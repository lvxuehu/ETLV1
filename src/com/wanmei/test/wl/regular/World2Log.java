package com.wanmei.test.wl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2Log {
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
	public void item_cash() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info\\s+:\\s+\\bitem_cash\\b,roleid=(\\d+),service_id=(\\d+),buy_item=(\\d+),cash_id=(\\d+),cash_count=(-?\\d+),order_count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"item_cash");
	}
	
	//2
	public void itemtomoney() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info\\s+:\\s+\\bitemtomoney\\b,roleid=(.+),count=(.+),item=(.+),money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"itemtomoney");
	}
	
	//3
	public void new_item_cash() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info\\s+:\\s+\\bnew_item_cash\\b,roleid=(\\d+),service_id=(\\d+),buy_item=(\\d+),buy_item_count=(\\d+),cash1_id=(\\d+),cash1_count=(\\d+),cash2_id=(\\d+),cash2_count=(\\d+),cash3_id=(\\d+),cash3_count=(\\d+),unbind_money=(\\d+),bind_money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"new_item_cash");
	}
	
	//4
	public void playerstall() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info\\s+:\\s+\\bplayerstall\\b,rolea=(.+),roleb=(.+),count=(.+),item=(.+),price=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"playerstall");
	}
	
	//5
	public void playerstalled() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info\\s+:\\s+\\bplayerstalled\\b,rolea=(.+),roleb=(.+),count=(.+),item=(.+),price=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"playerstalled");
	}
	
	public static void main(String[] args) {
		World2Log w = new World2Log();
		w.item_cash();
	}
}
