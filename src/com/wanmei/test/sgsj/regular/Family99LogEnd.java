package com.wanmei.test.sgsj.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Family99LogEnd {
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
	public void familymember() {
		String text ="191570,798,'verka','皴疱驺',67,7,40,0";
		String reg = "(.+),(.+),\\047(.*)\\047,\\047(.*?)[\\047]?,(.+),(.+),(.+),(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"familymember");
	}
	
	public static void main(String[] args) {
		Family99LogEnd w = new Family99LogEnd();
		w.familymember();
	}
}
