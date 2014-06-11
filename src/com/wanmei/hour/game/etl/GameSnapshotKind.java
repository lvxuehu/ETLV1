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
 * 快照类游戏处理
 *@author lihui
 *
 *  2014-3-20  上午11:39:23
 */
public class GameSnapshotKind {
	@SuppressWarnings("rawtypes")
	public static List<String> etl(String yesterday,String gameFileName,String prefix,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context,Properties pro) {
		//不需要解析的组
		String noNeedEtlGroup = pro.getProperty(gameKindFilterType + ".no.need.etl.group");

		//不需要etl的组
		if(noNeedEtlGroup != null) {
			StringTokenizer colonStringTokenizer = new StringTokenizer(noNeedEtlGroup,pro.getProperty("game.split.symbol"));
			
			while(colonStringTokenizer.hasMoreTokens()) {
				//如果包含不需要解析的组号
				if(line.contains(colonStringTokenizer.nextToken())) {
					return new ArrayList<String>();
				}
			}
		}
		
		//
		if(gameFileName.equals("iwm.city.csv")) {
			return iwmCityCsv(yesterday, prefix, gameKindFilterType, line, patternMap, context);
		}else if(gameFileName.equals("sdxl.yuanbao.csv.end")) {
			return sdxlYuanbaoCsvEnd(yesterday, prefix, gameKindFilterType, line, patternMap, context);
		}else {
			String content = analyze(yesterday,prefix, gameKindFilterType, line, patternMap, context);
			//如果沒有分析出來
			if(content == null){
				return new ArrayList<String>();
			}
			
			//如果是xa.yuanbao.csv.end
			if(gameKindFilterType.equals("cashstat_rest") && gameFileName.equals("xa.yuanbao.csv.end")) {
				return xa_cashstat_restEtl(content);
			}else if(gameKindFilterType.equals("itemidtot_detail")){
				return itemidtot_detail(gameFileName, content);
			}else{
				return commonEtl(content);
			}
		}
	}
	
	//itemidtot_detail 方法里面判断
	private static List<String> itemidtot_detail(String gameFileName,String content) {
		if(gameFileName.equals("xa.items.csv.end")) {
			return xa_itemidtot_detailEtl(content);
		}else if(gameFileName.equals("sdsxs.items.end")) {
			return sdsxs_itemidtot_detailEtl(content);
		}else if(gameFileName.equals("sw.daily_review_role_rareitem")) {
			return sw_itemidtot_detailEtl(content);
		}else if(gameFileName.equals("sdxl.items.csv.end")) {
			return sdxl_itemidtot_detailEtl(content);
		}
		
		return new ArrayList<String>();
	}
	
	//神雕侠侣itemidtot_detailEtl
	private static List<String> sdxl_itemidtot_detailEtl(String content) {
		StringTokenizer markStringTokenizer = new StringTokenizer(content,"!");
		String lastValue = GameTool.getStringTokenizerLastValue(markStringTokenizer);
		//解析的内容
		String firstValue = content.substring(0,(content.length() - (lastValue.length() + 1)));
		
		StringTokenizer tabStringTokenizer = new StringTokenizer(firstValue,"\t");
		
		List <String> list = new ArrayList<String>();
		
		while(tabStringTokenizer.hasMoreTokens()) {
			list.add(tabStringTokenizer.nextToken().trim());
		}
	
		//存入组合数据
		List <String> stringList = new ArrayList<String>();
		
		if(list.size() == 5) {
			//要切分的
			String splitString = list.get(4);
			
			StringTokenizer semicolonStringTokenizer = new StringTokenizer(splitString,";");
			
			while(semicolonStringTokenizer.hasMoreTokens()) {
				String string = semicolonStringTokenizer.nextToken().trim();
				
				StringTokenizer colonStringTokenizer = new StringTokenizer(string,",");
				
				StringBuilder stringBuilder = new StringBuilder();
				
				while(colonStringTokenizer.hasMoreTokens()) {
					String str = colonStringTokenizer.nextToken().trim();
					stringBuilder.append(str).append("\t");
				}
				
				stringList.add(stringBuilder.toString());
			}
			
			List<String> contentList = new ArrayList<String>();
			
			//加入
			for(int i= 0 ; i < stringList.size(); i++) {
				StringBuilder sb = new StringBuilder();
				//重新组合
				sb.append(list.get(0)).append("\t").append(list.get(1)).append("\t").append(stringList.get(0)).
					append(list.get(2)).append("\t").append(list.get(3)).append("!").append(lastValue).append(i);
				
				contentList.add(sb.toString());
			}
			
			return contentList;
		}
		
		return new ArrayList<String>();
	}
	
