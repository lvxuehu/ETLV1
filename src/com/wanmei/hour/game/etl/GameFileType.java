package com.wanmei.hour.game.etl;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameTool;


/**
 * 
 * 笑傲 读取文件路径的正则
 *@author lihui
 *
 *  2013-8-4  下午04:11:43
 */
public class GameFileType {
	/**
	 * 装配map 并且返回
	 * 分析提供的properties文件，提取此款游戏的参数，将log中涉及的所有正则表达式初始化到Map中。
	 * @return
	 */
	public static Map<String,Pattern> getPatternMap(Properties properties) {
		//map
		Map <String,Pattern> map =  new HashMap<String,Pattern>();
		
		//分割的符号，游戏log的文件名集合字符串分割符号
		String splitSymbol = properties.getProperty("game.split.symbol");//;
		//游戏文件名称过滤，游戏log的文件名称 
		//xa.world2.formatlog;xa.world2.log;xa.world2.action;xa.rolesbrief.csv;xa.new_rolesbrief.csv;
		String gameFileNameFilter = properties.getProperty("game.file.name.filter");
		//游戏日志正则表达式前缀 ^(.+)#
		String gameRegularFilterPrefix = properties.getProperty("game.regular.filter.prefix");
		
		//gameFileNameFilter 切分，log的文件名称集合
		StringTokenizer gameFileNameFilterStringTokenizer = new StringTokenizer(gameFileNameFilter,splitSymbol);
		//循环遍历 log文件名集合
		while(gameFileNameFilterStringTokenizer.hasMoreTokens()) {
			// 下一个遍历结果xa.world2.formatlog
			String gameFileNameFilterNextToken = gameFileNameFilterStringTokenizer.nextToken().trim();
			
			//这款游戏种类 需要过滤的 类型 xa.world2.formatlog.filter.type
			//sysmail;stone_combine;player_get_valuable_item;.......，这个log有多种过滤类型
			String gameKindFilterType = properties.getProperty(gameFileNameFilterNextToken + ".filter.type");
			
			//gameKindFilterType 切分
			StringTokenizer gameKindFilterTypeStringTokenizer = new StringTokenizer(gameKindFilterType,splitSymbol);
			
			//循环迭代，sysmail;stone_combine;player_get_valuable_item;.......的集合，每一个正则表达式，分析每一种过滤类型的表达式，put到map中。
			while(gameKindFilterTypeStringTokenizer.hasMoreTokens()) {
				//游戏种类过滤类型 下一个
				String gameKindFilterTypeNextToken = gameKindFilterTypeStringTokenizer.nextToken();
				
				//sysmail.regular.filter.key->(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsysmail\\b:sysid=(-?\\d+):sys_type=(-?\\d+):
				String regular = properties.getProperty(gameKindFilterTypeNextToken + ".regular.filter.key");
				
				//如果有正则表达式
				if(regular != null) {
					//表达式为 游戏日志前缀 + 游戏日志本身正则，^(.+)#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsysmail\\b:sysid=(-?\\d+):sys_type=(-?\\d+):
					Pattern pattern = new Pattern(GameTool.getUTF8String(gameRegularFilterPrefix + regular));
					//sysmail.regular.filter.key，^(.+)#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsysmail\\b:sysid=(-?\\d+):sys_type=(-?\\d+):
					map.put(gameKindFilterTypeNextToken, pattern);
				}
			}
		}
		
		return map;
	}
}
