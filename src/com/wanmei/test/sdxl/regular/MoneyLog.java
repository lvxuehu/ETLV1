package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoneyLog {
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
	public void cash_change() {
		String text ="2014-05-19 09:00:00 cash_change:from=2691:userid=388527703:roleid=15360131:shapeid=1020204:school=15:lev=69:cashchange1=-10:cashchange2=0:cashchange3=0:reason=1305";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+cash_change:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):cashchange1=(.+):cashchange2=(.+):cashchange3=(.+):reason=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cash_change____");
	}
	
	//2
	public void money_change() {
		String text ="2014-05-19 09:00:00 money_change:from=2644:userid=314954524:roleid=273125489:shapeid=1010109:school=11:lev=87:moneychange=0:smoneychange=3902:hint=5biI6Zeo5Lu75Yqh5aWW5Yqx:reason=4";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+money_change:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):moneychange=(.+):smoneychange=(.+):hint=(.+):reason=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"money_change___");
	}
	
	public static void main(String[] args) {
		MoneyLog w = new MoneyLog();
		//w.cash_change();
		w.money_change();
	}
}
