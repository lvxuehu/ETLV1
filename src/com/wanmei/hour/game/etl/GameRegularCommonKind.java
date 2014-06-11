package com.wanmei.hour.game.etl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.mapreduce.Mapper.Context;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameTool;

/**
 * 游戏的正则处理一般情况
 *@author lihui
 *
 *  2014-3-13  上午10:23:39
 */
public class GameRegularCommonKind {
	
	//gameKindFilterType=stone_combine,正则的名称，这个时候已经配对出正则表达式了。
	//之前是对一行line数据，调用正则名称的集合进行配对，找到对应的正则后，进入对应的解析方法，进行解析。
	//这个方法就是配对后，具体的那个解析方法。
	@SuppressWarnings("rawtypes")
	public static List<String> etl(String prefix,Properties pro,String gameFileName,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		if(gameKindFilterType.equals("onlineuser")) {//通过配对的正则名称，再次配对。
			return onlineuser(gameFileName, prefix, pro, gameKindFilterType, line, patternMap, context);
		}else if(gameFileName.equals("sgsj.cslog1.log")) {
			return sgsj_cslog1_log_etl(prefix, pro, gameKindFilterType, line, patternMap, context);
		}else if(gameFileName.equals("sg.cslog1.log")) {
			return sg_cslog1_log_etl(prefix, pro, gameKindFilterType, line, patternMap, context);
		}else{
			return commonEtl(prefix,pro,gameKindFilterType, line, patternMap, context);
		}
	}
	
	//onlineuser 里面判断
	//再判断是哪款游戏
	@SuppressWarnings("rawtypes")
	private static List<String> onlineuser(String gameFileName,String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		if(gameFileName.equals("sdsxs.stat.log") || gameFileName.equals("iwm.statinfom") || 
		   gameFileName.equals("zx.statinfom") || gameFileName.equals("sgsj.statlog7.log") || 
		   gameFileName.equals("sg.statlog7.log") ) {
			return onlineuserEtl(prefix,pro,gameKindFilterType, line, patternMap, context);
		}
		
		return new ArrayList<String>();
	}
	
	//神鬼世界
	@SuppressWarnings("rawtypes")
	private static List<String> sgsj_cslog1_log_etl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		if(gameKindFilterType.equals("deathinfo")) {
			return sgsj_cslog1_log_deathinfo_etl(prefix, pro, gameKindFilterType, line, patternMap, context);
		}else if(gameKindFilterType.equals("deal")) {
			return sgsj_cslog1_log_deal_etl(prefix, pro, gameKindFilterType, line, patternMap, context);
		}
		
