package com.wanmei.game.map.reduce;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;
import org.apache.hadoop.util.GenericOptionsParser;

import com.wanmei.day.game.etl.GameFilePathFilter;
import com.wanmei.game.tool.GameProperties;
import com.wanmei.game.tool.GameTool;

/**天的日志清洗
 * Game map reduce
 *@author lihui
 *
 *  2013-8-6  下午04:42:44
 */
public class DayGameETLRun {
	/*
	 *  map读取小时etl生成的日志
	 */
	public static class DayGameETLMapper extends Mapper<LongWritable, Text, Text, NullWritable>{
		//读取文件的配置信息
		private Properties properties;
		//读取的快
		private InputSplit inputSplit;
		//读取每块的文件的名称
		private String filePath;
		//输出的关键字
		
		//是否包含
		private boolean contains = false;
		
		//文件名
		private static String fileName = "";
		
		//输出的内容
		private Text content = new Text();
		
		@Override
		protected void setup(Context context) throws IOException,
				InterruptedException {
			//游戏配置文件的路径
			String gamePropertiesPath = context.getConfiguration().get("game.properties.path");
			
			//获得hadoop 系统中的文件
			Configuration conf = context.getConfiguration();
			Path path = new Path(gamePropertiesPath);
			FileSystem fileSystem = FileSystem.get(path.toUri(),conf);
			InputStream inputStream  = fileSystem.open(path );
			
			//获得properties
			properties = GameProperties.getProperties(inputStream);
			
			//读取块
			inputSplit = context.getInputSplit();
			//获得读取文件的路径
			filePath = ( (FileSplit)inputSplit).getPath().toString();
			
			contains = GameFilePathFilter.contains(filePath, properties);
			
			fileName = GameTool.getSpiltLastFileName("/",filePath,3).split("-")[0];
		}
		
		/*
		 *  map阶段因为小时的清洗日志就记录下来自己的文件生成的目录,
		 *  那么我不需要每次都做复杂的判断,filePath 最后的文件名称是否是在所有的游戏日志文件
		 *  名称中,如判断是否为xa.world2.formatlog/task_accept ,小时日志已经记录来自哪个
		 *  文件了,就不需要做复杂的循环判断了,还有生成的目录下可能会有不需要解析的hadoop
		 *  运行的日志信息,需要过滤这样不需要的目录,因为天合并,是模糊匹配,一次模糊读入很多文件
		 *  那么目录不包含游戏类型的也就不需要解析了
		 *  1.key 直接输出读入的小时清洗过的日志
		 *  2.value 不需要输出null
		 */
		@Override
		protected void map(LongWritable key, Text value,Context context)
				throws IOException, InterruptedException {
			//如果 不包含读入的文件
			if(!contains) {
				return ;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(value.toString()).append("%").append(fileName);
			
			content.set(sb.toString());
			
			//直接输出 使得键唯一 去重复
			context.write(content, NullWritable.get());
		}
	}
	
	/**
	 * map 之后 过滤合并
	 *@author lihui
	 *
	 *  2014-3-3  上午11:31:14
	 */
	public static class DayGameETLReducer extends Reducer<Text,NullWritable,Text,NullWritable> {
		private MultipleOutputs<Text, NullWritable> mos;
		
		//输出的内容
		private Text content = new Text();
		
		@Override
		protected void setup(Context context) throws IOException,
				InterruptedException {
			mos = new MultipleOutputs<Text, NullWritable>(context);
		}
		
		@Override
		protected void reduce(Text key, Iterable<NullWritable> values, Context context)
				throws IOException, InterruptedException {
			 //分割
			 StringTokenizer lastValueStringTokenizer = new StringTokenizer(key.toString(),"!");
			 
			 //唯一标识%文件目录
			 String lastValue = GameTool.getStringTokenizerLastValue(lastValueStringTokenizer);
			 
            content.set(key.toString().substring(0,key.toString().length() - (lastValue.length() + 1)));
            
            StringTokenizer st = new StringTokenizer(lastValue,"%");
            
            String fileName = GameTool.getStringTokenizerLastValue(st);
            
            //行数计数器
            GameTool.countLineKeyNumber(fileName, context);
            
            //文件大小的计数器
            GameTool.countSizeKeyNumber(fileName, context, content.toString());
            //输出
			mos.write(content, NullWritable.get(),fileName);
		}
		
