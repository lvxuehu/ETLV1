package com.wanmei.test.sg.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CsLog1Log {
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
	public void copy_involve() {
		String text ="2014-05-20 03:48:36 lv3:GS1:Deal SrcID=27140408:SrcGetPet=:SrcGetItem=[53396:3007177133184428426:1]:SrcGetSoul=:SrcGetMoney=250000:DstID=27137054:DstGetPet=:DstGetItem=[65490:3007602484281397750:1;63810:3007595014354200522:34;31128:3007596665146714386:1;28081:3007596036180413308:1;63811:3007565169831373302:3]:DstGetSoul=:DstGetMoney=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) .+:actID:(.+) accid:(.+) playerid:(.+) profession:(.+) level:(.+) fieldlevel:(.+) rewardid:(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"copy_involve");
	}
	
	//2
	public void deal() {
		String text ="2014-05-28 01:38:34 lv3:GS8:Deal SrcID=305348632:SrcGetPet=:SrcGetItem=[44442:3008261591944681202:3;44045:3008841978563142200:3;44239:3000555977643176836:25]:SrcGetMoney=0:DstID=313151426:DstGetPet=:DstGetItem=[44713:3005484534751377864:255;4943:3006754671754622934:14;64176:3008237708085042078:69;44263:3007178245968448530:20;45006:3007098246987588920:6;64241:3006753875175687276:42]:DstGetMoney=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) .+?Deal SrcID=(\\d+):SrcGetPet=(.*):SrcGetItem=(.*):SrcGetMoney=(.*):DstID=(\\d+):DstGetPet=(.*):DstGetItem=(.*):DstGetMoney=(.*);?$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"deal");
	}
	
	//3
	public void deathinfo() {
		String text ="2014-05-21 08:26:49 lv3:GS1:Death:梦幻蕊蕊 ID:27122768 Killer:死灵龙 DeathType:1 DeathMapID:228 LoseMoney:0 LoseExp:0 LoseItemID:6676 LoseItemNums:176 LoseItemID:12 LoseItemNums:4";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) .+:Death:.* ID:(.+) Killer:.* DeathType:(.+) DeathMapID:(.+) LoseMoney:(.+) LoseExp:(\\d+)(.*)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"deathinfo");
	}
	
	public static void main(String[] args) {
		CsLog1Log w = new CsLog1Log();
		w.deal();
		//w.deathinfo();
	}
}
