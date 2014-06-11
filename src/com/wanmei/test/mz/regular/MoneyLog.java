package com.wanmei.test.mz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoneyLog {
	//1
	public void moneylog_1() {
		String text ="mz#30221#2013-11-11 00:08:32  : info : BagAddMoney:bagid=299:roleid=2142334:old=1081823:new=1086047:v=4224:reason=sell:itemid=14164";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bBagAddMoney:bagid=\\d+:roleid=(\\d+):old=\\d+:new=\\d+:v=(-?\\d+):reason=([^:\\[]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//2
	public void moneylog_2() {
		String text ="mz#30221#2013-11-11 00:08:32  : info : BagAddMoney:bagid=299:roleid=2142334:old=1081823:new=1086047:v=4224:reason=sell:itemid=14164";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bBagAddMoney:bagid=\\d+:roleid=(\\d+):old=\\d+:new=\\d+:v=(-?\\d+):reason=(sell):.+=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//3
	public void moneylog_3() {
		String text ="mz#30221#2013-11-11 00:08:32  : info : BagAddMoney:bagid=299:roleid=2142334:old=1081823:new=1086047:v=4224:reason=sell:itemid=14164";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bBagAddMoney:bagid=\\d+:roleid=(\\d+):old=\\d+:new=\\d+:v=(-?\\d+):reason=([^:\\[]+):.+=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//4
	public void moneylog_4() {
		String text ="mz#30221#2013-11-11 00:08:32  : info : BagAddMoney:bagid=299:roleid=2142334:old=1081823:new=1086047:v=4224:reason=sell:itemid=14164";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bBagAddMoney:bagid=\\d+:roleid=(\\d+):old=\\d+:new=\\d+:v=(-?\\d+):reason=([^:\\[]+)\\[(\\d+)\\]?$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//5
	public void moneylog_5() {
		String text ="mz#30221#2013-11-11 00:08:32  : info : BagAddMoney:bagid=299:roleid=2142334:old=1081823:new=1086047:v=4224:reason=sell:itemid=14164";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bBagAddMoney:bagid=\\d+:roleid=(\\d+):old=\\d+:new=\\d+:v=(-?\\d+):reason=([^:\\[]+)\\[[^:\\[\\]]+\\](\\d+)\\[.+\\](\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//6
	public void moneylog_6() {
		String text ="mz#30221#2013-11-11 00:08:32  : info : BagAddMoney:bagid=299:roleid=2142334:old=1081823:new=1086047:v=4224:reason=sell:itemid=14164";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bBagAddMoney:bagid=\\d+:roleid=(\\d+):old=\\d+:new=\\d+:v=(-?\\d+):reason=(activation)\\[(\\d+)\\]taskid\\[(\\d+)\\]$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//7
	public void moneylog_7() {
		String text ="mz#10801#2013-11-11 00:09:55  : info : BagAddMoney:bagid=299:roleid=56995946:old=1336924:new=1341646:v=4722:reason=activation[4]taskset[graphid]5583[ringnum]2";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bBagAddMoney:bagid=\\d+:roleid=(\\d+):old=\\d+:new=\\d+:v=(-?\\d+):reason=(activation)\\[(\\d+)\\]taskset\\[[^:\\[\\]]+\\](\\d+)\\[.+\\]\\d+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	public static void main(String[] args) {
		MoneyLog expLog = new MoneyLog();
		expLog.moneylog_7();
	}
}
