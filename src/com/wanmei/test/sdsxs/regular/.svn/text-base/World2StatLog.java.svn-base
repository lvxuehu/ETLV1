package com.wanmei.test.sdsxs.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2StatLog {
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
	public void onlineuser() {
		//20140313
		String text = "2014-03-26 18:02:59 backup:gdeliveryd:STAT:OnlineUsers=1201:16:951:836:744164";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+:STAT:OnlineUsers=\\d+:\\d+:(\\d+):\\d+:\\d+$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"onlineuser");
	}
	
	public static void main(String[] args) {
		World2StatLog s = new World2StatLog();
		s.onlineuser();
	}
}