		return new ArrayList<String>();
	}
	
	//神鬼
	@SuppressWarnings("rawtypes")
	private static List<String> sg_cslog1_log_etl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		if(gameKindFilterType.equals("deathinfo")) {
			return sg_cslog1_log_deathinfo_etl(prefix, pro, gameKindFilterType, line, patternMap, context);
		}else if(gameKindFilterType.equals("copy_involve")) {
			return commonEtl(prefix, pro, gameKindFilterType, line, patternMap, context);
		}else if(gameKindFilterType.equals("deal")) {
			return sg_cslog1_log_deal_etl(prefix, pro, gameKindFilterType, line, patternMap, context);
		}
		
		return new ArrayList<String>();
	}
	
	//神鬼
	@SuppressWarnings("rawtypes")
	private static List<String> sg_cslog1_log_deal_etl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return new ArrayList<String>();
		}
		
		Matcher matcher = pattern.matcher(line);
		
		//如果匹配上了
		if(matcher.find()) {
			//计数器
			GameTool.countAnalyzeKeyNumber(prefix + gameKindFilterType, context);
			
			//匹配的数量
			int number = matcher.groupCount();
			
			//唯一标识
			String uniqueMark = "";
			
			//内容集合
			List <String> contentList = new ArrayList<String>();
			
			//循环 number -1  最后一个不要 
			//
			for(int i = 1; i <= number - 1; i++) {
				if(i == 1) {
					//第一个字段就是唯一标识的
					uniqueMark = matcher.group(i);
				}
				else {
					contentList.add(matcher.group(i));
				}
			}
			
			//	取得服务器组号
			String  groupNumnber = GameTool.getStringTokenizerLastValue(uniqueMark,"=");
			
			//倒数第二
			String lastThirdStr = contentList.get(contentList.size() - 2);
			//正数第四的位置
			String fourthStr = contentList.get(3);
			
			Map<Integer,String> lastThirdStrMap = new HashMap<Integer,String>();
			Map<Integer,String> fourthStrMap = new HashMap<Integer,String>();
			
			if(fourthStr.contains("[") &&  fourthStr.contains("]")) {
				fourthStr = fourthStr.substring(1, fourthStr.length() - 1);
				
				//分号切割
				StringTokenizer semicolonStringTokenizer = new StringTokenizer(fourthStr,";");
				
				int time = 0;
				
				while(semicolonStringTokenizer.hasMoreTokens()) {
					//分号切割的内容
					String semicolonStr = semicolonStringTokenizer.nextToken();
					
					//冒号切割
					StringTokenizer colonStringTokenizer = new StringTokenizer(semicolonStr,":");
					
					if(colonStringTokenizer.countTokens() == 3) {
						StringBuilder colonStringBuilder = new StringBuilder();
						
						colonStringBuilder.append(colonStringTokenizer.nextToken()).append("\t");
						colonStringTokenizer.nextToken();
						colonStringBuilder.append(colonStringTokenizer.nextToken());
						
						time++;
						
						fourthStrMap.put(time, colonStringBuilder.toString());
					}
				}
			}
			
			if(lastThirdStr.contains("[") &&  lastThirdStr.contains("]")) {
				lastThirdStr = lastThirdStr.substring(1, lastThirdStr.length() - 1);
				
				//分号切割
				StringTokenizer semicolonStringTokenizer = new StringTokenizer(lastThirdStr,";");
				
				int time = 0;
				
				while(semicolonStringTokenizer.hasMoreTokens()) {
					//分号切割的内容
					String semicolonStr = semicolonStringTokenizer.nextToken();
					
					//冒号切割
					StringTokenizer colonStringTokenizer = new StringTokenizer(semicolonStr,":");
					
					if(colonStringTokenizer.countTokens() == 3) {
						StringBuilder colonStringBuilder = new StringBuilder();
						
						colonStringBuilder.append(colonStringTokenizer.nextToken()).append("\t");
						colonStringTokenizer.nextToken();
						colonStringBuilder.append(colonStringTokenizer.nextToken());
						
						time++;
						
						lastThirdStrMap.put(time, colonStringBuilder.toString());
					}
				}
			}
			
			//所有的组合
			List <String> allCombinationList = new ArrayList<String>();
			//结果集合
			List<String> resultList = new ArrayList<String>();
			
			//都没有数据
			if(fourthStrMap.size() == 0 && lastThirdStrMap.size() == 0) {
				return resultList;
			}else {
				int maxSzie = fourthStrMap.size();
				int lastThirdStrListSize = lastThirdStrMap.size();
				
				//最大的数
				if(maxSzie < lastThirdStrListSize) {
					maxSzie = lastThirdStrListSize;
				}
				
				//空的
				StringBuilder blankStringBuilder = new StringBuilder();
				blankStringBuilder.append("0").append("\t").append("0");
				
				for(int i = 1; i <= maxSzie; i++ ) {
					String fourthStrContent =  fourthStrMap.get(i);
					String lastThirdStrContent =  lastThirdStrMap.get(i);
					
					if(fourthStrContent == null) {
						fourthStrContent = blankStringBuilder.toString();
					}
					
					if(lastThirdStrContent == null) {
						lastThirdStrContent = blankStringBuilder.toString();
					}
					
					StringBuilder stringBuilder = new StringBuilder();
					
					String fifthStr = contentList.get(4);
					
					//空就补零
					if(StringUtils.isBlank(fifthStr)) {
						fifthStr = "0";
					}
					
					stringBuilder.append(fourthStrContent).append("\t").append(fifthStr).append("\t").
					append(contentList.get(5)).append("\t").append("\t").append(lastThirdStrContent);
					
					allCombinationList.add(stringBuilder.toString());
				}
			}
			
			for(int i = 0 ; i < allCombinationList.size(); i++) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(contentList.get(0)).append("\t").append(groupNumnber).append("\t").
				append(contentList.get(1)).append("\t").append("\t").append(allCombinationList.get(i)).append("\t").append(contentList.get(contentList.size() - 1));
				
				//在最后面 加入唯一标识
				stringBuilder.append("!").append(uniqueMark).append(i);
				
				//截取 日期 2014-03-05
				String date = stringBuilder.substring(0, 10);
				
				//文件名
				String fileName = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

				//字符串样式etl内容!唯一标识%生成文件的目录
				stringBuilder.append("%").append(date).append("/").append(prefix).append(fileName).append("/").append(fileName);
				
				resultList.add(stringBuilder.toString());
			}
			
			return resultList;
		}
		
		return new ArrayList<String>();
	}
	
	//神鬼
	@SuppressWarnings("rawtypes")
	private static List<String> sg_cslog1_log_deathinfo_etl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

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
//					if(StringUtils.isBlank(matcherString)) {
//						matcherString = " ";
//					}
					
					//其他的是 etl 解析的
					sb.append(matcherString).append( "\t");
				}
			}
		    
			//最后匹配上的
			String lastMatcher = matcher.group(number-1);
			//组合的集合
			List<String> combinationList = new ArrayList<String>();
			
			if(lastMatcher.contains("LoseItemID")) {
				StringTokenizer stringTokenizer = new StringTokenizer(lastMatcher);
				
				//组合StringBuilder
				StringBuilder combinationStringBuilder = new StringBuilder();
				
				while(stringTokenizer.hasMoreTokens()) {
					String str = stringTokenizer.nextToken();
					
					if(str.contains("LoseItemID")) {
						combinationStringBuilder.append(GameTool.getStringTokenizerLastValue(str, ":")).append( "\t");
					}else if(str.contains("LoseItemNums")) {
						combinationStringBuilder.append(GameTool.getStringTokenizerLastValue(str, ":"));
						//加入集合
						combinationList.add(combinationStringBuilder.toString());
						//清空
						combinationStringBuilder.delete(0, combinationStringBuilder.length());
					}
				}
				
				List<String> list = new ArrayList<String>();
				
				//遍历
				for(int i = 0 ; i < combinationList.size(); i++) {
					StringBuilder stringBuilder = new StringBuilder();
					stringBuilder.append(sb.toString()).append(combinationList.get(i));
					
					//在最后面 加入唯一标识
					stringBuilder.append("!").append(uniqueMark).append(i);
					
					//唯一标识按“=” 切割 
					StringTokenizer st =  new StringTokenizer(uniqueMark,"=");	
					
					//	取得服务器组号
					String  groupNumnber = GameTool.getStringTokenizerLastValue(st) + "\t";
					
					//20 这个位置是时间日期的长度 不会改变
					stringBuilder.insert(20,groupNumnber);
					
					//截取 日期 2014-03-05
					String date = stringBuilder.substring(0, 10);
					
					//文件名
					String fileName = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

					//字符串样式etl内容!唯一标识%生成文件的目录
					stringBuilder.append("%").append(date).append("/").append(prefix).append(fileName).append("/").append(fileName);
					
					list.add(stringBuilder.toString());
				}
				
				return list;
				
			}else {
				sb.append( "\t");
			}
			
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
		
		return new ArrayList<String>();
	}
	
	//神鬼世界
	@SuppressWarnings("rawtypes")
	private static List<String> sgsj_cslog1_log_deal_etl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return new ArrayList<String>();
		}
		
		Matcher matcher = pattern.matcher(line);
		
		//如果匹配上了
		if(matcher.find()) {
			//计数器
			GameTool.countAnalyzeKeyNumber(prefix + gameKindFilterType, context);
			
			//匹配的数量
			int number = matcher.groupCount();
			
			//唯一标识
			String uniqueMark = "";
			
			//内容集合
			List <String> contentList = new ArrayList<String>();
			
			//循环 number -1  最后一个不要 
			//
			for(int i = 1; i <= number - 1; i++) {
				if(i == 1) {
					//第一个字段就是唯一标识的
					uniqueMark = matcher.group(i);
				}
				else {
					contentList.add(matcher.group(i));
				}
			}
			
			//	取得服务器组号
			String  groupNumnber = GameTool.getStringTokenizerLastValue(uniqueMark,"=");
			
			//倒数第三
			String lastThirdStr = contentList.get(contentList.size() - 3);
			//正数第四的位置
			String fourthStr = contentList.get(3);
			
			Map<Integer,String> lastThirdStrMap = new HashMap<Integer,String>();
			Map<Integer,String> fourthStrMap = new HashMap<Integer,String>();
			
			if(fourthStr.contains("[") &&  fourthStr.contains("]")) {
				fourthStr = fourthStr.substring(1, fourthStr.length() - 1);
				
				//分号切割
				StringTokenizer semicolonStringTokenizer = new StringTokenizer(fourthStr,";");
				
				int time = 0;
				
				while(semicolonStringTokenizer.hasMoreTokens()) {
					//分号切割的内容
					String semicolonStr = semicolonStringTokenizer.nextToken();
					
					//冒号切割
					StringTokenizer colonStringTokenizer = new StringTokenizer(semicolonStr,":");
					
					if(colonStringTokenizer.countTokens() == 3) {
						StringBuilder colonStringBuilder = new StringBuilder();
						
						colonStringBuilder.append(colonStringTokenizer.nextToken()).append("\t");
						colonStringTokenizer.nextToken();
						colonStringBuilder.append(colonStringTokenizer.nextToken());
						
						time++;
						
						fourthStrMap.put(time, colonStringBuilder.toString());
					}
				}
			}
			
			if(lastThirdStr.contains("[") &&  lastThirdStr.contains("]")) {
				lastThirdStr = lastThirdStr.substring(1, lastThirdStr.length() - 1);
				
				//分号切割
				StringTokenizer semicolonStringTokenizer = new StringTokenizer(lastThirdStr,";");
				
				int time = 0;
				
				while(semicolonStringTokenizer.hasMoreTokens()) {
					//分号切割的内容
					String semicolonStr = semicolonStringTokenizer.nextToken();
					
					//冒号切割
					StringTokenizer colonStringTokenizer = new StringTokenizer(semicolonStr,":");
					
					if(colonStringTokenizer.countTokens() == 3) {
						StringBuilder colonStringBuilder = new StringBuilder();
						
						colonStringBuilder.append(colonStringTokenizer.nextToken()).append("\t");
						colonStringTokenizer.nextToken();
						colonStringBuilder.append(colonStringTokenizer.nextToken());
						
						time++;
						
						lastThirdStrMap.put(time, colonStringBuilder.toString());
					}
				}
			}
			
			//所有的组合
			List <String> allCombinationList = new ArrayList<String>();
			//结果集合
			List<String> resultList = new ArrayList<String>();
			
			//都没有数据
			if(fourthStrMap.size() == 0 && lastThirdStrMap.size() == 0) {
				return resultList;
			}else {
				int maxSzie = fourthStrMap.size();
				int lastThirdStrListSize = lastThirdStrMap.size();
				
				//最大的数
				if(maxSzie < lastThirdStrListSize) {
					maxSzie = lastThirdStrListSize;
				}
				
				//空的
				StringBuilder blankStringBuilder = new StringBuilder();
				blankStringBuilder.append("0").append("\t").append("0");
				
				for(int i = 1; i <= maxSzie; i++ ) {
					String fourthStrContent =  fourthStrMap.get(i);
					String lastThirdStrContent =  lastThirdStrMap.get(i);
					
					if(fourthStrContent == null) {
						fourthStrContent = blankStringBuilder.toString();
					}
					
					if(lastThirdStrContent == null) {
						lastThirdStrContent = blankStringBuilder.toString();
					}
					
					StringBuilder stringBuilder = new StringBuilder();
					
					String fifthStr = contentList.get(5);
					
					//空就补零
					if(StringUtils.isBlank(fifthStr)) {
						fifthStr = "0";
					}
					
					stringBuilder.append(fourthStrContent).append("\t").append(fifthStr).append("\t").
					append(contentList.get(6)).append("\t").append("\t").append(lastThirdStrContent);
					
					allCombinationList.add(stringBuilder.toString());
				}
			}
			
			for(int i = 0 ; i < allCombinationList.size(); i++) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(contentList.get(0)).append("\t").append(groupNumnber).append("\t").
				append(contentList.get(1)).append("\t").append("\t").append(allCombinationList.get(i)).append("\t").append(contentList.get(contentList.size() - 1));
				
				//在最后面 加入唯一标识
				stringBuilder.append("!").append(uniqueMark).append(i);
				
				//截取 日期 2014-03-05
				String date = stringBuilder.substring(0, 10);
				
				//文件名
				String fileName = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

				//字符串样式etl内容!唯一标识%生成文件的目录
				stringBuilder.append("%").append(date).append("/").append(prefix).append(fileName).append("/").append(fileName);
				
				resultList.add(stringBuilder.toString());
			}
			
			return resultList;
		}
		
		return new ArrayList<String>();
	}
	
	//神鬼世界
	@SuppressWarnings("rawtypes")
	private static List<String> sgsj_cslog1_log_deathinfo_etl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

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
//					if(StringUtils.isBlank(matcherString)) {
//						matcherString = " ";
//					}
					
					//其他的是 etl 解析的
					sb.append(matcherString).append( "\t");
				}
			}
		    
			//最后匹配上的
			String lastMatcher = matcher.group(number-1);
			//组合的集合
			List<String> combinationList = new ArrayList<String>();
			
			if(lastMatcher.contains("LoseItemID")) {
				StringTokenizer stringTokenizer = new StringTokenizer(lastMatcher);
				
				//组合StringBuilder
				StringBuilder combinationStringBuilder = new StringBuilder();
				
				while(stringTokenizer.hasMoreTokens()) {
					String str = stringTokenizer.nextToken();
					
					if(str.contains("LoseItemID")) {
						combinationStringBuilder.append(GameTool.getStringTokenizerLastValue(str, ":")).append( "\t");
					}else if(str.contains("LoseItemNums")) {
						combinationStringBuilder.append(GameTool.getStringTokenizerLastValue(str, ":"));
						//加入集合
						combinationList.add(combinationStringBuilder.toString());
						//清空
						combinationStringBuilder.delete(0, combinationStringBuilder.length());
					}
				}
				
				List<String> list = new ArrayList<String>();
				
				//遍历
				for(int i = 0 ; i < combinationList.size(); i++) {
					StringBuilder stringBuilder = new StringBuilder();
					stringBuilder.append(sb.toString()).append(combinationList.get(i));
					
					//在最后面 加入唯一标识
					stringBuilder.append("!").append(uniqueMark).append(i);
					
					//唯一标识按“=” 切割 
					StringTokenizer st =  new StringTokenizer(uniqueMark,"=");	
					
					//	取得服务器组号
					String  groupNumnber = GameTool.getStringTokenizerLastValue(st) + "\t";
					
					//20 这个位置是时间日期的长度 不会改变
					stringBuilder.insert(20,groupNumnber);
					
					//截取 日期 2014-03-05
					String date = stringBuilder.substring(0, 10);
					
					//文件名
					String fileName = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

					//字符串样式etl内容!唯一标识%生成文件的目录
					stringBuilder.append("%").append(date).append("/").append(prefix).append(fileName).append("/").append(fileName);
					
					list.add(stringBuilder.toString());
				}
				
				return list;
				
			}else {
				sb.append( "\t");
			}
			
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
		
		return new ArrayList<String>();
	}
	
	/*
	 * 清洗
	 */
	@SuppressWarnings("rawtypes")
	private static List<String> onlineuserEtl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//通过正则的名称，得到正则表达式
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return new ArrayList<String>();
		}
		
		//开始匹配
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
				}//取得时间
				else if(i == 2) {
					//匹配的日期
					String dateString = matcher.group(i);
					
					StringTokenizer colonStringTokenizer = new StringTokenizer(dateString,":");//
					
					StringBuilder dateStringBuilder = new StringBuilder();
					//如果切开了
					if(colonStringTokenizer.countTokens() == 3) {
						dateStringBuilder.append(colonStringTokenizer.nextToken()).append(":");
						
						int min = Integer.parseInt(colonStringTokenizer.nextToken()) / 5 * 5;
						
						if(min >=10) {
							dateStringBuilder.append(min).append(":");
						}else if(min < 10) {
							dateStringBuilder.append("0").append(min).append(":");
						}
						
						dateStringBuilder.append("00");
						
						sb.append(dateStringBuilder.toString()).append( "\t");
					}
				}
				else {
					//匹配的内容
					String matcherString = matcher.group(i);
					
					//如果为 空 字符串
//					if(StringUtils.isBlank(matcherString)) {
//						matcherString = " ";
//					}
					
					//其他的是 etl 解析的
					sb.append(matcherString).append( "\t");
				}
			}
		    
			//最后匹配上的
			String lastMatcher = matcher.group(number-1);
			
			//如果为空
