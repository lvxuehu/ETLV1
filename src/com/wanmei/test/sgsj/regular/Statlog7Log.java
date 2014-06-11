package com.wanmei.test.sgsj.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Statlog7Log {
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
	public void statinfom_1() {
		String text ="27162,'丨非法聚众丨',5,3257546,10,2014-03-20 13:01:14,0,0,0,1,5153,'丨巅峰丨永恒丨',1,1,19,69459,0,105,";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bLevel\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_1");
	}
	
	//2
	public void statinfom_2() {
		String text ="27162,'丨非法聚众丨',5,3257546,10,2014-03-20 13:01:14,0,0,0,1,5153,'丨巅峰丨永恒丨',1,1,19,69459,0,105,";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoneyPut\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_2");
	}
	
	//3
	public void statinfom_3() {
		String text ="27162,'丨非法聚众丨',5,3257546,10,2014-03-20 13:01:14,0,0,0,1,5153,'丨巅峰丨永恒丨',1,1,19,69459,0,105,";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoney\\b=(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_3");
	}
	
	//4
	public void statinfom_4() {
		String text ="27162,'丨非法聚众丨',5,3257546,10,2014-03-20 13:01:14,0,0,0,1,5153,'丨巅峰丨永恒丨',1,1,19,69459,0,105,";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bItemPut\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_4");
	}
	
	//5
	public void statinfom_5() {
		String text ="27162,'丨非法聚众丨',5,3257546,10,2014-03-20 13:01:14,0,0,0,1,5153,'丨巅峰丨永恒丨',1,1,19,69459,0,105,";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bPutData\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_5");
	}
	
	//6
	public void statinfom_6() {
		String text ="27162,'丨非法聚众丨',5,3257546,10,2014-03-20 13:01:14,0,0,0,1,5153,'丨巅峰丨永恒丨',1,1,19,69459,0,105,";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bSysMail\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_6");
	}
	
	//7
	public void onlineuser() {
		String text ="2014-05-21 00:19:37 lv3:MS:STAT:OnlineUsers=57:120";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:OnlineUsers=(\\d+):\\d+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"onlineuser");
	}
	
	public static void main(String[] args) {
		Statlog7Log w = new Statlog7Log();
		w.onlineuser();
	}
}
