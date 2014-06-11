package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StatLog {
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
	public void onlineuser() {
		String text ="2014-05-20 00:01:30 onlineuser:sourceserver=2681:sourceproc=GS:currentnum=1653:currentmachine=0:levelnumlist=:maxnumonsrv=1653";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) onlineuser:sourceserver=(.+):sourceproc=(.+):currentnum=(.+):currentmachine=(.+):levelnumlist=(.*):maxnumonsrv=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"onlineuser____");
	}
	
	public static void main(String[] args) {
		StatLog w = new StatLog();
		w.onlineuser();
	}
}
