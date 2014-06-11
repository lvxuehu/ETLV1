package com.wanmei.test.map.reduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

import com.wanmei.game.tool.GameTool;

/**
 * Game map reduce
 *@author lihui
 *
 *  2013-8-6  下午04:42:44
 */
public class FileNumberRun {
	/*
	 *  map  处理
	 */
	public static class FileNumberRunMapper extends Mapper<LongWritable, Text, Text, Text >{
		//读取的快
		private InputSplit inputSplit;
		//读取每块的文件的名称
		private String filePath;
		//文件名
		private String fileName;
		
		@Override
		protected void setup(Context context) throws IOException,
				InterruptedException {
			//读取块
			inputSplit = context.getInputSplit();
			//获得读取文件的路径
			filePath = ( (FileSplit)inputSplit).getPath().toString();
			
			String lastString = GameTool.getSpiltLastFileName("/", filePath, 1);
			
			fileName = lastString.split("-")[0];
		}
		
		@Override
		protected void map(LongWritable key, Text value,Context context)
				throws IOException, InterruptedException {
			
			GameTool.countContainKeyNumber(fileName, context);
		}
	}
	
	
   public static void main(String[] args) throws Exception{
	   //hadoop 集群的配置文件
	   Configuration conf = new Configuration();
	   //传入的参数
	   String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
	   //判断参数的数量
	   if (otherArgs.length != 2) {
		   System.err.println("传入参数不足2个~~");
		   System.exit(1);
	   }
	  
	    Job job = new Job(conf, "计数器统计");
	    
	    job.setJarByClass(FileNumberRun.class);
	    job.setMapperClass(FileNumberRunMapper.class);
	    
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(Text.class);
	    
	    FileInputFormat.addInputPath(job, new Path(otherArgs[0].trim()));
	    FileOutputFormat.setOutputPath(job, new Path(otherArgs[1].trim() + "/counter"));
	    
	    if(job.waitForCompletion(true)){
	    	GameTool.saveHourCountNumber(job, conf, otherArgs[1].trim());
	    	//删除无用文件
	    	GameTool.deletePartAndSuccessFile(conf, otherArgs[1].trim() + "/counter");
	    	System.exit(job.waitForCompletion(true) ? 0 : 1);
	    }
	}
}
