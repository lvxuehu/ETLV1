package com.wanmei.test.mz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YuanBaoLog {
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
	public void addcash() {
		String text ="mz#30221#2013-11-11 13:59:38  : info : yuanbaobuy:userid=349266380:roleid=7123070:shopid=60:price=490:itemid=25066:buynum=10:leftyuanbao=1001:order_id=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+:\\s+info\\s+:\\s+\\baddcash\\b:userid=(.+):sn=(.+):yuanbao=(.+):total=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		systemout(m, "addcash");
	}
	
	//2
	public void shoptrade() {
		String text ="mz#30221#2013-11-11 13:59:38  : info : yuanbaobuy:userid=349266380:roleid=7123070:shopid=60:price=490:itemid=25066:buynum=10:leftyuanbao=1001:order_id=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+:\\s+info\\s+:\\s+\\byuanbaobuy\\b:userid=(.+):roleid=(.+):shopid=.+:price=(.+):itemid=(.+):buynum=(.+):leftyuanbao=(.+):order_id=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		systemout(m, "shoptrade");
	}
	
	//3
	public void stockbalance() {
		String text ="2013-11-11 00:50:13  : info : mail:mail:type=delete:timestamp=1383467554787:src=system:dst=6361968654:mid=50:money=0:itemid=:count=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+:\\s+info\\s+:\\s+buyerordid=(.+):sellerordid=(.+):success:buyerid=(.+):sellerid=(.+):yuanbao=(.+):totalmoney=(.+):tax=(-?\\d+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stockbalance");
	}
	
	public static void main(String[] args) {
		YuanBaoLog expLog = new YuanBaoLog();
		expLog.addcash();
	}
}
