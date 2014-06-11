package com.wanmei.test.sg.regular;

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
	public void question() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:question:userid=(\\d+):zoneid=(.+):areaid=(.+):cheattype=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"question");
	}
	
	//2
	public void npcshop() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bnpcshop\\b:(.+):RoleID=(.+):ItemID=(.+):ItemGUID=(.+):Num=(.+):Money=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"npcshop");
	}
	
	//3
	public void taskaccept() {
		String text ="2014-05-21 17:54:01 lv3:GS8:formatlog:task:roleid=7886584:taskid=4427:msg=CTaskMgr::Update:type=done:successs=0:money=0:exp=0:items=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:task:roleid=(.+):taskid=(.+):msg=(.+):type=(accept)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"taskaccept");
	}
	
	//4
	public void accountlogin() {
		String text ="2014-05-21 21:03:54 lv3:MS:formatlog:login:accountid=213794227:account=a624407337:challid=23260:peer:123.173.58.24:mid=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogin\\b:accountid=(.+):account=(.+):challid=(.+):peer:([^:]+):mid=([^:]*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogin");
	}
	
	//5
	public void rolelogin() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogin\\b:accountid=(.+):account=([^:]*):charid=([^:]*):gate=([^:]*):line=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogin");
	}
	
	//6
	public void regmailbox() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:regmailbox:send_userid=(.+):send_roleid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):offline_seconds=([^:]*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"regmailbox");
	}
	
	//7
	public void regmailbox_award() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:regmailbox_award:roleid=(.+):item=(.+):count=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"regmailbox");
	}
	
	//8
	public void gamemailbox() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:gamemailbox:send_roleid=(.+):receive_roleid=(.+):level=(.+):offline_time=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gamemailbox");
	}
	
	//9
	public void gamemailbox_award() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:gamemailbox_award:roleid=(.+):item=(.+):count=(.+):callback_roleid=([^:]+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gamemailbox_award");
	}
	
	//10
	public void accountlogout() {
		String text ="2014-05-21 00:00:51 lv3:MS:formatlog:logout:accountid=386390022:account=:gate=8:time=34395:peer=222.133.178.178:reason=2:mid=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:accountid=([^:]*):account=([^:]*):gate=(.+):time=(.+):peer=(.+):reason=(-?\\d+):mid=([^:]*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogout");
	}
	
	//11
	public void rolelogout() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\brolelogout\\b:accountid=(.+):account=[^:]*:charid=([^:]*):gate=[^:]*:line=[^:]*:time=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogout");
	}
	
	//12
	public void gmlog() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"gmlog");
	}
	
	//13
	public void tasksucc() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(-?\\d+):msg=OnMsgTaskReqDone:.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"tasksucc");
	}
	
	//14
	public void forbiduser() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bforbidaccount\\b:source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.+):cash_add=(.+):cash_used=(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	//15
	public void givechanged() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:give:RoleID=(\\d+):GiveChanged=(.+):GiveTotal=(.+):Reason=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"givechanged");
	}
	
	//16
	public void salary() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+salary:AccID=(\\d+):RoleID=(\\d+):ItemID=(\\d+):Num=(\\d+):Price=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"salary");
	}
	
	//17
	public void card() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:card:RoleID=(\\d+):ItemID=(\\d+):CardNumber=([^:]*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"card");
	}
	
	//18
	public void goldconsign_cancel() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:cancel:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_cancel");
	}
	
	//19
	public void goldconsign_begin() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:begin:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_begin");
	}
	
	//20
	public void goldconsign_end() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:end:ID=(.+):RoleID=(.+):Price=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_end");
	}
	
	//21
	public void goldconsign_syscan() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:syscancel:ID=(.+):RoleID=(.+):Price=(.+):StartTime=(.+):Type=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_syscan");
	}
	
	//22
	public void goldconsign_buy() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:buy:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):LeftTime=(.+):AddGold=(.+):SellRoleID=([^:]+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_syscan");
	}
	
	//23
	public void goldconsign_sell() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+goldconsign:sell:ID=(.+):RoleID=(.+):Price=(.+):HandNum=(.+):StartTime=(.+):LeftTime=(.+):AddMoney=(.+):BuyRoleID=(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"goldconsign_sell");
	}
	
	//24
	public void globalvar() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:GlobalVar:Key:(.+)=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"globalvar");
	}
	
	//25
	public void jewels() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:insert:userid=(.+):item=(.+):gem=(.+):charm=(.+):result=(.+):perfect=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"jewels");
	}
	
	//26
	public void shop_buy() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bshop\\b:AccID=(.+):RoleID=(.+):ItemID=(.+):ItemGUID=.+:Num=(.+):BuyType=(.+):RealNeed=(.+):Point=(.+):Left=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shop_buy");
	}
	
	//27
	public void shoptrade() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bshop\\b:AccID=(.+):RoleID=(.+):ItemID=(.+):ItemGUID=(.+):Num=(.+):BuyType=1:RealNeed=(.+):Point=(.+):Left=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shop_buy");
	}
	
	//28
	public void addcash() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:accountid=(.+):oldserial=(.+):newserial=(.+):cash_add=(.+):delta=(-?\\d+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"addcash");
	}
	
	//29
	public void stockbalance() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgoldconsign\\b:(buy):ID=.+:RoleID=(.+):Price=.+:HandNum=.+:StartTime=.+:LeftTime=.+:AddGold=(-?\\d+):SellRoleID=.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"addcash");
	}
	
	//30
	public void clear360cash() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(-?\\d+);?(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360cash");
	}
	
	//31
	public void clear360item() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360item");
	}
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		//w.question();
		//w.taskaccept();
		//w.accountlogin();
		w.accountlogout();
	}
}
