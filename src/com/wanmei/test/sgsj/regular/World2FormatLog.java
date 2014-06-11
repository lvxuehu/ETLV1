package com.wanmei.test.sgsj.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2FormatLog {
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
	public void taskaccept() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:task:roleid=(.+):taskid=(.+):msg=(.*):type=(accept)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"taskaccept");
	}
	
	//2
	public void top_challenge() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+:formatlog:top:challenge:no=\\d*,rank=(\\d+),rolename=(.*?),achivenum=(\\d+),zoneid=(\\d+),logtime=\\d+,date=.*$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"top_challenge");
	}
	
	//3
	public void accountlogin() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogin\\b:accountid=(.+):account=(.+):challid=(.+):peer:([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogin");
	}
	
	//4
	public void rolelogin() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogin\\b:accountid=(.+):account=(.+):charid=(.+):gate=(.+):line=(.+):mac=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogin");
	}
	
	//5
	public void accountlogout() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:accountid=(.+):account=(.+):gate=(.+):time=(.+):peer=(.+):reason=([^:]+):MaxPing=.+:MinPing=.+:AvePing=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogout");
	}
	
	//6
	public void rolelogout() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogout\\b:accountid=(.+):account=.+:charid=(.+):gate=.+:line=.+:time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogout");
	}
	
	//7
	public void gmlog() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gmlog");
	}
	
	//8
	public void tasksucc() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(-?\\d+):msg=OnMsgTaskReqDone:.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"tasksucc");
	}
	
	//9
	public void forbiduser() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bforbidaccount\\b:source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.+):cash_add=(.+):cash_used=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	//10
	public void question() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:question:userid=(.+):zoneid=(.+):areaid=(.+):cheattype=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"question");
	}
	
	//11
	public void givechanged() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:give:RoleID=(\\d+):GiveChanged=(.+):GiveTotal=(.+):Reason=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"givechanged");
	}
	
	//12
	public void salary() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+salary:AccID=(\\d+):RoleID=(\\d+):ItemID=(\\d+):Num=(\\d+):Price=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"salary");
	}
	
	//13
	public void card() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:card:RoleID=(\\d+):ItemID=(\\d+):CardNumber=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"card");
	}
	
	//14
	public void bargain() {
		String text ="s_ln=99974#srbip=172.21.182.254#srbgn=10101#2014-05-21 14:32:41 lv3:GS1:formatlog:bargain:RoleID=3245636:ItemID=4651:ItemGUID=3000310645719284234:Num=20:Money=40000:fromTargetID=3239507";
		String reg = "^(.+)#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+bargain:RoleID=(\\d+):ItemID=(\\d+):ItemGUID=(.+):Num=(\\d+):Money=(.+):fromTargetID=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"bargain");
	}
	
	//15
	public void reinforce() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+reinforce:userid=(-?\\d+):item=(-?\\d+):level=(-?\\d+):Crystal1Num=(-?\\d+):Crystal2Num=(-?\\d+):Crystal3Num=(-?\\d+):result=(-?\\d+):lucyroll=(-?\\d+):level_before=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"reinforce");
	}
	
	//16
	public void goldconsign_cancel() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:cancel:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_cancel");
	}
	
	//17
	public void goldconsign_begin() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:begin:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_begin");
	}
	
	//18
	public void goldconsign_end() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:end:ID=(.+):RoleID=(.+):Price=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_end");
	}
	
	//19
	public void goldconsign_syscan() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:syscancel:ID=(.+):RoleID=(.+):Price=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_syscan");
	}
	
	//20
	public void goldconsign_buy() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:buy:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):LeftTime=(.+):AddGold=(.+):SellRoleID=([^:]+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_buy");
	}
	
	//21
	public void goldconsign_sell() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:sell:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):LeftTime=(.+):AddMoney=(.+):BuyRoleID=([^:]+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_sell");
	}
	
	//22
	public void npcshop() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:npcshop:(.+):RoleID=(.+):ItemID=(.+):ItemGUID=(.+):Num=(.+):Money=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"npcshop");
	}
	
	//23
	public void globalvar() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:GlobalVar:Key:(.+)=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"globalvar");
	}
	
	//24
	public void regmailbox() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bregmailbox:send_userid=(.+):send_roleid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):offline_seconds=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"regmailbox");
	}
	
	//25
	public void gamemailbox() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:gamemailbox:send_roleid=(.+):receive_roleid=(.+):level=(.+):offline_time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gamemailbox");
	}
	
	//26
	public void gamemailbox_award() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:gamemailbox_award:roleid=(.+):item=(.+):count=(.+):callback_roleid=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gamemailbox");
	}
	
	//27
	public void regmailbox_award() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:regmailbox_award:roleid=(.+):item=(.+):count=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"regmailbox_award");
	}
	
	//28
	public void jewels() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:insert:userid=(.+):item=(.+):gem=(.+):charm=(.+):result=(.+):perfect=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"jewels");
	}
	
	//29
	public void shop_buy() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bshop\\b:AccID=(.+):RoleID=(.+):ItemID=(.+):ItemGUID=.+:Num=(.+):BuyType=(.+):RealNeed=(.+):Point=(.+):Left=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shop_buy");
	}
	
	//30
	public void shoptrade() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bshop\\b:AccID=(.+):RoleID=(.+):ItemID=(.+):ItemGUID=(.+):Num=(.+):BuyType=1:RealNeed=(.+):Point=(.+):Left=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shop_buy");
	}
	
	//31
	public void shop() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bshop\\b:AccID=(.+):RoleID=(.+):ItemID=(.+):ItemGUID=(.+):Num=(.+):BuyType=3:RealNeed=(.+):Point=(.+):Left=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shop");
	}
	
	//32
	public void addcash() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:accountid=(.+):oldserial=(.+):newserial=(.+):cash_add=(.+):delta=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"addcash");
	}
	
	//33_1
	public void stockbalance_1() {
		String text ="2014-05-20 18:46:22 lv3:MS:formatlog:goldconsign:buy:ID=14084:RoleID=10822547:Price=474555:HandNum=7:StartTime=1400576440:LeftTime=80301:AddGold=700:SellRoleID=[10839253]";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgoldconsign\\b:(buy):ID=.+:RoleID=(.+):Price=.+:HandNum=.+:StartTime=.+:LeftTime=.+:AddGold=(-?\\d+):SellRoleID=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stockbalance_1");
	}
	
	//33_2
	public void stockbalance_2() {
		String text ="2014-05-20 18:46:22 lv3:MS:formatlog:goldconsign:buy:ID=14084:RoleID=10822547:Price=474555:HandNum=7:StartTime=1400576440:LeftTime=80301:AddGold=700:SellRoleID=[10839253]";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgoldconsign\\b:(sell):ID=.+:RoleID=(.+):Price=.+:HandNum=.+:StartTime=.+:LeftTime=.+:AddMoney=(.+):BuyRoleID=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stockbalance_2");
	}
	
	//34
	public void clear360cash() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(-?\\d+);?(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360cash");
	}
	
	//35
	public void clear360item() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360item");
	}
	
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		//w.taskaccept();\
		//w.bargain();
		w.stockbalance_1();
	}
}
