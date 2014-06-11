package com.wanmei.test.zx.regular;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;

public class World2Log {
	private void systemout(String text,String reg,String methodName) {
		Pattern p = new Pattern(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i < count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	//1
	public void vip_reward() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info : 用户(.+)领取VIP奖励id=(.+),item_id=(.+)$";
		
		systemout(text, reg, "vip_reward__");
	}
	
	public static void main(String[] args) {
		World2Log w = new World2Log();
		w.vip_reward();
	}
}
