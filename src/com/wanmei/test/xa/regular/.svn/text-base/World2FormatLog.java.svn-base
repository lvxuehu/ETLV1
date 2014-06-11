package com.wanmei.test.xa.regular;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2FormatLog {
	//private String prefixRegular = "^srbfile=(.+)#srbline=(.+)#srbgame=(.+)#srbip=(.+)#srbgn=(.+)#";
	private String prefixRegular = "^(.*)#";
	private String prefixString = "srbfile=world2.formatlog#srbline=9#srbgame=xa#srbip=172.21.214.254#srbgn=10919#";
	
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	@SuppressWarnings("unused")
	private void systemout(Matcher m) {
		systemout(m, "");
	}
	
	//
	private void order(Matcher m,String order,String methodName) {
		if(m.find()) {
			StringTokenizer st = new StringTokenizer(order,",");
			
			ArrayList<Integer> list = null;
			
			if(st.countTokens() > 1) {
				list = new ArrayList<Integer>();
				
				while(st.hasMoreTokens()) {
					list.add(Integer.parseInt(st.nextToken()));
				}
			}
			
			for(Integer l : list) {
				System.out.println(m.group(l));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	//1
	public void sysmail() {
		String text = prefixString + "2014-02-18 00:04:29 backup gdeliveryd: notice:formatlog:sysmail:sysid=32:sys_type=3:tid=1074084563:receiver=819503121:itemid=83687:count=1";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsysmail\\b:sysid=(-?\\d+):sys_type=(-?\\d+):tid=([^:]*):receiver=([^:]*):itemid=(-?\\d+):count=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"sysmail");
	}
	
	//2
	public void stone_combine() {
		String text = prefixString + "2014-02-18 00:04:37 game1 gs007: notice:formatlog:stone_combine:roleid=62820373:combiner=56490:input_stone=56696:count=5:money_cost=500:output_stone=56697:bind=1";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bstone_combine\\b:roleid=(-?\\d+):combiner=(-?\\d+):input_stone=([^:]*):count=([^:]*):money_cost=(-?\\d+):output_stone=(-?\\d+):bind=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stone_combine");
	}
	
	//3
	public void player_get_valuable_item() {
		String text = prefixString + "2014-02-18 00:04:37 backup gs017: notice:formatlog:player_get_valuable_item:roleid=64577557:item_id=36320:scene=1529:inc_type=5:sell_level=1:buy_level=0";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_get_valuable_item\\b:roleid=(-?\\d+):item_id=(-?\\d+):scene=([^:]*):inc_type=([^:]*):sell_level=(-?\\d+):buy_level=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"player_get_valuable_item");
	}
	
	//4
	public void equip_embed_stone() {
		String text = prefixString + "2014-02-18 00:04:39 game1 gs001: notice:formatlog:equip_embed_stone:roleid=984535048:equip=69555:tool=36320:money=1500:stone1=75278:stone2=56716:stone3=56666:bind=1";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bequip_embed_stone\\b:roleid=(-?\\d+):equip=(-?\\d+):tool=([^:]*):money=([^:]*):stone1=(-?\\d+):stone2=(-?\\d+):stone3=(-?\\d+):bind=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"equip_embed_stone");
	}
	
	//5
	public void equip_unembed_stone() {
		String text = prefixString + "2014-02-18 00:04:42 game1 gs007: notice:formatlog:equip_unembed_stone:roleid=11735049:equip=4639:money=720:stone1=56667:stone2=0:stone3=0:bind=1";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bequip_unembed_stone\\b:roleid=(-?\\d+):equip=(-?\\d+):money=([^:]*):stone1=(-?\\d+):stone2=(-?\\d+):stone3=(-?\\d+):bind=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"equip_unembed_stone");
	}
	
	//6
	public void mail_pack() {
		String text = prefixString + "2014-02-18 00:04:42 database gamedbd: notice:formatlog:mail_pack:from=0:to=768114788:mailid=34:category=136:sid=25:money=0:items=553771,1;";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmail_pack\\b:from=(-?\\d+):to=(-?\\d+):mailid=([^:]*):category=(-?\\d+):sid=(-?\\d+):money=(-?\\d+):items=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mail_pack");
	}
	
	//7
	public void marriageSave() {
		String text = prefixString + "2014-02-18 00:04:52 database gamedbd: notice:formatlog:MarriageSave:initiator=33304686:bride.id=761995374:groom.id=33304686:operation=2";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bMarriageSave\\b:initiator=(-?\\d+):bride.id=(-?\\d+):groom.id=([^:]*):operation=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"MarriageSave");
	}
	
	//8
	public void mid_report() {
		String matcherIndex = "1,2,3,4,5,7,8,9,6";
		String text = "2014-05-23 12:46:12 backup gdeliveryd: notice:formatlog:mid_report:userid=392026529:roleid=1509314683:mid=:mac=2E-FD-B9-92-E3-5F:minimode=0:prof=4:level=17:cash_add=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmid_report\\b:userid=(-?\\d+):roleid=(-?\\d+):mid=([^:]*)[:]*mac=([^:]*):minimode=(-?\\d+):prof=(-?\\d+):level=(-?\\d+):cash_add=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m,matcherIndex,"mid_report");
	}
	
	
	
	//13
	public void acforbiduser() {
		String text =  prefixString + "2013-07-30 15:03:56 backup gdeliveryd: notice:formatlog:acforbiduser:roleid=676921353:accid=325437226:forbid_time=259201:reason_size=22";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bacforbiduser\\b:roleid=(-?\\d+):accid=(-?\\d+):forbid_time=(-?\\d+):reason_size=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"acforbiduser");
	}
	
	//14
	public void player_get_reward() {
		String text = prefixString + "2013-07-25 07:03:34 database gs003: notice:formatlog:player_get_reward:roleid=93421572:native_zoneid=0:level=54:prof=6:reward=4034";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_get_reward\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):reward=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"player_get_reward");
	}
	
	//15
	public void modify_reputation() {
		String text = prefixString +  "2013-07-25 07:04:12 backup gs002: notice:formatlog:modify_reputation:roleid=107937796:native_zoneid=0:level=37:prof=9:index=23:offset=13";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmodify_reputation\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):index=(-?\\d+):offset=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"modify_reputation");
	}
	
	//16
	public void round_pk_result() {
		String matcherIndex = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20,21,15,22";
		
		String text =  prefixString +   "2014-03-06 04:29:02 backup gs020: notice:formatlog:round_pk_result:tid=3547:mode=0x1:time_mask=0x4:option_mask=0x2f:round_no=1:time_used=43:winner_offset=0:roleid0=55488630:native_zoneid0=0:invader0=0:prof0=8:wulin0=5:level0=40:point0=2177:roleid1=48377974:native_zoneid1=0:invader1=0:prof1=9:wulin1=6:level1=58:point1=2064";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bround_pk_result\\b:tid=(\\d+):mode=([^:]+):time_mask=([^:]+):option_mask=([^:]+):round_no=(\\d+):time_used=(\\d+):winner_offset=(-?\\d+):roleid0=(\\d+)[,|:]native_zoneid0=(\\d+):invader0=(\\d+):prof0=(\\d+):wulin0=(\\d+):level0=(\\d+):point0=(\\d+):roleid1=(\\d+)[,|:]native_zoneid1=(\\d+):invader1=(\\d+):prof1=(\\d+):wulin1=(\\d+):level1=(\\d+):point1=(\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m,matcherIndex,"round_pk_result");
	}
	
	//17
	public void mafia_activity_deliver_reward() {
		String text = prefixString + "2013-07-23 19:25:11 database gs030: notice:formatlog:mafia_activity_deliver_reward:fid=32791:tid=2074:type=1:value=2:rewardid=2612:category=2:progress=2";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmafia_activity_deliver_reward\\b:fid=(-?\\d+):tid=(-?\\d+):type=(-?\\d+):value=(-?\\d+):rewardid=(-?\\d+):category=(-?\\d+):progress=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mafia_activity_deliver_reward");
	}
	
	//18
	public void player_status() {
		String matcherIndex = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15";
		String text =  prefixString + "2014-03-06 12:31:31 game1 gs013: notice:formatlog:player_status:roleid=174796812:level=81:prof=9:trade_money=20569:bind_money=511494:money_depost=0:force=37390:world_tid=0:scene_tag=2019:x=147.84:y=40.83:z=130.05:killed_monster=1789:native_zoneid=0:invader=0:credit=115.275253";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_status\\b:roleid=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):trade_money=(-?\\d+):bind_money=(-?\\d+):money_depost=(-?\\d+):force=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+):killed_monster=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):credit=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, matcherIndex, "player_status");
	}
	
	//19
	public void market_sell() {
		String text =  prefixString + "2013-07-25 07:00:31 backup gs002: notice:formatlog:market_sell:src_userid=322155297:src_roleid=441839634:dst_userid=310211067:dst_roleid=38334482:src_money=0:dst_money=100:src_item=52319,1;:dst_item=0,0;";
		
		String reg = prefixRegular + "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmarket_sell\\b:src_userid=(\\d+):src_roleid=(\\d+):dst_userid=(\\d+):dst_roleid=(\\d+):src_money=(-?\\d+):dst_money=(-?\\d+):src_item=(\\d+),(\\d+);:dst_item=(\\d+),(\\d+);$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"market_sell");
	}
	
	//20
	public void trade() {
		String text = "2013-07-30 15:03:56 game1 gs010: notice:formatlog:trade:src_user_id=320540428:src_player_id=7159869:dst_user_id=235184789:dst_player_id=23101501:src_money=0:dst_money=0:src_item=63307,2;56637,1;13136,9;13717,6;57435,3;57479,3;:dst_item=56716,1;56636,1;56666,2;56580,1;13137,1;56706,1;13136,1;56610,1;70528,4";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btrade\\b:src_user_id=(-?\\d+):src_player_id=(-?\\d+):dst_user_id=(-?\\d+):dst_player_id=(-?\\d+):src_money=(-?\\d+):dst_money=(-?\\d+):src_item=([^:]*):dst_item=([^:]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"trade");
	}
	
	//21
	public void mafia_activity_close() {
		String text = "2013-07-23 21:01:57 backup gs029: notice:formatlog:mafia_activity_close:fid=110604:tid=2074:type=1:dectime=1:normal_exit=1:value=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmafia_activity_close\\b:fid=(-?\\d+):tid=(-?\\d+):type=(-?\\d+):dectime=(-?\\d+):normal_exit=(-?\\d+):value=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mafia_activity_close");
	}
	
	//22
	public void mafia_activity_open() {
		String text = "2013-07-23 19:08:36 database gs030: notice:formatlog:mafia_activity_open:fid=196618:roleid=0:tid=2081:type=0:iswait=0:ret=227";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmafia_activity_open\\b:fid=(-?\\d+):roleid=(-?\\d+):tid=(-?\\d+):type=(-?\\d+):iswait=(-?\\d+):ret=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mafia_activity_open");
	}
	
	//23
	public void instance_begin() {
		String text = "2013-07-23 00:04:32 backup gs014: notice:formatlog:instance_begin:instance_tid=2998:world_id=202223:mode=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\binstance_begin\\b:instance_tid=(-?\\d+):world_id=(-?\\d+):mode=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"instance_begin");
	}
	
	//24
	public void instance_end() {
		String text = "2013-07-23 00:08:39 backup gs026: notice:formatlog:instance_end:instance_tid=2997:world_id=231702:mode=1:member_count=1:add_draw_times=0:last_time=71";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\binstance_end\\b:instance_tid=(-?\\d+):world_id=(-?\\d+):mode=(-?\\d+):member_count=(-?\\d+):add_draw_times=(-?\\d+):last_time=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"instance_end");
	}
	
	//25
	public void roam_rolelogout() {
		String index = "1,2,3,4,5,7,8,9,10,11,12";
		String text = "2013-07-23 00:15:56 backup gdeliveryd: notice:formatlog:roamdsputrole:sid=22:userid=323197009:roleid=109355067:native_zoneid=20539:invader=0:timestamp=4303:level=52:exp=1722271:money=1871:cash_used=0:time_used=97";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\broamdsputrole\\b:sid=(-?\\d+):userid=(-?\\d+):roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):timestamp=(-?\\d+):level=(-?\\d+):exp=(-?\\d+):money=(-?\\d+):cash_used=(-?\\d+):time_used=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, index, "roam_rolelogout");
	}
	
	//26
	public void tiguan_end() {
		String text = "2013-07-23 21:28:38 backup gdeliveryd: notice:formatlog:tiguan_end:src_fid=405550:dest_fid=307246:mode=0:cityid=0:src_win=true";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btiguan_end\\b:src_fid=(-?\\d+):dest_fid=(-?\\d+):mode=(-?\\d+):cityid=(-?\\d+):src_win=([a-z]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"tiguan_end");
	}
	
	//27
	public void tiguan_begin() {
		String text = "2013-07-23 18:06:23 backup gdeliveryd: notice:formatlog:tiguan_begin:src_fid=974866:dest_fid=1351698:mode=0:cityid=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btiguan_begin\\b:src_fid=(-?\\d+):dest_fid=(-?\\d+):mode=(-?\\d+):cityid=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"tiguan_begin");
	}
	
	//28
	public void player_start_parading() {
		String text = "2013-07-23 15:45:02 game1 gs010: notice:formatlog:player_start_parading:roleid=182304786:level=61:prof=5:parading_level=0:member_count=2";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_start_parading\\b:roleid=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):parading_level=(-?\\d+):member_count=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"player_start_parading");
	}
	
	//29
	public void mafia_player_get_activity_reward() {
		String text = "2013-07-23 20:36:56 database gs030: notice:formatlog:mafia_player_get_activity_reward:fid=69667:roleid=482668579:tid=2073:rewardid=2613:ret=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmafia_player_get_activity_reward\\b:fid=(-?\\d+):roleid=(-?\\d+):tid=(-?\\d+):rewardid=(-?\\d+):ret=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mafia_player_get_activity_reward");
	}
	
	//30
	public void player_marry() {
		String text = "2013-07-23 12:06:13 game1 gs010: notice:formatlog:player_marry:roleid=280002574:level=59:prof=6:spouse=502493198";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_marry\\b:roleid=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):spouse=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"player_marry");
	}
	
	//31
	public void mafia_generate_treasure() {
		String text = "2013-07-23 12:51:30 database gs006: notice:formatlog:mafia_generate_treasure:roleid=188805169:item_id=37575:count=1:mafia_id=208945";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmafia_generate_treasure\\b:roleid=(-?\\d+):item_id=(-?\\d+):count=(-?\\d+):mafia_id=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mafia_generate_treasure");
	}
	
	//32
	public void change_face() {
		String text = "2013-07-23 00:08:31 backup gs014: notice:formatlog:change_face:roleid=160620550:level=57:prof=1:item=64306";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bchange_face\\b:roleid=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):item=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"change_face");
	}
	
	//33
	public void player_get_equipment() {
		String text = "2013-07-23 00:03:06 backup gs023: notice:formatlog:player_get_equipment:roleid=691564604:item_id=69232:scene=1515:quality=5:req_level=40:gen_type=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_get_equipment\\b:roleid=(-?\\d+):item_id=(-?\\d+):scene=(-?\\d+):quality=(-?\\d+):req_level=(-?\\d+):gen_type=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"player_get_equipment");
	}
	
	//34
	public void destroy_inst() {
		String text = "2013-07-23 00:04:58 backup gdeliveryd: notice:formatlog:destroy_inst:lineid=28:world_id=182832:wrold_tag=1928:category=1:roleid=128278566:native_zoneid=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bdestroy_inst\\b:lineid=(-?\\d+):world_id=(-?\\d+):wrold_tag=(-?\\d+):category=(-?\\d+):roleid=(-?\\d+):native_zoneid=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"destroy_inst");
	}
	
	//35
	public void create_mafia() {
		String text = "2013-07-23 01:09:50 backup gdeliveryd: notice:formatlog:create_mafia:mafia_id=786456:member_size=6:master=279552024";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bcreate_mafia\\b:mafia_id=(-?\\d+):member_size=(-?\\d+):master=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"create_mafia");
	}
	
	//36
	public void createrole() {
		String text = "2013-07-23 00:05:14 database gamedbd: notice:formatlog:createrole:userid=325816367:account=yuhuang3399:roleid=339836954:origin=0:gender=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bcreaterole\\b:userid=(-?\\d+):account=([^:]*):roleid=(-?\\d+):origin=(-?\\d+):gender=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"createrole");
	}
	
	//37
	public void playerlogout() {
		String text = "2013-07-23 00:01:42 game1 gs013: notice:formatlog:playerlogout:userid=323668209:roleid=608239666:offline_type=2:world_tid=0:scene_tag=2014:x=102.554939:y=85.255371:z=-8.724227:level=53:time_used=453866:exp_delta=0:money_delta=0:bind_money_delta=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayerlogout\\b:userid=(-?\\d+):roleid=(-?\\d+):offline_type=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+):level=(-?\\d+):time_used=(-?\\d+):exp_delta=(-?\\d+):money_delta=(-?\\d+):bind_money_delta=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"playerlogout");
	}
	
	//38
	public void levelup() {
		String index = "1,2,3,5,6,7,8,9,10,11,12,13";
		String text = "2013-07-23 00:01:56 backup gs002: notice:formatlog:levelup:roleid=1543712774:native_zoneid=0:invader=0:level=15:force=6189:time_used=4294:prof=7:cash_used=0:cur_level_time_used=1531:weapon_level=3:defense_level=2:accessory_level=0:scene_tag=67:x=31.700001:y=81.335304:z=-34.899994";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\blevelup\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):level=(-?\\d+):force=(-?\\d+):time_used=(-?\\d+):prof=(-?\\d+):cash_used=(-?\\d+):cur_level_time_used=(-?\\d+):weapon_level=(-?\\d+):defense_level=(-?\\d+):accessory_level=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, index, "levelup");
	}
	
	//39
	public void userlogout() {
		String index = "1,2,3,4,5,7,10,6";
		String text = "2014-03-31 00:02:34 backup glinkd-9: notice:formatlog:userlogout:account=18746622880:userid=281019352:sid=4930:peer=113.69.36.181:mac=4E-D0-5A-5A-77-0D:time=5552:roleid=0:lineid=0:status=0x40001";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\buserlogout\\b:account=([^:]*):userid=([^:]*):sid=([^:]*):peer=([^:]*):mac=([^:]*):time=([^:]*):roleid=([^:]+):lineid=([^:]*):status=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, index, "userlogout");
	}
	
	//40
	public void userlogin() {
		String text = "2014-03-06 06:00:03 game1 glinkd-0: notice:formatlog:userlogin:account=emei17173:userid=360006807:sid=10377:peer=119.187.96.149:mac=E0-CB-4E-B5-1B-C9";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\buserlogin\\b:account=([^:]*):userid=([^:]*):sid=(-?\\d+):peer=([^:]*):mac=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"userlogin");
	}
	
	//41
	public void equip_upgrade() {
		String text = "2013-07-23 00:00:46 database gs012: notice:formatlog:equip_upgrade:roleid=55443507:equip=52519:equip_level=6:equip_exp=4767:equip_upgrade_level=6:cost1=52325:level1=6:is_stone1=0:cost2=52349:level2=6:is_stone2=0:cost3=55357:level3=6:is_stone3=0:cost4=0:level4=0:is_stone4=0:cost5=0:level5=0:is_stone5=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bequip_upgrade\\b:roleid=(-?\\d+):equip=(-?\\d+):equip_level=(-?\\d+):equip_exp=(-?\\d+):equip_upgrade_level=(-?\\d+):cost1=(-?\\d+):level1=(-?\\d+):is_stone1=(-?\\d+):cost2=(-?\\d+):level2=(-?\\d+):is_stone2=(-?\\d+):cost3=(-?\\d+):level3=(-?\\d+):is_stone3=(-?\\d+):cost4=(-?\\d+):level4=(-?\\d+):is_stone4=(-?\\d+):cost5=(-?\\d+):level5=(-?\\d+):is_stone5=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"equip_upgrade");
	}
	
	//42
	public void death() {
		String index = "1,2,3,5,6,7,10,11,12,13,14,15,8";
		String text = "2013-07-23 00:01:01 backup gs020: notice:formatlog:death:roleid=296357894:native_zoneid=0:invader=0:level=59:attacker_id=12009478:attacker_level=59:attacker_zoneid=0:attacker_invader=0:tid=0:world_tid=3548:scene_tag=1405:x=-7.79:y=37.31:z=6.12";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bdeath\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):level=(-?\\d+):attacker_id=(-?\\d+):attacker_level=(-?\\d+):attacker_zoneid=(-?\\d+):attacker_invader=(-?\\d+):tid=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, index, "death");
	}
	
	//43
	public void rolelogin() {
		String index = "1,2,3,4,5,6,8";
		String text = "2013-07-23 00:03:35 backup glinkd-9: notice:formatlog:rolelogin:userid=314285439:trustee=0:roleid=385151026:lineid=6:native_zoneid=0:invader=0:localsid=18214:peer=61.147.110.240";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\brolelogin\\b:userid=(-?\\d+):trustee=(-?\\d+):roleid=(-?\\d+):lineid=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):localsid=(-?\\d+):peer=([^:]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, index, "rolelogin");
	}
	
	//44
	public void task_accept() {
		String text = "2013-07-23 00:00:46 backup gs011: notice:formatlog:task_accept:roleid=601419838:level=49:taskid=4849:taskuniqueid=-1918893278:world_tid=0:scene_tag=75:x=-147.6:y=35.7:z=109.9:msg=DeliverTask";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btask_accept\\b:roleid=(-?\\d+):level=(-?\\d+):taskid=(-?\\d+):taskuniqueid=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+):msg=([a-z,A-Z]+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_accept");
	}
	
	//45
	public void task_failed() {
		String text = "2013-07-23 00:04:19 backup gs011: notice:formatlog:task_failed:roleid=239804431:level=48:taskid=4743:taskuniqueid=-1918893306:world_tid=0:scene_tag=75:x=-175.7:y=32.6:z=48.5:msg=TaskCheckAwardDirect Fail, Timeout";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btask_failed\\b:roleid=(-?\\d+):level=(-?\\d+):taskid=(-?\\d+):taskuniqueid=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+):msg=([a-z,A-Z, ]+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_failed");
	}
	
	//46
	public void task_giveup() {
		String text = "2013-07-23 00:03:32 database gs003: notice:formatlog:task_giveup:roleid=163479608:level=50:taskid=5852:taskuniqueid=581:world_tid=0:scene_tag=81:x=165.7:y=75.7:z=-112.6:msg=DeliverAwardByAwardData";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btask_giveup\\b:roleid=(-?\\d+):level=(-?\\d+):taskid=(-?\\d+):taskuniqueid=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+):msg=([a-z,A-Z, ]+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_giveup");
	}
	
	//47
	public void task_accomplished() {
		String text = "2013-07-23 00:00:32 game1 gs007: notice:formatlog:task_accomplished:roleid=796688394:level=10:taskid=4867:taskuniqueid=-1918893960:world_tid=0:scene_tag=72:x=25.9:y=87.7:z=-28.2:msg=DeliverAwardByAwardData";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\btask_accomplished\\b:roleid=(-?\\d+):level=(-?\\d+):taskid=(-?\\d+):taskuniqueid=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):x=(-?\\d+\\.+\\d+):y=(-?\\d+\\.+\\d+):z=(-?\\d+\\.+\\d+):msg=([a-z,A-Z, ]+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"task_accomplished");
	}
	
	//48
	public void use_vp() {
		String index = "1,2,3,5,6,7,8,9 ";
		String text = "2013-07-23 00:01:02 backup gs011: notice:formatlog:use_vp:roleid=204927035:native_zoneid=0:invader=0:prof=2:level=52:type=0:value=4.000000:left=808.000000";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\buse_vp\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):prof=(-?\\d+):level=(-?\\d+):type=(-?\\d+):value=(-?\\d+\\.+\\d+):left=(-?\\d+\\.+\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, index, "use_vp");
	}
	
	//49
	public void mall_service() {
		String text = "2013-07-23 00:03:59 game1 gs010: notice:formatlog:mall_service:roleid=159092770:userid=319945254:level=55:prof=2:order_id=3:service=2:item=29662:item_expire=-1:item_guid=0,0:item_count=1:gift_tid=0:gift_count=0:payment_type=1:payment_id=0:payment_amount=100:cash_used=40:bind_cash_used=0:cash_left=340:bind_cash_left=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmall_service\\b:roleid=(-?\\d+):userid=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):order_id=(-?\\d+):service=(-?\\d+):item=(-?\\d+):item_expire=(-?\\d+):item_guid=([^:]*):item_count=(-?\\d+):gift_tid=(-?\\d+):gift_count=(-?\\d+):payment_type=(-?\\d+):payment_id=(-?\\d+):payment_amount=(-?\\d+):cash_used=(-?\\d+):bind_cash_used=(-?\\d+):cash_left=(-?\\d+):bind_cash_left=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mall_service");
	}
	
	//51
	public void player_enter_instance() {
		String index = "1,2,3,5,6,8,9";
		String text = "2014-03-06 19:00:00 database gs021: notice:formatlog:player_enter_instance:roleid=27725942:native_zoneid=0:invader=0:level=56:prof=10:world_id=245218:instance_tid=4689:mode=1";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_enter_instance\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):world_id=(-?\\d+):instance_tid=(-?\\d+):mode=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		order(m, index, "player_enter_instance");
	}
	
	//52
	public void player_finish_instance() {
		//String index = "1,2,3,5,6,8,9,10";
		String text = "2014-03-06 15:31:19 backup gs026: notice:formatlog:player_finish_instance:roleid=1090699314:native_zoneid=0:invader=0:level=73:prof=6:world_id=13332:instance_tid=6161:mode=1:score=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bplayer_finish_instance\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=(-?\\d+):level=(-?\\d+):prof=(-?\\d+):world_id=(-?\\d+):instance_tid=(-?\\d+):mode=(-?\\d+):score=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"player_finish_instance");
	}
	
	//54
	public void create_inst() {
		String text = "2013-07-23 00:04:30 backup gdeliveryd: notice:formatlog:create_inst:lineid=24:world_id=359075:wrold_tag=2996:category=0:roleid=138260536:native_zoneid=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bcreate_inst\\b:lineid=(-?\\d+):world_id=(-?\\d+):wrold_tag=(-?\\d+):category=(-?\\d+):roleid=(-?\\d+):native_zoneid=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"create_inst");
	}
	
	//55
	public void mafia_level() {
		String text = "2013-07-23 00:41:10 backup gdeliveryd: notice:formatlog:mafia_level:fid=475154:cur_level=5:master=68251666:domain=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmafia_level\\b:fid=(-?\\d+):cur_level=(-?\\d+):master=(-?\\d+):domain=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"mafia_level");
	}
	
	//56
	public void stockbuycash() {
		String text = "2013-07-23 00:05:51 database gamedbd: notice:formatlog:stockbuycash:roleid=440107014:userid=320185490:order.userid=1127006336:tid=25412:price=79:volume=5000:tax=100";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bstockbuycash\\b:roleid=(-?\\d+):userid=(-?\\d+):order.userid=(-?\\d+):tid=(-?\\d+):price=(-?\\d+):volume=(-?\\d+):tax=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stockbuycash");
	}
	
	//57
	public void stocksellcash() {
		String text = "2013-07-23 00:03:17 database gamedbd: notice:formatlog:stocksellcash:userid=320190681:tid=8233:price=100:volume=500";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bstocksellcash\\b:userid=(-?\\d+):tid=(-?\\d+):price=(-?\\d+):volume=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stocksellcash");
	}
	
	//58
	public void stockcancel() {
		String text = "2013-07-23 00:18:54 database gamedbd: notice:formatlog:stockcancel:userid=238062647:tid=5632:reason=3:volume=500:tax=10:money=47200:cash_add=10890:cash_used=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bstockcancel\\b:userid=(-?\\d+):tid=(-?\\d+):reason=(-?\\d+):volume=(-?\\d+):tax=(-?\\d+):money=(-?\\d+):cash_add=(-?\\d+):cash_used=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stocksellcash");
	}
	
	//59
	public void addcash() {
		String text = "2013-07-23 00:01:48 database gamedbd: notice:formatlog:addcash:userid=1713040208:zoneid=20484:oldserial=1:newserial=2:cash_add=5450:cash_delta=5000:cash_rate=40";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\baddcash\\b:userid=(-?\\d+):zoneid=(-?\\d+):oldserial=(-?\\d+):newserial=(-?\\d+):cash_add=(-?\\d+):cash_delta=(-?\\d+):cash_rate=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"addcash");
	}
	
	//60
	public void shoptrade() {
		String text = "2014-05-15 00:33:52 database gamedbd: notice:formatlog:mall_trade:roleid=15056971:userid=331339278:level=-1:prof=-1:order_id=-1:item=10427:item_expire=0:item_guid=0:item_count=1:gift_tid=0:gift_count=0:payment_type=1:payment_id=0:payment_amount=3000:cash_used=1200:bind_cash_used=0:cash_left=-1:bind_cash_left=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog.+\\bmall_trade\\b:roleid=(\\d+):userid=(\\d+):level=(.+):prof=(.+):order_id=(.+):item=(\\d+):item_expire=(.+):item_guid=(\\d+):item_count=(\\d+):gift_tid=(\\d+):gift_count=(\\d+):payment_type=(\\d+):payment_id=(\\d+):payment_amount=(\\d+):cash_used=(\\d+):bind_cash_used=(\\d+):cash_left=(.+):bind_cash_left=(\\d+)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"shoptrade");
	}
	
	//61
	public void stocktrade() {
		String text = "2013-07-23 00:01:25 backup gs011: notice:formatlog:stocktrade:userid=686821424:tid=323393157:ack_volume=52:ack_money=10:volume=28:money=57849:cash_buy=-1:cash_sell=0";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog.+\\bstocktrade\\b:userid=(\\d+):tid=(\\d+):ack_volume=(-?\\d+):ack_money=(-?\\d+):volume=(\\d+):money=(-?\\d+):cash_buy=(-?\\d+):cash_sell=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"stocktrade");
	}
	
	//62
	public void clear360cash() {
		String text = "2013-07-23 00:01:25 backup gs011: notice:formatlog:clear360:userid=686821424:logintime=12234:cash_delta=21321;1231";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=(.+):cash_delta=(.+?);(.*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360cash");
	}
	
	//63 不好使
	public void clear360item() {
		String text = "2013-07-23 00:01:25 backup gs011: notice:formatlog:clear360:userid=686821424:logintime=12234:cash_delta=asdb;1231";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+formatlog:\\bclear360\\b:userid=(.+):logintime=.+:cash_delta=\\d+?;(.+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"clear360item");
	}
	
	//64  formatlog:ds_stat
	public void onlineuser_new() {
		String text = "2014-03-06 02:18:56 backup gdeliveryd: notice:formatlog:ds_stat:zoneid=20562:uptime=64800:online_user=275:waiting_user=0:accumulate_login=3535";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bds_stat\\b:zoneid=(-?\\d+):uptime=(-?\\d+):online_user=(-?\\d+):waiting_user=(-?\\d+):accumulate_login=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"onlineuser_new");
	}

	public static void main(String[] args) {
		World2FormatLog wa =  new World2FormatLog();
		//wa.sysmail();
		//wa.stone_combine()
		//wa.player_get_valuable_item();
		//wa.equip_embed_stone();
		//wa.equip_unembed_stone();
	//	wa.mail_pack();
		//wa.MarriageSave();
		wa.mid_report();
	//wa.acforbiduser();
//wa.player_get_reward();
	//	wa.modify_reputation();
//	/wa.round_pk_result();
		//wa.mafia_activity_deliver_reward();
		//wa.player_status();
		//wa.market_sell();
		//wa.trade();
		//wa.mafia_activity_close();
		//wa.mafia_activity_open();
		//wa.instance_begin();
		//wa.instance_end();
		//wa.roam_rolelogout();
		//wa.tiguan_end();
		//wa.tiguan_begin();
		//wa.player_start_parading();
		//wa.mafia_player_get_activity_reward();
		//wa.player_marry();
		//wa.mafia_generate_treasure();
		//wa.change_face();
		//wa.player_get_equipment();
		//wa.destroy_inst();
		//wa.create_mafia();
		//wa.createrole();
		//wa.playerlogout();
		//wa.levelup();
		//wa.userlogout();
		//wa.userlogin();
		//wa.equip_upgrade();
		//wa.death();
		//wa.rolelogin();
		//wa.task_accept();
		//wa.task_failed();
		//wa.task_giveup();
		//wa.task_accomplished();
		//wa.use_vp();
		//wa.mall_service();
		//wa.player_enter_instance();
		//wa.player_finish_instance();
		//wa.create_inst();
		//wa.mafia_level();
		//wa.stockbuycash();
		//wa.stocksellcash();
		//wa.stockcancel();
		//wa.addcash();
		wa.shoptrade();
		//wa.stocktrade();
		//wa.clear360cash();
		//wa.clear360item();
		//wa.onlineuser_new();
	}
}
