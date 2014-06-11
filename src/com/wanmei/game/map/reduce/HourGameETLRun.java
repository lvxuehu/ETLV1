package com.wanmei.game.map.reduce;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
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

import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameProperties;
import com.wanmei.game.tool.GameTool;
import com.wanmei.hour.game.etl.GameFileType;
import com.wanmei.hour.game.etl.GameKindFilterType;

/**
 * Game map reduce
 * 
 * @author lihui
 * 
 *         2013-8-6 下午04:42:44
 */
public class HourGameETLRun {
	/*
	 * map 处理
	 */
	public static class HourGameETLMapper extends
			Mapper<LongWritable, Text, Text, NullWritable> {
		// 读取文件的配置信息
		private Properties properties;
		// 存储每个正则到内存中
		private Map<String, Pattern> patternMap;

		// 输出的关键字
		private Text key_word = new Text();

		// 游戏为文件名称
		private String gameFileName;

		// 文件名称前缀
		private String prefix;

		// 切分
		private String[] gameKindFilterTypeSplit;

		// 时间
		private String yesterday;

		// private MultipleOutputs<Text, NullWritable> mos;

		@Override
		protected void setup(Context context) throws IOException,
				InterruptedException {
			// 游戏配置文件的路径 hdfs://master:49000/user/hadoop/etl/conf/xa.properties
			String gamePropertiesPath = context.getConfiguration().get(
					"game.properties.path");

			// 获得hadoop 系统中的文件
			Configuration conf = context.getConfiguration();
			Path path = new Path(gamePropertiesPath);
			FileSystem fileSystem = FileSystem.get(path.toUri(), conf);
			InputStream inputStream = fileSystem.open(path);

			// 设置文件名前缀
			GameTool.setFileNamePrefix(gamePropertiesPath);// FILE_NAME_PREFIX="gamelog_xa_"

			// 获得properties
			properties = GameProperties.getProperties(inputStream);
			// 存储每个正则到内存中
			patternMap = GameFileType.getPatternMap(properties);// 所有正则的集合

			// 读取块,取得当前正在处理的文件的名称
			InputSplit inputSplit = context.getInputSplit();

			// 获得读取文件的路径
			String filePath = ((FileSplit) inputSplit).getPath().toString();

			// filePath=hdfs://master:49000/export/gamelog/xa/2014-05-29/xa.new_rolesbrief.csv.1.03:0+67108864
			// filePath=hdfs://master:49000/export/gamelog/xa/2014-05-29/xa.new_rolesbrief.csv.1.03
			System.out.println("filePath=" + filePath);

			// 分割的符号
			String splitSymbol = properties.getProperty("game.split.symbol");// ;
			// xa游戏下所有log的文件名称
			// game.file.name.filter=xa.world2.formatlog;xa.world2.log;xa.world2.action;xa.rolesbrief.csv;xa.new_rolesbrief.csv;
			String gameFileNameFilter = properties
					.getProperty("game.file.name.filter");

			// gameFileNameFilter 切分
			StringTokenizer gameFileNameFilterStringTokenizer = new StringTokenizer(
					gameFileNameFilter, splitSymbol);
			// 循环遍历，遍历所有log的文件名
			while (gameFileNameFilterStringTokenizer.hasMoreTokens()) {
				// 下一个遍历结果
				String gameFileNameFilterNextToken = gameFileNameFilterStringTokenizer
						.nextToken().trim();

				// 如果匹配的上了
				if (GameTool.contains(gameFileNameFilterNextToken, filePath)) {
					// 确定哪个游戏文件
					gameFileName = gameFileNameFilterNextToken;// xa.world2.formatlog
					// 文件名称前缀
					prefix = gameFileName + "/";// prefix="xa.world2.formatlog/"

					// xa下xa.world2.formatlog这个log文件中所有日志格式：
					// gameKindFilterType=sysmail;stone_combine;player_get_valuable_item;equip_embed_stone;
					String gameKindFilterType = properties
							.getProperty(gameFileName + ".filter.type");

					// gameKindFilterType 切分
					gameKindFilterTypeSplit = gameKindFilterType
							.split(splitSymbol);

					// 名称
					// filePath=hdfs://master:49000/export/gamelog/xa/2014-05-29/xa.new_rolesbrief.csv.1.03
					String fileName = GameTool.getSpiltLastFileName("/",
							filePath, 1);// xa.new_rolesbrief.csv.1.03

					// 日期,从输入路径中取出时间，作为输出的文件路径名称。
					yesterday = GameTool.getYesterdayString(GameTool
							.getSpiltLastFileName(
									"/",
									filePath.substring(0, filePath.length()
											- fileName.length() - 1), 1));

					// mos = new MultipleOutputs<Text, NullWritable>(context);

					break;
				}
			}
		}

		/*
		 * map阶段 1.key为清洗后的日志2.value为null 什么都不需要
		 * contentlist 中每行的数据 key=2014-05-28	11138	16543862	356326619	"酒音舍国"	7	29	32694	0	0	0	0	1393812320	-1	-1	-1
           !s_ln=3897#srbip=172.21.170.254#srbgn=11138%2014-05-28/xa.new_rolesbrief.csv/gamelog_xa_chardata_inc/gamelog_xa_chardata_inc
		 */
		@Override
		protected void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			// 如果没有找到需要解析的文件
			if (gameFileName == null) {
				return;
			}

//			map方法调用正则解析方法
//			log日期=2014-09-23
//			gameFileName = xa.world2.formatlog
//			prefix="xa.world2.formatlog/"
//			gameKindFilterTypeSplit每个log中每种日志格式的正则名称集合
//			line=value.toString() 一行数据
//			gameFileName=xa.world2.formatlog
			// 过滤之后的内容 gamefilename=xa.world2.formatlog
			List<String> contentList = GameKindFilterType.getFilterContent(
					yesterday, gameFileName, prefix, gameKindFilterTypeSplit,
					value.toString(), gameFileName, properties, patternMap,
					context);

			// if(contentList.size() == 0) {
			// mos.write(value, NullWritable.get(),"noRegular/");
			// }

			for (String content : contentList) {
				// 匹配文本的关键字
				key_word.set(content);
				// System.out.println("map content key="+content);
				// 过滤之后的内容
				context.write(key_word, NullWritable.get());
			}
		}

