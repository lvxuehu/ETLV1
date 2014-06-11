package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpCsvEnd {
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
	public void exp() {
		String text ="3,35,7494302";
		String reg = "(\\d+),(.+),(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"exp_____");
	}
	
	public static void main(String[] args) {
		ExpCsvEnd w = new ExpCsvEnd();
		w.exp();
	}
}
