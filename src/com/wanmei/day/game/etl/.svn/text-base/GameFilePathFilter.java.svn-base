package com.wanmei.day.game.etl;

import java.util.Properties;
import java.util.StringTokenizer;

/**
 * 每天处理 读取文件路径过滤
 *@author lihui
 *
 *  2014-3-6  上午11:07:41
 */
public class GameFilePathFilter {
	/**
	 * 输入的文件路径是否是 要处理的
	 * @param filePath 读取路径
	 * @param properties 配置文件
	 * @return
	 */
	public static boolean contains(String filePath,Properties properties) {
		//分割的符号
		String splitSymbol = properties.getProperty("game.split.symbol");
		//游戏文件名称过滤
		String gameFileNameFilter = properties.getProperty("game.file.name.filter");
		//gameFileNameFilter 切分
		StringTokenizer gameFileNameFilterStringTokenizer = new StringTokenizer(gameFileNameFilter,splitSymbol);
		
		//循环遍历
		while(gameFileNameFilterStringTokenizer.hasMoreTokens()) {
			// 下一个遍历结果
			String gameFileNameFilterNextToken = gameFileNameFilterStringTokenizer.nextToken().trim();
	
			//如果包含
			if(filePath.contains(gameFileNameFilterNextToken)) {
				return true;
			}
		}
		
		return false;
	}
}
