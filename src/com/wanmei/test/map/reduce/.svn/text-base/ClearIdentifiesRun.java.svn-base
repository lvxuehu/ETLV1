package com.wanmei.test.map.reduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;

/**
 * 清除唯一标识
 *@author lihui
 *
 *  2014-4-2  下午04:17:29
 */
public class ClearIdentifiesRun {
	/*
	 *  map  处理
	 */
	public static class ClearIdentifiesRunMapper extends Mapper<LongWritable, Text, NullWritable, Text>{
		@Override
		protected void map(LongWritable key, Text value,Context context)
				throws IOException, InterruptedException {
			
			String line = value.toString();
			
			Pattern pattern = new Pattern("^.+#(.+)");
			Matcher matcher = pattern.matcher(line);
			
			if(matcher.find()) {
				context.write(NullWritable.get(),new Text(matcher.group(1)));
			}
			
			//context.write(NullWritable.get(),value);
		}
	}
	
    public static class MyPartioner extends Partitioner<NullWritable,Text>{
		@Override
		public int getPartition(NullWritable key, Text value, int numPartitions) {
			//自定义分区
			 return (value.toString().hashCode() & Integer.MAX_VALUE)  % numPartitions;
		}
	}
	
   public static void main(String[] args) throws Exception{
	   //hadoop 集群的配置文件
	   Configuration conf = new Configuration();
	  
	   Job job = new Job(conf, "test");
	    
	    job.setJarByClass(ClearIdentifiesRun.class);
	    job.setMapperClass(ClearIdentifiesRunMapper.class);
	    job.setMapOutputKeyClass(NullWritable.class);
	    job.setMapOutputValueClass(Text.class);
	    
	    job.setOutputKeyClass(NullWritable.class);
	    job.setOutputValueClass(Text.class);
	    
	    job.setPartitionerClass(MyPartioner.class);
	    
//	    FileInputFormat.addInputPath(job, new Path("hdfs://namenode:8020/user/hadoop/test/input/"));
//	    FileOutputFormat.setOutputPath(job, new Path("hdfs://namenode:8020/user/hadoop/test/output"));
	    
	    FileInputFormat.addInputPath(job, new Path("hdfs://namenode:8020/export/gamelog/xa/2014-04-01/"));
	    FileOutputFormat.setOutputPath(job, new Path("hdfs://namenode:8020/export/bisql/gamesql/xa/2014-04-01/identifies"));
	    
	    if(job.waitForCompletion(true)){
	    	System.exit(job.waitForCompletion(true) ? 0 : 1);
	    }
	}
}	
