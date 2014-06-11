package com.wanmei.test.iwm.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cashstat {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void cashstat() {
		String text ="48,48,1164857267,1,0,0,0,add:1000;buy:0;sell:0;used:0;";
		//String text = "id,level,owner,occupy_time,challenger,deposit,cutoff_time,battle_time,bonus_time,color,status,timeout,maxbonus";
		String reg = "\\d+,(\\d+),\\d+,(\\d+),?(\\d*),?(\\d*),?(\\d*),add:(\\d+);buy:(\\d+);sell:(-?\\d+);used:(\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cashstat");
	}
	
	public void itemidtot_detail() {
		String text ="3233216,5254,1243405233,1,0,0,0,add:0;buy:0;sell:0;used:0;3366:1;3368:1;23752:1;";
		//String text = "id,level,owner,occupy_time,challenger,deposit,cutoff_time,battle_time,bonus_time,color,status,timeout,maxbonus";
		String reg = "(\\d+),(\\d+),\\d+,\\d+,?(\\d*),?(\\d*),?(\\d*),add:\\d+;buy:\\d+;sell:-?\\d+;used:\\d+;(\\d.*);";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cashstat_rest");
	}
	
	public static void main(String[] args) {
		Cashstat w = new Cashstat();
		w.cashstat();
		//w.itemidtot_detail();
	}
}
