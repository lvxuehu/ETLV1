package com.wanmei.test.cb.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Statinfom {
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
	public void statinfom_1() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bLevel\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "statinfom_1");
	}
	
	//2
	public void statinfom_2() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoneyPut\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "statinfom_2");
	}
	
	//3
	public void statinfom_3() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoney\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "statinfom_3");
	}
	
	//4
	public void statinfom_4() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bItemPut\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "statinfom_4");
	}
	
	//5
	public void statinfom_5() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bPutData\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "statinfom_5");
	}
	
	//5
	public void statinfom_6() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bSysMail\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "statinfom_6");
	}
	
	public static void main(String[] args) {
		Statinfom w = new Statinfom();
		w.statinfom_1();
	}
}
