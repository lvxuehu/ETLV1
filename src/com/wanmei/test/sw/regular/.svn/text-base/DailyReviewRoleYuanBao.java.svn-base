package com.wanmei.test.sw.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DailyReviewRoleYuanBao {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void cashstat_rest() {
		String text ="358271089,1399570198,0,1341500,1340722,180,2402,3000,-1	";
		String reg = "(\\d+),\\d+,(\\d+),(\\d+),(\\d+),(-?\\d+),(-?\\d+),(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cashstat____");
	}
	
	public static void main(String[] args) {
		DailyReviewRoleYuanBao w = new DailyReviewRoleYuanBao();
		w.cashstat_rest();
	}
}
