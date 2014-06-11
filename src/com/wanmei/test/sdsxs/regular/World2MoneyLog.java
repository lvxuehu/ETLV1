package com.wanmei.test.sdsxs.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2MoneyLog {
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
	public void money_change() {
		String text = "2013-07-16 15:00:14 game1:gs35:money_change:from=19:userid=312900651:roleid=207056915:occupation=6:lev=81:fightvalue=102916:logintime=1373957495:bindmoneyleft=4086801:moneyleft=1608755:bindcashleft=92:cashleft=0:moneychange=92:type=2:reason=4:hint=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmoney_change\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):?bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):moneychange=(-?\\d+):type=(\\d+):reason=(\\d+):hint=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"money_change");
	}
	
	public static void main(String[] args) {
		World2MoneyLog s = new World2MoneyLog();
		s.money_change();
	}
}
