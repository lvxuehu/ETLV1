package com.wanmei.hour.game.etl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.hadoop.mapreduce.Mapper.Context;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameTool;

/**
 * 多正则种类文件
 *@author lihui
 *
 *  2014-3-27  下午05:18:25
 */
public class GameMultipleRegularKind {
	/*
	 * 清洗
	 */
	@SuppressWarnings("rawtypes")
	public static List<String> etl(String prefix,String multipleRegularNumber,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context,Properties pro) {
		//初始化数量
		int multipleNumber = 1;
		
		try {
			multipleNumber = Integer.parseInt(multipleRegularNumber);
		}catch (Exception e) {
		}
		
		for(int j = 1; j <= multipleNumber; j++) {
			//切分的开
			Pattern pattern = patternMap.get(gameKindFilterType + "_" + j);

			//如果map中不存在
			if(pattern == null) {
				return new ArrayList<String>();
			}
			
			Matcher matcher = pattern.matcher(line);
			
			//如果匹配上了
			if(matcher.find()) {
				//计数器
				GameTool.countAnalyzeKeyNumber(prefix + gameKindFilterType, context);
				
				StringBuilder sb = new StringBuilder();
				//匹配的数量
				int number = matcher.groupCount();
				
				//唯一标识
				String uniqueMark = "";
				
				//循环 number -1  最后一个不要 
				//
				for(int i = 1; i < number - 1; i++) {
					if(i == 1) {
						//第一个字段就是唯一标识的
						uniqueMark = matcher.group(i);
					}
					else {
						//匹配的内容
						String matcherString = matcher.group(i);
						
						//如果为 空 字符串
//						if(StringUtils.isBlank(matcherString)) {
//							matcherString = " ";
//						}
						
						//其他的是 etl 解析的
						sb.append(matcherString + "\t");
					}
				}
			    
				//最后匹配上的
				String lastMatcher = matcher.group(number-1);
				
				//如果为空
//				if(StringUtils.isBlank(lastMatcher)) {
//					//加入最后一行 解析 解决最后一位不需要
//					//制表符的问题
//					sb.append(" ");
//				}else{
					sb.append(lastMatcher);
			//	}
				
				//在最后面 加入唯一标识
				sb.append("!").append(uniqueMark);
				
				//唯一标识按“=” 切割 
				StringTokenizer st =  new StringTokenizer(uniqueMark,"=");	
				
				//	取得服务器组号
				String  groupNumnber = GameTool.getStringTokenizerLastValue(st) + "\t";
				
				//20 这个位置是时间日期的长度 不会改变
				sb.insert(20,groupNumnber);
				
				//截取 日期 2014-03-05
				String date = sb.substring(0, 10);
				
				gameKindFilterType = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

				//字符串样式etl内容!唯一标识%生成文件的目录
				sb.append("%").append(date).append("/").append(prefix).append(gameKindFilterType).append("/").append(gameKindFilterType);
				
				List<String> list = new ArrayList<String>();
				list.add(sb.toString());
				
				return list;
			}
		}
		
		return new ArrayList<String>();
	}
}
