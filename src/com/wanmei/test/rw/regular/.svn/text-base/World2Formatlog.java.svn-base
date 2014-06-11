package com.wanmei.test.rw.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2Formatlog {
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
	public void accountlogin() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:login:account=(.+):userid=(.+):sid=(.+):peer=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogin");
	}
	
	//2
	public void rolelogin() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogin\\b:roleid=(.+):localsid=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogin");
	}
	
	//3
	public void rolelogout() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogout\\b:roleid=(.+):time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogout");
	}
	
	//4
	public void music() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:RoomGameStart:channelid=(.+),lineid=(.+),roomid=(.+),roleid=(.+),scene=(.+),music=(.+),mode=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"music");
	}
	
	//5
	public void accountlogout() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogout");
	}
	
	//6
	public void gmlog() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gmlog");
	}
	
	//7
	public void forbiduser() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bacforbiduser\\b:gmuser=(.+):userid=(.+):roleid=(.+):forbid_time=(.+):reason=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	//8
	public void shoptrade() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:shoplog.+roleid=(.+),level=(.+),itemid=(.+),type=(.+),expire_date=(.+),price=(.+),count=(.+),cash_need=(.+),pocket=(.*),orderid=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shoptrade");
	}
	
	//9
	public void addcash() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:userid=(.+):oldserial=.+:newserial=.+:cash_add=(.+):delta=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"addcash");
	}
	
	//10
	public void clear360cash() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(.+?);.*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360cash");
	}
	
	//11
	public void clear360item() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=.+?;(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360item");
	}
	
	public static void main(String[] args) {
		World2Formatlog w = new World2Formatlog();
		w.accountlogin();
	}
}
