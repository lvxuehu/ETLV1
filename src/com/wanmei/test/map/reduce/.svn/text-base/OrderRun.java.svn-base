package com.wanmei.test.map.reduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * Game map reduce
 *@author lihui
 *
 *  2013-8-6  下午04:42:44
 */
public class OrderRun {
	/*
	 *  map  处理
	 */
	public static class OrderRunMapper extends Mapper<LongWritable, Text, Text, NullWritable>{
		@Override
		protected void map(LongWritable key, Text value,Context context)
				throws IOException, InterruptedException {
			
			context.write(value,NullWritable.get());
		}
	}
	
   public static void main(String[] args) throws Exception{
	   //hadoop 集群的配置文件
	   Configuration conf = new Configuration();
	  
	   Job job = new Job(conf, "test");
	    
	    job.setJarByClass(OrderRun.class);
	    job.setMapperClass(OrderRunMapper.class);
	    job.setMapOutputKeyClass(Text.class);
	    job.setMapOutputValueClass(NullWritable.class);
	    
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(Text.class);
	    
	    
	    FileInputFormat.addInputPath(job, new Path("hdfs://test02:9000/user/hadoop/test/fileNumber/"));
	    FileOutputFormat.setOutputPath(job, new Path("hdfs://test02:9000/user/hadoop/test/fileNumber/result"));
	    
	    if(job.waitForCompletion(true)){
	    	System.exit(job.waitForCompletion(true) ? 0 : 1);
	    }
	}
}
