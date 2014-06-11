package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemsCsvEnd {
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
		String text ="247311926,4221,1391691816423,0,49009,1,0;33013,20,0;49251,1,0;49137,1,0;49136,1,0;33001,20,0;";
		String reg = "(\\d+),(\\d+),\\d+,\\d+,(.+);";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"itemidtot_detail___");
	}
	
	public static void main(String[] args) {
		ItemsCsvEnd w = new ItemsCsvEnd();
		w.itemidtot_detail();
	}
}
