package com.wanmei.test.cb.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoneyLog {
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
	public void money_change() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+: money_change : \\[roleid=(.+),level=(.+),prof=(.+)\\]:moneytype=(.+):moneychange=(.+):reason=(-?\\d+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "money_change");
	}
	
	public static void main(String[] args) {
		MoneyLog w = new MoneyLog();
		w.money_change();
	}
}