	//圣王itemidtot_detailEtl
	private static List<String> sw_itemidtot_detailEtl(String content) {
		StringTokenizer markStringTokenizer = new StringTokenizer(content,"!");
		String lastValue = GameTool.getStringTokenizerLastValue(markStringTokenizer);
		//解析的内容
		String firstValue = content.substring(0,(content.length() - (lastValue.length() + 1)));
		
		StringTokenizer tabStringTokenizer = new StringTokenizer(firstValue,"\t");
		
		List <String> list = new ArrayList<String>();
		
		while(tabStringTokenizer.hasMoreTokens()) {
			list.add(tabStringTokenizer.nextToken().trim());
		}
	
		//存入组合数据
		List <String> stringList = new ArrayList<String>();
		
		if(list.size() == 5) {
			//要切分的
			String splitString = list.get(4);
			
			StringTokenizer semicolonStringTokenizer = new StringTokenizer(splitString,";");
			
			while(semicolonStringTokenizer.hasMoreTokens()) {
				String string = semicolonStringTokenizer.nextToken().trim();
				
				StringTokenizer colonStringTokenizer = new StringTokenizer(string,":");
				
				StringBuilder stringBuilder = new StringBuilder();
				
				while(colonStringTokenizer.hasMoreTokens()) {
					String str = colonStringTokenizer.nextToken().trim();
					stringBuilder.append(str).append("\t");
				}
				
				stringList.add(stringBuilder.toString());
			}
			
			List<String> contentList = new ArrayList<String>();
			
			//加入
			for(int i= 0 ; i < stringList.size(); i++) {
				StringBuilder sb = new StringBuilder();
				//重新组合
				sb.append(list.get(0)).append("\t").append(list.get(1)).append("\t").append(stringList.get(0)).
					append(list.get(3)).append("\t").append(list.get(2)).append("!").append(lastValue).append(i);
				
				contentList.add(sb.toString());
			}
			
			return contentList;
		}
		
		return new ArrayList<String>();
	}
	
	//sdxl.yuanbao.csv.end
	@SuppressWarnings("rawtypes")
	private static List<String> sdxlYuanbaoCsvEnd(String yesterday,String prefix,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		String yuanbao = analyze(yesterday,prefix, "yuanbao", line, patternMap, context);
		String cashstat_rest = analyze(yesterday,prefix, "cashstat_rest", line, patternMap, context);
		
		//集合
		List<String> list = new ArrayList<String>();
		
		if(yuanbao != null) {
			list.add(yuanbao);
		}
		
		if(cashstat_rest != null) {
			list.add(cashstat_rest);
		}
		
		return list;
	}
	
	//iwm.city.csv
	@SuppressWarnings("rawtypes")
	private static List<String> iwmCityCsv(String yesterday,String prefix,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		String city = analyze(yesterday,prefix, "city", line, patternMap, context);
		String factionmap = analyze(yesterday,prefix, "factionmap", line, patternMap, context);
		
		//集合
		List<String> list = new ArrayList<String>();
		
		if(city != null) {
			list.add(city);
		}
		
		if(factionmap != null) {
			list.add(factionmap);
		}
		
		return list;
	}
	
	
	//itemidtot_detailEtl
	private static List<String> sdsxs_itemidtot_detailEtl(String content) {
		//
		StringTokenizer markStringTokenizer = new StringTokenizer(content,"!");
		String lastValue = GameTool.getStringTokenizerLastValue(markStringTokenizer);
		//解析的内容
		String firstValue = content.substring(0,(content.length() - (lastValue.length() + 1)));
		
		StringTokenizer tabStringTokenizer = new StringTokenizer(firstValue,"\t");
		
		List <String> list = new ArrayList<String>();
		
		while(tabStringTokenizer.hasMoreTokens()) {
			list.add(tabStringTokenizer.nextToken().trim());
		}
		
		//存入组合数据
		List <String> stringList = new ArrayList<String>();
		
		if(list.size() == 7) {
			//要切分的
			String splitString = list.get(6);
			
			StringTokenizer semicolonStringTokenizer = new StringTokenizer(splitString,";");
			
			while(semicolonStringTokenizer.hasMoreTokens()) {
				String string = semicolonStringTokenizer.nextToken().trim();
				
				StringTokenizer colonStringTokenizer = new StringTokenizer(string,",");
				
				StringBuilder stringBuilder = new StringBuilder();
				
				while(colonStringTokenizer.hasMoreTokens()) {
					String str = colonStringTokenizer.nextToken().trim();
					stringBuilder.append(str).append("\t");
				}
				
				stringList.add(stringBuilder.toString());
			}
			
			List<String> contentList = new ArrayList<String>();
			
			//加入
			for(String str : stringList) {
				StringBuilder sb = new StringBuilder();
				//重新组合
				sb.append(list.get(0)).append("\t").append(list.get(1)).append("\t").append(str).
					append(list.get(5)).append("\t").append(list.get(4)).append("\t").append(list.get(3)).
					append("\t").append(list.get(2)).append("!").append(lastValue);
				
				contentList.add(sb.toString());
			}
			
			return contentList;
		}
		
		return new ArrayList<String>();
	}
	
