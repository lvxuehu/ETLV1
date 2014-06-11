package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FamilysCsvEnd {
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
	public void family() {
		String text ="860291,-1,27984003,3,4603000,109,9,14,60,青帝,27984003";
		String reg = "(\\d+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"family____");
	}
	
	public static void main(String[] args) {
		FamilysCsvEnd w = new FamilysCsvEnd();
		w.family();
	}
}