		@Override
		protected void cleanup(Context context)
				throws IOException, InterruptedException {
			mos.close();
		}
	}
	
	/*
	 * 自定义输出的文件的路径 相同正则表达式的 内容合为一个文件
	 */
	public static class DayGameMultipleOutputFormat extends MultipleOutputFormat<Text, Text> {  
		 @Override  
	      protected String generateFileNameForKeyValue(Text key, Text value, Configuration conf) {  
	    	  return key.toString();
	      }  
	}
	
	/*
	 * 自定义分区
	 *相同名称的文件 分到同一分区下
	 *  2014-3-5  下午06:16:34
	 */
    public static class DayPartioner extends Partitioner<Text, NullWritable>{
		@Override
		public int getPartition(Text key, NullWritable value, int numPartitions) {
			 //最后一个切分 就是生成的文件目录
            String fileName = GameTool.getDayFileName(key.toString());
            
			//自定义分区
			return (fileName.hashCode() & Integer.MAX_VALUE)  % numPartitions;
		}
	}
	  
   public static void main(String[] args) throws Exception{
	   //hadoop 集群的配置文件
	   Configuration conf = new Configuration();
	  //传入的参数
	   String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
	   //判断参数的数量
	   if (otherArgs.length < 3 || otherArgs.length > 4) {
		   System.err.println("传入参数不足~~");
		   System.exit(1);
	   }
	   
	  	//设置游戏的名称
	   	conf.set("game.properties.path",otherArgs[2].trim());	
	   
	   	//任务名称
		String jobName = GameTool.getDayJobName(otherArgs[1].trim(), otherArgs[2].trim());
	    Job job = new Job(conf, jobName);
	    
	    job.setJarByClass(DayGameETLRun.class);
	    job.setMapperClass(DayGameETLMapper.class);
	    job.setReducerClass(DayGameETLReducer.class);
	    job.setMapOutputKeyClass(Text.class);
	    job.setMapOutputValueClass(NullWritable.class);
	    
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(NullWritable.class);
	   // job.setPartitionerClass(DayPartioner.class);
	  //  job.setOutputFormatClass(DayGameMultipleOutputFormat.class);
	    
	    //设定reduce数量
	    if(otherArgs.length == 4) {
	    	job.setNumReduceTasks(Integer.parseInt(otherArgs[3].trim()));
	    }
	    
	    //hadoop 文件路径
	    FileSystem hdfs = FileSystem.get(conf);
	    //多文件路径按逗号分隔
	    String input[] = otherArgs[0].trim().split(",");
	    
	    //如果切割开了
	    if(input.length > 1) {
		    //循环通配符路径
		    for(int i = 0; i < input.length; i++) {
		    	Path path = new Path(input[i].trim());
		    	FileStatus[] status=hdfs.globStatus(path);
		    	Path[] listedPaths = FileUtil.stat2Paths(status);
		    	//循环加入完整路径
		        for (Path p : listedPaths) {
		        	//不包含
		        	if(!p.toString().contains("_SUCCESS")) {
		        		FileInputFormat.addInputPath(job, p);
		        	}
		         }
		    }
	    }else {
	    	 FileInputFormat.addInputPath(job, new Path(otherArgs[0].trim()));
	    }
	    
	    //输出路径
	    FileOutputFormat.setOutputPath(job, new Path(otherArgs[1].trim()));
//	    FileInputFormat.addInputPath(job, new Path("hdfs://test02:9000/export/gamelog/xa/2014-02-28"));
//	    FileOutputFormat.setOutputPath(job, new Path("hdfs://test02:9000/export/bisql/gamesql/xa/2014-02-28/08"));
	    
	    if(job.waitForCompletion(true)){
	    	//计数器的统计
	    	GameTool.saveDayCountNumber(job, conf, otherArgs[1].trim());
	    	//删除无用文件
	    	GameTool.deletePartAndSuccessFile(conf, otherArgs[1].trim());
	    	System.exit(job.waitForCompletion(true) ? 0 : 1);
	    }
	}
}
