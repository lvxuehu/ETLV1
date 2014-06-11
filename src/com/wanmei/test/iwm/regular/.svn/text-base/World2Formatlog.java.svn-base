package com.wanmei.test.iwm.regular;

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
		String text ="iwm#10501#2013-11-11 00:02:02 game1 gamed: notice : playerlogout:roleid=9891456:userid=270731265:level=56:occupation=0:worldtag=1:x=2383.401367:y=220.149872:z=-743.512878:playtime=1331";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+playerlogout:roleid=(\\d+):userid=(\\d+):level=(\\d+):occupation=(\\d+):worldtag=(\\d+):x=(-?\\d+\\.?\\d+):y=(-?\\d+\\.?\\d+):z=(-?\\d+\\.?\\d+):playtime=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"playerlogout");
	}
	
	//2
	public void mallconsumption() {
		String text ="iwm#40108#2013-11-11 00:37:58 game1 gamed: notice : mallconsumption:userid=345892746:roleid=27825312:rolename=ACUBJQUmuQM2Tod2UFs=:delta=10:total=84520:type=2:item=12979:item_count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+mallconsumption:userid=(\\d+):roleid=(\\d+):rolename=(.+):delta=(-?\\d+):total=(-?\\d+):type=(\\d+):item=(\\d+):item_count=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mallconsumption");
	}
	
	//3
	public void dph_rank() {
		String text ="iwm#40108#2013-11-11 00:37:58 game1 gamed: notice : mallconsumption:userid=345892746:roleid=27825312:rolename=ACUBJQUmuQM2Tod2UFs=:delta=10:total=84520:type=2:item=12979:item_count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:dph_rank::mask=(.+):cls=(.+):rank=(.+):roleid=(.+):dps=(.+):dph=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"dph_rank");
	}
	
	//4
	public void accountlogin() {
		String text ="iwm#20801#2013-11-11 00:06:07 backup glinkd-1: notice : formatlog:login:account=seyimm0323:userid=243376934:sid=14833:peer=180.143.146.51";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogin\\b:account=(.+):userid=(.+):sid=(.+):peer=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogin");
	}
	
	//5
	public void rolelogout() {
		String text ="iwm#40206#2013-11-11 00:07:11 game1 glinkd-6: notice : formatlog:rolelogout:userid=1057075344:roleid=46647362:localsid=21475:time=11149";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogout\\b:userid=(.+):roleid=(.+):localsid=(.+):time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogout");
	}
	
	//6
	public void deleterole() {
		String text ="iwm#20107#2013-11-11 00:05:07 database gamedbd: notice : formatlog:deleterole:roleid=1089508948:occupation=6:create_time=1383492237";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:deleterole:roleid=(.+):occupation=(.+):create_time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"deleterole");
	}
	
	//7
	public void accountlogout() {
		String text ="iwm#40205#2013-11-11 00:01:16 game1 glinkd-6: notice : formatlog:logout:account=mejkqy:userid=347641949:sid=26721:peer=27.42.63.239:time=2095:status=0x60000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=(-?\\d+):status=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogout");
	}
	
	//8
	public void gmlog() {
		String text ="iwm#40205#2013-11-11 00:01:16 game1 glinkd-6: notice : formatlog:logout:account=mejkqy:userid=347641949:sid=26721:peer=27.42.63.239:time=2095:status=0x60000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gmlog");
	}
	
	//9
	public void forbiduser() {
		String text ="iwm#20401#2013-11-11 00:08:21 database gamedbd: notice : formatlog:forbiduser:source=1:gmuserid=1984:userid=213110877:zoneid=174:areaid=10:forbid_time=301:real_time=301:reason=94v/Un9PKHVel9VshHYsewlOuWVvj/ZOAjA=:cash_add=46000:cash_used=149760";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bforbiduser\\b:source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.+):cash_add=(.+):cash_used=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	//10
	public void task_complete() {
													
		String text ="iwm#20107#2014-05-04 04:02:30 database gamed: notice : formatlog:task:roleid=8424800:taskid=29653:type=1:msg=DeliverByAwardData: success = 1, gold = 0, exp = 0, sp = 0, reputation = 0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(\\d+).+msg=DeliverByAwardData:\\s+success\\s+=\\s+1\\b,\\s+gold\\s+=\\s+(\\d+),\\s+exp\\s+=(.+),\\s+sp\\s+=\\s+(.+),\\s+reputation\\s+=\\s+(.+).*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_complete");
	}

	//11
	public void webtradesold() {
		String text ="iwm#10401#2013-11-11 00:11:39 database gamedbd: notice : formatlog:webtradesold:role=12557013:sn=468151541369:buyer_roleid=8086418:type=2:itemid=39941:item_count=10:money=0:role=12557013:petid=0:pet_count=0:level=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:webtradesold:role=(.+):sn=(.+):buyer_roleid=(.+):type=(.+):itemid=(.+):item_count=(.+):money=(.+):role=(.+):petid=(.+):pet_count=(.+):level=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"webtradesold");
	}
	
	//12
	public void sendmail() {
		String text ="iwm#20102#2013-11-11 00:02:13 database gamedbd: notice : formatlog:sendmail:timestamp=14463:src=618721:dst=368669456:mid=87:size=4:money=0:item=20355:count=1:pos=26";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:sendmail:timestamp=(.+):src=(.+):dst=(.+):mid=(.+):size=(.+):money=(.+):item=(.+):count=(.+):pos=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"sendmail");
	}
	
	//13
	public void rolelogin() {
		String text ="iwm#20103#2013-11-11 00:02:15 backup glinkd-6: notice : formatlog:rolelogin:userid=222234452:roleid=68812688:lineid=77:localsid=95494";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogin\\b:userid=(.+):roleid=(-?\\d+):lineid=.+:localsid=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogin");
	}
	
	//14
	public void task_accept() {
		String text ="2014-03-24 23:59:59 game1 gamed: notice : formatlog:task:roleid=57716642:taskid=23084:type=1:msg=CheckDeliverTask";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(-?\\d+):type=.+:msg=CheckDeliverTask$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_accept");
	}
	
	//15
	public void task_abort() {
		String text ="2014-03-26 05:07:51 game1 gamed: notice : formatlog:task:roleid=21797520:taskid=9675:type=1:msg=GiveUpTask";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(-?\\d+):type=.+:msg=GiveUpTask$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_abort");
	}
	
	//16
	public void sendaumail() {
		String text ="iwm#10319#2013-11-11 00:03:48 game1 gamed: notice : formatlog:task:roleid=44603953:taskid=6752:type=1:msg=GiveUpTask";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:SendAUMail:send_userid=(.+):send_role=(.+):received_userid=(.+):received_roleid=(.+):level=(.+):offline_seconds=(.+):bonus_lvl=(.+):ex_reward=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"sendaumail");
	}
	
	//17
	public void createrole_success() {
		String text ="iwm#40203#2013-11-11 00:06:02 backup gdeliveryd: notice : formatlog:createrole-success:userid=350754401:account=xssrvkzhhf:roleid=55548982:IP=182.242.89.21";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:createrole-success:userid=(.+):account=(.+):roleid=(.+):IP=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"createrole_success");
	}
	
	//18
	public void shoptrade() {
		String text ="iwm#40203#2013-11-11 00:06:02 backup gdeliveryd: notice : formatlog:createrole-success:userid=350754401:account=xssrvkzhhf:roleid=55548982:IP=182.242.89.21";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgshop_trade\\b:userid=(.+):db_magic_number=(.+):order_id=(.+):item_id=(.+):expire=(.+):item_count=(.+):cash_need=(.+):cash_left=(-?\\d+):guid1=.+:guid2=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shoptrade");
	}
	
	//19
	public void addcash() {
		String text ="iwm#40203#2013-11-11 00:06:02 backup gdeliveryd: notice : formatlog:createrole-success:userid=350754401:account=xssrvkzhhf:roleid=55548982:IP=182.242.89.21";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:userid=(.+):oldserial=.+:newserial=.+:cash_add=(.+):delta=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shoptrade");
	}
	
	//20
	public void stockbalance() {
		String text ="iwm#40203#2013-11-11 00:06:02 backup gdeliveryd: notice : formatlog:createrole-success:userid=350754401:account=xssrvkzhhf:roleid=55548982:IP=182.242.89.21";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bstockbalance\\b:userid=(.+):tid=(.+):volume=(.+):ack_volume=(.+):ack_money=(.+):cash=(.+):money=(.+):cash_buy=(.+):cash_sell=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shoptrade");
	}
	
	//21
	public void clear360cash() {
		String text ="2014-03-26 05:31:55 database gamedbd: notice : formatlog:clear360:userid=738768768:logintime=1206022172:cash_delta=0;797:1;802:2;817:1;833:4;11208:15;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(\\d+?);.*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360cash");
	}
	
	//22
	public void clear360item() {
		String text ="2014-03-26 05:31:55 database gamedbd: notice : formatlog:clear360:userid=738768768:logintime=1206022172:cash_delta=0;797:1;802:2;817:1;833:4;11208:15;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360item");
	}
	
	public static void main(String[] args) {
		World2Formatlog expLog = new World2Formatlog();
		//expLog.playerlogout();
		//expLog.mallconsumption();
		//expLog.accountlogin();
		//expLog.rolelogout();
	//	expLog.deleterole();
		//expLog.accountlogout();
		//expLog.gmlog();
		//expLog.forbiduser();
		expLog.task_complete();
		//expLog.webtradesold();
		//expLog.sendmail();
		//expLog.rolelogin();
		//expLog.task_accept();
		//expLog.task_abort();
		//expLog.sendaumail();
		//expLog.createrole_success();
		//expLog.clear360cash();
		//expLog.clear360item();
	}
}
