package com.wanmei.test.mz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmLog {
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
	public void forbiduser() {
		String text = "0	2304	1368612938	0	330000	0	0	210200	-119800";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bforbiduser\\b:userid=(.+):time=(.+):reason=(.+):gmuser=(.+):cash_add=(.+):cash_used=(.+):realtime=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	public static void main(String[] args) {
		GmLog s = new GmLog();
		s.forbiduser();
	}
}
