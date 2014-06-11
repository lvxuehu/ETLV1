package com.wanmei.test.sdxl.regular;

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
	public void disguise_make() {
		String text ="2013-11-11 00:38:07 disguise_make:from=2642:userid=269335672:roleid=711802900:shapeid=2040403:school=13:lev=106:petid=500043:cardnum=9";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bdisguise_make\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):petid=(\\d+):cardnum=(-?\\d+)$";
		
		systemout(text,reg,"disguise_make");
	}
	
	//2
	public void disguise_use() {
		String text ="2013-11-11 00:38:12 disguise_use:from=2642:userid=269335672:roleid=711802900:shapeid=2040403:school=13:lev=106:petid=500043";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bdisguise_use\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):petid=(-?\\d+)$";
		
		systemout(text,reg,"disguise_use");
	}
	
	//3
	public void qizhantianxiajisha() {
		String text ="2013-11-11 20:24:46 qizhantianxiajisha:from=2642:userid=280991053:roleid=397271074:shapeid=2040407:school=14:lev=69:npcid=12333";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bqizhantianxiajisha\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):npcid=(\\d+)$";
		
		systemout(text,reg,"qizhantianxiajisha");
	}
	
	//4
	public void tianfutask() {
		String text ="2013-11-11 00:38:15 tianfutask:from=2670:userid=350783062:roleid=48840827:shapeid=1010101:school=12:lev=69:taskstar=5";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btianfutask\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):taskstar=(-?\\d+)$";
		
		systemout(text,reg,"tianfutask");
	}
	
	//5
	public void horsexiuxing() {
		String text ="2013-11-11 00:45:57 horsexiuxing:from=2635:userid=309996841:roleid=265482349:shapeid=1010109:school=11:lev=89:horseid=1000221:horseuniqid=12447853:horseskill=[800014,1;800005,1]:horsetianfudian=0:horseroyal=0:horselev=50:horsejingjie=1:horseinfo=[attack,34;defend,34;magic,35;phyforce,13;speed,35;grow,28]:horsetype=1:roleexp=5000:horseexp=100000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bhorsexiuxing\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):horseid=(\\d+):horseuniqid=(\\d+):horseskill=(.+):horsetianfudian=(\\d+):horseroyal=(\\d+):horselev=(\\d+):horsejingjie=(\\d+):horseinfo=(.+):horsetype=(\\d+):roleexp=(-?\\d+):horseexp=(-?\\d+)$";
		
		systemout(text,reg,"horsexiuxing");
	}
	
	//6
	public void horserenew() {
		String text ="2013-11-11 00:45:58 horserenew:from=2614:userid=332781138:roleid=55955466:shapeid=2010109:school=18:lev=107:horseid=1000631:horseuniqid=120655878:horseskill=[800005,1][remainlv: 1]:horsetianfudian=13000:horseroyal=100:horselev=38:horsejingjie=1:horseinfo=[attack,36;defend,41;magic,39;phyforce,51;speed,36;grow,32]:horsetype=2:horseid1=1000631:horseuniqid1=120655878:horseskill1=[][remainlv: 1,1]:horsetianfudian1=13000:horseroyal1=100:horselev1=38:horsejingjie1=1:horseinfo1=[attack,50;defend,29;magic,26;phyforce,32;speed,37;grow,32]:horsetype1=2:item=38060";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bhorserenew\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):horseid=(\\d+):horseuniqid=(\\d+):horseskill=(.+):horsetianfudian=(\\d+):horseroyal=(\\d+):horselev=(\\d+):horsejingjie=(\\d+):horseinfo=(.+):horsetype=(\\d+):horseid1=(\\d+):horseuniqid1=(\\d+):horseskill1=(.+):horsetianfudian1=(\\d+):horseroyal1=(\\d+):horselev1=(\\d+):horsejingjie1=(\\d+):horseinfo1=(.+):horsetype1=(\\d+):item=([^:]*)$";
		
		systemout(text,reg,"horserenew");
	}
	
	//7
	public void horseskilllingwu() {
		String text ="2013-11-11 00:58:23 horseskilllingwu:from=2609:userid=328181023:roleid=53272675:shapeid=2040401:school=13:lev=103:horseid=1000412:horseuniqid=276123649:horseskill=[800016,1][remainlv: 1]:horsetianfudian=19800:horseroyal=100:horselev=66:horsejingjie=1:horseinfo=[attack,67;defend,36;magic,49;phyforce,51;speed,40;grow,65]:horsetype=2:horseid1=1000412:horseuniqid1=276123649:horseskill1=[800016,1;800015,1]:horsetianfudian1=19800:horseroyal1=100:horselev1=66:horsejingjie1=1:horseinfo1=[attack,67;defend,36;magic,49;phyforce,51;speed,40;grow,65]:horsetype1=2:items=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bhorseskilllingwu\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):horseid=(\\d+):horseuniqid=(\\d+):horseskill=(.+):horsetianfudian=(\\d+):horseroyal=(\\d+):horselev=(\\d+):horsejingjie=(\\d+):horseinfo=(.+):horsetype=(\\d+):horseid1=(\\d+):horseuniqid1=(\\d+):horseskill1=(.+):horsetianfudian1=(\\d+):horseroyal1=(\\d+):horselev1=(\\d+):horsejingjie1=(\\d+):horseinfo1=(.+):horsetype1=(\\d+):items=([^:]*)$";
		
		systemout(text,reg,"horseskilllingwu");
	}
	
	//8
	public void horseskilljinjie() {
		String text ="2013-11-11 00:03:15 horseskilljinjie:from=2666:userid=349978619:roleid=311417:shapeid=2010105:school=13:lev=69:horseid=1000912:horseuniqid=54591609:horseskill=[800012,4;800025,4;800017,3]:horsetianfudian=82000:horseroyal=100:horselev=58:horsejingjie=2:horseinfo=[attack,66;defend,48;magic,38;phyforce,48;speed,43;grow,67]:horsetype=3:horseid1=1000912:horseuniqid1=54591609:horseskill1=[800012,4;800025,4;800017,4]:horsetianfudian1=82000:horseroyal1=100:horselev1=58:horsejingjie1=2:horseinfo1=[attack,66;defend,48;magic,38;phyforce,48;speed,43;grow,67]:horsetype1=3:items=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bhorseskilljinjie\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):horseid=(\\d+):horseuniqid=(\\d+):horseskill=(.+):horsetianfudian=(\\d+):horseroyal=(\\d+):horselev=(\\d+):horsejingjie=(\\d+):horseinfo=(.+):horsetype=(\\d+):horseid1=(\\d+):horseuniqid1=(\\d+):horseskill1=(.+):horsetianfudian1=(\\d+):horseroyal1=(\\d+):horselev1=(\\d+):horsejingjie1=(\\d+):horseinfo1=(.+):horsetype1=(\\d+):items=([^:]*)$";
		
		systemout(text,reg,"horseskilljinjie");
	}
	
	//9
	public void horsejingjie() {
		String text ="2013-11-11 00:14:04 horsejingjie:from=2642:userid=268840616:roleid=8347687:shapeid=2020201:school=13:lev=106:horseid=1000412:horseuniqid=121208866:horseskill=[800012,1;800015,2]:horsetianfudian=102000:horseroyal=100:horselev=59:horsejingjie=1:horseinfo=[attack,62;defend,45;magic,56;phyforce,33;speed,33;grow,68]:horsetype=2:horseid1=1000412:horseuniqid1=121208866:horseskill1=[800012,1;800015,2]:horsetianfudian1=102000:horseroyal1=100:horselev1=59:horsejingjie1=2:horseinfo1=[attack,62;defend,45;magic,56;phyforce,33;speed,33;grow,70]:horsetype1=2:items=38074";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bhorsejingjie\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):horseid=(\\d+):horseuniqid=(\\d+):horseskill=(.+):horsetianfudian=(\\d+):horseroyal=(\\d+):horselev=(\\d+):horsejingjie=(\\d+):horseinfo=(.+):horsetype=(\\d+):horseid1=(\\d+):horseuniqid1=(\\d+):horseskill1=(.+):horsetianfudian1=(\\d+):horseroyal1=(\\d+):horselev1=(\\d+):horsejingjie1=(\\d+):horseinfo1=(.+):horsetype1=(\\d+):items=([^:]*)$";
		
		systemout(text,reg,"horsejingjie");
	}
	
	//10
	public void change_shape() {
		String text ="2013-11-11 00:14:04 change_shape:from=2670:userid=351605529:roleid=110538875:shapeid=1010105:school=11:lev=48:questionid=208302:changeshapeid=0:time=60:type=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bchange_shape\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):questionid=(\\d+):changeshapeid=(\\d+):time=(\\d+):type=(-?\\d+)$";
		
		systemout(text,reg,"change_shape");
	}
	
	//11
	public void createrole() {
		String text ="2013-11-11 00:15:29 createrole:from=2670:userid=250407802:roleid=239263867:shapeid=1010103:school=12:lev=1:peer=61.161.201.110:account=200936373@qq.com";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bcreaterole\\b:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):peer=(\\d+\\.\\d+\\.\\d+\\.\\d+):account=([^:]+)$";
		
		systemout(text,reg,"createrole");
	}
	
	//12
	public void forbiduser_lock() {
		String text ="2013-11-11 00:16:13 forbiduser_lock:from=2656:userid=336748683:roleid=359227510:shapeid=1010106:school=13:lev=54:gmuserid=1984:forbid_time=0:reason=6K+35Yu/5L2/55So6Z2e5rOV55qE56ys5LiJ5pa56L2v5Lu244CCAA==:type=3";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bforbiduser_lock\\b:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):gmuserid=(.+):forbid_time=(.+):reason=(.+):type=(-?\\d+)$";
		
		systemout(text,reg,"forbiduser_lock");
	}
	
	
	//13
	public void huoyueadd() {
		String text ="2013-11-11 00:16:14 huoyueadd:from=2663:userid=338339678:roleid=27930744:shapeid=1010109:school=11:lev=70:hint=30:add=3:total=16";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bhuoyueadd\\b:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):hint=(.+):add=(.+):total=(-?\\d+)$";
		
		systemout(text,reg,"huoyueadd");
	}
	
	//14
	public void novice_card() {
		String text ="2013-11-11 00:16:29 novice_card:from=2667:userid=354291335:roleid=107434106:shapeid=1010106:school=12:lev=2:key=26111006419236720506:items=60636,1,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bnovice_card\\b:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):key=(.*):items=([^:]+)$";
		
		systemout(text,reg,"novice_card");
	}
	
	//15
	public void killbyrole() {
		String text ="2013-11-11 00:16:44 killbyrole:sfrom=2616:suserid=265944065:sroleid=823385:sshapeid=2010203:sschool=12:slev=89:steamid=0:steamrolelist=0:steamoutrolelist=0:sleaderid=0:szhenfa=0:dfrom=2616:duserid=169146122:droleid=663486471:dshapeid=2030401:dschool=13:dlev=100:dteamid=0:dteamrolelist=0:dteamoutrolelist=0:dleaderid=0:dzhenfa=0:type=3:mapid=1007:areatype=0:areaid=0:babyused=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) killbyrole:sfrom=(.+):suserid=(.+):sroleid=(.+):sshapeid=(.+):sschool=(.+):slev=(.+):steamid=(.+):steamrolelist=(.*):steamoutrolelist=(.*):sleaderid=(.+):szhenfa=(.+):dfrom=(.+):duserid=(.+):droleid=(.+):dshapeid=(.+):dschool=(.+):dlev=(.+):dteamid=(.+):dteamrolelist=(.*):dteamoutrolelist=(.*):dleaderid=(.+):dzhenfa=(.+):type=(.+):mapid=(.+):areatype=(.+):areaid=(.+):babyused=(-?\\d+)$";
		
		systemout(text,reg,"killbyrole");
	}
	
	//16
	public void killbymonster() {
		String text ="2013-11-11 20:24:52 killbymonster:from=2666:userid=344457339:roleid=113971321:shapeid=1010110:school=11:lev=33:teamid=0:teamrolelist=0:teamoutrolelist=0:leaderid=0:zhenfa=0:monsterid=26016:battleid=1442:mapid=1007:areatype=0:areaid=0:babyused=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) killbymonster:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):teamid=(.+):teamrolelist=(.*):teamoutrolelist=(.*):leaderid=(.+):zhenfa=(.+):monsterid=(.+):battleid=(.+):mapid=(.+):areatype=(.+):areaid=(.+):babyused=(-?\\d+)$";
		systemout(text,reg,"killbymonster");
	}
	
	//17
	public void equip_repair() {
		String text ="2013-11-11 00:16:50 equip_repair:from=2637:userid=275019742:roleid=139952242:shapeid=1010108:school=14:lev=70:equipid=43020:equipuniqid=54162710642:equipprefix=2:equipdurmax=30:equipbase=821,68;101,0;141,0;111,361;1231,0;131,0;1531,0;81,0;1241,0;121,0;811,0;151,:equipspecial=:equipstarlev=4:equipcolour=4:equipgem=:equipskill=0;0:equipmaker=:equippos=2:result=1:money=863:type=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) equip_repair:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):equipid=(.+):equipuniqid=(.+):equipprefix=(.+):equipdurmax=(.+):equipbase=(.*):equipspecial=(.*):equipstarlev=(.+):equipcolour=(.+):equipgem=(.*):equipskill=(.+):equipmaker=(.*):equippos=(.+):result=(.+):money=(.+):type=(-?\\d+)$";
		
		systemout(text,reg,"equip_repair");
	}
	
	//18
	public void equip_insert() {
		String text ="sdxl#20106#2013-11-11 00:16:51 equip_insert:from=2614:userid=275588228:roleid=405725284:shapeid=2020305:school=11:lev=109:equipid=44013:equipuniqid=77858254948:equipprefix=4:equipdurmax=90:equipbase=821,15;101,334;141,55;81,0;111,0;1231,0;131,0;1241,0;121,0;811,0;151,:equipspecial=1261,137.82669,6;931,0.09857143,6;931,0.09857143,:equipstarlev=8:equipcolour=6:equipgem=1;2;3;4;:equipskill=0;0:equipmaker=6L+O5aS05LiA5p2/56CW:equippos=3:items=35057,1,532699852806;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) equip_insert:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):equipid=(.+):equipuniqid=(.+):equipprefix=(.+):equipdurmax=(.+):equipbase=(.*):equipspecial=(.*):equipstarlev=(.+):equipcolour=(.+):equipgem=(.*):equipskill=(.+):equipmaker=(.*):equippos=(.+):items=([^:]*)$";
		
		systemout(text,reg,"equip_insert");
	}
	
	//19
	public void equip_remake() {
		String text ="sdxl#70709#2013-11-11 00:17:15 equip_remake:from=2663:userid=334465474:roleid=5730424:shapeid=2010103:school=13:lev=89:equipid=42016:equipuniqid=92012626040:equipprefix=4:equipdurmax=100:equipbase=821,49;101,124;141,0;111,0;1231,0;131,0;1531,0;81,0;1241,221;121,0;811,0;151,21:equipspecial=1251,179.94768,6;1311,18.989857,0;1251,22.173357,:equipstarlev=8:equipcolour=6:equipgem=1;2;3;4;:equipskill=0;0:equipmaker=5aSp6LWQ5omT6YCgMg==:equippos=1:items=37217,1,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) equip_remake:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):equipid=(.+):equipuniqid=(.+):equipprefix=(.+):equipdurmax=(.+):equipbase=(.*):equipspecial=(.*):equipstarlev=(.+):equipcolour=(.+):equipgem=(.*):equipskill=(.+):equipmaker=(.*):equippos=(.+):items=([^:]*)$";
		
		systemout(text,reg,"equip_remake");
	}
	
	//20
	public void equip_refine() {
		String text ="sdxl#70709#2013-11-11 00:17:45 equip_refine:from=2663:userid=344641967:roleid=128233592:shapeid=2010103:school=12:lev=92:equipid=40316:equipuniqid=127929102456:equipprefix=3:equipdurmax=100:equipbase=821,0;101,0;141,0;111,0;131,0;1231,246;1531,0;81,675;1241,0;121,0;151,0;811,64:equipspecial=1251,38.259716,1;1321,50.42347,0;931,0.022857143,:equipstarlev=10:equipcolour=5:equipgem=1;:equipskill=0;0:equipmaker=SGVybWVzODI=:equippos=0:items=37220,1,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) equip_refine:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):equipid=(.+):equipuniqid=(.+):equipprefix=(.+):equipdurmax=(.+):equipbase=(.*):equipspecial=(.*):equipstarlev=(.+):equipcolour=(.+):equipgem=(.*):equipskill=(.+):equipmaker=(.*):equippos=(.+):items=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//21
	public void equip_append() {
		String text ="sdxl#70709#2013-11-11 00:17:45 equip_append:from=2663:userid=1764406944:roleid=266948728:shapeid=1010103:school=12:lev=79:equipid=43007:equipuniqid=150245109880:equipprefix=3:equipdurmax=90:equipbase=821,90;101,18;141,0;111,576;131,0;1231,0;1531,0;81,0;1241,0;121,0;151,0;811,:equipspecial=1231,4.6886787,:equipstarlev=1:equipcolour=1:equipgem=:equipskill=0;0:equipmaker=5a6M576O6KWE6Ziz5Y+k5Z+OMTE=:equippos=2:appenditem=35196,1,0;:lucystone=0:money=700: result=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) equip_append:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):equipid=(.+):equipuniqid=(.+):equipprefix=(.+):equipdurmax=(.+):equipbase=(.*):equipspecial=(.*):equipstarlev=(.+):equipcolour=(.+):equipgem=(.*):equipskill=(.+):equipmaker=(.*):equippos=(.+):appenditem=(.+):lucystone=(.+):money=(.+):\\s*result=([^:]+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//22
	public void petrenew() {
		String text ="sdxl#70710#2013-11-11 00:17:53 petrenew:from=2666:userid=350168909:roleid=28377209:shapeid=1010109:school=11:lev=50:petid=500016:petuniqid=3212558457:petskill=:petblood=0:petroyal=80:petcolor=1:petlev=22:pettype=1:petid1=500016:petuniqid1=3212558457:petskill1=200181,200121,:petblood1=0:petroyal1=80:petcolor1=2:petlev1=0:pettype1=2:item=31002,9,502859162810,0,0,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) petrenew:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):petid=(.+):petuniqid=(.+):petskill=(.*):petblood=(.+):petroyal=(.+):petcolor=(.+):petlev=(.+):pettype=(.+):petid1=(.+):petuniqid1=(.+):petskill1=(.*):petblood1=(.+):petroyal1=(.+):petcolor1=(.+):petlev1=(.+):pettype1=(.+):item=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//23
	public void petaddskill() {
		String text ="sdxl#70710#2013-11-11 00:18:17 petaddskill:from=2666:userid=350025916:roleid=3817593:shapeid=1020203:school=12:lev=69:petid=500036:petuniqid=2999353465:petskill=200092,200231,200331,200321,200302,:petblood=11285:petroyal=140:petcolor=4:petlev=61:pettype=2:petid1=500036:petuniqid1=2999353465:petskill1=200092,200341,200331,200321,200302,:petblood1=11285:petroyal1=140:petcolor1=4:petlev1=61:pettype1=2:item=31069,1,513515603130,0,0,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) petaddskill:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):petid=(.+):petuniqid=(.+):petskill=(.*):petblood=(.+):petroyal=(.+):petcolor=(.+):petlev=(.+):pettype=(.+):petid1=(.+):petuniqid1=(.+):petskill1=(.*):petblood1=(.+):petroyal1=(.+):petcolor1=(.+):petlev1=(.+):pettype1=(.+):item=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//24
	public void petunzip() {
		String text ="sdxl#70709#2013-11-11 00:18:18 petunzip:from=2663:userid=346137620:roleid=189497464:shapeid=1030303:school=13:lev=84:petid=500073:petuniqid=8454332536:petskill=200042,200431,200191,200051,:petblood=0:petroyal=160:petcolor=4:petlev=0:pettype=2:petid1=500073:petuniqid1=8454332536:petskill1=200042,200431,200191,200051,:petblood1=0:petroyal1=160:petcolor1=4:petlev1=0:pettype1=2:item=31093,1,1506051687600,0,0,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) petunzip:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):petid=(.+):petuniqid=(.+):petskill=(.*):petblood=(.+):petroyal=(.+):petcolor=(.+):petlev=(.+):pettype=(.+):petid1=(.+):petuniqid1=(.+):petskill1=(.*):petblood1=(.+):petroyal1=(.+):petcolor1=(.+):petlev1=(.+):pettype1=(.+):item=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//25
	public void petaddblood() {
		String text ="sdxl#70711#2013-11-11 00:19:10 petaddblood:from=2667:userid=333455592:roleid=103903354:shapeid=1010102:school=11:lev=89:petid=500073:petuniqid=562770042:petskill=200011,200042,200121,200251,200032,200181,:petblood=7000:petroyal=180:petcolor=4:petlev=94:pettype=2:petid1=500073:petuniqid1=562770042:petskill1=200011,200042,200121,200251,200032,200181,:petblood1=7200:petroyal1=180:petcolor1=4:petlev1=94:pettype1=2:item=36117,1,134978847940,0,0,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) petaddblood:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):petid=(.+):petuniqid=(.+):petskill=(.*):petblood=(.+):petroyal=(.+):petcolor=(.+):petlev=(.+):pettype=(.+):petid1=(.+):petuniqid1=(.+):petskill1=(.*):petblood1=(.+):petroyal1=(.+):petcolor1=(.+):petlev1=(.+):pettype1=(.+):item=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//26
	public void team_create() {
		String text ="sdxl#20101#2013-11-11 00:19:11 team_create:from=2609:userid=310618171:roleid=410648673:shapeid=1010105:school=13:lev=89:teamid=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) team_create:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):teamid=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//27
	public void team_join() {
		String text ="sdxl#70711#2013-11-11 00:19:11 team_join:from=2667:userid=321503855:roleid=98742394:shapeid=1010110:school=16:lev=23:teamid=115314810:teamrolelist=:teamoutrolelist=98742394;:leaderid=93593722:zhenfa=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+team_join:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):teamid=(.+):teamrolelist=(.*):teamoutrolelist=(.*):leaderid=(.+):zhenfa=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//28
	public void give() {
		String text ="sdxl#20106#2013-11-11 00:19:11 give:sfrom=2614:suserid=275163989:sroleid=915845220:sshapeid=1010301:sschool=18:slev=107:dfrom=2614:duserid=274645781:droleid=104788069:dshapeid=1010301:dschool=16:dlev=104:srcmoney=0:srcitem=36028,27,532106924038,0,0,0,0;33040,2,532700942342,0,0,0,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+give:sfrom=(.+):suserid=(.+):sroleid=(.+):sshapeid=(.+):sschool=(.+):slev=(.+):dfrom=(.+):duserid=(.+):droleid=(.+):dshapeid=(.+):dschool=(.+):dlev=(.+):srcmoney=(.+):srcitem=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//29
	public void trade() {
		String text ="sdxl#70712#2013-11-11 00:19:13 trade:sfrom=2670:suserid=118975487:sroleid=12144763:sshapeid=1010101:sschool=13:slev=69:dfrom=2670:duserid=155302179:droleid=7102587:dshapeid=1010105:dschool=16:dlev=76:srcmoney=0:dstmoney=0:srcitem=:dstitem=500035,1,2996670587;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+trade:sfrom=(.+):suserid=(.+):sroleid=(.+):sshapeid=(.+):sschool=(.+):slev=(.+):dfrom=(.+):duserid=(.+):droleid=(.+):dshapeid=(.+):dschool=(.+):dlev=(.+):srcmoney=(.+):dstmoney=(.+):srcitem=(.*):dstitem=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//30
	public void stall_trade() {
		String text ="sdxl#70709#2013-11-11 00:19:14 stall_trade:sfrom=2663:suserid=344510534:sroleid=133857400:sshapeid=1010102:sschool=11:slev=72:dfrom=2663:duserid=346995349:droleid=253759608:dshapeid=1020203:dschool=12:dlev=59:srcmoney=23000:dstitem=32005,1,158410551416,0,0,0,023000,23000;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+stall_trade:sfrom=(.+):suserid=(.+):sroleid=(.+):sshapeid=(.+):sschool=(.+):slev=(.+):dfrom=(.+):duserid=(.+):droleid=(.+):dshapeid=(.+):dschool=(.+):dlev=(.+):srcmoney=(.+):dstitem=([^:]+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//31
	public void shop_create() {
		String text ="sdxl#70709#2013-11-11 00:35:47 shop_create:from=2663:userid=318822970:roleid=162304120:shapeid=2040404:school=14:lev=89:shopid=1732728";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+shop_create:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):shopid=(-?\\d+)$";
		systemout(text,reg,"equip_refine");
	}
	
	//32
	public void cashorder() {
		String text ="sdxl#70712#2013-11-11 00:36:25 cashorder:from=2670:userid=323154421:roleid=183414907:shapeid=1010102:school=17:lev=56:tid=51089531:tradeflag=1:order_cash=500:order_money=515000:orderfee_money=15450";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+cashorder:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):tid=(.+):tradeflag=(.+):order_cash=(.+):order_money=(.+):orderfee_money=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//33
	public void cashdeal() {
		String text ="sdxl#70710#2013-11-11 00:36:26 cashdeal:from=2666:userid=350050597:roleid=1405049:shapeid=2010101:school=13:lev=69:tid=50983033:volume=58:tradeflag=1:deal_cash=3:deal_money=3132:cash_buy=2879:cash_sell=13442";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+cashdeal:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):tid=(.+):volume=(.+):tradeflag=(.+):deal_cash=(.+):deal_money=(.+):cash_buy=(.+):cash_sell=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//34
	public void upgrade() {
		String text ="sdxl#70710#2013-11-11 00:36:26 upgrade:from=2666:userid=330239050:roleid=105455737:shapeid=1010105:school=11:lev=35:beforelev=34:exp=334582:money=7524:smoney=401783:time=12643973";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+upgrade:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):beforelev=(.+):exp=(.+):money=(.+):smoney=(.+):time=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//35
	public void rolelogin() {
		String text ="sdxl#70708#2013-11-11 00:36:33 rolelogin:from=2661:userid=336380345:roleid=134320247:shapeid=1010104:school=14:lev=70:peer=222.245.226.227:account=meng294032314:clientfrom=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+rolelogin:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):peer=(.+):account=(.+):clientfrom=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//36
	public void rolelogout() {
		String text ="sdxl#70712#2013-11-11 00:36:33 rolelogout:from=2670:userid=257509629:roleid=71721083:shapeid=1010103:school=12:lev=60:mapid=1007:x=4700:y=2104:time=40711:clientfrom=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+rolelogout:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):mapid=(.+):x=(.+):y=(.+):time=(.+):clientfrom=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//37
	public void acupoint() {
		String text ="sdxl#70712#2013-11-11 00:36:34 acupoint:from=2670:userid=351972601:roleid=138379387:shapeid=1010102:school=19:lev=59:acupointid=1914:acupointlev=33:moneyneed=0:smoneyneed=-4700:savingneed=0:expchanged=-12474";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+acupoint:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):acupointid=(.+):acupointlev=(.+):moneyneed=(.+):smoneyneed=(.+):savingneed=(.+):expchanged=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//38
	public void learnskill() {
		String text ="sdxl#10101#2013-11-11 00:36:42 learnskill:from=2608:userid=248617327:roleid=599334912:shapeid=2030304:school=14:lev=69:skillfrom=1:skillid=320101:skilllev=83:moneyneed=0:smoneyneed=-17976:savingneed=0:factionswneed=-83:renqineed=0:expchanged=-345935";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+learnskill:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):skillfrom=(.+):skillid=(.+):skilllev=(.+):moneyneed=(.+):smoneyneed=(.+):savingneed=(.+):factionswneed=(.+):renqineed=(.+):expchanged=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//39
	public void produce_get() {
		String text ="sdxl#70703#2013-11-11 00:36:47 produce_get:from=2637:userid=320695907:roleid=232657010:shapeid=2020103:school=12:lev=109:produceskill=300101:items=37178,1,-1321848718:items1=37121,1,-1321975694:equipid=42012:equipuniqid=209133703282:equipprefix=4:equipdurmax=100:equipbase=821,39;101,78;141,0;81,0;111,0;1231,0;131,0;1241,156;121,0;1531,0;811,0;151,15:equipspecial=1261,14.368131,0;1331,33.029247,:equipstarlev=0:equipcolour=2:equipgem=:equipskill=0;0:equipmaker=44GX44KK5a6H5paH6L6w6YC4:money=6000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+produce_get:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):produceskill=(.+):items=(.+):items1=(.+):equipid=(.+):equipuniqid=(.+):equipprefix=(.+):equipdurmax=(.+):equipbase=(.+):equipspecial=(.*):equipstarlev=(.+):equipcolour=(.+):equipgem=(.*):equipskill=(.+):equipmaker=(.+):money=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//40
	public void consume_item() {
		String text ="sdxl#10101#2013-11-11 00:36:47 consume_item:from=2608:userid=290096982:roleid=519012352:shapeid=1010107:school=19:lev=70:consumetype=1:items=33001,6,0;";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+consume_item:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):consumetype=(.+):items=([^:]+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//41
	public void task_accept() {
		String text ="sdxl#70712#2013-11-11 20:24:52 task_accept:from=2670:userid=354298307:roleid=233967739:shapeid=1010101:school=12:lev=27:taskid=102028";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+task_accept:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):taskid=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//42
	public void task_abort() {
		String text ="sdxl#70712#2013-11-11 00:37:20 task_abort:from=2670:userid=105311376:roleid=62214267:shapeid=1010102:school=11:lev=65:taskid=811001:time=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+task_abort:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):taskid=(.+):time=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//43
	public void task_done() {
		String text ="sdxl#70710#2013-11-11 00:37:20 task_done:from=2666:userid=350059988:roleid=74965113:shapeid=1010109:school=11:lev=60:taskid=804000:money=0:smoney=1989:exp=11395:item=:time=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+task_done:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):taskid=(.+):money=(.+):smoney=(.+):exp=(.+):item=(.*):time=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//44
	public void shimentask_accept() {
		String text ="sdxl#70712#2013-11-11 20:24:53 shimentask_accept:from=2670:userid=137596048:roleid=84033659:shapeid=1010109:school=11:lev=64:ringnum=1:roundnum=1:taskid=801002:taskpara=801000,4,1,1,24,164,801002,0,0,10014,0,0,0,0,0,1384172693887,1,801002,,0,0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+shimentask_accept:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):ringnum=(.+):roundnum=(.+):taskid=(.+):taskpara=([^:]+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//45
	public void shimentask_abort() {
		String text ="sdxl#20212#2013-11-11 00:37:26 shimentask_abort:from=2635:userid=275011059:roleid=264392814:shapeid=1010108:school=19:lev=70:ringnum=3:roundnum=3:taskid=801003:time=1225:taskpara=801000,4,3,3,19,218,801003,0,0,10161,32005,1,0,0,0,1384101445658,1,801003,,0,0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+shimentask_abort:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):ringnum=(.+):roundnum=(.+):taskid=(.+):time=(.+):taskpara=([^:]+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//46
	public void shimentask_done() {
		String text ="sdxl#70710#2013-11-11 00:37:26 shimentask_done:from=2666:userid=291230316:roleid=37822585:shapeid=1010108:school=15:lev=49:ringnum=6:roundnum=6:taskid=801011:taskpara=801000,3,6,6,29,129,801011,1007,0,10209,50081,0,453,159,0,1384101390691,1,801011,,0,0:items=50081:time=56222";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+shimentask_done:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):ringnum=(.+):roundnum=(.+):taskid=(.+):taskpara=(.+):items=(.+):time=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//47
	public void accountlogout() {
		String text ="sdxl#70710#2013-11-11 00:37:27 logout:accountid=347098861:account=ck2lqy:charid=:gate=:line=:time=155:peer=58.215.168.12:reason=1:mid=wanmei";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) logout:accountid=(.+):account=(.+):charid=(.*):gate=(.*):line=(.*):time=(.+):peer=(.+):reason=(.+):mid=([^:]*)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//48
	public void addcash() {
		String text ="sdxl#20112#2013-11-11 00:38:07 addcash:userid=271322698:oldserial=6:newserial=7:cash_add=3000:delta=1000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) addcash:userid=(.+):oldserial=(.+):newserial=(.+):cash_add=(.+):delta=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//49
	public void shoptrade() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "^(.+)#(\\d{5})+#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) shop_trade:from=(.+):userid=(.+):roleid=(.+):shapeid=(.+):school=(.+):lev=(.+):itemid=(.+):itemnum=(.+):uid=(.+):cash_need1=(.+):cash_need2=(.+):cash_need3=(-?\\d+)$";
		
		systemout(text,reg,"equip_refine");
	}
	
	//50
	public void home_treasure() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+home_treasure:from=([^:]*):userid=([^:]*):roleid=([^:]*):shapeid=([^:]*):school=([^:]*):lev=([^:]*):itemid=([^:]*):treasureid=([^:]*):treasureuniqid=([^:]*):treasurecolour=([^:]*):treasurecolour1=([^:]*):treasurebaseids=([^:]*):treasurebasevalues=([^:]*):treasureappendids=([^:]*):treasureappendvalues=([^:]*)$";
		
		systemout(text,reg,"home_treasure");
	}
	
	//51
	public void pet_change() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+pet_change:from=([^:]*):userid=([^:]*):roleid=([^:]*):shapeid=([^:]*):school=([^:]*):lev=([^:]*):petid=([^:]*):petuniqid=([^:]*):petsbloodlevel=([^:]*):petblood=([^:]*):petqizhiget=([^:]*):petshapeget=([^:]*)$";
		
		systemout(text,reg,"pet_change");
	}
	
	//52
	public void zinv_addskill() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+zinv_addskill:from=([^:]*):userid=([^:]*):roleid=([^:]*):shapeid=([^:]*):school=([^:]*):lev=([^:]*):zinvid=([^:]*):zinvuniqid=([^:]*):zinvskill=([^:]*):zinvchengzhang=([^:]*):zinvwenbao=([^:]*):zinvshuxiang=([^:]*):addskill=([^:]*):items=([^:]*):type=([^:]*)$";
		
		systemout(text,reg,"zinv_addskill");
	}
	
	//53
	public void zinv_banadd() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+zinv_banadd:sfrom=([^:]*):suserid=([^:]*):sroleid=([^:]*):sshapeid=([^:]*):sschool=([^:]*):slev=([^:]*):szinvid=([^:]*):szinvuniqid=([^:]*):szinvskill=([^:]*):szinvchengzhang=([^:]*):szinvwenbao=([^:]*):szinvshuxiang=([^:]*):dfrom=([^:]*):duserid=([^:]*):droleid=([^:]*):dshapeid=([^:]*):dschool=([^:]*):dlev=([^:]*):dzinvid=([^:]*):dzinvuniqid=([^:]*):dzinvskill=([^:]*):dzinvchengzhang=([^:]*):dzinvwenbao=([^:]*):dzinvshuxiang=([^:]*):items=([^:]*)$";
		
		systemout(text,reg,"zinv_banadd");
	}
	
	//54
	public void zinv_get() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+zinv_get:from=([^:]*):userid=([^:]*):roleid=([^:]*):shapeid=([^:]*):school=([^:]*):lev=([^:]*):zinvid=([^:]*):zinvuniqid=([^:]*):zinvskill=([^:]*):zinvchengzhang=([^:]*):zinvwenbao=([^:]*):zinvshuxiang=([^:]*):items=([^:]*):type=([^:]*)";
		
		systemout(text,reg,"zinv_get");
	}
	
	//55
	public void zinv_peiyang() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+zinv_peiyang:from=([^:]*):userid=([^:]*):roleid=([^:]*):shapeid=([^:]*):school=([^:]*):lev=([^:]*):zinvid=([^:]*):zinvuniqid=([^:]*):zinvskill=([^:]*):zinvchengzhang=([^:]*):zinvwenbao=([^:]*):zinvshuxiang=([^:]*):dianshu1=([^:]*):dianshu2=([^:]*):items=([^:]*)$";
		
		systemout(text,reg,"zinv_peiyang");
	}
	
	//56
	public void zinv_qinadd() {
		String text ="sdxl#70710#2013-11-11 00:38:08 shop_trade:from=2666:userid=311864258:roleid=26906745:shapeid=1020207:school=13:lev=59:itemid=36111:itemnum=1:uid=0:cash_need1=0:cash_need2=3:cash_need3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+zinv_qinadd:sfrom=([^:]*):suserid=([^:]*):sroleid=([^:]*):sshapeid=([^:]*):sschool=([^:]*):slev=([^:]*):szinvid=([^:]*):szinvuniqid=([^:]*):szinvskill=([^:]*):szinvchengzhang=([^:]*):szinvwenbao=([^:]*):szinvshuxiang=([^:]*):dfrom=([^:]*):duserid=([^:]*):droleid=([^:]*):dshapeid=([^:]*):dschool=([^:]*):dlev=([^:]*):dzinvid=([^:]*):dzinvuniqid=([^:]*):dzinvskill=([^:]*):dzinvchengzhang=([^:]*):dzinvwenbao=([^:]*):dzinvshuxiang=([^:]*):items=([^:]*)$";
		
		systemout(text,reg,"zinv_qinadd");
	}
	
	//57
	public void clear360cash() {
		String text ="2014-05-19 16:00:53 clear360:from=2642:userid=121182822:roleid=109891687:shapeid=1010103:school=12:lev=45:logintime=41266156198:cash_delta=36137,14;33048,1;36134,1;33010,99;33010,72;32028,1;36130,1;36112,2;36000,7;32019,1;33028,9;36495,1;36019,4;33006,6;36091,21;36267,3;31001,24;32016,1;50001,8;50015,1;33038,30;32020,7;36011,2;32029,1;50134,1;:smoney=769060:money=2337:syuanbao=0:yuanbao=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bclear360\\b:from=\\d+:userid=(.+?):roleid=.+?:shapeid=.+?:school=.+?:lev=.+?:logintime=(.+):cash_delta=.*?:smoney=.+?:money=.+?:syuanbao=.+?:yuanbao=(.+)$";
		
		systemout(text,reg,"clear360cash");
	}
	
	//58
	public void clear360item() {
		String text ="2014-05-19 16:00:53 clear360:from=2642:userid=121182822:roleid=109891687:shapeid=1010103:school=12:lev=45:logintime=41266156198:cash_delta=36137,14;33048,1;36134,1;33010,99;33010,72;32028,1;36130,1;36112,2;36000,7;32019,1;33028,9;36495,1;36019,4;33006,6;36091,21;36267,3;31001,24;32016,1;50001,8;50015,1;33038,30;32020,7;36011,2;32029,1;50134,1;:smoney=769060:money=2337:syuanbao=0:yuanbao=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bclear360\\b:from=\\d+:userid=(.+?):roleid=.+?:shapeid=.+?:school=.+?:lev=.+?:logintime=.+:cash_delta=(.+?);:smoney=";
		
		systemout(text,reg,"clear360cash");
	}
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		//w.shoptrade();
		//w.clear360cash();
		w.clear360item();
	}
}
