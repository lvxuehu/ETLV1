package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Faction {
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
	public void faction() {
		String text = "4151,KOG破天之光,6,126,2,107094641,0,5:5:5:0:5:5:5:0:0:0:5,1871592,197288,0,,1829,0,0,0,1,44203:244218:144233:144228:344223:144192:1,426598455";
		//String text = "499716,HELLO你妹,0,0,-1,0,0,,0,0,0,,0,0,0,0,0,,";
		String reg = "(\\d+),([^\n]*),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),([^,]*),(-?\\d+),(-?\\d+),(-?\\d+),([^,]*),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),([^,]*),([^,]*),([^,]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"recast_equip");
	}
	
	public static void main(String[] args) {
		Faction r = new Faction();
		r.faction();
	}
}