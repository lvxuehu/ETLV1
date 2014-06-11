package com.wanmei.test.wl.regular;

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
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bLevel\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_1");
	}
	
	//2
	public void statinfom_2() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoneyPut\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_2");
	}
	
	//3
	public void statinfom_3() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoney\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_3");
	}
	
	//4
	public void statinfom_4() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bItemPut\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_4");
	}
	
	//5
	public void statinfom_5() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bPutData\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_5");
	}
	
	//6
	public void statinfom_6() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bSysMail\\b=(.+):(.+):(.+):(.+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_6");
	}
	
	public static void main(String[] args) {
		Statinfom w = new Statinfom();
		w.statinfom_1();
	}
}
