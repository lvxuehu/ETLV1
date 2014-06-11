package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YuanbaoCsvEnd {
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
	public void cashstat_rest () {
		String text = "355648861,1389590047,0,12000,11052,0";
		
		String reg = "(\\d+),\\d+,(\\d+),(\\d+),(\\d+),(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"recast_equip");
	}
	
	public static void main(String[] args) {
		YuanbaoCsvEnd r = new YuanbaoCsvEnd();
		r.cashstat_rest();
	}
}
