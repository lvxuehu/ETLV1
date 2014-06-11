package com.wanmei.test.sdsxs.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashstatEnd {
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
	public void cashstat() {
		String text = "0	2304	1368612938	0	330000	0	0	210200	-119800";
		
		String reg = "\\d+\\s+(\\d+)\\s+\\d+\\s+(-?\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+\\.?\\d*)\\s+-?\\d+\\.?\\d*";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cashstat");
	}
	
	public static void main(String[] args) {
		CashstatEnd s = new CashstatEnd();
		s.cashstat();
	}
}
