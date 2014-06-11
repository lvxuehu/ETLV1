package com.wanmei.test.iwm.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FactionUser {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void factionuser() {
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(-?\\d+),([^\n]*?),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),([^\n]*?)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"factionuser");
	}
	
	public static void main(String[] args) {
		//FactionUser w = new FactionUser();
	}
}
