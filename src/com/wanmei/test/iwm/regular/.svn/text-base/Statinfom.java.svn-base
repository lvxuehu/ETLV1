package com.wanmei.test.iwm.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Statinfom {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void statinfom_1() {
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bLevel\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_1");
	}
	
	public void statinfom_2() {
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoney\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_2");
	}
	
	public void statinfom_3() {
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bMoneyPut\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_3");
	}
	
	public void statinfom_4() {
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bItemPut\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_4");
	}
	
	public void statinfom_5() {
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bPutData\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_5");
	}
	
	public void statinfom_6() {
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:\\bSysMail\\b=([^:]+):([^:]+):([^:]+):([^:]+):([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"statinfom_6");
	}
	
	public void onlineuser() {
		String text ="2014-04-07 21:52:59 backup gdeliveryd: debug : STAT:OnlineUsers=1349:1:1213:1602:1351544";
		//String text = "2014-03-26 18:02:59 backup:gdeliveryd:STAT:OnlineUsers=1201:16:951:836:744164";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+STAT:OnlineUsers=\\d+:\\d+:(\\d+):\\d+:\\d+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"onlineuser");
	}
	
	public static void main(String[] args) {
		Statinfom w = new Statinfom();
		w.onlineuser();
	}
}
