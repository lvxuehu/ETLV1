package com.wanmei.test.wm.regular;

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
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogin\\b:account=(.+):userid=(.+):sid=(.+):peer=(\\d+\\.\\d+\\.\\d+\\.\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogin");
	}
	
	//2
	public void rolelogin() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogin\\b:userid=(.+):roleid=(.+):lineid=(.+):localsid=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogin");
	}
	
	//3
	public void rolelogout() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rolelogout:userid=(.+):roleid=(.+):localsid=(.+):time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogout");
	}
	
	//4
	public void accountlogout() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogout");
	}
	
	//5
	public void gmlog() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gmlog");
	}
	
	//6
	public void forbiduser() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bforbiduser\\b:source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.+):cash_add=(.+):cash_used=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	//7
	public void task_complete() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(\\d+).+msg=DeliverByAwardData:\\s+gold\\s+=\\s+(\\d+),\\s+exp\\s+=(.+),\\s+sp\\s+=\\s+(.+),\\s+reputation\\s+=\\s+(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_complete");
	}
	
	//8
	public void sendaumail() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:SendAUMail:send_userid=(.+):send_role=(.+):received_userid=(.+):received_roleid=(.+):level=(.+):offline_seconds=(.+):bonus_lvl=(.+):ex_reward=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"sendaumail");
	}
	
	public static void main(String[] args) {
		World2Formatlog w = new World2Formatlog();
		w.accountlogin();
	}
}