//			if(StringUtils.isBlank(lastMatcher)) {
//				//加入最后一行 解析 解决最后一位不需要
//				//制表符的问题
//				sb.append(" ");
//			}else{
				sb.append(lastMatcher);
			//}
			
			//在最后面 加入唯一标识
			sb.append("!").append(uniqueMark);
			
			//唯一标识按“=” 切割 
			StringTokenizer st =  new StringTokenizer(uniqueMark,"=");	
			
			//	取得服务器组号 和 固定字符
			String  groupNumnberAndFixString = GameTool.getStringTokenizerLastValue(st) + "\t" + pro.getProperty("onlineuser.fix.string") + "\t";
			
			//20 这个位置是时间日期的长度 不会改变
			sb.insert(20,groupNumnberAndFixString);
			
			//截取 日期 2014-03-05
			String date = sb.substring(0, 10);
			
			gameKindFilterType = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

			//字符串样式etl内容!唯一标识%生成文件的目录
			sb.append("%").append(date).append("/").append(prefix).append(gameKindFilterType).append("/").append(gameKindFilterType);
			
			
			List<String> list = new ArrayList<String>();
			list.add(sb.toString());
			
			return list;
		}
		
		return new ArrayList<String>();
	}
	
	
	/*
	 * 清洗
	 * gameKindFilterType=stone_cobine 正则表达式的名称
	 */
	@SuppressWarnings("rawtypes")
	private static List<String> commonEtl(String prefix,Properties pro,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开，得到正则表达式
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return new ArrayList<String>();
		}
		
		Matcher matcher = pattern.matcher(line);
		
		//如果匹配上了
		if(matcher.find()) {
			//说明一个文件是多个正则
			//每个正则的关键字还不一致
			String hasIndexNumber = pro.getProperty(gameKindFilterType + ".has.index.number");
			
			//真的文件名称
			String realFileName = "";
			
			//获取正确的文件名称
			if(hasIndexNumber != null) {
				//真的文件名称
				realFileName = GameTool.getRealFileName(gameKindFilterType);
				GameTool.countAnalyzeKeyNumber(prefix + realFileName, context);
			}else {
				//计数器
				GameTool.countAnalyzeKeyNumber(prefix + gameKindFilterType, context);
			}
			
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
//					if(StringUtils.isBlank(matcherString)) {
//						matcherString = " ";
//					}
					
					//其他的是 etl 解析的
					sb.append(matcherString).append( "\t");
				}
			}
		    
			//最后匹配上的
			String lastMatcher = matcher.group(number-1);
			
			//如果为空
//			if(StringUtils.isBlank(lastMatcher)) {
//				//加入最后一行 解析 解决最后一位不需要
//				//制表符的问题
//				sb.append(" ");
//			}else{
				sb.append(lastMatcher);
	//		}
			
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
			
			if(hasIndexNumber != null) {
				//文件名称
				String fileName = GameTool.FILE_NAME_PREFIX + realFileName;

				sb.append("%").append(date).append("/").append(prefix).append(fileName).append("/").append(fileName);
			}else {
				gameKindFilterType = GameTool.FILE_NAME_PREFIX + gameKindFilterType;
				
				//字符串样式etl内容!唯一标识%生成文件的目录
				sb.append("%").append(date).append("/").append(prefix).append(gameKindFilterType).append("/").append(gameKindFilterType);
			}
			
			List<String> list = new ArrayList<String>();
			list.add(sb.toString());
			
			return list;
		}
		
		return new ArrayList<String>();
	}
}
