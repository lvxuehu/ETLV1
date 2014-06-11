package com.wanmei.test.zx.regular;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;

public class NewRolesbriefCsv {
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
	public void chardata_inc() {
		String text ="2014-04-17 04:19:42 database gamed: info : 用户25432769领取VIP奖励id=28,item_id=16438";
		String reg = "(\\d+),(\\d+),\\042(.*)\\042?,(\\d+),(\\d+),(\\d+),(-?\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(-?\\d+\\.?\\d*),(-?\\d+\\.?\\d*),(-?\\d+\\.?\\d*),(\\d+),?(-?\\d*)";
		
		systemout(text, reg, "chardata_inc______");
	}
	
	public static void main(String[] args) {
		NewRolesbriefCsv w = new NewRolesbriefCsv();
		w.chardata_inc();
	}
}
