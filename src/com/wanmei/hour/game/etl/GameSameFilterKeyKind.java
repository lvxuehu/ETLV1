package com.wanmei.hour.game.etl;

import java.util.ArrayList;
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
 * 拥有相同的过滤关键字
 *@author lihui
 *
 *  2014-5-14  下午01:47:18
 */
public class GameSameFilterKeyKind {
	/**
	 * 相同过滤关键字etl 处理
	 * @param prefix 目录前缀
	 * @param line 一行日志
	 * @param patternMap 正则map
	 * @param context 计数器用
	 * @param gameFileName 读入的游戏大文件名称
	 * @param sameFilterKey 相同的过滤关键字
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static List<String> etl(Properties pro,String prefix,String line,Map <String,Pattern> patternMap,Context context,String gameFileName,String sameFilterKey) {
		if(sameFilterKey.equals("clear360") && (gameFileName.equals("iwm.world2.formatlog") || 
		   gameFileName.equals("zx.world2.formatlog") || gameFileName.equals("sdxl.world2.formatlog") 
		   || gameFileName.equals("sgsj.world2.formatlog") || gameFileName.equals("wl.world2.formatlog") 
		   || gameFileName.equals("cb.world2.formatlog") || gameFileName.equals("mz.world2.formatlog") 
		   || gameFileName.equals("sg.world2.formatlog"))) {
			return clear360Etl(pro,prefix, line, patternMap, context,gameFileName);
		}else if(sameFilterKey.equals("yuanbao_recharge") && gameFileName.equals("sw.world2.formatlog")) {
			return sw_yuanbao_etl(pro,prefix, line, patternMap, context);
		}else if(gameFileName.equals("sgsj.world2.formatlog")) {
			return sgsj_samefilter__etl(pro, sameFilterKey, prefix, line, patternMap, context);
		}else if(gameFileName.equals("sg.world2.formatlog")) {
			return sg_samefilter__etl(pro, sameFilterKey, prefix, line, patternMap, context);
		}
		
		return new ArrayList<String>();
	}
	
	//神鬼相同的过滤关键字
	@SuppressWarnings("rawtypes")
	private static List<String> sg_samefilter__etl(Properties pro,String sameFilterKey,String prefix,String line,Map <String,Pattern> patternMap,Context context) {
		List <String> list = new ArrayList<String>();
		
		if(sameFilterKey.equals("goldconsign:buy:ID")) {
			List<String> sgsj_goldconsignbuy_list = commonEtl(pro,prefix, line, patternMap, context,"goldconsignbuy");
			List<String> sgsj_stockbalance_list = commonEtl(pro,prefix, line, patternMap, context,"stockbalance");
			
			list.addAll(sgsj_goldconsignbuy_list);
			list.addAll(sgsj_stockbalance_list);
		}
		
		return list;
	}
	
	//神鬼世界相同的过滤关键字
	@SuppressWarnings("rawtypes")
	private static List<String> sgsj_samefilter__etl(Properties pro,String sameFilterKey,String prefix,String line,Map <String,Pattern> patternMap,Context context) {
		List <String> list = new ArrayList<String>();
		
		if(sameFilterKey.equals("goldconsign:buy:ID")) {
			List<String> sgsj_goldconsignbuy_list = commonEtl(pro,prefix, line, patternMap, context,"goldconsignbuy");
			List<String> sgsj_stockbalance_list = commonEtl(pro,prefix, line, patternMap, context,"stockbalance_1");
			
			list.addAll(sgsj_goldconsignbuy_list);
			list.addAll(sgsj_stockbalance_list);
		}else if(sameFilterKey.equals("goldconsign:sell:ID")) {
			List<String> sgsj_goldconsignsell_list = commonEtl(pro,prefix, line, patternMap, context,"goldconsignsell");
			List<String> sgsj_stockbalance_list = commonEtl(pro,prefix, line, patternMap, context,"stockbalance_2");
			
			list.addAll(sgsj_goldconsignsell_list);
			list.addAll(sgsj_stockbalance_list);
		}else if(sameFilterKey.equals("BuyType=1")) {
			List<String> sgsj_shop_buy_list = commonEtl(pro,prefix, line, patternMap, context,"shop_buy");
			List<String> sgsj_shoptrade_list = commonEtl(pro,prefix, line, patternMap, context,"shoptrade");
			
			list.addAll(sgsj_shop_buy_list);
			list.addAll(sgsj_shoptrade_list);
		}else if(sameFilterKey.equals("BuyType=3")) {
			List<String> sgsj_shop_buy_list = commonEtl(pro,prefix, line, patternMap, context,"shop_buy");
			List<String> sgsj_shop_list = commonEtl(pro,prefix, line, patternMap, context,"shop");
			
			list.addAll(sgsj_shop_buy_list);
			list.addAll(sgsj_shop_list);
		}
		
		return list;
	}
	
	/*
	 * 圣王的清洗
	 */
	@SuppressWarnings("rawtypes")
	private static List<String> sw_yuanbao_etl(Properties pro,String prefix,String line,Map <String,Pattern> patternMap,Context context) {
		List<String> sw_addcash_list = commonEtl(pro,prefix, line, patternMap, context,"addcash");
		List<String> sw_yuanbao_recharge_list = commonEtl(pro,prefix, line, patternMap, context,"yuanbao_recharge");
		
		//全包含
		List <String>list = new ArrayList<String>();
		list.addAll(sw_addcash_list);
		list.addAll(sw_yuanbao_recharge_list);
		
		return list;
	}
	
