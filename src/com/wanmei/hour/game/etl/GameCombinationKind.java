package com.wanmei.hour.game.etl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.mapreduce.Mapper.Context;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameTool;

/**
 *  組合匹配
 *@author lihui
 *
 *  2014-3-14  下午03:47:11
 */
public class GameCombinationKind {
	/*
	 * 清洗
	 */
	@SuppressWarnings("rawtypes")
	public static List<String> etl(String prefix,String gameKindFilterType,String combinationInformation,String line,Map <String,Pattern> patternMap,Context context) {
		String content = analyze(prefix,gameKindFilterType, line, patternMap,context);
		
		//如果沒有分析出來
		if(content == null){
			return new ArrayList<String>();
		}
		
		//;分割
		StringTokenizer semicolonStringTokenizer = new StringTokenizer(combinationInformation,";");
		//第一位置
		int index1 = Integer.parseInt(semicolonStringTokenizer.nextToken()) + 1;
		//第二位置
		int index2 = Integer.parseInt(semicolonStringTokenizer.nextToken()) + 1;
		
		//分割
		StringTokenizer  tabStringTokenizer = new StringTokenizer(content,"\t");
		//匹配的数量
		int countTokens = tabStringTokenizer.countTokens();
		//顺序
		int index = 0;
		//组合一 组合二
		String combination1 = null;
		String combination2 = null;
		
		//前缀StringBuilder
		StringBuilder prefixStringBuilder = new StringBuilder();
		//后缀
		String suffixString = "";
		
		while(tabStringTokenizer.hasMoreTokens()) {
			//解析的值
			String value = tabStringTokenizer.nextToken().trim();
			//++
			index ++;

			if(index == index1) {
				combination1 = value;
			}else if(index == index2) {
				//如果是最后一个
				if(countTokens == index2){
					//分割
					StringTokenizer stringTokenizer = new StringTokenizer(value,"!");
					suffixString = GameTool.getStringTokenizerLastValue(stringTokenizer);
					combination2 = value.substring(0, value.length() - suffixString.length() -1);
				}else {
					combination2 = value;
				}
			}
			else{
				prefixStringBuilder.append(value).append("\t");
			}
		}
		
		//
		List<String> combination1_list = getGroup(combination1);
		List<String> combination2_list = getGroup(combination2);
		
		int combination1_list_size = combination1_list.size() ;
		int combination2_list_size = combination2_list.size() ;
		//最大的集合的值
		int max_list_size = combination1_list_size;
		
		//如果第一个长度大于第二个的长度
		if(combination1_list_size > combination2_list_size) {
			for(int i = 1; i <= (combination1_list_size - combination2_list_size); i++) {
				combination2_list.add("0" + "\t" + "0");
			}
		}
		
		if(combination2_list_size > combination1_list_size) {
			//最大值
			max_list_size = combination2_list_size;
			
			for(int i = 1; i <= (combination2_list_size - combination1_list_size); i++) {
				combination1_list.add("0" + "\t" + "0");
			}
		}
		
		List <String> combination_list = new ArrayList<String>();
		
		for(int i = 0; i < max_list_size; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(combination1_list.get(i)).append("\t").append(combination2_list.get(i));
			combination_list.add(sb.toString());
		}
		
		//内容的集合
		List <String> contentList = new ArrayList<String>();
		
		//
		for(int i = 0 ; i < combination_list.size(); i++) {
			StringBuilder contentStringBuilder = new StringBuilder();
			
			contentStringBuilder.append(prefixStringBuilder.toString()).append(combination_list.get(i)).
				append("!").append(suffixString).append("#combination").append(i);
			
			//截取 日期 2014-03-05
			String date = contentStringBuilder.substring(0, 10);
			
			String fileName = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

			//字符串样式etl内容!唯一标识%生成文件的目录
			contentStringBuilder.append("%").append(date).append("/").append(prefix).append(fileName).append("/").append(fileName);
			
			contentList.add(contentStringBuilder.toString());
		}
		
		return contentList;
	}
	
	//获得组合
	private static List<String> getGroup(String combination){
		StringTokenizer stringTokenizer = new StringTokenizer(combination,";");
		List <String> list = new ArrayList<String>();
		
		//如果
		if(stringTokenizer.countTokens() == 0) {
			list.add("0" + "\t" + "0");
		}
		else {
			while(stringTokenizer.hasMoreTokens()) {
				String group = stringTokenizer.nextToken().trim();
				StringTokenizer commaStringTokenizer = new StringTokenizer(group,",");
				
				if(commaStringTokenizer.countTokens() == 2) {
					list.add(commaStringTokenizer.nextToken().trim() + "\t" + commaStringTokenizer.nextToken().trim());
				}else {
					list.add("0" + "\t" + "0");
				}
			}
		}
		
		return list;
	}
	
	/*
	 * 解析
	 */
	@SuppressWarnings("rawtypes")
	private static String analyze(String prefix,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return null;
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
					if(StringUtils.isBlank(matcherString)) {
						matcherString = " ";
					}
					
					//其他的是 etl 解析的
					sb.append(matcherString + "\t");
				}
			}
		    
			//最后匹配上的
			String lastMatcher = matcher.group(number-1);
			
			//如果为空
			if(StringUtils.isBlank(lastMatcher)) {
				//加入最后一行 解析 解决最后一位不需要
				//制表符的问题
				sb.append(" ");
			}else{
				sb.append(lastMatcher);
			}
			
			//在最后面 加入唯一标识
			sb.append("!").append(uniqueMark);
			
			//唯一标识按“=” 切割 
			StringTokenizer st =  new StringTokenizer(uniqueMark,"=");	
			
			//	取得服务器组号
			String  groupNumnber = GameTool.getStringTokenizerLastValue(st) + "\t";
			
			//20 这个位置是时间日期的长度 不会改变
			sb.insert(20,groupNumnber);
			
			return sb.toString();
		}
		
		return null;
	}
}
