package com.wanmei.test.zx.regular;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;



public class World2FormatLog {
	private void systemout(String text,String reg,String methodName) {
		Pattern p = new Pattern(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i < count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	//1
	public void lottery() {
		String text ="2013-11-10 23:59:59 game1 gamed: notice : formatlog:lottery:userid=27545346:lottery_item=61139:bonus=3:bonus_item=6350:bonus_count=1:bonus_money=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:lottery:userid=(\\d+):lottery_item=(\\d+):bonus=(\\d+):bonus_item=(\\d+):bonus_count=(\\d+):bonus_money=(-?\\d+)$";
		
		systemout(text, reg, "lottery____");
	}
	
	//2
	public void rolelogout_gs() {
		String text ="2013-11-10 23:59:59 beiji gamed: notice : formatlog:rolelogout_gs:roleid=138733824:userid=233412436:occupation=0:map_id=401:x=387.247681:y=483.388580:z=282.493439:level=16:reborn_cnt=0:onlinetime=14387";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rolelogout_gs:roleid=(\\d+):userid=(\\d+):occupation=(\\d+):map_id=(\\d+):x=(-?\\d+\\.?\\d*):y=(-?\\d+\\.?\\d*):z=(-?\\d+\\.?\\d*):level=(\\d+):reborn_cnt=(\\d+):onlinetime=(-?\\d+)$";
		
		systemout(text, reg, "rolelogout_gs____");
	}
	
	//3
	public void forbiduser_question() {
		String text ="2013-11-11 00:00:03 backup gdeliveryd: notice : formatlog:acforbiduser:gmuser=1984:userid=347201434:roleid=3112497:forbid_time=-1:reason=AAA=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bacforbiduser\\b:gmuser=(.+):userid=(.+):roleid=(.+):forbid_time=(.+):reason=([^:]+)$";
		
		systemout(text, reg, "forbiduser_question___");
	}
	
	//4
	public void newbie_exit_game_reason() {
		String text ="2013-11-11 00:00:04 game1 gamed: notice : formatlog:newbie_exit_game_reason:roleid=9160608:type=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bnewbie_exit_game_reason\\b:roleid=(.+):type=([^:]+)$";
		
		systemout(text, reg, "newbie_exit_game_reason___");

	}
//	
	//5
	public void getattach() {
		String text ="2013-11-11 00:00:06 database gamedbd: notice : formatlog:getattach:stamp=4095:src=91654400:dst=92870976:mid=29:money=0:item=48002:count=1:pos=9";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgetattach\\b:stamp=(.+):src=(.+):dst=(.+):mid=(.+):money=(.+):item=(.+):count=(.+):pos=([^:]+)$";
		
		systemout(text, reg, "getattach____");
	}
	
	//6
	public void gbonusshop_trade() {
		String text ="2013-11-11 00:00:12 game1 gamed: notice : formatlog:gbonusshop_trade:userid=690463713:db_magic_number=690463712:item_id=31823:expire=0:item_count=1:bonus_need=600:bonus_left=24445:guid=1384099212,251661207";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgbonusshop_trade\\b:userid=(.+):db_magic_number=(.+):item_id=(.+):expire=(.+):item_count=(.+):bonus_need=(.+):bonus_left=(.+):guid=([^:]+)$";
		
		systemout(text, reg, "gbonusshop_trade___");
	}
	
	
	//7 -1 
	public void accountlogin_1() {
		String text ="2013-11-11 00:00:11 backup glinkd-2: notice : formatlog:login:account=a309509279:userid=222426545:sid=214795:peer=222.183.110.238:mid=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogin\\b:account=(.+):userid=(.+):sid=(.+):peer=(\\d+\\.\\d+\\.\\d+\\.\\d+):mid=([^:]*)$";
		
		systemout(text, reg, "accountlogin1____");
	}
	
	//7 -2 
	public void accountlogin_2() {
		String text ="2013-11-11 00:00:11 backup glinkd-2: notice : formatlog:login:account=a309509279:userid=222426545:sid=214795:peer=222.183.110.238";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogin\\b:account=(.+):userid=(.+):sid=(.+):peer=(\\d+\\.\\d+\\.\\d+\\.\\d+)$";
		
		systemout(text, reg, "accountlogin_2____");
	}
	
	//8
	public void rolelogin() {
		String text ="2013-11-11 00:00:24 backup glinkd-2: notice : formatlog:rolelogin:userid=255329880:roleid=148198448:lineid=6:localsid=934407:src_zoneid=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogin\\b:userid=(.+):roleid=(.+):lineid=(.+):localsid=(.+):src_zoneid=(-?\\d+)$";
		
		systemout(text, reg, "rolelogin___");
	}
	//9
	public void rolelogout() {
		String text ="2013-11-11 00:00:23 backup glinkd-2: notice : formatlog:rolelogout:userid=353611106:roleid=8697744:localsid=52819:time=38";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogout\\b:userid=(.+):roleid=(.+):localsid=(.+):time=(-?\\d+)$";
		
		systemout(text, reg, "rolelogout___");
	}
	
	//10
	public void deleterole() {
		String text ="2013-11-11 00:00:41 database gamedbd: notice : formatlog:deleterole:roleid=46921314:create_time=1383188364";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:deleterole:roleid=(.+):create_time=([^:]+)$";
		
		systemout(text, reg, "deleterole____");
	}
	
	//11 -- 1
	public void accountlogout_1() {
		String text ="2013-11-11 00:00:41 backup glinkd-3: notice : formatlog:logout:account=wu730414:userid=1088063664:sid=948183:peer=163.179.18.104:time=356:status=0x10000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=(-?\\d+):status=(\\w+)$";
		systemout(text, reg, "accountlogout_1___");
	}
	
	//11 -- 2
	public void accountlogout_2() {
		String text ="2013-11-11 00:00:41 backup glinkd-3: notice : formatlog:logout:account=wu730414:userid=1088063664:sid=948183:peer=163.179.18.104:time=356:status=0x10000:mid=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=(-?\\d+):status=(\\w+):mid=([^:]*)$";
		
		systemout(text, reg, "accountlogout_2___");
	}
	
	//12
	public void task_complete() {
		String text ="2013-11-11 00:00:45 game1 gamed: notice : formatlog:task:roleid=67184016:taskid=25055:type=1:msg=DeliverByAwardData: success = 1, gold = 0, exp = 0, sp = 0, reputation = 0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(\\d+).+msg=DeliverByAwardData:\\s+success\\s+=\\s+1\\b,\\s+gold\\s+=\\s+(\\d+),\\s+exp\\s+=(.+),\\s+sp\\s+=\\s+(.+),\\s+reputation\\s+=\\s+(-?\\d+)$";
		
		systemout(text, reg, "task_complete___");
	}
	
	//13
	public void gamemailbox() {
		String text ="2013-11-11 00:00:45 database gamedbd: notice : formatlog:gamemailbox:send_roleid=8291104:receive_roleid=3706785:level=128:offline_time=19976";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+gamemailbox:send_roleid=(.+):receive_roleid=(.+):level=(.+):offline_time=([^:]+)$";
		
		systemout(text, reg, "gamemailbox___");
	}
	
	//14
	public void regmailbox() {
		String text ="2013-11-11 00:00:45 database gamedbd: notice : formatlog:regmailbox:send_userid=235938549:send_roleid=8478272:receive_userid=242650296:receive_roleid=13261392:level=116:offline_seconds=51492357";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+regmailbox:send_userid=(.+):send_roleid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):offline_seconds=([^:]+)$";
		
		systemout(text, reg, "regmailbox___");
	}
	
	//15
	public void gamemailbox_award() {
		String text ="2013-11-11 00:01:17 database gamedbd: notice : formatlog:gamemailbox_award:roleid=23513984:item=44219:count=1:callback_roleid=25295665";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+gamemailbox_award:roleid=(.+):item=(.+):count=(.+):callback_roleid=([^:]+)$";
		
		systemout(text, reg, "gamemailbox_award___");
	}
	
	//16
	public void regmailbox_award() {
		String text ="2013-11-11 00:01:17 database gamedbd: notice : formatlog:regmailbox_award:roleid=25295665:item=44220:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+regmailbox_award:roleid=(.+):item=(.+):count=([^:]+)$";
		
		systemout(text, reg, "regmailbox_award___");
	}
	
	//17
	public void obtain_cash_gift() {
		String text ="2013-11-11 00:07:39 game1 gamed: notice : formatlog:obtain_cash_gift:userid=70215782:gift_award_id=60362:total_point=2150:gift_id1=55594:gift_id2=55595:cur_timestmap=1384099660:award_timestamp=1379952000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bobtain_cash_gift\\b:userid=(\\d+):gift_award_id=(\\d+):total_point=(-?\\d+):gift_id1=(\\d+):gift_id2=(\\d+):cur_timestmap=(-?\\d+):award_timestamp=(-?\\d+)$";
		
		systemout(text, reg, "obtain_cash_gift____");
	}
	
	//18
	public void addcash() {
		String text ="2013-11-11 00:00:20 database gamedbd: notice : formatlog:addcash:userid=347598760:oldserial=11:newserial=11:cash_add=153000:delta=5100";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:userid=(.+):oldserial=.+:newserial=.+:cash_add=(.+):delta=([^:]+)$";
		
		systemout(text, reg, "addcash____");
	}
	
	//19
	public void stockbalance() {
		String text ="2013-11-11 00:00:03 database gamedbd: notice : formatlog:stockbalance:userid=130364989:tid=137683:volume=0:ack_volume=7:ack_money=-139999300:cash=700:money=65661787:cash_buy=38400:cash_sell=2794";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bstockbalance\\b:userid=(.+):tid=(.+):volume=(.+):ack_volume=(.+):ack_money=(.+):cash=(.+):money=(.+):cash_buy=(.+):cash_sell=([^:]+)$";
		
		systemout(text, reg, "stockbalance____");
	}
	
	//20
	public void gmlog() {
		String text ="2013-11-11 00:00:03 database gamedbd: notice : formatlog:stockbalance:userid=130364989:tid=137683:volume=0:ack_volume=7:ack_money=-139999300:cash=700:money=65661787:cash_buy=38400:cash_sell=2794";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=(.*)$";
		
		systemout(text, reg, "gmlog___");
	}
	
	//21
	public void shoptrade() {
		String text ="2013-11-11 00:00:03 database gamedbd: notice : formatlog:stockbalance:userid=130364989:tid=137683:volume=0:ack_volume=7:ack_money=-139999300:cash=700:money=65661787:cash_buy=38400:cash_sell=2794";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgshop_trade\\b:userid=(.+):db_magic_number=(.+):order_id=(.+):item_id=(.+):expire=(.+):item_count=(.+):cash_need=([^:]+):cash_left=([^:]+):guid=.+$";
		
		systemout(text, reg, "shoptrade_____");
	}
	
	//22
	public void task_abort() {
		String text ="2014-04-15 09:00:11 game1 gamed: notice : formatlog:task:roleid=1241366896:taskid=20594:type=1:msg=GiveUpTask";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(.+):type=.+:msg=GiveUpTask$";
		
		systemout(text, reg, "task_abort_____");
	}
	
	//23
	public void task_accept() {
		String text ="2014-04-15 09:00:10 beiji gamed: notice : formatlog:task:roleid=59880816:taskid=31595:type=1:msg=CheckDeliverTask";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(.+):type=.+:msg=CheckDeliverTask$";
		
		systemout(text, reg, "task_accept____");
	}
	
	//24
	public void territoryowner() {
		String text ="2013-11-11 00:00:03 database gamedbd: notice : formatlog:stockbalance:userid=130364989:tid=137683:volume=0:ack_volume=7:ack_money=-139999300:cash=700:money=65661787:cash_buy=38400:cash_sell=2794";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+TerritoryOwner:tid=(.+),\\ owner=([^:]+)$";
		
		systemout(text, reg, "territoryowner_____");
	}
	
	//25
	public void forbiduser() {
		String text ="2013-11-11 00:00:03 database gamedbd: notice : formatlog:stockbalance:userid=130364989:tid=137683:volume=0:ack_volume=7:ack_money=-139999300:cash=700:money=65661787:cash_buy=38400:cash_sell=2794";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bforbiduser\\b:source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.*):cash_add=(.+):cash_used=([^:]+)$";
		
		systemout(text, reg, "forbiduser___");
	}
	
