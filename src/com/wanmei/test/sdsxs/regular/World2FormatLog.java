package com.wanmei.test.sdsxs.regular;

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
	public void demesne_income() {
		String text = "2014-03-26 20:40:42 backup:gdeliveryd:demesne_income:demesne=59:roleid=10125313:leader=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_income:demesne=([^:]*):roleid=([^:]*):leader=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_income");
	}
	
	//2_1
	public void delete_master_1() {
		String text = "2014-03-25 00:42:14 backup:gdeliveryd:delete_master:d_from=44:d_userid=365482824:d_roleid=1137201196:d_occupation=6:d_lev=60:d_fightvalue=34011:d_logintime=1395679244:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=:d_from=44:d_userid=356116599:d_roleid=28463148:d_occupation=5:d_lev=90:d_fightvalue=164370:d_logintime=1395626229:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+delete_master:d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*):d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"delete_master_1");
	}
	
	//2_2
	public void delete_master_2() {
		String text = "2014-03-25 00:42:14 backup:gdeliveryd:delete_master:d_from=44:d_userid=365482824:d_roleid=1137201196:d_occupation=6:d_lev=60:d_fightvalue=34011:d_logintime=1395679244:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=:d_from=44:d_userid=356116599:d_roleid=28463148:d_occupation=5:d_lev=90:d_fightvalue=164370:d_logintime=1395626229:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+delete_master:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"delete_master_2");
	}
	
	//3_1
	public void finish_master_1() {
		String text = "2014-03-25 00:42:14 backup:gdeliveryd:finish_master:d_from=44:d_userid=365482824:d_roleid=1137201196:d_occupation=6:d_lev=60:d_fightvalue=34011:d_logintime=1395679244:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=:d_from=44:d_userid=356116599:d_roleid=28463148:d_occupation=5:d_lev=90:d_fightvalue=164370:d_logintime=1395626229:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+finish_master:d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*):d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"finish_master_1");
	}
	
	//3_2
	public void finish_master_2() {
		String text = "2014-03-25 00:42:14 backup:gdeliveryd:finish_master:d_from=44:d_userid=365482824:d_roleid=1137201196:d_occupation=6:d_lev=60:d_fightvalue=34011:d_logintime=1395679244:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=:d_from=44:d_userid=356116599:d_roleid=28463148:d_occupation=5:d_lev=90:d_fightvalue=164370:d_logintime=1395626229:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+finish_master:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"finish_master_2");
	}
	
	//4
	public void sendmail() {
		String text = "2014-03-25 00:44:05 database:gamedbd:sendmail:from=35:userid=361607204:roleid=778620963:occupation=5:lev=59:fightvalue=32822:logintime=0:bindmoneyleft=23469336:moneyleft=2177:bindcashleft=7022:cashleft=0:mid=2:mtype=0:src=778620963:dst=773582883:sendtime=1395679445:attr=35:size=0:money=0:cash=0:item=16208:count=2:guid=2532783967223962636:pos=70";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+sendmail:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):mid=([^:]*):mtype=([^:]*):src=([^:]*):dst=([^:]*):sendtime=([^:]*):attr=([^:]*):size=([^:]*):money=([^:]*):cash=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"sendmail");
	}
	
	//5
	public void mail_attach() {
		String text = "2014-03-25 00:44:14 database:gamedbd:mail_attach:from=15:userid=325817482:roleid=432074767:occupation=5:lev=100:fightvalue=299894:logintime=0:bindmoneyleft=29020133:moneyleft=12221104:bindcashleft=15:cashleft=5:mid=1:mtype=0:src=32899075:dst=432074767:sendtime=1395635751:attr=32:size=0:money=0:cash=0:item=0:count=0:guid=0:pos=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+mail_attach:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):mid=([^:]*):mtype=([^:]*):src=([^:]*):dst=([^:]*):sendtime=([^:]*):attr=([^:]*):size=([^:]*):money=([^:]*):cash=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mail_attach");
	}
	
	//6_1
	public void guarder_1() {
		String text = "2014-03-25 00:44:17 game1:gs1:guarder:from=46:userid=1846888752:roleid=23240750:occupation=4:lev=72:fightvalue=56147:logintime=1395678632:bindmoneyleft=18085012:moneyleft=39410:bindcashleft=860:cashleft=0:guarder_num=4:guarder_serial=79451201245044925:guarder_qualifi=0.320387";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+guarder:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):guarder_num=([^:]*):guarder_serial=([^:]*):guarder_qualifi=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"guarder");
	}
	
	//6_2
	public void guarder_2() {
		String text = "2014-03-25 00:44:17 game1:gs1:guarder:from=46:userid=1846888752:roleid=23240750:occupation=4:lev=72:fightvalue=56147:logintime=1395678632:bindmoneyleft=18085012:moneyleft=39410:bindcashleft=860:cashleft=0:guarder_num=4:guarder_serial=79451201245044925:guarder_qualifi=0.320387:guarder_qualifi_old=0.000000";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+guarder:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):guarder_num=([^:]*):guarder_serial=([^:]*):guarder_qualifi=([^:]*):guarder_qualifi_old=[^:]*$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"guarder_2");
	}
	
	//7
	public void saintcloth_enhance() {
		String text = "2014-03-25 00:44:30 game1:gs1:saintcloth_enhance:from=28:userid=321162810:roleid=175804444:occupation=6:lev=100:fightvalue=292113:logintime=1395673875:bindmoneyleft=11103502:moneyleft=0:bindcashleft=372:cashleft=10:saintclothid=10742:saintclothev=12:saintclothid=10742:saintclothev=12:tools=8380,1,2303C0EC530D7D7E:assist_item=34345,1,12CB0315330608A:moneycost=22730:luckypoint=203:success=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s\\d+:\\d+:\\d+).+saintcloth_enhance:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=([^:]*):moneyleft=(-?\\d+):bindcashleft=(-?\\d+):cashleft=(-?\\d+):saintclothid=(-?\\d+):saintclothev=(-?\\d+):saintclothid=(-?\\d+):saintclothev=(\\d+):tools=([^:]*):assist_item=([^:]*):moneycost=(\\d+):luckypoint=(\\d+):success=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"saintcloth_enhance");
	}
	
	//8
	public void createrole() {
		String text = "sdsxs#10716#2013-07-16 15:00:14 database:gamedbd:createrole:from=19:userid=324483538:roleid=667107347:occupation=1:lev=1:fightvalue=409:logintime=0:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:birthday=284";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+createrole:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(\\d+):logintime=(\\d*):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):birthday=(\\d*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"createrole");
	}
	
	//9
	public void giftcard() {
		String text = "sdsxs#10509#2013-07-16 15:00:25 database:gs15:giftcard:from=7:userid=321095667:roleid=453423111:occupation=2:lev=58:fightvalue=22013:logintime=1373957657:bindmoneyleft=511747:moneyleft=50000:bindcashleft=33:cashleft=0:cardnum=28011110735025968491:parenttype=13:subtype=11";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bgiftcard\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):cardnum=(\\d+):parenttype=(\\d+):subtype=(\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"giftcard");
	}
	
	//10
	public void forbiduser() {
		String text = "sdsxs#10611#2013-07-16 15:13:23 database:gamedbd:forbiduser:gmuserid=1984:areaid=28:zoneid=2824:userid=311832750:forbid_time=301:real_time=0:reason=AAA=:cash_add=0:cash_used=0";
		
		String reg = "^(.+)#(\\d{5})+#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bforbiduser\\b:gmuserid=(\\d+):areaid=(\\d+):zoneid=(\\d+):userid=(\\d+):forbid_time=(-?\\d+):real_time=(-?\\d+):reason=([^:]*):cash_add=(-?\\d+):cash_used=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"forbiduser");
	}
	
	//11
	public void singleteam_instance_close() {
		String text = "sdsxs#10615#2013-08-06 07:01:14 database:gs40:singleteam_instance_close:teamid=150056:worldid=20622:instancetid=6154:line=40";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsingleteam_instance_close\\b:teamid=(\\d+):worldid=(\\d+):instancetid=(\\d+):line=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"singleteam_instance_close");
	}
	
	//12
	public void singlerole_instance_close() {
	//String text = "2013-08-06 07:01:07 database:gs38:singlerole_instance_close:roleid=488034315:worldid=8084:instancetid=11450:line=38";
		String text = "2014-03-26 00:05:05 game1:gs34:singlerole_instance_close:roleid=3444737:worldid=128:instancetid=33362:line=34";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsinglerole_instance_close\\b:roleid=(\\d+):worldid=(\\d+):instancetid=(\\d+):line=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"singlerole_instance_close");
	}
	
	//13
	public void singleteam_instance_open() {
		String text = "sdsxs#10503#2013-08-06 07:00:57 game1:gs36:singleteam_instance_open:teamid=25214:worldid=4256:instancetid=1309:line=36";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsingleteam_instance_open\\b:teamid=(\\d+):worldid=(\\d+):instancetid=(\\d+):line=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"singleteam_instance_open");
	}
	
	//14
	public void singlerole_instance_open() {
		String text = "sdsxs#10510#2013-08-06 07:00:57 game1:gs34:singlerole_instance_open:roleid=1219817482:worldid=9410:instancetid=18676:line=34";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsinglerole_instance_open\\b:roleid=(\\d+):worldid=(\\d+):instancetid=(\\d+):line=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"singlerole_instance_open");
	}
	
	//15
	public void killmonster() {
		String text = "2014-03-26 00:00:52 game1:gs1:killmonster:monsterid=18512:monstertype=2:mapid=2:x=5.15:y=288.96:z=-106.51:lastattacker=339083265";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bkillmonster\\b:monsterid=(\\d+):monstertype=(\\d+):mapid=(\\d+):x=(-?\\d+\\.\\d+):y=(-?\\d+\\.\\d+):z=(-?\\d+\\.\\d+):lastattacker=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"killmonster");
	}
	
	//16
	public void team_create() {
		String text = "sdsxs#10615#2013-08-06 07:00:56 backup:gdeliveryd:team_create:from=32:userid=322514657:roleid=145358880:occupation=2:lev=63:fightvalue=28338:logintime=1375743569:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:teamid=150069:teamnum=2:leaderid=145358880:maxlev=63:maxfv=28338:minlev=62:minfv=28126:avelev=62:avefv=28232:type=0:instanceid=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+team_create:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):?bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(\\d+):instanceid=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"team_create");
	}
	
	//17
	public void killbymonster() {
		String text = "sdsxs#10502#2013-08-06 07:01:02 game1:gs36:killbymonster:from=2:userid=323449807:roleid=492527618:occupation=5:lev=40:fightvalue=9640:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:monsterid=18048:type=0:mapid=403:x=203.51:y=332.93:z=99.55";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+killbymonster:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d*):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):monsterid=(\\d+):type=(\\d+):mapid=(\\d+):x=(-?\\d+\\.\\d+):y=(-?\\d+\\.\\d+):z=(-?\\d+\\.\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"killbymonster");
	}
	
	//18
	public void faction_join() {
		String text = "sdsxs#10615#2013-07-16 15:01:38 database:gamedbd:faction_join:from=32:userid=319452137:roleid=370163744:occupation=2:lev=30:fightvalue=5203:logintime=0:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:factionid=3014688:factionnum=255:factionlv=14:facleader=19189792";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+faction_join:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):factionid=(\\d+):factionnum=(\\d+):factionlv=(\\d+):facleader=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"faction_join");
	}
	
	//19
	public void selectprof() {
		String text = "sdsxs#10503#2013-07-16 15:00:16 database:gs15:selectprof:from=3:userid=318910489:roleid=508608515:occupation=1:lev=1:fightvalue=409:logintime=1373957664:bindmoneyleft=0:moneyleft=0:bindcashleft=0:cashleft=0:newprof=6:oldskillpoint=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+selectprof:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):newprof=(\\d+):oldskillpoint=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"selectprof");
	}
	
	//20
	public void switchprof() {
		String text = "sdsxs#10505#2013-07-16 15:01:20 game1:gs1:switchprof:from=5:userid=313469672:roleid=265306117:occupation=6:lev=85:fightvalue=109035:logintime=1373957818:bindmoneyleft=14122099:moneyleft=27658:bindcashleft=6602:cashleft=0:newprof=5:oldskillpoint=4230";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+switchprof:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):newprof=(\\d+):oldskillpoint=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"switchprof");
	}
	
	//21_1
	public void upgrade_1() {
		String text = "sdsxs#10615#2013-07-16 15:00:38 database:gs10:upgrade:from=32:userid=355914800:roleid=375336992:occupation=6:lev=36:fightvalue=7064:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:exp=3416928:money=1510:time=28350:leveluptime=3561:starstone_exp=0:skill=284,1;285,1;292,1;302,18;341,1;366,1;367,1;371,1;542,1;1109,1;1111,1;1519,18;1520,18;1521,13;1522,14;1523,16;1524,1;1525,9;1526,6;1528,1;1533,1;1534,1;1550,1;3275,1:skillexp=781";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+upgrade:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):exp=(\\d+):money=(\\d+):time=(\\d+):leveluptime=(\\d+):starstone_exp=(\\d+):skill=(.+):skillexp=(-?\\d+):promotion=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"upgrade_1");
	}
	
	//21_2
	public void upgrade_2() {
		String text = "sdsxs#10615#2013-07-16 15:00:38 database:gs10:upgrade:from=32:userid=355914800:roleid=375336992:occupation=6:lev=36:fightvalue=7064:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:exp=3416928:money=1510:time=28350:leveluptime=3561:starstone_exp=0:skill=284,1;285,1;292,1;302,18;341,1;366,1;367,1;371,1;542,1;1109,1;1111,1;1519,18;1520,18;1521,13;1522,14;1523,16;1524,1;1525,9;1526,6;1528,1;1533,1;1534,1;1550,1;3275,1:skillexp=781";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+upgrade:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):exp=(\\d+):second_exp=[^:]*:money=(\\d+):time=(\\d+):leveluptime=(\\d+):starstone_exp=(\\d+):()()promotion=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"upgrade_2");
	}
	
	//21_3
	public void upgrade_3() {
		String text = "sdsxs#10615#2013-07-16 15:00:38 database:gs10:upgrade:from=32:userid=355914800:roleid=375336992:occupation=6:lev=36:fightvalue=7064:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:exp=3416928:money=1510:time=28350:leveluptime=3561:starstone_exp=0:skill=284,1;285,1;292,1;302,18;341,1;366,1;367,1;371,1;542,1;1109,1;1111,1;1519,18;1520,18;1521,13;1522,14;1523,16;1524,1;1525,9;1526,6;1528,1;1533,1;1534,1;1550,1;3275,1:skillexp=781";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+upgrade:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):exp=(\\d+):second_exp=[^:]*:money=(\\d+):time=(\\d+):leveluptime=(\\d+):starstone_exp=(\\d+):skill=(.+):skillexp=(-?\\d+):promotion=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"upgrade_3");
	}
	
	//21_4
	public void upgrade_4() {
		String text = "sdsxs#10615#2013-07-16 15:00:38 database:gs10:upgrade:from=32:userid=355914800:roleid=375336992:occupation=6:lev=36:fightvalue=7064:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:exp=3416928:money=1510:time=28350:leveluptime=3561:starstone_exp=0:skill=284,1;285,1;292,1;302,18;341,1;366,1;367,1;371,1;542,1;1109,1;1111,1;1519,18;1520,18;1521,13;1522,14;1523,16;1524,1;1525,9;1526,6;1528,1;1533,1;1534,1;1550,1;3275,1:skillexp=781";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+upgrade:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):exp=(\\d+):money=(\\d+):time=(\\d+):leveluptime=(\\d+):starstone_exp=(\\d+):([^:]*?)([^:]*?)promotion=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"upgrade_4");
	}
	
	//22_1
	public void saintclothinfo_1() {
		String text = "sdsxs#10611#2013-07-16 15:01:02 game1:gs7:saintclothinfo:from=26:userid=317195784:roleid=820207642:occupation=4:lev=16:fightvalue=3543:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:total=1:bronze=1:bronze_list=10738:silver=0:silver_list=:gold=0:gold_list=:holly=0:holly_list=";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+saintclothinfo:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):total=(\\d+):bronze=(\\d+):bronze_list=(.*):silver=(\\d+):silver_list=(.*):gold=(\\d+):gold_list=(.*):holly=(\\d+):holly_list=([^:]*)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"saintclothinfo_1");
	}
	
	//22_2
	public void saintclothinfo_2() {
		String text = "sdsxs#10611#2013-07-16 15:01:02 game1:gs7:saintclothinfo:from=26:userid=317195784:roleid=820207642:occupation=4:lev=16:fightvalue=3543:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:total=1:bronze=1:bronze_list=10738:silver=0:silver_list=:gold=0:gold_list=:holly=0:holly_list=:surplice=123:surplice_list=234";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+saintclothinfo:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):total=(\\d+):bronze=(\\d+):bronze_list=(.*):silver=(\\d+):silver_list=(.*):gold=(\\d+):gold_list=(.*):holly=(\\d+):holly_list=([^:]*):surplice=[^:]*:surplice_list=[^:]*";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"saintclothinfo_2");
	}
	
	//23
	public void saintcloth_obtain() {
		String text = "sdsxs#10505#2013-07-16 15:00:18 database:gs40:saintcloth_obtain:from=5:userid=324348082:roleid=505929733:occupation=5:lev=9:fightvalue=986:logintime=1373957853:bindmoneyleft=1665:moneyleft=0:bindcashleft=0:cashleft=0:saintclothid=10740:saintclothlev=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+saintcloth_obtain:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):saintclothid=(\\d+):saintclothlev=(-?\\d+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"saintcloth_obtain");
	}
	
	//24
	public void upgradefv() {
		String text = "sdsxs#10715#2013-07-16 15:00:47 database:gs14:upgradefv:from=18:userid=324035999:roleid=502452242:occupation=2:lev=24:fightvalue=5052:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:total=5052:1_1=312:1_2=484:1_3=0:1_4=0:2_1=0:2_2=0:2_3=0:2_4=0:3_1=1263:3_2=0:3_3=0:3_4=0:4_1=2380:4_2=0:4_3=0:4_4=0:5_1=613:5_2=0:5_3=0:6_1=0:6_2=0:6_3=0:7_1=0:7_2=0:7_3=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+upgradefv:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):total=(.+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"upgradefv");
	}
	
	//25
	public void reinforce() {
		String text = "sdsxs#10718#2013-07-16 15:00:32 database:gs9:reinforce:from=20:userid=313047503:roleid=174903316:occupation=2:lev=83:fightvalue=109634:logintime=1373954680:bindmoneyleft=13106483:moneyleft=304454:bindcashleft=4273:cashleft=0:equipid=2650:equipuniqid=2602124451E26F1E:equipfv=1258:equipev=10:equipquality=5:equipmask=8:equipid=2650:equipuniqid=2602124451E26F1E:equipfv=1258:equipev=10:equipquality=5:equipmask=8:op=1:dstlevel=1:tools=5114,266,230065C251E4B9C2:assistitems=:bindmoneycost=397:moneycost=0:isbind=0:newlevel=10";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+reinforce:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):equipid=(\\d+):equipuniqid=(.+):equipfv=(\\d+):equipev=(\\d+):equipquality=(\\d+):equipmask=(\\d+):equipid=(\\d+):equipuniqid=(.+):equipfv=(\\d+):equipev=(\\d+):equipquality=(\\d+):equipmask=(\\d+):op=(\\d+):dstlevel=(\\d+):tools=(.+):assistitems=(.*):bindmoneycost=(-?\\d+):moneycost=(-?\\d+):isbind=(\\d+):newlevel=(-?\\d+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"reinforce");
	}
	
	//26_1
	public void learnskill_1() {
		String text = "sdsxs#10505#2013-07-16 15:00:39 game1:gs1:learnskill:from=5:userid=299144888:roleid=505339909:occupation=5:lev=29:fightvalue=4332:logintime=1373957813:bindmoneyleft=48852:moneyleft=0:bindcashleft=700:cashleft=0:skillid=526:skillnewlv=9:expbefore=462:expafter=470:expcost=25910:itemcost=0,0,0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+learnskill:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):skillid=(\\d+):skillnewlv=(\\d+):expbefore=(\\d+):expafter=(\\d+):expcost=(\\d+):itemcost=([^:]+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"learnskill_1");
	}
	
	//26_2
	public void learnskill_2() {
		String text = "sdsxs#10505#2013-07-16 15:00:39 game1:gs1:learnskill:from=5:userid=299144888:roleid=505339909:occupation=5:lev=29:fightvalue=4332:logintime=1373957813:bindmoneyleft=48852:moneyleft=0:bindcashleft=700:cashleft=0:skillid=526:skillnewlv=9:expbefore=462:expafter=470:expcost=25910:itemcost=0,0,0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+learnskill:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):skillid=(\\d+):skillnewlv=(\\d+):expbefore=(\\d+):expafter=(\\d+):expcost=(\\d+):secondexpcost=[^:]*:itemcost=([^:]+)";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"learnskill_2");
	}
	
	//27
	public void friendinfo() {
		String text = "sdsxs#10505#2013-07-16 15:01:04 backup:gdeliveryd:friendinfo:from=5:userid=263124380:roleid=500355077:occupation=4:lev=27:fightvalue=5308:logintime=1373956748:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:total=1:buddy=1:good=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+friendinfo:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):?bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):total=(\\d+):buddy=(\\d+):good=(-?\\d+)$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"friendinfo");
	}
	
	//28
	public void rolelogin() {
		String text = "sdsxs#10614#2013-07-16 15:00:31 backup:gdeliveryd:rolelogin:from=28:userid=311682482:roleid=15736860:occupation=4:lev=56:fightvalue=22638:logintime=1373958030:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:peer=120.42.115.193:account=i1nd2r6a";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+rolelogin:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):?bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):peer=([^:]+):account=([^:]+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogin");
	}
	
	//29
	public void auction_upitem() {
		String text = "sdsxs#10715#2013-07-16 15:01:33 database:gamedbd:auction_upitem:from=15:userid=311777468:roleid=47988751:occupation=2:lev=80:fightvalue=83118:logintime=0:bindmoneyleft=852974:moneyleft=131217:bindcashleft=160:cashleft=0:auction_id=524720:item_id=17393:item_uniqid=50124C151E42D63:item_count=1:money_type=2:start_money=400000:buynow_money=400000:fee_money=0:fee_bind_money=10000";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+auction_upitem:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):auction_id=(\\d+):item_id=(\\d+):item_uniqid=(.+):item_count=(\\d+):money_type=(\\d+):start_money=(\\d+):buynow_money=(\\d+):fee_money=(\\d+):fee_bind_money=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"auction_upitem");
	}
	
	//30
	public void auction_down() {
		String text = "sdsxs#10501#2013-07-16 15:00:13 database:gamedbd:auction_down:from=1:userid=312819041:roleid=161574913:occupation=4:lev=83:fightvalue=113712:logintime=0:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:auction_id=485907:item_id=11812:item_uniqid=1021D6451E2802F:item_count=4:money_type=2:start_money=20000:now_money=20000";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+auction_down:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):auction_id=(\\d+):item_id=(\\d+):item_uniqid=(.+):item_count=(\\d+):money_type=(\\d+):start_money=(\\d+):now_money=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"auction_down");
	}
	
	//31
	public void auction_deal() {
		String text = "sdsxs#10708#2013-07-16 15:00:15 database:gamedbd:auction_deal:from=11:userid=313103433:roleid=265007115:occupation=6:lev=80:fightvalue=84543:logintime=0:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:d_from=11:d_userid=316052474:d_roleid=399773707:d_occupation=3:d_lev=83:d_fightvalue=83339:d_logintime=0:d_bindmoneyleft=12302:d_moneyleft=5170702:d_bindcashleft=153:d_cashleft=14:auction_id=396420:item_id=11642:item_uniqid=2304A2AA51E403E3:item_count=1:money_type=2:total_money=10000:tax=1000";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+auction_deal:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):d_from=(\\d+):d_userid=(\\d+):d_roleid=(\\d+):d_occupation=(\\d+):d_lev=(\\d+):d_fightvalue=(-?\\d+):d_logintime=(-?\\d+):?d_bindmoneyleft=(\\d*):d_moneyleft=(\\d*):d_bindcashleft=(\\d*):d_cashleft=(\\d*):auction_id=(\\d+):item_id=(\\d+):item_uniqid=(.+):item_count=(\\d+):money_type=(\\d+):total_money=(\\d+):tax=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"auction_deal");
	}
	
	//32
	public void auction_raiseprice() {
		String text = "sdsxs#10712#2013-07-16 15:00:54 database:gamedbd:auction_raiseprice:from=15:userid=313447965:roleid=196456463:occupation=5:lev=19:fightvalue=2307:logintime=0:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:d_from=15:d_userid=316122698:d_roleid=330190863:d_occupation=4:d_lev=75:d_fightvalue=70142:d_logintime=0:d_bindmoneyleft=3334358:d_moneyleft=310733:d_bindcashleft=2711:d_cashleft=0:auction_id=520856:item_id=18252:item_uniqid=704A90A51DB1AFF:item_count=1:money_type=2:raiseprice_money=52500:former_raiseprice_role=120000527:former_raiseprice_money=50000";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+auction_raiseprice:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):d_from=(\\d+):d_userid=(\\d+):d_roleid=(\\d+):d_occupation=(\\d+):d_lev=(\\d+):d_fightvalue=(-?\\d+):d_logintime=(-?\\d+):?d_bindmoneyleft=(\\d*):d_moneyleft=(\\d*):d_bindcashleft=(\\d*):d_cashleft=(\\d*):auction_id=(\\d+):item_id=(\\d+):item_uniqid=(.+):item_count=(\\d+):money_type=(\\d+):raiseprice_money=(\\d+):former_raiseprice_role=(\\d+):former_raiseprice_money=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"auction_raiseprice");
	}
	
	//33
	public void trade() {
		String text = "sdsxs#10607#2013-07-16 15:01:01 backup:gdeliveryd:trade:from=22:userid=160968407:roleid=329338902:occupation=4:lev=81:fightvalue=80742:logintime=1373958039:bindmoneyleft=:moneyleft=977818:bindcashleft=:cashleft=:d_from=22:d_userid=13157031:d_roleid=662810646:d_occupation=2:d_lev=79:d_fightvalue=78455:d_logintime=1373956484:d_bindmoneyleft=:d_moneyleft=901030:d_bindcashleft=:d_cashleft=:tradeid=840:srcmoney=600000:dstmoney=0:srcitem=:dstitem=17395,1,10362C851E04B9B";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+trade:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):?bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):d_from=(\\d+):d_userid=(\\d+):d_roleid=(\\d+):d_occupation=(\\d+):d_lev=(\\d+):d_fightvalue=(-?\\d+):d_logintime=(\\d+):?d_bindmoneyleft=(\\d*):d_moneyleft=(\\d*):d_bindcashleft=(\\d*):d_cashleft=(\\d*):tradeid=(-?\\d+):srcmoney=(\\d+):dstmoney=(\\d+):srcitem=(.*):dstitem=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"trade");
	}
	
	//34
	public void stall_sell() {
		String text = "sdsxs#10716#2013-07-16 15:00:39 game1:gs1:stall_sell:from=19:userid=165056892:roleid=517165075:occupation=5:lev=33:fightvalue=6076:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:d_from=19:d_userid=161319218:d_roleid=517812243:d_occupation=5:d_lev=70:d_fightvalue=31226:d_logintime=:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=:money=200:item=11811,2,22099A8D51D5C6C3,200,100:tax=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+stall_sell:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):d_from=(\\d+):d_userid=(\\d+):d_roleid=(\\d+):d_occupation=([^:]*):d_lev=(\\d+):d_fightvalue=(-?\\d+):d_logintime=(\\d*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*):money_type=(-?\\d+):money=(-?\\d+):item=(.*):tax=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stall_sell");
	}

	
	//35
	public void stall_buy() {
		String text = "sdsxs#10510#2013-07-16 15:00:26 game1:gs7:stall_buy:from=10:userid=314584884:roleid=732532746:occupation=5:lev=34:fightvalue=4410:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:d_from=10:d_userid=306243020:d_roleid=1085440010:d_occupation=5:d_lev=59:d_fightvalue=18783:d_logintime=:d_bindmoneyleft=:d_moneyleft=:d_bindcashleft=:d_cashleft=:money=62:item=8380,62,1F032EAF51DC114D,62,1:tax=3";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+stall_buy:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):d_from=(\\d+):d_userid=(\\d+):d_roleid=(\\d+):d_occupation=([^:]*):d_lev=(\\d+):d_fightvalue=(-?\\d+):d_logintime=(-?\\d*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*):money_type=(-?\\d+):money=(\\d+):item=(.*):tax=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stall_buy");
	}
	
	
	//36
	public void rolelogout() {
		String text = "sdsxs#10715#2013-07-16 15:00:25 game1:gs4:rolelogout:from=4:userid=314213628:roleid=410468356:occupation=5:lev=59:fightvalue=52028:logintime=1373957957:bindmoneyleft=1435825:moneyleft=229918:bindcashleft=727:cashleft=0:time=68:mapid=5:x=-20.45:y=310.00:z=106.67";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+rolelogout:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):time=(\\d+):mapid=(\\d+):x=(.+):y=(.+):z=([^:]+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"rolelogout");
	}
	
	//37
	public void task_accept() {
		String text = "sdsxs#10610#2013-07-16 15:00:15 database:gs10:task_accept:from=25:userid=224951854:roleid=467632153:occupation=5:lev=13:fightvalue=2638:logintime=1373957064:bindmoneyleft=19893:moneyleft=0:bindcashleft=0:cashleft=0:teamid=0:teamnum=0:leaderid=0:maxlev=0:maxfv=0:minlev=0:minfv=0:avelev=0:avefv=0:type=0:taskid=3201:type=1:mafia_id=0:inteam=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_accept:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(\\d+):taskid=(\\d+):type=(-?\\d+):mafia_id=(\\d+):inteam=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_accept");
	}
	
	//38
	public void task_abort() {
		String text = "sdsxs#10608#2013-07-16 15:01:25 game1:gs3:task_abort:from=23:userid=316836643:roleid=574988311:occupation=4:lev=46:fightvalue=11491:logintime=1373958029:bindmoneyleft=643390:moneyleft=253882:bindcashleft=2241:cashleft=0:taskid=2140:type=2:mafia_id=24838167:inteam=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_abort:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):taskid=(\\d+):type=(\\d+):mafia_id=(\\d+):inteam=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_abort");
	}
	
	//39
	public void task_done() {
		String text = "sdsxs#10502#2013-07-16 15:00:09 game1:gs7:task_done:from=2:userid=155292018:roleid=437059586:occupation=6:lev=59:fightvalue=37278:logintime=1373955355:bindmoneyleft=3707150:moneyleft=59429:bindcashleft=176:cashleft=5:teamid=0:teamnum=0:leaderid=0:maxlev=0:maxfv=0:minlev=0:minfv=0:avelev=0:avefv=0:type=0:taskid=3908:type=0:money=0:exp=0:repu=:mafia_id=9830402:inteam=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_done:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(\\d+):taskid=(\\d+):type=(-?\\d+):money=(\\d+):exp=(\\d+):repu=(.*):mafia_id=(\\d+):inteam=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_done");
	}
	
	//40
	public void task_fail() {
		String text = "sdsxs#10711#2013-07-16 15:00:10 database:gs10:task_fail:from=17:userid=310414873:roleid=510918673:occupation=5:lev=57:fightvalue=14827:logintime=1373957985:bindmoneyleft=10431409:moneyleft=22:bindcashleft=764:cashleft=0:teamid=0:teamnum=0:leaderid=0:maxlev=0:maxfv=0:minlev=0:minfv=0:avelev=0:avefv=0:type=0:taskid=7139:type=0:mafia_id=0:inteam=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_fail:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(\\d+):taskid=(\\d+):type=(\\d+):mafia_id=(\\d+):inteam=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_fail");
	}
	
	//41
	public void achievement() {
		String text = "sdsxs#10709#2013-07-16 15:01:05 database:gs40:achievement:from=12:userid=311899016:roleid=77778956:occupation=5:lev=83:fightvalue=88812:logintime=1373957890:bindmoneyleft=103533587:moneyleft=812:bindcashleft=6730:cashleft=0:achievementid=32113";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+achievement:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):achievementid=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"achievement");
	}
	
	//42
	public void team_join() {
		String text = "sdsxs#10608#2013-07-16 15:00:28 backup:gdeliveryd:team_join:from=23:userid=278175759:roleid=155963415:occupation=5:lev=79:fightvalue=82039:logintime=1373957710:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:teamid=3648:teamnum=3:leaderid=71331863:maxlev=82:maxfv=87297:minlev=79:minfv=79730:avelev=80:avefv=83022:type=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+team_join:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):?bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"team_join");
	}
	
	//43
	public void team_leave() {
		String text = "sdsxs#10501#2013-07-16 15:00:34 backup:gdeliveryd:team_leave:from=1:userid=311257911:roleid=38584321:occupation=5:lev=81:fightvalue=81415:logintime=1373955441:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:teamid=1637:teamnum=2:leaderid=185806849:maxlev=84:maxfv=118830:minlev=82:minfv=87885:avelev=83:avefv=103357:type=1:reason=0:staytime=71";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+team_leave:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):?bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(\\d+):reason=(\\d+):staytime=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"team_leave");
	}
	
	//44
	public void enter_instance() {
		String text = "sdsxs#10718#2013-07-16 15:00:40 database:gs38:enter_instance:from=16:userid=311944841:roleid=26054672:occupation=6:lev=75:fightvalue=32873:logintime=:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:instanceid=24237:friendcnt=0:buddyfriend=0:goodfriend=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+enter_instance:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d*):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):instanceid=(\\d+):friendcnt=(\\d+):buddyfriend=(\\d+):goodfriend=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"enter_instance");
	}
	
	//45
	public void task_accept_team() {
		String text = "sdsxs#10714#2013-07-16 15:00:59 database:gs10:task_accept_team:from=17:userid=310415651:roleid=514584593:occupation=5:lev=51:fightvalue=13920:logintime=1373955735:bindmoneyleft=5020356:moneyleft=17:bindcashleft=32:cashleft=0:teamid=1082:teamnum=6:leaderid=514584593:maxlev=58:maxfv=17575:minlev=48:minfv=13920:avelev=54:avefv=15582:type=0:taskid=7139:friendcnt=0:buddyfriend=0:goodfriend=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_accept_team:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(\\d+):taskid=(\\d+):friendcnt=(\\d+):buddyfriend=(\\d+):goodfriend=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_accept_team");
	}
	
	//46
	public void auction_notdeal() {
		String text = "sdsxs#10714#2013-07-16 15:00:29 database:gamedbd:auction_notdeal:from=17:userid=315182666:roleid=480489489:occupation=6:lev=60:fightvalue=18908:logintime=0:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:auction_id=395820:item_id=11617:item_uniqid=D0123A051D988EB:item_count=117:money_type=2:start_money=11000";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+auction_notdeal:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(-?\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):auction_id=(\\d+):item_id=(\\d+):item_uniqid=(.+):item_count=(\\d+):money_type=(\\d+):start_money=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"auction_notdeal");
	}
	
	//47
	public void shoptrade() {
		String text = "sdsxs#10614#2013-07-16 15:02:37 game1:gs1:shop_trade:from=28:userid=320880852:roleid=169398300:occupation=5:lev=55:fightvalue=21214:logintime=1373956837:bindmoneyleft=1611095:moneyleft=17058:bindcashleft=5386:cashleft=0:item_id=13523:item_type=1:item_count=20:cash_type=1:cash_need=2565:order_id=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+shop_trade:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):item_id=(\\d+):item_type=(\\d+):item_count=(\\d+):cash_type=(\\d+):cash_need=(\\d+\\.?\\d*):order_id=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shoptrade");
	}
	
	//48
	public void addcash() {
		String text = "sdsxs#10607#2013-07-16 15:00:24 database:gamedbd:addcash:userid=314904472:oldserial=3:newserial=4:cash_add=24500:cash_delta=1500:delta=1500";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+addcash:userid=(\\d+):oldserial=(\\d+):newserial=(\\d+):cash_add=(\\d+):cash_delta=(\\d+\\.?\\d*):delta=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"addcash");
	}
	
	//49
	public void cash_change() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bcash_change\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=(\\d+):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=(\\d*):moneyleft=(\\d*):bindcashleft=(\\d*):cashleft=(\\d*):cashchange=(-?\\d+\\.?\\d*):type=(\\d+):reason=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cash_change");
	}
	
	//50
	public void accountlogin() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\blogin\\b:account=(.+):userid=(\\d+):peer=(\\d+\\.\\d+\\.\\d+\\.\\d+):mac=(.+):mid=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogin");
	}
	
	//51
	public void accountlogout() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\blogout\\b:account=(.+):userid=(\\d+):peer=(\\d+\\.\\d+\\.\\d+\\.\\d+):mac=(.+):time=(\\d+):status=(.+):mid=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"accountlogout");
	}
	
	//52_1
	public void add_master_1() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+add_master:d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*):d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"add_master_1");
	}
	
	//52_2
	public void add_master_2() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+add_master:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):d_from=([^:]*):d_userid=([^:]*):d_roleid=([^:]*):d_occupation=([^:]*):d_lev=([^:]*):d_fightvalue=([^:]*):d_logintime=([^:]*):d_bindmoneyleft=([^:]*):d_moneyleft=([^:]*):d_bindcashleft=([^:]*):d_cashleft=([^:]*)";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"add_master_2");
	}
	
	//53
	public void demesne_abandon() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_abandon:demesne=([^:]*):leagueid=([^:]*):reason=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_abandon");
	}
	
	//54
	public void demesne_battle_enter() {
		String text = "2014-05-04 20:00:01 backup:gdeliveryd:demesne_battle_enter:from=43:userid=359092196:roleid=217444395:occupation=4:lev=94:fightvalue=267241:logintime=1399204731:bindmoneyleft=:moneyleft=:bindcashleft=:cashleft=:demesne=48:side_league=1966123:role_league=1966123";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_battle_enter:from=([^:]*):userid=([^:]*):roleid=([^:]*):occupation=([^:]*):lev=([^:]*):fightvalue=([^:]*):logintime=([^:]*):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):demesne=([^:]*):side_league=([^:]*)";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_battle_enter");
	}
	
	//55
	public void demesne_battle_start() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_battle_start:demesne=([^:]*):line=([^:]*):worldid=([^:]*):league=([^:]*):bidleague=([^:]*):bidrole=([^:]*):bidmoney=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_battle_start");
	}
	
	//56
	public void demesne_bid() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_bid:demesne=([^:]*):leagueid=([^:]*):bidleague=([^:]*):bidrole=([^:]*):bidmoney=([^:]*):former_bidleague=([^:]*):former_bidrole=([^:]*):former_bidmoney=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_bid");
	}
	
	//57
	public void demesne_deal() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_deal:demesne=([^:]*):leagueid=([^:]*):bidleague=([^:]*):bidrole=([^:]*):bidmoney=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_deal");
	}
	
	//58
	public void demesne_plan() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_plan:pve=([^:]*):pvp=([^:]*):peace=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_plan");
	}
	
	//59
	public void demesne_tunnel() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+demesne_tunnel:demesne=([^:]*):leagueid=([^:]*):tunnels=([^:]*)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"demesne_tunnel");
	}
	
	//60
	public void platform_team_create() {
		String text = "sdsxs#10606#2013-07-16 15:01:53 game1:gs1:cash_change:from=21:userid=261716930:roleid=602214421:occupation=6:lev=59:fightvalue=42326:logintime=1373957212:bindmoneyleft=5484408:moneyleft=10945457:bindcashleft=1395:cashleft=0:cashchange=3000:type=1:reason=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+platform_team_create:from=(\\d+):userid=(\\d+):roleid=(\\d+):occupation=([^:]*):lev=(\\d+):fightvalue=(-?\\d+):logintime=(\\d+):bindmoneyleft=([^:]*):moneyleft=([^:]*):bindcashleft=([^:]*):cashleft=([^:]*):teamid=(\\d+):teamnum=(\\d+):leaderid=(\\d+):maxlev=(\\d+):maxfv=(\\d+):minlev=(\\d+):minfv=(\\d+):avelev=(\\d+):avefv=(\\d+):type=(\\d+):tid=(-?\\d+)$";

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"platform_team_create");
	}
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		//w.demesne_income();
		//w.delete_master();
		//w.finish_master();
		//w.sendmail();
		//w.mail_attach();
		//w.guarder_1();
		//w.guarder_2();
		//w.saintcloth_enhance();
		//w.createrole();
		//w.giftcard();
		//w.forbiduser();
		//w.singleteam_instance_close();
		//w.singlerole_instance_close();
		//w.singleteam_instance_open();
		//w.killmonster();
		//w.team_create();
		//w.killbymonster();
		//w.faction_join();
		//w.selectprof();
		//w.switchprof();
		//w.upgrade();
		//w.saintclothinfo_1();
		//w.saintclothinfo_2();
		//w.saintcloth_obtain();
		//w.upgradefv();
		//w.reinforce();
		//w.learnskill();
		//w.friendinfo();
		//w.rolelogin_2();
		//w.rolelogin_1();
		//w.auction_upitem();
		//w.auction_down();
		//w.auction_deal();
		//w.auction_raiseprice();
		//w.trade();
		//w.stall_sell_1();
		//w.stall_sell3();
		//w.stall_sell2();
		//w.stall_buy_3();
		//w.stall_buy_1();
		//w.stall_buy2();
		//w.rolelogout();
		//w.task_accept();
		//w.task_abort();
		//w.task_done();
		//w.task_fail();
		//w.achievement();
		//w.team_join();
		//w.team_leave();
		//w.enter_instance();
		//w.task_accept_team();
		//w.auction_notdeal();
		//w.shoptrade();
		//w.addcash();
		//w.cash_change();
		w.demesne_battle_enter();
	}
}