	//itemidtot_detailEtl
	private static List<String> xa_itemidtot_detailEtl(String content) {
		//
		StringTokenizer markStringTokenizer = new StringTokenizer(content,"!");
		String lastValue = GameTool.getStringTokenizerLastValue(markStringTokenizer);
		//解析的内容
		String firstValue = content.substring(0,(content.length() - (lastValue.length() + 1)));
		
		StringTokenizer tabStringTokenizer = new StringTokenizer(firstValue,"\t");
		
		List <String> list = new ArrayList<String>();
		
		while(tabStringTokenizer.hasMoreTokens()) {
			list.add(tabStringTokenizer.nextToken().trim());
		}
		
		//存入组合数据
		List <String> stringList = new ArrayList<String>();
		
		if(list.size() == 5) {
			//要切分的
			String splitString = list.get(4);
			
			StringTokenizer semicolonStringTokenizer = new StringTokenizer(splitString,";");
			
			while(semicolonStringTokenizer.hasMoreTokens()) {
				String string = semicolonStringTokenizer.nextToken().trim();
				
				StringTokenizer colonStringTokenizer = new StringTokenizer(string,":");
				
				StringBuilder stringBuilder = new StringBuilder();
				
				while(colonStringTokenizer.hasMoreTokens()) {
					String str = colonStringTokenizer.nextToken().trim();
					stringBuilder.append(str).append("\t");
				}
				
				stringList.add(stringBuilder.toString());
			}
			
			List<String> contentList = new ArrayList<String>();
			
			//加入
			for(String str : stringList) {
				StringBuilder sb = new StringBuilder();
				//重新组合
				sb.append(list.get(0)).append("\t").append(list.get(1)).append("\t").append(str).
					append(list.get(2)).append("\t").append(list.get(3)).append("!").append(lastValue);
				
				contentList.add(sb.toString());
			}
			
			return contentList;
		}
		
		return new ArrayList<String>();
	}
	
	//cashstat_rest
	private static List<String> xa_cashstat_restEtl(String content) {
		//
		StringTokenizer markStringTokenizer = new StringTokenizer(content,"!");
		String lastValue = GameTool.getStringTokenizerLastValue(markStringTokenizer);
		//解析的内容
		String firstValue = content.substring(0,(content.length() - (lastValue.length() + 1)));
		
		StringTokenizer tabStringTokenizer = new StringTokenizer(firstValue,"\t");
		
		List <String> list = new ArrayList<String>();
		
		while(tabStringTokenizer.hasMoreTokens()) {
			list.add(tabStringTokenizer.nextToken().trim());
		}
		
		StringBuilder sb = new StringBuilder();
		
		//最后加入的值
		String lastContent = " ";
		
		for(int i = 0; i < list.size(); i ++) {
			if(i == 3) {
				lastContent = list.get(i);
				//跳过
				continue;
			}
			
			sb.append(list.get(i)).append("\t");
		}
		
		//重新组合
		sb.append(lastContent).append("!").append(lastValue);
		
		List<String> contentList = new ArrayList<String>();
		contentList.add(sb.toString());
		
		return contentList;
	}
	
	//一般的etl
	private static List<String> commonEtl(String content) {
		List<String> contentList = new ArrayList<String>();
		contentList.add(content);
		
		return contentList;
	}
	
	/*
	 * 清洗
	 */
	@SuppressWarnings("rawtypes")
	private static String analyze(String yesterday,String prefix,String gameKindFilterType,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return null;
		}
		
		String countName = prefix + gameKindFilterType;
		
		//快照类的 没法用关键字判断
		//可以全都默认认为全都匹配
		GameTool.countContainKeyNumber(countName, context);

		Matcher matcher = pattern.matcher(line);
	
		//如果匹配上了
		if(matcher.find()) {
			GameTool.countAnalyzeKeyNumber(countName, context);
			
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
					sb.append(matcherString + "\t");
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
			
			//	取得服务器组号
			String  groupNumnber = GameTool.getStringTokenizerLastValue(st) + "\t";
			
			//加入组号
			sb.insert(0,groupNumnber);
			
			
			//加入时间
			sb.insert(0,yesterday + "\t");
			
			StringBuilder stringBuilder = new StringBuilder();
			
			gameKindFilterType = GameTool.FILE_NAME_PREFIX + gameKindFilterType;
			
			stringBuilder.append(sb.toString()).append("%").append(yesterday)
			.append("/").append(prefix).append(gameKindFilterType).append("/").append(gameKindFilterType);
			
			return stringBuilder.toString();
		}
		
		return null;
	}
}
