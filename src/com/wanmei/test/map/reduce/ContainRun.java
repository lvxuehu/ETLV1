package com.wanmei.test.map.reduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**测试是是否包含数据
 * Game map reduce
 *@author lihui
 *
 *  2013-8-6  下午04:42:44
 */
public class ContainRun {
	/*
	 *  map  处理
	 */
	public static class ContainRunMapper extends Mapper<LongWritable, Text, Text, Text>{
		@Override
		protected void map(LongWritable key, Text value,Context context)
				throws IOException, InterruptedException {
			
			if(value.toString().contains("15:52:57")) {
				context.write(new Text(""),value);
			}
		}
	}
	
   public static void main(String[] args) throws Exception{
	   //hadoop 集群的配置文件
	   Configuration conf = new Configuration();
	  
	   Job job = new Job(conf, "test");
	    
	    job.setJarByClass(ContainRun.class);
	    job.setMapperClass(ContainRunMapper.class);
	    job.setMapOutputKeyClass(Text.class);
	    job.setMapOutputValueClass(Text.class);
	    
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(Text.class);
	    
	    
	    FileInputFormat.addInputPath(job, new Path("hdfs://namenode:8020/export/gamelog/xa/2014-03-04/"));
	    FileOutputFormat.setOutputPath(job, new Path("hdfs://namenode:8020/export/gamelog/xa/2014-03-04/result"));
	    
	    if(job.waitForCompletion(true)){
	    	System.exit(job.waitForCompletion(true) ? 0 : 1);
	    }
	}
}
