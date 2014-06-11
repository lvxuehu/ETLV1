package com.wanmei.hour.game.etl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.hadoop.mapreduce.Mapper.Context;

import com.wanmei.game.tool.GameTool;

/**
 * StringTokenizer 分割方式
 *@author lihui
 *
 *  2014-5-16  下午02:24:36
 */
public class GameStringTokenizerCommonKind {
	@SuppressWarnings("rawtypes")
	public static List<String> etl(String stringTokenizerColumn,String prefix,Properties pro,String gameFileName,String gameKindFilterType,String line,Context context) {
		//唯一标识
		StringBuilder uniqueStringBuilder = new StringBuilder();
		
		//逗号分割
		StringTokenizer commaStringTokenizer = new StringTokenizer(stringTokenizerColumn,";");
		//列名集合
		List<String> columnList =  new ArrayList<String>();
		
		while(commaStringTokenizer.hasMoreTokens()) {
			//加载
			columnList.add(commaStringTokenizer.nextToken());
		}
		
		//井号分割
		StringTokenizer poundStringTokenizer = new StringTokenizer(line,"#");
		
		//标准长度
		if(poundStringTokenizer.countTokens() == 4) {
			//唯一标识
			uniqueStringBuilder.append(poundStringTokenizer.nextToken()).append("#");
			uniqueStringBuilder.append(poundStringTokenizer.nextToken()).append("#");
			
			//组号的key value
			String groupKeyValue = poundStringTokenizer.nextToken();
			//唯一标识
			uniqueStringBuilder.append(groupKeyValue);
			//纯日志
			String log = poundStringTokenizer.nextToken();
			//组号
			String group = GameTool.getStringTokenizerLastValue(groupKeyValue,"=");
			//空格分割
			StringTokenizer stringTokenizer = new StringTokenizer(log);
			//标准的数量
			if(stringTokenizer.countTokens() == 3) {
				//年
				String year = stringTokenizer.nextToken();
				//日期
				String date = stringTokenizer.nextToken();
				//剩余的log
				String lastLog = stringTokenizer.nextToken();
				
				//冒号分割
				StringTokenizer colonStringTokenizer = new StringTokenizer(lastLog,":");
				//存入提取的key value
				Map <String,String> map = new HashMap<String,String>();
				
				while(colonStringTokenizer.hasMoreTokens()) {
					//等号分割
					StringTokenizer equalStringTokenizer =  new StringTokenizer(colonStringTokenizer.nextToken(),"=");
					
					if(equalStringTokenizer.countTokens() == 2) {
						//存入
						map.put(equalStringTokenizer.nextToken(), equalStringTokenizer.nextToken());
					}
				}
				
				//如果解析出来了
				if(map.size() > 0) {
					//计数器
					GameTool.countAnalyzeKeyNumber(prefix + gameKindFilterType, context);
					
					StringBuilder sb = new StringBuilder();
					
					sb.append(year).append(" ").append(date).append("\t").append(group);
					
					//遍历列名
					for(String columnStr : columnList) {
						String value = map.get(columnStr);
						
						if(value != null) {
							sb.append("\t").append(value);
						}else {
							sb.append("\t");
						}
					}
					
					sb.append("!").append(uniqueStringBuilder);
					
					//文件名称
					String fileName = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

					sb.append("%").append(year).append("/").append(prefix).append(fileName).append("/").append(fileName);
					
					List<String> list = new ArrayList<String>();
					list.add(sb.toString());
					
					return list;
				}
			}
		}
		
		return new ArrayList<String>();
	}
}
