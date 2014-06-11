package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShopCsvEnd {
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
	public void shop() {
		String text ="417923,14557315,189440,1,0";
		String reg = "(\\d+),(.+),(.+),(.+),(.+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shop____");
	}
	
	public static void main(String[] args) {
		ShopCsvEnd w = new ShopCsvEnd();
		w.shop();
	}
}