	//26
	public void clear360cash() {
		String text ="2013-11-11 00:00:10 database gamedbd: notice : formatlog:clear360:userid=16583392:logintime=1347521550:cash_delta=0;22343:3000;23360:25;41668:1500;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(.+?);(.*)$";
		
		systemout(text, reg, "clear360cash___");
	}
	
	//27
	public void clear360item() {
		String text ="2013-11-11 00:00:10 database gamedbd: notice : formatlog:clear360:userid=16583392:logintime=1347521550:cash_delta=0;22343:3000;23360:25;41668:1500;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		
		systemout(text, reg, "clear360item____");
	}
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		//expLog.lottery();
		//expLog.rolelogout_gs();
		//w.forbiduser_question();
		//w.newbie_exit_game_reason();
		//w.getattach();
		//w.gbonusshop_trade();
		//w.accountlogin_1();
		//w.accountlogin_2();
		//w.rolelogin();
		//w.rolelogout();
		//w.deleterole();
		w.accountlogout_1();
		//w.accountlogout_2();
		//w.task_complete();
		//w.gamemailbox();
		//w.regmailbox();
		//w.gamemailbox_award();
		//w.regmailbox_award();
		//w.addcash();
		//w.stockbalance();
		//w.clear360cash();
		//w.clear360item();
		//w.task_abort();
		//w.task_accept();
	}
}
