package com.wanmei.test.sgsj.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cslog1Log {
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
	public void deal() {
		String text ="2014-05-20 03:48:36 lv3:GS1:Deal SrcID=27140408:SrcGetPet=:SrcGetItem=[53396:3007177133184428426:1]:SrcGetSoul=:SrcGetMoney=250000:DstID=27137054:DstGetPet=:DstGetItem=[65490:3007602484281397750:1;63810:3007595014354200522:34;31128:3007596665146714386:1;28081:3007596036180413308:1;63811:3007565169831373302:3]:DstGetSoul=:DstGetMoney=0";
		
		//String text = "2014-05-20 20:18:13 lv3:GS4:Deal SrcID=9836440:SrcGetPet=:SrcGetItem=[63669:3007740381526917724:5]:SrcGetSoul=:SrcGetMoney=0:DstID=9835498:DstGetPet=:DstGetItem=[64244:3007740005457730516:2;64245:3007738637323907692:1]:DstGetSoul=:DstGetMoney=1000000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) .+Deal SrcID=(\\d+):SrcGetPet=(.*):SrcGetItem=(.*):SrcGetSoul=(.*):SrcGetMoney=(\\d+):DstID=(\\d+):DstGetPet=(.*):DstGetItem=(.*):DstGetSoul=(.*):DstGetMoney=(-?\\d+);?$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"deal");
	}
	
	//2
	public void deathinfo() {
		String text ="2014-05-21 08:26:49 lv3:GS1:Death:梦幻蕊蕊 ID:27122768 Killer:死灵龙 DeathType:1 DeathMapID:228 LoseMoney:0 LoseExp:0 LoseItemID:6676 LoseItemNums:176 LoseItemID:12 LoseItemNums:4";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) .+:Death:.* ID:(.+) Killer:.* DeathType:(.+) DeathMapID:(.+) LoseMoney:(.+) LoseExp:(-?\\d+)(.*)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"deathinfo");
	}
	
	public static void main(String[] args) {
		Cslog1Log w = new Cslog1Log();
		w.deal();
		//w.deathinfo();
	}
}
