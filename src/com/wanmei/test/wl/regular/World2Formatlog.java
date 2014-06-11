package com.wanmei.test.wl.regular;

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
	public void playerlogout() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayerlogout\\b:userid=(\\d+):roleid=(\\d+):reborn_count=(\\d+):level=(\\d+):occupation=(\\d+):mapid=(\\d+):x=(-?\\d+):y=(-?\\d+):z=(-?\\d+):onlinetime=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"playerlogout");
	}
	
	//2
	public void forbiduser_question() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:forbiduser:source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.+):cash_add=(.+):cash_used=(.+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser_question");
	}
	
	//3
	public void stockcommission() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bstockcommission\\b:userid=(.+):tid=(.+):price=(.+):volume=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stockcommission");
	}
	
	//4
	public void trade() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btrade\\b:roleidA=(.+):roleidB=(.+):moneyA=(.+):moneyB=(.+):objectsA=(.*):objectsB=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"trade");
	}
	
	//5
	public void accountlogin() {
		String text ="2014-05-26 04:41:08 backup glinkd-2: notice : formatlog:login:account=zhscaid:userid=254005778:sid=2712:peer=121.27.135.201:mac=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:login:account=(.+):userid=(.+):sid=(.+):peer=(.+):mac=([^:]*):mid=([^:]*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogin");
	}
	
	//6
	public void rolelogout() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rolelogout:userid=(.+):roleid=(.+):localsid=(.+):time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogout");
	}
	
	//7
	public void deleterole() {
		String text ="2014-05-26 02:38:45 backup gdeliveryd: notice : formatlog:deleterole:roleid=80376720";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:deleterole:roleid=(.+):create_time=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"deleterole");
	}
	
	//8
	public void webtradesold() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:webtrade:webtradesold:role=(.+):sn=(.+):buyer_roleid=(.+):type=(4):itemid=(.+):item_count=(.+):money=(.+):role=(.+):petid=(.+):pet_count=(.+):level=(.+):reborn_cnt=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"webtradesold");
	}
	
	//9
	public void accountlogout() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=(-?\\d+):status=.+:mac=[^:]*:mid=([^:]*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogout");
	}
	
	//10
	public void gmlog() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gmlog");
	}
	
	//11
	public void forbiduser() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bACForbidUser\\b:GM=(.+):roleid=(.+):accountid=(.+):forbid_time=(.+):reason=(.+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	//12
	public void task_complete() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:task_complete:userid=.+:roleid=(.+):taskid=(.+):lev=.+:levtype=.+:success=.+:gold=(.+):exp=(.+):sp=(.+):reputation=(.+):items=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_complete");
	}
	
	//13
	public void gamemailbox() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+gamemailbox:send_roleid=(.+):receive_roleid=(.+):level=(.+):offline_time=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gamemailbox");
	}
	
	//14
	public void regmailbox() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+regmailbox:send_roleid=(.+):send_userid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):offline_seconds=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"regmailbox");
	}
	
	//15
	public void gamemailbox_award() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+gamemailbox_award:roleid=(.+):item=(.+):count=(.+):callback_roleid=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gamemailbox_award");
	}
	
	//16
	public void regmailbox_award() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+regmailbox_award:roleid=(.+):item=(.+):count=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"regmailbox_award");
	}
	
	//17
	public void rolelogin() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rolelogin:userid=(.+):roleid=(.+):lineid=(.+):localsid=(.+):levtype=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogin");
	}
	
	//18
	public void task_accept() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:task_accept:userid=(.+):roleid=(.+):taskid=(.+):lev=(.+):levtype=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_accept");
	}
	
	//19
	public void task_abort() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:task_abort:userid=(.+):roleid=(.+):taskid=(.+):lev=(.+):levtype=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_abort");
	}
	
	//20
	public void instance_player_enter() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:instance_player_enter:userid=(.+):roleid=(.+):serial_id=(.+):gs_id=(.+):template_id=(.+):result=(.+):lev=(.+),levtype=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"instance_player_enter");
	}
	
	//21
	public void instance_result() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:instance_result:serial_id=(.+):gs_id=(.+):battle_id=(.+):world_tag=(.+):world_index=(.+):template_id=(.+):result=(.+):role_count=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"instance_result");
	}
	
	//22
	public void instance_player_award() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:instance_player_award:userid=(.+):roleid=(.+):serial_id=(.+):gs_id=(.+):template_id=(.+):result=(.+):lev=(.+),levtype=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"instance_player_award");
	}
	
	//23
	public void shoptrade() {
		String text ="2014-05-26 11:25:24 game1 gamed010: notice : formatlog:gshop_trade:userid=355631409:roleid=6013360:order_id=409:item_id=48850:expire=0:item_count=1:cash_need=100:cash_left=204500:guid=0,0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgshop_trade\\b:userid=(.+):roleid=(.+):order_id=(.+):item_id=(.+):expire=(.+):item_count=(.+):cash_need=(.+):cash_left=([^:]+):guid=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shoptrade");
	}
	
	//24
	public void addcash() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:userid=(.+):oldserial=.+:newserial=.+:cash_add=(.+):delta=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"addcash");
	}
	
	//25
	public void stockbalance() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bstockbalance\\b:userid=(.+):tid=(.+):volume=(.+):ack_volume=(.+):ack_money=(.+):cash=(.+):money=(.+):cash_buy=(.+):cash_sell=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stockbalance");
	}
	
	//26
	public void clear360cash() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(\\d+?);.*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360cash");
	}
	
	//27
	public void clear360item() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360item");
	}
	
	public static void main(String[] args) {
		World2Formatlog w = new World2Formatlog();
		//w.playerlogout();
		//w.accountlogin();
		//w.deleterole();
		w.shoptrade();
	}
}
