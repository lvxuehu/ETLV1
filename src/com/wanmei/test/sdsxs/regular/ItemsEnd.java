package com.wanmei.test.sdsxs.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemsEnd {
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
	public void itemidtot_detail() {
		String text = "0	0	79552534	246493	1371628062	0;22746,24";
		
		String reg = "(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+\\d+\\s+-?\\d+;(.+)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"itemidtot_detail");
	}
	
	public static void main(String[] args) {
		ItemsEnd s = new ItemsEnd();
		s.itemidtot_detail();
	}
}
