package com.wanmei.test.mz.regular;

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
	public void tiantipoint() {
		String text ="mz#30302#2013-11-11 00:07:30  : info : tiantipoint:roleid=1585152:addpoint=-4:currpoint=932";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\btiantipoint\\b:roleid=(\\d+):addpoint=(-?\\d+):currpoint=(-?\\d+)$";
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
	
	//2
	public void tiantifame() {
		String text ="mz#30302#2013-11-11 00:07:30  : info : tiantifame:roleid=1585152:addfame=15:currfame=975:weekaddfame=15";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\btiantifame\\b:roleid=(-?\\d+):addfame=(-?\\d+):currfame=(-?\\d+):weekaddfame=(-?\\d+)$";
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
	public void crossback() {
		String text ="mz#30302#2013-11-11 00:07:32  : info : crossback:roleid=2187681792:crossroleid=17391616";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bcrossback\\b:roleid=(-?\\d+):crossroleid=(-?\\d+)$";
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
	public void petlianhua() {
		String text ="mz#20411#2013-11-11 00:07:32  : info : pet:type=lianhua:roleid=243290113:mainpetid=139701768203:mainpetkey=36402:mainpettype=80839:vicepetid=139477098507:vicepetkey=36403:vicepettype=52873:mainpetskills=96215,3028,3155:tempbinditem=-1:tempbindskill=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bpet:type=lianhua\\b:roleid=(\\d+):mainpetid=(\\d+):mainpetkey=(\\d+):mainpettype=(\\d+):vicepetid=(\\d+):vicepetkey=(\\d+):vicepettype=(\\d+):mainpetskills=(.*):tempbinditem=(-?\\d+):tempbindskill=(-?\\d+)";
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
	public void reinforce() {
		String text ="mz#30221#2013-11-11 00:07:34  : info : reinforce:roleid=14250110:itemid=24596:level=0:result=1:qilingitem=1814:addinitem=-1:level_before=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\breinforce\\b:roleid=(\\d+):itemid=(\\d+):level=(\\d+):result=(-?\\d+):qilingitem=(\\d+):addinitem=(-?\\d+):level_before=(-?\\d+)";
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
	public void petlevelup() {
		String text ="mz#30219#2013-11-11 00:07:34  : info : pet:type=levelup:roleid=880764:petid=10827575420:petkey=3615:oldlevel=14:newlevel=15:typeid=1051:skills=3019";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bpet:type=levelup\\b:roleid=(\\d+):petid=(\\d+):petkey=(\\d+):oldlevel=(\\d+):newlevel=(\\d+):typeid=(\\d+):skills=([^:]*)";
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
	public void secondraceopen() {
		String text ="mz#30221#2013-11-11 00:29:01  : info : secondraceopen:roleid=1736830:mainrace=172:secondrace=102364:oldsecondrace=-1:times=1:itemtype=132892:itemnum=2";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bsecondraceopen\\b:roleid=(\\d+):mainrace=(\\d+):secondrace=(\\d+):oldsecondrace=(-?\\d+):times=(\\d+):itemtype=(\\d+):itemnum=(-?\\d+)";
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
	public void secondraceswitch() {
		String text ="mz#20401#2013-11-11 00:44:34  : info : secondraceswitch:roleid=39677958:oldrace=173:newrace=76606:mainrace=173:secondrace=76606";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bsecondraceswitch\\b:roleid=(\\d+):oldrace=(\\d+):newrace=(\\d+):mainrace=(\\d+):secondrace=(-?\\d+)";
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
	public void wingswitch() {
		String text ="mz#20201#2013-11-11 00:45:15  : info : wingswitch:roleid=3086983168:wingindexold=1:wingindexnew=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bwingswitch\\b:roleid=(\\d+):wingindexold=(\\d+):wingindexnew=(-?\\d+)";
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
	public void cashusereward() {
		String text ="mz#30224#2013-11-11 00:47:22  : info : cashusereward:roleid=167325825:itemid=135923:itemnum=1:rewardid=134969:cashused=1078";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bcashusereward\\b:roleid=(\\d+):itemid=(\\d+):itemnum=(\\d+):rewardid=(\\d+):cashused=(-?\\d+)";
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
	public void taskgraph() {
		String text ="mz#30224#2013-11-11 00:47:22  : info : task.graph:roleid=72413313:graphcomplete=3337";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+task\\.graph:roleid=(.+):graphcomplete=(-?\\d+)$";
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
	public void upgrade() {
		String text ="mz#30225#2013-11-11 00:47:24  : info : upgrade:roleid=88010882,newlevel=17";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bupgrade\\b:roleid=(.+),newlevel=(-?\\d+)$";
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
	public void accountlogin() {
		String text ="mz#30219#2013-11-11 00:47:32  : info : login:accountid=251359954:account=zx2juan:challid=:peer=14.106.151.217:mid=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\blogin\\b:accountid=(.+):account=(.+):challid=.*:peer=(\\d+\\.\\d+\\.\\d+\\.\\d+):mid=([^:]+)$";
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
	public void rolelogout() {
		String text ="mz#30221#2013-11-11 00:47:32  : info : online:rolelogout:accountid=338646599:account=:charid=88002686:gate=:line=:time=25:level=18:race=182:reason=0:exp=9522:money=1134:depotmoney=0:webclient=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+:\\s+info\\s+:\\s+online:\\brolelogout\\b:accountid=(.+):account=(.*):charid=(.+):gate=(.*):line=(.*):time=(.+):level=(.+):race=(.+):reason=(.+):exp=(.+):money=(.+):depotmoney=(.+):webclient=(-?\\d+)$";
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
	public void accountlogout() {
		String text ="mz#30207#2013-11-11 00:47:52  : info : logout:accountid=267860717:account=luqizheng1020:charid=:gate=:line=:time=51332:peer=218.107.55.253:reason=1:mid=12";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\blogout\\b:accountid=(.+):account=(.+):charid=.*:gate=.*:line=.*:time=(.+):peer=(.+):reason=(-?\\d+):mid=([^:]+)$";
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
	public void rolelogin() {
		String text ="2014-05-26 23:55:54  : info : online:rolelogin:accountid=309053435:account=:charid=9299509262:gate=4:line=:exp=4040:money=20000:depotmoney=0:webclient=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+:\\s+info\\s+:\\s+online:rolelogin:accountid=(.*):account=.*:charid=(.*):gate=.*:line.*:webclient=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m, "rolelogin");
	}
	
	
	//17
	public void task_accept() {
		String text ="mz#20301#2013-11-11 00:47:54  : info : task:roleid=75702272:taskid=11691:msg=accept";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btask:roleid=(\\d+):taskid=(-?\\d+):msg=accept$";
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
	public void task_complete() {
		String text ="mz#20301#2013-11-11 00:47:54  : info : task:roleid=75702272:taskid=11691:msg=complete";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btask:roleid=(\\d+):taskid=(-?\\d+):msg=complete$";
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
	public void task_abort() {
		String text ="mz#20301#2013-11-11 00:47:54  : info : task:roleid=75702272:taskid=11691:msg=abort";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btask:roleid=(\\d+):taskid=(-?\\d+):msg=abort$";
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
	public void pet_remove() {
		String text ="mz#20401#2013-11-11 00:47:54  : info : pet:type=remove:roleid=1279078410:bagid=304:petid=122011693056:petkey=6852:reason=rejuvenate";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+pet:type=remove:roleid=(.+):bagid=(.+):petid=(.+):petkey=(.+):reason=([^:]+)$";
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
	public void pet_drop() {
		String text ="mz#10507#2013-11-11 00:47:56  : info : pet:type=drop:roleid=76509206:petid=94013345818:petkey=13746";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+pet:type=drop:roleid=(.+):petid=(.+):petkey=(-?\\d+)$";
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
	public void gamemailbox() {
		String text ="mz#10302#2013-11-11 00:49:14  : info : mail:gamemailbox:send_roleid=471019560:receive_roleid=625168423:level=89:offline_time=2783559";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+mail:gamemailbox:send_roleid=(.+):receive_roleid=(.+):level=(.+):offline_time=(-?\\d+)$";
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
	
	//23
	public void regmailbox() {
		String text ="mz#10302#2013-11-11 00:49:14  : info : mail:regmailbox:send_userid=240509978:send_roleid=471019560:receive_userid=262842018:receive_roleid=625168423:level=89:offline_seconds=2783559";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+mail:regmailbox:send_userid=(.+):send_roleid=(.+):receive_userid=(.+):receive_roleid=(.+):level=(.+):offline_seconds=(-?\\d+)$";
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
	
	//24
	public void sendmail() {
		String text ="mz#30225#2013-11-11 00:49:20  : info : mail:sendmail:timestamp=1384102160921:type=normal:src=11182210:dst=32456834:mid=3038:money=0:itemid=14039:count=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+mail:sendmail:timestamp=(.+):type=(.+):src=(.+):dst=(.+):mid=(.+):money=(.+):itemid=(.*):count=(-?\\d+)$";
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
	public void mail() {
		String text ="mz#20212#2013-11-11 00:50:13  : info : mail:mail:type=delete:timestamp=1383467554787:src=system:dst=6361968654:mid=50:money=0:itemid=:count=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+mail:mail:type=(.+):timestamp=(.+):src=(.+):dst=(.+):mid=(.+):money=(.+):itemid=(.*):count=(-?\\d+)$";
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
	public void wingopen() {
		String text ="2013-11-11 00:50:13  : info : mail:mail:type=delete:timestamp=1383467554787:src=system:dst=6361968654:mid=50:money=0:itemid=:count=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info.+\\bwingopen\\b:roleid=(\\d+):wingcountold=(\\d+):wingcountnew=(\\d+):wingindexold=(\\d+):wingindexnew=(-?\\d+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"wingopen");
	}
	
	//27
	public void clear360cash() {
		String text ="2013-11-11 00:50:13  : info : mail:mail:type=delete:timestamp=1383467554787:src=system:dst=6361968654:mid=50:money=0:itemid=:count=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info\\s:\\s\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(\\d+?);.*$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360cash");
	}
	
	//28
	public void clear360item() {
		String text ="2013-11-11 00:50:13  : info : mail:mail:type=delete:timestamp=1383467554787:src=system:dst=6361968654:mid=50:money=0:itemid=:count=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+info\\s:\\s\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360item");
	}
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		//w.mail();
		w.rolelogin();
	}
}
