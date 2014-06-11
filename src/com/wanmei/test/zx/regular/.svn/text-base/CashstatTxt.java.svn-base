package com.wanmei.test.zx.regular;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;

public class CashstatTxt {
	private void systemout(String text,String reg,String methodName) {
		Pattern p = new Pattern(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i < count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	//1
	public void cashstat() {
		String text ="0,1000906464,0,0,0,0,add:14000;buy:100;sell:11858;used:2200;";
		String reg ="\\d+,(\\d+),\\d+,(\\d+),\\d+,\\d+,add:(\\d+);buy:(\\d+);sell:(-?\\d+);used:(\\d+)";
		systemout(text, reg, "cashstat________");
	}
	
	//2
	public void itemidtot_detail() {
		String text ="1047,1437592352,1322200064,1,0,0,add:0;buy:100;sell:0;used:100;3984:20;3985:10;3986:14;3987:22;";
		String reg ="(\\d+),(\\d+),.+,.+,.+,.+,add:\\d+;buy:\\d+;sell:-?\\d+;used:\\d+;(\\d.*);";
		systemout(text, reg, "cashstat________");
	}
	
	public static void main(String[] args) {
		CashstatTxt w = new CashstatTxt();
		//w.cashstat();
		w.itemidtot_detail();
	}
}
