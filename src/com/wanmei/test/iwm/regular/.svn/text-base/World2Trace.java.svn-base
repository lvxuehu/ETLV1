package com.wanmei.test.iwm.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2Trace {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void onlineannounce() {
		String text ="2014-03-25 03:18:01 backup glinkd-1: debug : glinkd::onlineannounce:userid=346023052,client_type=2";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bonlineannounce\\b:userid=(\\d+),client_type=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"onlineannounce");
	}
	
	public static void main(String[] args) {
		World2Trace w = new World2Trace();
		w.onlineannounce();
	}
}