	/*
	 * 清洗
	 */
	@SuppressWarnings("rawtypes")
	private static List<String> clear360Etl(Properties pro,String prefix,String line,Map <String,Pattern> patternMap,Context context,String gameFileName) {
		List<String> clear360cashList = commonEtl(pro,prefix, line, patternMap, context,"clear360cash");
		List<String> clear360itemList = clear360itemEtl(prefix, line, patternMap, context,gameFileName);
		
		//全包含
		List <String>list = new ArrayList<String>();
		list.addAll(clear360cashList);
		list.addAll(clear360itemList);
		
		return list;
	}
	
	@SuppressWarnings("rawtypes")
	private static List<String> clear360itemEtl(String prefix,String line,Map <String,Pattern> patternMap,Context context,String gameFileName) {
		String gameKindFilterType = "clear360item";
		
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return new ArrayList<String>();
		}
		
		Matcher matcher = pattern.matcher(line);
		
		//如果匹配上了
		if(matcher.find()) {
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
			
			//结果内容集合
			List <String> list = new ArrayList<String>();
			
			//如果为空
			if(StringUtils.isBlank(lastMatcher)) {
				//加入最后一行 解析 解决最后一位不需要
				//制表符的问题
				//sb.append(" ").append("\t").append(" ");
				sb.append("").append("\t").append("");
				list.add(sb.toString());
			}else {
				StringTokenizer semicolonStringTokenizer = new StringTokenizer(lastMatcher,";");
				
				while(semicolonStringTokenizer.hasMoreTokens()) {
					String string = semicolonStringTokenizer.nextToken().trim();
					
					StringTokenizer colonStringTokenizer = null;
					
					if(gameFileName.equals("sdxl.world2.formatlog")) {
						colonStringTokenizer = new StringTokenizer(string,",");
					}else {
						colonStringTokenizer = new StringTokenizer(string,":");
					}
					
					if(colonStringTokenizer.countTokens() > 1) {
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append(colonStringTokenizer.nextToken().trim()).append("\t").append(colonStringTokenizer.nextToken().trim());
						
						//加入
						list.add(stringBuilder.insert(0, sb.toString()).toString());
					}
				}
			}
			
			//清洗内容的集合
			List <String> contentList = new ArrayList<String>();
			
			for(int i = 0; i < list.size(); i++) {
				String countName = prefix + gameKindFilterType;
				
				//计数器
				GameTool.countContainKeyNumber(countName, context);
				GameTool.countAnalyzeKeyNumber(countName, context);
				
				StringBuilder stringBuilder = new StringBuilder();
				//在最后面 加入唯一标识
				stringBuilder.append(list.get(i)).append("!").append(uniqueMark).append(i);
				
				//唯一标识按“=” 切割 
				StringTokenizer st =  new StringTokenizer(uniqueMark,"=");	
				
				//	取得服务器组号
				String  groupNumnber = GameTool.getStringTokenizerLastValue(st) + "\t";
				
				//20 这个位置是时间日期的长度 不会改变
				stringBuilder.insert(20,groupNumnber);
				
				//截取 日期 2014-03-05
				String date = stringBuilder.substring(0, 10);
				
				String fileName = GameTool.FILE_NAME_PREFIX + gameKindFilterType;
				//字符串样式etl内容!唯一标识%生成文件的目录
				stringBuilder.append("%").append(date).append("/").append(prefix).append(fileName).append("/").append(fileName);
				
				contentList.add(stringBuilder.toString());
			}
			
			return contentList;
		}
		
		return new ArrayList<String>();
	}
	
	//公用的
	@SuppressWarnings("rawtypes")
	private static List<String> commonEtl(Properties pro,String prefix,String line,Map <String,Pattern> patternMap,Context context,String gameKindFilterType) {
		//切分的开
		Pattern pattern = patternMap.get(gameKindFilterType);

		//如果map中不存在
		if(pattern == null) {
			return new ArrayList<String>();
		}
		
		Matcher matcher = pattern.matcher(line);
		
		//说明一个文件是多个正则
		//每个正则的关键字还不一致
		String hasIndexNumber = pro.getProperty(gameKindFilterType + ".has.index.number");
		
		//获取正确的文件名称
		if(hasIndexNumber != null) {
			//真的文件名称
			String realFileName = GameTool.getRealFileName(gameKindFilterType);
			GameTool.countContainKeyNumber(prefix + realFileName, context);
		}else{
			//通过了说明包含解析的key
			GameTool.countContainKeyNumber(prefix + gameKindFilterType, context);
		}
		
		//如果匹配上了
		if(matcher.find()) {
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
					sb.append(matcherString + "\t");
				}
			}
		    
			//最后匹配上的
			String lastMatcher = matcher.group(number-1);
			
//			//如果为空
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
			
			List <String> list = new ArrayList<String>();
			list.add(sb.toString());
			
			return list;
		}
		
		return new ArrayList<String>();
	}
}
