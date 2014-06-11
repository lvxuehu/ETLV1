package com.wanmei.test.cb.regular;

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
	public void playerlogout() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayerlogout\\b:userid=(\\d+):roleid=(\\d+):level=(\\d+):occupation=(\\d+):mapid=(\\d+):x=(-?\\d+):y=(-?\\d+):z=(-?\\d+):onlinetime=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "playerlogout");
	}
	
	//2
	public void forbiduser_question() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bacforbiduser\\b:gmuser=(.+):userid=(.+):roleid=(.+):forbid_time=(.+):reason=([^:]+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "forbiduser_question");
	}
	
	//3
	public void rivalry_enter() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rivalry_enter:tid=(\\d+):world_tag=(\\d+):roleid=(\\d+):faction=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "rivalry_enter");
	}
	
	//4
	public void rivalry_leave() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rivalry_leave:tid=(\\d+):world_tag=(\\d+):roleid=(\\d+):faction=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "rivalry_leave");
	}
	
	//5
	public void regmailbox() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bregmailbox\\b:send_roleid=(.+):send_userid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):offline_seconds=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "regmailbox");
	}
	
	//6
	public void gamemailbox() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgamemailbox\\b:send_roleid=(.+):receive_roleid=(.+):level=(.+):offline_time=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "gamemailbox");
	}
	
	//7
	public void sendmailbox_award() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bsendmailbox_award\\b:send_roleid=(.+):send_userid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):item=(.+):count=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "sendmailbox_award");
	}
	
	//8
	public void gamemailbox_award() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgamemailbox_award\\b:roleid=(.+):item=(.+):count=(.+):callback_roleid=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "gamemailbox_award");
	}
	
	//9
	public void regmailbox_award() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bregmailbox_award\\b:roleid=(.+):item=(.+):count=([^:]+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "regmailbox_award");
	}
	
	//10
	public void deleterole() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:deleterole:roleid=(.+):create_time=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "deleterole");
	}
	
	//11
	public void webtradesold() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:webtradesold:role=(.+):sn=(.+):buyer_roleid=(.+):type=(4):itemid=(.+):item_count=(.+):money=(.+):role=(.+):petid=(.+):pet_count=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "webtradesold");
	}
	
	//12
	public void arena_round_result() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:arena_round_result:id=(.+):tid=(.+):world_tag=(.+):round=(.+):attacker_id=(.+):defender_id=(.+):result=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "arena_round_result");
	}
	
	//13
	public void arena_round_notify() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:arena_round_notify:id=(.+):tid=(.+)[:,]world_tag=(.+):round=(.+):state=(.+):attacker_id=(.+):defender_id=(.+):start_time=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "arena_round_notify");
	}
	
	//14
	public void arena_enter() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:arena_enter:id=(.+):tid=(.+):world_tag=(.+):round=(.+):roleid=(.+):faction=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "arena_enter");
	}
	
	//15
	public void arena_task_result() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:arena_task_result:id=(.+):tid=(.+):world_tag=(.+):round=(.+):attacker_task=(.+):defender_task=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "arena_task_result");
	}
	
	//16
	public void arena_stage_result() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:arena_stage_result:id=(.+):tid=(.+):world_tag=(.+):round=(.+):stage=(.+):attacker_id=(.+):defender_id=(.+):result=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "arena_stage_result");
	}
	
	//17
	public void rolelogout() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rolelogout:userid=(.+):roleid=(.+):localsid=(.+):time=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "rolelogout");
	}
	
	//18
	public void rolelogin() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:rolelogin:userid=(.+):roleid=(.+):lineid=(.+):localsid=(-?\\d+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "rolelogin");
	}
	
	//19
	public void accountlogout() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogout\\b:account=(.+):userid=(.+):sid=(.+):peer=(.+):time=([^:]+):status=.+$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "accountlogout");
	}
	
	//20
	public void accountlogin() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\blogin\\b:account=(.+):userid=(.+):sid=(.+):peer=(\\d+\\.\\d+\\.\\d+\\.\\d+):mid=([^:]*)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "accountlogin");
	}
	
	//21
	public void gmlog() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgmoperate\\b:userid=(.+):type=(.+):content=(.*)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "gmlog");
	}
	
	//22
	public void forbiduser() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bforbiduser\\b:source=(.+):gmuserid=(.+):userid=(.+):zoneid=(.+):areaid=(.+):forbid_time=(.+):real_time=(.+):reason=(.+):cash_add=(.+):cash_used=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "forbiduser");
	}
	
	//23
	public void task_complete() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\btask\\b:roleid=(.+):taskid=(.+):type.+msg=DeliverByAwardData:\\s+success\\s+=\\s+1,\\s+gold\\s+=\\s+(.+),\\s+gold2\\s+=\\s+.+,\\s+exp\\s+=\\s+(-?\\d+),\\s+exp2\\s+=\\s+.+$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "task_complete");
	}
	
	//24
	public void onbattlestart() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bOnBattleStart:retcode=.+,gs_id=.+,map_id=(-?\\d+),battle_id=.+$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "onbattlestart");
	}
	
	//25
	public void task_accept() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:task:roleid=(.+):taskid=(.+):type=(-?\\d+):msg=CheckDeliverTask$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "task_accept");
	}
	
	//26
	public void task_abort() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:task:roleid=(.+):taskid=(.+):type=(-?\\d+):msg=GiveUpTask$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "task_abort");
	}
	
	//27
	public void shoptrade() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bgshop_trade\\b:userid=(.+):db_magic_number=(.+):order_id=(.+):item_id=(.+):expire=(.+):item_count=(.+):cash_need=(.+):cash_left=([^:]+):guid=.+$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "shoptrade");
	}
	
	//28
	public void addcash() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\baddcash\\b:userid=(.+):oldserial=.+:newserial=.+:cash_add=(.+):delta=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "addcash");
	}
	
	//29
	public void stockbalance() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bstockbalance\\b:userid=(.+):tid=(.+):volume=(.+):ack_volume=(.+):ack_money=(.+):cash=(.+):money=(.+):cash_buy=(.+):cash_sell=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "stockbalance");
	}
	
	//30
	public void clear360cash() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(\\d+?);.*$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "clear360cash");
	}
	
	//31
	public void clear360item() {
		String text ="2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "clear360item");
	}
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		w.playerlogout();
	}
}
