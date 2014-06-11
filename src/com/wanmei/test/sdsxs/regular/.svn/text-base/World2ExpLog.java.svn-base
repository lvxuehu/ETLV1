package com.wanmei.test.sdsxs.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2ExpLog {
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
	public void exp_change() {
		String text = "2013-09-24 06:59:59 database:gs38:exp_change:from=32:userid=330647391:roleid=704585760:occupation=5:lev=62:fightvalue=26465:logintime=1379977093:bindmoneyleft=13235530:moneyleft=423:bindcashleft=4115:cashleft=0:expchange=4432:type=1:reason=2:hint=963";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+exp_change:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):expchange=(-?\\d+):type=(\\d+):reason=(\\d+):hint=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"exp_change");
	}
	
	public static void main(String[] args) {
		World2ExpLog s = new World2ExpLog();
		s.exp_change();
	}
}