		// @Override
		// protected void cleanup(Context context)
		// throws IOException, InterruptedException {
		// mos.close();
		// }
	}

	/*
	 * Reducer 阶段 hadoop 集群默认会把 map阶段输出的key 自动做去重的操作 并且按时间排序 1.输出的key为 文件目录
	 * 2.value 为读入的key 不处理 生成每小时的日志,目前还不是完整清理的结果,需要保留a.生成的文件目录,b.唯一标示符c.清洗后的日志
	 * 这三部分内容.
	 */
	public static class HourGameETLReducer extends
			Reducer<Text, NullWritable, Text, NullWritable> {
		private MultipleOutputs<Text, NullWritable> mos;
		private Text key_word = new Text();

		@Override
		protected void setup(Context context) throws IOException,
				InterruptedException {
			mos = new MultipleOutputs<Text, NullWritable>(context);
		}

		
//		reduce阶段
//		StringTokenizer st =  new StringTokenizer(key.toString(),"%");
//		按照%分割key
//		取最后一个分割值，就是输出的路径和文件名
//		fileName="2014-05-28/xa.new_rolesbrief.csv/gamelog_xa_chardata_inc/gamelog_xa_chardata_inc"
//		          
//		从key中取出除路径之后的数据，这个数据就是最终整理之后的log数据，包括srbip的数据
//		content=2014-05-28	11138	16543862	356326619	"酒音舍国"	7	29	32694	0	0	0	0	1393812320	-1	-1	-1!s_ln=3897#srbip=172.21.170.254#srbgn=11138
		@Override
		protected void reduce(Text key, Iterable<NullWritable> values,
				Context context) throws IOException, InterruptedException {
			// 分割
			StringTokenizer st = new StringTokenizer(key.toString(), "%");

			// 最后一个切分 就是生成的文件目录
			String fileName = GameTool.getStringTokenizerLastValue(st);
			//2014-05-30/xa.world2.formatlog/gamelog_xa_player_enter_instance/gamelog_xa_player_enter_instance
			//System.out.println("reduce fileName="+fileName);
			String content = key.toString().substring(0,
					key.toString().length() - (fileName.length() + 1));
			key_word.set(content);

			// 输出
			mos.write(key_word, NullWritable.get(), fileName);
		}

		@Override
		protected void cleanup(Context context) throws IOException,
				InterruptedException {
			mos.close();
		}
	}

	/*
	 * 自定义输出的文件的路径 相同正则表达式的 内容合为一个文件
	 */
	public static class HourGameMultipleOutputFormat extends
			MultipleOutputFormat<Text, Text> {
		@Override
		protected String generateFileNameForKeyValue(Text key, Text value,
				Configuration conf) {
			System.out.println(key.toString());
			return key.toString();
		}
	}

	/*
	 * 自定义分区相同名称的文件 分到同一分区下 2014-3-5 下午06:16:34
	 */
	public static class HourPartioner extends Partitioner<Text, NullWritable> {
		@Override
		public int getPartition(Text key, NullWritable value, int numPartitions) {
			StringTokenizer st = new StringTokenizer(key.toString(), "%");
			// 文件生成目录
			String fileName = GameTool.getStringTokenizerLastValue(st);
			System.out.println("fileName="+fileName);
			// 自定义分区
			return (fileName.hashCode() & Integer.MAX_VALUE) % numPartitions;
		}
	}

	public static void main(String[] args) throws Exception {
		// hadoop 集群的配置文件
		Configuration conf = new Configuration();
		// 传入的参数
		String[] otherArgs = new GenericOptionsParser(conf, args)
				.getRemainingArgs();
		// 判断参数的数量
		if (otherArgs.length < 3 || otherArgs.length > 4) {
			System.err.println("传入参数不足~~");
			System.exit(1);
		}

		// 设置游戏的名称，hdfs://master:49000/user/hadoop/etl/conf/xa.properties
		conf.set("game.properties.path", otherArgs[2].trim());

		// 任务名称
		String jobName = GameTool.getHourJobName(conf, otherArgs[0].trim(),
				otherArgs[2].trim());
		Job job = new Job(conf, jobName);

		job.setJarByClass(HourGameETLRun.class);
		job.setMapperClass(HourGameETLMapper.class);
		job.setReducerClass(HourGameETLReducer.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(NullWritable.class);

		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(NullWritable.class);
		// job.setPartitionerClass(HourPartioner.class);
		// job.setOutputFormatClass(HourGameMultipleOutputFormat.class);

		// 设定reduce数量
		if (otherArgs.length == 4) {
			job.setNumReduceTasks(Integer.parseInt(otherArgs[3].trim()));
		}
		// job.setNumReduceTasks(GameTool.getReduceNumber(conf,
		// otherArgs[2].trim()));

		// hadoop 文件路径
		FileSystem hdfs = FileSystem.get(conf);
		// 多文件路径按逗号分隔
		String input[] = otherArgs[0].trim().split(",");

		// 如果切割开了
		if (input.length > 1) {
			// 循环通配符路径
			for (int i = 0; i < input.length; i++) {
				Path path = new Path(input[i].trim());
				FileStatus[] status = hdfs.globStatus(path);
				Path[] listedPaths = FileUtil.stat2Paths(status);
				// 循环加入完整路径
				for (Path p : listedPaths) {
					FileInputFormat.addInputPath(job, p);
				}
			}
		} else {
			FileInputFormat.addInputPath(job, new Path(otherArgs[0].trim()));
		}

		FileOutputFormat.setOutputPath(job, new Path(otherArgs[1].trim()));

		// FileInputFormat.addInputPath(job, new
		// Path("hdfs://test02:9000/export/gamelog/xa/2014-02-28"));
		// FileOutputFormat.setOutputPath(job, new
		// Path("hdfs://test02:9000/export/bisql/gamesql/xa/2014-02-28/08"));
		if (job.waitForCompletion(true)) {
			// 计数器的统计
			GameTool.saveHourCountNumber(otherArgs[2].trim(), job, conf,
					otherArgs[1].trim());
			// 删除无用文件
			GameTool.deletePartAndSuccessFile(conf, otherArgs[1].trim());
			System.exit(job.waitForCompletion(true) ? 0 : 1);
		}
	}
}
