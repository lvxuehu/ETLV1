package com.wanmei.test.sgsj.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cashstat93LogEnd {
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
	public void cashstat_rest() {
		String text ="945626,1397189870,0,add:0;buy:2100;sell:2020;used:50";
		
		String reg = "(\\d+),\\d+,(\\d+),add:(\\d+);buy:(-?\\d+);sell:(-?\\d+);used:(\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cashstat_rest");
	}
	
	//2
	public void itemidtot_detail() {
		String text ="945626,1397189870,0,add:0;buy:2100;sell:2020;used:50";
		
		String reg = "(\\d+),(\\d+),\\d+,\\d+,(.+);";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"itemidtot_detail");
	}
	
	public static void main(String[] args) {
		Cashstat93LogEnd w = new Cashstat93LogEnd();
		w.cashstat_rest();
	}
}
