package com.wanmei.test.sm.regular;

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
		String text ="sm#30403#2013-11-10 23:59:58 database gamed006: notice : playerlogout:userid=225583789:roleid=8057720928:level=68:occupation=8:mapid=1:x=-200:y=227:z=-125:onlinetime=1468";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+playerlogout:userid=(\\d+):roleid=(\\d+):level=(\\d+):occupation=(\\d+):mapid=(\\d+):x=(-?\\d+):y=(-?\\d+):z=(-?\\d+):onlinetime=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"playerlogout");
	}
	
	//2
	public void forbiduser_question() {
		String text ="sm#30810#2013-11-11 00:00:48 database gamedbd: notice : forbiduser, source=2:gmuserid=0:userid=353048063:zoneid=1911:areaid=19:forbid_time=300:real_time=300:reason=AQ==:cash_add=0:cash_used=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+forbiduser, source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.+):cash_add=(.+):cash_used=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//3
	public void horcrux_rerand() {
		String text ="sm#30403#2013-11-11 00:01:21 game1 gamed001: notice : horcrux_rerand:roleid=6592401504:level=80:item_id=43711:reborns=6:item_level=67:skill_old=(8276-8283):skill_new=(8277-8280)";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+horcrux_rerand:roleid=(.+):level=(.+):item_id=(.+):reborns=(.+):item_level=(.+):skill_old=(.+):skill_new=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//4
	public void horcrux_feed() {
		String text ="sm#30401#2013-11-11 00:01:23 game1 gamed002: notice : horcrux_feed:roleid=84533343:level=80:item_id=43711:tool_id=43381:exp=20:horcrux_level=63:reborns=5";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+horcrux_feed:roleid=(.+):level=(.+):item_id=(.+):tool_id=(.+):exp=(.+):horcrux_level=(.+):reborns=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//5
	public void horcrux_reborn_success() {
		String text ="sm#30803#2013-11-11 00:12:21 game1 gamed002: notice : horcrux_reborn_success:roleid=67874819:level=82:item_id=43711:item_level=40:reborn_count=5:active_type=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+horcrux_reborn_success:roleid=(.+):level=(.+):item_id=(.+):item_level=(.+):reborn_count=(.+):active_type=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//6
	public void horcrux_recast() {
		String text ="sm#30806#2013-11-11 00:12:22 game1 gamed002: notice : horcrux_recast:roleid=239853574:level=79:item_id=43725:item_level=50:money_type=1:attack_type=0:reborns=2:result=(0,0,-5,0,0,-10,13)";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+horcrux_recast:roleid=(.+):level=(.+):item_id=(.+):item_level=(.+):money_type=(.+):attack_type=(.+):reborns=(.+):result=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//7
	public void solo_instance_open() {
		String text ="sm#30201#2013-11-11 00:13:17 game1 gamed031: notice : solo_instance_open:templ_id=24754:instance_id=2209:roleid=13137317979";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+solo_instance_open:templ_id=(.+):instance_id=(.+):roleid=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//8
	public void extend_identify() {
		String text ="sm#30201#2013-11-11 00:13:17 game1 gamed001: notice : extend_identify:roleid=3078455387:level=80:equip_tid=28609:tool=44850:money_cost=100000:succeed=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+extend_identify:roleid=(.+):level=(.+):equip_tid=(.+):tool=(.+):money_cost=(.+):succeed=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//9
	public void accountlogin() {
		String text ="sm#30809#2013-11-11 00:13:17 backup glinkd-3: notice : formatlog:login:account=guohaiping426:userid=274786340:sid=41889:peer=61.167.139.36:peerport=3927:MID=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:login:account=(.+):userid=(.+):sid=(.+):peer=(\\d+.\\d+.\\d+.\\d+).*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//10
	public void rolelogin() {
		String text ="sm#30403#2013-11-11 00:13:18 backup glinkd-5: notice : formatlog:rolelogin:userid=150510683:roleid=71409760:Sex=0:level=41:phyle=3:profession=4:peer_ip=110.52.2.33";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogin\\b:userid=(.+):roleid=(.+):Sex=(.+):level=(.+):phyle=(.+):profession=(.+):peer_ip=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//11
	public void rolelogout() {
		String text ="sm#30809#2013-11-11 00:13:19 game1 glinkd-4: notice : formatlog:rolelogout:userid=353377679:roleid=100372578:localsid=614520:time=2722";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogout\\b:userid=(.+):roleid=(.+):localsid=(.+):time=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//12
	public void dbkwarsubmitchoice() {
		String text ="sm#30435#2013-11-11 18:01:20 database gamedbd: notice : formatlog:dbkwarsubmitchoice:kid=210055265:seq=1:attack_sid=22592:defend_sid=22294";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+dbkwarsubmitchoice:kid=(.+):seq=(.+):attack_sid=(.+):defend_sid=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//13
	public void merge_rune() {
		String text ="sm#30501#2013-11-11 00:00:03 database gamed010: notice : merge_rune:roleid=103395329:level=81:src=39473;39473;39473;39473;39477:tool=38066:result=39999";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+merge_rune:roleid=(.+):level=(.+):src=(.+):tool=(.+):result=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//14
	public void recast_item() {
		String text ="sm#30403#2013-11-11 00:00:03 database gamed010: notice : recast_item:roleid=11327504480:level=77:item_id=48882:tool=38049:damage_low=0;0:damage_high=0;0:defense=13;14:hp=0;0:mp=40;44:attack=0;0:armor=0;0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+recast_item:roleid=(.+):level=(.+):item_id=(.+):tool=(.+):damage_low=(.+):damage_high=(.+):defense=(.+):hp=(.+):mp=(.+):attack=(.+):armor=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//15
	public void transfer_enhance() {
		String text ="sm#30245#2013-11-11 00:00:17 game1 gamed002: notice : transfer_enhance:roleid=333025374:level=80:src=43885:src_quality=9:dst=42152:dst_quality=4:enhance_level=12:tool_count=1;0:transfer_addon=0:vip_free=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+transfer_enhance:roleid=(.+):level=(.+):src=(.+):src_quality=(.+):dst=(.+):dst_quality=(.+):enhance_level=(.+):tool_count=(.+):transfer_addon=(.+):vip_free=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//16
	public void regmailbox() {
		String text ="sm#30403#2013-11-11 00:00:50 database gamedbd: notice : formatlog:regmailbox:send_roleid=751714400:receive_userid=152410458:receive_roleid=1807511648:level=77:offline_seconds=8844090";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bregmailbox\\b:send_roleid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):offline_seconds=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//17
	public void gamemailbox() {
		String text ="sm#30241#2013-11-11 00:05:25 database gamedbd: notice : formatlog:gamemailbox:send_roleid=1011376218:receive_roleid=4336537690:level=63:offline_time=959518";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgamemailbox\\b:send_roleid=(.+):receive_roleid=(.+):level=(.+):offline_time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//18
	public void sendmailbox_award() {
		String text ="sm#30241#2013-11-11 00:05:25 database gamedbd: notice : formatlog:sendmailbox_award:send_roleid=1011376218:receive_userid=270781788:receive_roleid=4336537690:level=63:item=38046:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bsendmailbox_award\\b:send_roleid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):item=(.+):count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//19
	public void return_award() {
		String text ="sm#30232#2013-11-11 00:10:13 database gamedbd: notice : formatlog:return_award:roleid=1140371549:item=38045:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\breturn_award\\b:roleid=(.+):item=(.+):count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//20
	public void sender_return_award() {
		String text ="sm#30232#2013-11-11 00:10:13 database gamedbd: notice : formatlog:sender_return_award:roleid=1204289629:item=43232:count=1:callback_roleid=1140371549";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bsender_return_award\\b:roleid=(.+):item=(.+):count=(.+):callback_roleid=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//21
	public void accountlogout() {
		String text ="sm#30810#2013-11-11 00:46:14 backup glinkd-1: notice : formatlog:logout:account=qs62615205:userid=239260086:sid=660545:peer=116.238.37.78:time=1976:status=0x10000:peerport=51594:MID=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=(.+):status=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//22
	public void forbiduser() {
		String text ="sm#30810#2013-11-11 00:53:20 backup gdeliveryd: notice : formatlog:ACForbidUser:roleid=209404003,accountid=354422536,forbid_time=301,reason_size=46,logreason=AAA=,reason=反外挂答题错误或避而不答，请勿使用第三方软件";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bACForbidUser\\b:roleid=(.+),accountid=(.+),forbid_time=(.+),reason_size=(.+),logreason=(.+),reason=([^:]+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//23//msg=accepttask
	public void task_accept() {
		String text ="sm#30810#2013-11-11 00:11:17 game1 gamed003: notice : formatlog:task:roleid=156823651:taskid=13184:type=1:msg=accepttask,level=45";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(.+):type=(.+):msg=accepttask,level=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//24//msg=finishtask
	public void task_complete() {
		String text ="sm#30809#2013-11-11 00:58:20 database gamed007: notice : formatlog:task:roleid=124772450:taskid=15965:type=1:msg=finishtask,level=1,success=1,giveup=0,gold=0,bindmoney=0,exp=0,bindcash=0,itemid:count=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(.+):type=(.+):msg=finishtask,level=(.+),success=(.+),giveup=(.+),gold=(.+),bindmoney=(.+),exp=(-?\\d+),.*itemid:count=.*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//25
	public void trade_formatlog() {
		String text ="sm#30232#2013-11-11 00:58:31 backup gdeliveryd: notice : formatlog:trade:roleidA=711532637:roleidB=3555680349:moneyA=3000000:moneyB=0:objectsA=:objectsB=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btrade\\b:roleidA=(\\d+):roleidB=(\\d+):moneyA=(\\d+):moneyB=(\\d+):objectsA=(.*);?:objectsB=(.*);?$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//26
	public void npc_sellitem() {
		String text ="sm#30807#2013-11-11 00:58:32 game1 gamed004: notice : sellitem,userid=513634311,level=72,itemid=2295,count=1,bind_money=7272,money=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsellitem\\b,userid=(.+),level=(.+),itemid=(.+),count=(.+),bind_money=(.+),.*money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//27
	public void npc_buyback() {
		String text ="sm#30201#2013-11-11 00:58:42 game1 gamed004: notice : buyback,roleid=6544961627,level=81,itemid=25142,bind_money=10885,money=0,count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bbuyback\\b,roleid=(.+),level=(.+),itemid=(.+),bind_money=(.+),.*money=(.+),count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//28
	public void npc_refineitem() {
		String text ="sm#30809#2013-11-11 00:58:45 game1 gamed005: notice : refineitem,roleid=5714018,level=67,itemid=24280,equip_mask=32,stone1=22905,stone1_count=5,stone2=14188,stone2_count=0,stone3=50156,stone3_count=0,money=0,bind_money=14166,result=1,equip_level=2";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\brefineitem\\b,roleid=(.+),level=(.+),itemid=(.+),equip_mask=(.+),stone1=(.+),stone1_count=(.+),stone2=(.+),stone2_count=(.+),money=(.+),bind_money=(.+),result=(-?\\d+),equip_level=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//29
	public void booth_buy() {
		String text ="sm#30401#2013-11-11 00:58:50 database gamed010: notice : booth_buy:purchaser=593907807,vendor=381984863,itemid=23091,count=1,price=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bbooth_buy:purchaser=(\\d+),vendor=(\\d+),itemid=(\\d+),count=(\\d+),price=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//30
	public void booth_sell() {
		String text ="sm#30801#2013-11-11 00:59:28 game1 gamed001: notice : booth_sell:vendor=70221825,purchaser=1978369,itemid=46705,count=50,price=6000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bbooth_sell:vendor=(\\d+),purchaser=(\\d+),itemid=(\\d+),count=(\\d+),price=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//31
	public void levelup() {
		String text ="sm#30810#2013-11-11 00:59:27 database gamed010: notice : levelup,roleid=128270435,level=40,money=0,play_time=36081";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\blevelup,roleid=(\\d+),level=(\\d+),money=(.+),play_time=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//32
	public void instance_open() {
		String text ="sm#30809#2013-11-11 00:59:44 database gamed006: notice : instance_open:team_id=25674,templ_id=13678,instance_id=1868,roleid:level=117305442:57;117272674:57;117395554:57;117346402:57;117502050:57;117354594:57;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\binstance_open:team_id=(\\d+),templ_id=(\\d+),instance_id=(\\d+),roleid:level=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//33
	public void instance_enter() {
		String text ="sm#30809#2013-11-11 00:59:45 database gamed006: notice : instance_enter.roleid=117305442,level=57,teamid=25674,templ_id=13678,instance_id=1868";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\binstance_enter.roleid=(\\d+),level=(\\d+),teamid=(.+),templ_id=(.+),instance_id=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//34
	public void instance_leave() {
		String text ="sm#30809#2013-11-11 00:59:45 game1 gamed021: notice : instance_leave.roleid=3166306,level=68,teamid=77908,templ_id=24410,instance_id=1166";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\binstance_leave.roleid=(\\d+),level=(\\d+),teamid=(.+),templ_id=(.+),instance_id=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//35
	public void instance_close() {
		String text ="sm#30809#2013-11-11 00:59:45 game1 gamed033: notice : instance_close.teamid=0,teamid_sec=-1,templ_id=24754,instance_id=4305,reason=1,timeout=5822";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\binstance_close.teamid=(\\d+).+templ_id=(\\d+),instance_id=(\\d+),reason=(-?\\d+).*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//36
	public void kingdomadd() {
		String text ="sm#30810#2013-11-11 00:17:35 database gamedbd: notice : formatlog:kingdomadd:roleid=90734691,level=33,kingdomid=426083,money=413820,bindmoney=2702513,bind_cash=3300";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bformatlog:kingdomadd:roleid=(\\d+),level=(\\d+),kingdomid=(\\d+),money=(.+),bindmoney=(-?\\d+).*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//37
	public void sendmail() {
		String text ="sm#30403#2013-11-11 00:17:38 database gamedbd: notice : formatlog:sendmail:timestamp=1068:src=9027928160:src_level=61:dst=9615458400:dst_level=80:mid=24:size=8:money=0:item=27937:count=1:pos=29";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bformatlog:sendmail:timestamp=(\\d+):src=(.+):src_level=(.+):dst=(.+):dst_level=(.+):mid=(.+):size=(.+):money=(.+):item=(.+):count=(.+):pos=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//38
	public void installgem() {
		String text ="sm#30245#2013-11-11 00:17:39 game1 gamed002: notice : installgem,roleid=123977822,level=80,itemid=43890,gemid=20313,money=0,bind_money=20000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\binstallgem,roleid=(\\d+),level=(\\d+),itemid=(.+),gemid=(.+),money=(.+),bind_money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//39
	public void uninstallgem() {
		String text ="sm#30301#2013-11-11 00:17:46 game1 gamed004: notice : uninstallgem,roleid=3724296284,level=75,itemid=34830,stoneid=19146,momey=0,bind_money=5000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\buninstallgem,roleid=(\\d+),level=(\\d+),itemid=(.+),stoneid=(.+),momey=(.+),bind_money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//40
	public void identifyitem() {
		String text ="sm#30401#2013-11-11 00:17:48 game1 gamed002: notice : identifyitem,roleid=287912031,level=50,itemid=33755,ticketid=22598,money=2000,bind_money=0,reidentify=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bidentifyitem,roleid=(\\d+),level=(\\d+),itemid=(.+),ticketid=(.+),money=(.+),bind_money=(.+),reidentify=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//41
	public void enhance_prop() {
		String text ="sm#30809#2013-11-11 00:17:47 game1 gamed003: notice : enhance_prop:roleid=17784930:level=56:prop_type=0:index=4:level=24:money=0:money2=28";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\benhance_prop:roleid=(\\d+):level=(\\d+):prop_type=(.+):index=(.+):level=(.+):money=(.+):money2=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//42
	public void transfer_makeupexp() {
		String text ="sm#30807#2013-11-11 00:17:50 database gamed009: notice : transfer_makeupexp:roleid=21270535:level=45:exp=10488000:bind_money=39131:money=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btransfer_makeupexp:roleid=(.+):level=(.+):exp=(.+):bind_money=(.+):money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//43
	public void obtain_makeupexp() {
		String text ="sm#30807#2013-11-11 00:17:50 game1 gamed001: notice : obtain_makeupexp:roleid=18186247:level=62:should_obtain=13999975:actual_obtain=13999975:result_total=13999975";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bobtain_makeupexp:roleid=(\\d+):level=(\\d+):should_obtain=(.+):actual_obtain=(.+):result_total=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//44
	public void npc_buyitem() {
		String text ="sm#30809#2013-11-11 00:17:50 game1 gamed001: notice : buyitem:roleid=28274786:level=69:item=9627,1:bind_money=42:money=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bbuyitem:roleid=(.+):level=(.+):item=(.+):bind_money=(.+):money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//45
	public void itemtrade() {
		String text ="sm#30806#2013-11-11 00:17:52 database gamed007: notice : itemtrade:roleid=765972486:level=75:item=35681,1,23861,25:bind_money=0:money=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+itemtrade:roleid=(.+):level=(.+):item=(.+):bind_money=(.+):money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//46
	public void exp_import_takeout() {
		String text ="sm#30809#2013-11-11 00:18:07 game1 gamed002: notice : exp_import_takeout:roleid=67125346:level=66:item_id=49821:finish=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+exp_import_takeout:roleid=(.+):level=(.+):item_id=(.+):finish=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//47
	public void arena_start() {
		String text ="sm#30808#2013-11-11 20:03:21 game1 gamed002: notice : arena_start:inst_tid=19022:inst_id=1481:inst_type=2:team1=23574:team2=23575:teammember=1,47603805,81,2088;1,355614814,80,2057;1,578695261,81,2117;2,3273896028,80,2035;2,4891037792,80,2168;2,7157842011,80,2152";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+arena_start:inst_tid=(.+):inst_id=(.+):inst_type=(.+):team1=(.+):team2=(.+):teammember=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//48
	public void arena_enter() {
		String text ="sm#30808#2013-11-11 20:03:22 game1 gamed005: notice : arena_enter:inst_tid=19022:inst_id=563:inst_type=2:roleid=9763536992:lvl=80:score=2324:teamid=23587";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+arena_enter:inst_tid=(.+):inst_id=(.+):inst_type=(.+):roleid=(.+):lvl=(.+):score=(.+):teamid=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//49
	public void arena_leave() {
		String text ="sm#30808#2013-11-11 20:05:06 database gamed010: notice : arena_leave:inst_tid=19022:inst_id=1075:inst_type=2:is_escape=0:roleid=1716408410:lvl=81:score_addon=-14:rep_addon=349:teamid=23569";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+arena_leave:inst_tid=(.+):inst_id=(.+):inst_type=(.+):is_escape=(.+):roleid=(.+):lvl=(.+):score_addon=(.+):rep_addon=(.+):teamid=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//50
	public void arena_finish() {
		String text ="sm#30802#2013-11-11 20:06:17 game1 gamed003: notice : arena_finish:inst_tid=19015:inst_id=800:inst_type=2:team1=21240:team2=21241:is_abandon=0:win_team=21240";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+arena_finish:inst_tid=(.+):inst_id=(.+):inst_type=(.+):team1=(.+):team2=(.+):is_abandon=(.+):win_team=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//51
	public void exp_import_putin() {
		String text ="sm#30809#2013-11-11 20:06:31 database gamed007: notice : exp_import_putin:roleid=76460130:level=70:item_id=31864";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+exp_import_putin:roleid=(.+):level=(.+):item_id=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//52
	public void repair_tool() {
		String text ="sm#30435#2013-11-11 20:07:58 game1 gamed003: notice : repair_tool:roleid=1419231329:level=80:tool_id=28229:tool_amount=1:equip_id=33751:repaire_count=3";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+repair_tool:roleid=(.+):level=(.+):tool_id=(.+):tool_amount=(.+):equip_id=(.+):repaire_count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//53
	public void petmelt() {
		String text ="sm#30809#2013-11-11 01:56:15 game1 gamed002: notice : petmelt:roleid=97742946:petid=17250:petgid=1383924821;150997669:quality=2:elixir=28810:count=4";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+petmelt:roleid=(.+):petid=(.+):petgid=(.+):quality=(.+):elixir=(.+):count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//54
	public void repair_npc() {
		String text ="sm#30810#2013-11-11 01:56:19 database gamed008: notice : repair_npc:roleid=117690467:level=32:equip_id=36898:dur_max_dec=0:dur_inc=1:cost=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+repair_npc:roleid=(.+):level=(.+):equip_id=(.+):dur_max_dec=(.+):dur_inc=(.+):cost=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//55
	public void start_oem() {
		String text ="sm#30232#2013-11-11 01:56:26 game1 gamed003: notice : start_oem:roleid=633032797:level=80:mercenary_tid=39662:oem_id=20348:pet_level=76:talent=0.000000:quality=0.400000:oem_time=24300:act_miss_count=2";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+start_oem:roleid=(.+):level=(.+):mercenary_tid=(.+):oem_id=(.+):pet_level=(.+):talent=(.+):quality=(.+):oem_time=(.+):act_miss_count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	
	//56
	public void petpass() {
		String text ="sm#30401#2013-11-11 01:08:37 game1 gamed002: notice : petpass:roleid=1178959967:level=80:petid=47587:petgid=1384103031;33555784:petid2=28276:petgid2=1342692645;67108926:score=3369:money=2887500:item_id=34101:item_count=5";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+petpass:roleid=(.+):level=(.+):petid=(.+):petgid=(.+):petid2=(.+):petgid2=(.+):score=(.+):money=(.+):item_id=(.+):item_count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//57
	public void auc_succ() {
		String text ="sm#30403#2013-11-11 01:08:38 database gamedbd: notice : formatlog:dbauction:type=auc_succ:auctionid=2196157:seller=6554632288:seller_level=80:buyer=2342862944:buy_type=0:item_id=45649:item_count=1:binprice=36098:bidprice=36000:deposit=48:tax=721";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:dbauction:type=auc_succ:auctionid=(.+):seller=(.+):seller_level=(.+):buyer=(.+):buy_type=(.+):item_id=(.+):item_count=(.+):binprice=(.+):bidprice=(.+):deposit=(.+):tax=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//58
	public void dbkingdomallychg() {
		String text ="sm#30809#2013-11-11 00:19:18 database gamedbd: notice : formatlog:dbkingdomallychg:kid=32866:ally_kid=196706:apply_type=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+dbkingdomallychg:kid=(.+):ally_kid=(.+):apply_type=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//59
	public void petunbind() {
		String text ="sm#30403#2013-11-11 01:16:19 game1 gamed002: notice : petunbind:roleid=9687871584:level=80:petid=34279:petgid=1328420907,100670240:petlevel=80:bind_money=800000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+petunbind:roleid=(.+):level=(.+):petid=(.+):petgid=(.+):petlevel=(.+):bind_money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//60
	public void shoptrade() {
		String text ="sm#30810#2013-11-11 00:19:31 game1 gamed033: notice : formatlog:gshop_trade:userid=248200438:roleid=39874659:order_id=0:item_id=14188:expire=0:item_count=1:cash_need=100:guid=0,0:reputation=0,0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgshop_trade\\b:userid=(.+):roleid=(.+):order_id=(.+):item_id=(.+):expire=(.+):item_count=(.+):cash_need=(-?\\d+):guid=.+";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//61
	public void addcash() {
		String text ="sm#30807#2013-11-11 00:20:36 database gamedbd: notice : formatlog:addcash:userid=334123380:oldserial=47:newserial=47:cash_add=1322600:delta=2000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:userid=(.+):oldserial=.+:newserial=.+:cash_add=(.+):delta=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//62
	public void stockbalance() {
		String text ="sm#30809#2013-11-11 00:21:02 database gamedbd: notice : formatlog:stockbalance:userid=351203194:tid=627:volume=0:ack_volume=5:ack_cash=12.5:ack_money=-719500:cash=1250:money=0:cash_buy=1250:cash_sell=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bstockbalance\\b:userid=(.+):tid=(.+):volume=(.+):ack_volume=.+:ack_cash=(.+):ack_money=(.+):cash=(.+):money=(.+):cash_buy=(.+):cash_sell=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//63
	public void clear360cash() {
		String text ="sm#30201#2013-11-11 00:40:12 database gamedbd: notice : formatlog:clear360:userid=152645540:logintime=1349491575:cash_delta=10;2296:41;14188:15;28821:12;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(.+?);(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	//64
	public void clear360item() {
		String text ="sm#30201#2013-11-11 00:40:12 database gamedbd: notice : formatlog:clear360:userid=152645540:logintime=1349491575:cash_delta=10;2296:41;14188:15;28821:12;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()){
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println("匹配的数量_____" + count);
		}
	}
	
	public static void main(String[] args) {
		World2Formatlog expLog = new World2Formatlog();
		expLog.task_accept();
	}
}
