package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2Log {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	//1
	public void recast_equip() {
		String text = "2014-03-06 00:00:03 backup gs008: info:玩家：528326708 重铸装备 主装备=82046 原料 82032x10;";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info:玩家：(\\d+) 重铸装备 主装备=(\\d+) 原料 (.*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"recast_equip");
	}
	
	//2
	public void scene_jump() {
		String text = "2014-03-06 12:31:47 database gs003: info:玩家: 790614022 同场景跳转 scene: 75, pos(-273.839630,25.049206,167.951447)";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info:玩家:\\s(\\d+) 同场景跳转 scene: (\\d+)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"scene_jump");
	}
	
	//3
	public void upgrade_legend_equip() {
		String text = "2014-03-06 00:05:49 database gs009: info:玩家：242802797 升级传说装备 主装备=82042, 原料 82032x20;";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info:玩家：(\\d+) 升级传说装备 主装备=(\\d+), 原料 (.*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"scene_jump");
	}
	
	public static void main(String[] args) {
		World2Log w = new World2Log();
		//w.recast_equip();
		w.scene_jump();
		//w.upgrade_legend_equip();
	}
}
