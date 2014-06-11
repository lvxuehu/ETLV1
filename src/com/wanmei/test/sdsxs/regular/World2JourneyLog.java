package com.wanmei.test.sdsxs.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2JourneyLog {
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
	public void npc_trade_sell() {
		String text = "2013-07-16 15:00:53 game1:gs1:npc_trade_sell:from=3:userid=278083102:roleid=64565251:occupation=5:lev=85:fightvalue=97361:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:moneybeforetrade=8873331:moneyadd=0:bindmoneyadd=1:item=472,1,700292051E4EF62";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bnpc_trade_sell\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(\\d+):logintime=(\\d*):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):moneybeforetrade=(-?\\d+):moneyadd=(\\d+):bindmoneyadd=(\\d+):item=([^:]+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"npc_trade_sell");
	}
	
	//2
	public void npc_trade_buy() {
		String text = "2013-07-16 15:00:26 database:gs14:npc_trade_buy:from=32:userid=307717513:roleid=157044768:occupation=5:lev=45:fightvalue=10591:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:moneybeforetrade=79:moneycost=0:npcid=20313:bindmoneycost=26410:itemcost=:item=20885,1,E00A8AA51E4EF8A:repucost=";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bnpc_trade_buy\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(\\d+):logintime=(\\d*):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):moneybeforetrade=(-?\\d+):moneycost=(\\d+):npcid=(\\d+):bindmoneycost=(\\d+):itemcost=([^:]*):item=([^:]*):repucost=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"npc_trade_buy");
	}
	
	//3
	public void lose_item() {
		String text = "2013-07-16 15:00:30 game1:gs32:lose_item:itemid=13523:count=1:guid=2004022B51E4EF8C:roleid=12472352:reason=1:hint=10740";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+lose_item:itemid=(\\d+):count=(\\d+):guid=(.+):roleid=(\\d+):reason=(\\d+):hint=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"lose_item");
	}
	
	//4
	public void gain_item() {
		String text = "2013-07-16 15:00:25 database:gs39:gain_item:itemid=17371:count=1:guid=2702E01551E4EF49:roleid=11804700:reason=5:hint=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+gain_item:itemid=(\\d+):count=(\\d+):guid=(.+):roleid=(\\d+):reason=(\\d+):hint=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gain_item");
	}
	
	public static void main(String[] args) {
		World2JourneyLog s = new World2JourneyLog();
		//s.npc_trade_sell();
		//s.npc_trade_buy();
		//s.lose_item();
		s.gain_item();
	}
}
