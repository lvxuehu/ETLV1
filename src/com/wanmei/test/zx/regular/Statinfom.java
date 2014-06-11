package com.wanmei.test.zx.regular;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;

public class Statinfom {
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
	public void statinfom_1() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bLevel\\b=(.+):(.+):(.+):(.+):(-?\\d+)$";
		
		systemout(text, reg, "statinfom_1___");
	}
	
	//2
	public void statinfom_2() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoneyPut\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		systemout(text, reg, "statinfom_2_____");
	}
	
	//3
	public void statinfom_3() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoney\\b=(.+):(.+):(.+):(.+):(-?\\d+)$";
		
		systemout(text, reg, "statinfom_3______");
	}
	
	//4
	public void statinfom_4() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bItemPut\\b=(.+):(.+):(.+):(.+):(-?\\d+)$";
		
		systemout(text, reg, "statinfom_4________");
	}
	
	//5
	public void statinfom_5() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bPutData\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		systemout(text, reg, "statinfom_5______");
	}
	
	//6
	public void statinfom_6() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bSysMail\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		systemout(text, reg, "statinfom_6________");
	}
	
	//7
	public void onlineuser() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:OnlineUsers=\\d+:\\d+:(\\d+):\\d+:\\d+$";
		
		systemout(text, reg, "onlineuser____");
	}
	
	public static void main(String[] args) {
		Statinfom s = new Statinfom();
		s.statinfom_1();
	}
}
