package com.wanmei.test.sw.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DailyReviewRoleRareitem {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void itemidtot_detail() {
		String text ="155956162,1261007898391990050,1400016543,2000,8500,10,13530004:1;13600001:1;13641200:1;,-1";
		String reg = "(\\d+),(\\d+),\\d+,\\d+,\\d+,\\d+,(.+);";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"itemidtot_detail______");
	}
	
	public static void main(String[] args) {
		DailyReviewRoleRareitem w = new DailyReviewRoleRareitem();
		w.itemidtot_detail();
	}
}
