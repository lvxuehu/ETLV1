package com.wanmei.test.mz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XingChengLog {
	//1
	public void petskillcard() {
		String text ="mz#30224#2013-11-11 00:14:03  : info : xingcheng:type=skillcard:roleid=42147969:itemid=11211:newskillid=3019:petid=2550153345:petkey=58:skills=3019,3145,17952";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\btype=skillcard\\b:roleid=(\\d+):itemid=(\\d+):newskillid=(\\d+):petid=(\\d+):petkey=(\\d+):skills=([^:]+)";
		
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
	public void bagremove() {
		String text ="mz#10801#2013-11-11 00:00:32  : info : Bag.remove:bagid=299:roleid=6336619:key=179634:itemid=14039:number=1:remain=0:flags=33554432:reason=CEquipLianjin";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+Bag\\.remove:bagid=(.+):roleid=(.+):key=(.+):itemid=(.+):number=(.+):remain=(.+):flags=(.+):reason=(.+)$";
		
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
	public void bagadd() {
		String text ="mz#21203#2013-11-11 00:00:49  : info : Bag.add:bagid=1820:roleid=45830201:itemid=2306:number=1:reason=fightreward";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+Bag\\.add:bagid=(.+):roleid=(.+):itemid=(.+):number=(.+):reason=(.+)$";
		
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
		XingChengLog expLog = new XingChengLog();
		expLog.bagadd();
	}
}
