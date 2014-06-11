package com.wanmei.test.xa.regular;

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
		String text = "31537201,4128772,1386325044,0,6713:1;6818:1;6824:1;6830:1;6845:1;6875:2;6878:1;56691:1;63308:725;63793:425;79150:28;80324:3;80325:1;82014:1;82032:510;";
		
		String reg = "(\\d+),(\\d+),\\d+,\\d+,(.+);$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"itemidtot_detail");
	}
	
	public static void main(String[] args) {
		ItemsCsvEnd r = new ItemsCsvEnd();
		r.itemidtot_detail();
	}
}
