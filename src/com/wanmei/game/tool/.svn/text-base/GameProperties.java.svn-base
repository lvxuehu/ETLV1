package com.wanmei.game.tool;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *  游戏的读取配置文件
 *@author lihui
 *
 *  2013-8-12  下午05:16:53
 */
public class GameProperties {
	/**
	 * 
	 * @param getProperties 获得properties
	 */
	public static Properties getProperties(InputStream inputStream) {
		//Properties
		Properties properties = new Properties();
		
		try {
			inputStream = new BufferedInputStream(inputStream);

			properties.load(inputStream);
		} catch (Exception e) {
			return null;
		}
		
		return properties;
	}
	
	/**
	 * 
	 * @param getProperties 获得properties
	 */
	public static Properties getProperties(String gameName) {
		//Properties
		Properties properties = new Properties();
		InputStream inputStream = null;
		
		try {
			inputStream = new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + "/src/" + gameName + ".properties"));

			properties.load(inputStream);
		} catch (Exception e) {
			
		}
		
		return properties;
	}
	
	/**
	 *  这个文件是否存在
	 * @param gameName
	 * @return
	 */
	public static boolean isExist(InputStream inputStream) {
		return getProperties(inputStream) != null ? true : false;
	}
}
