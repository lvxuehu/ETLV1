package com.wanmei.test.sw.regular;

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
	public void role_add_exp_vigor() {
		String text ="2013-11-11 00:03:59 :role_add_exp_vigor:uid=338192863:rid=612489551500390842:rlev=7asdsasd;@324^%$%fsdf2:type=0:value=26000:reason=0:param=13420018";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_add_exp_vigor:uid=(.+):rid=(.+):rlev=(.+):type=(.+):value=(.+):reason=(.+):param=(.+)$";
		
		systemout(text, reg, "role_add_exp_vigor_____");
	}
	
	//2
	public void role_die_bymonster() {
		String text ="2013-11-11 00:04:00 :role_die_bymonster:uid=337002853:rid=8106479350:63159863:rlev=35:pro1=8:grade1=2:lev1=20:pro2=-1:grade2=0:lev2=0:pro3=-1:grade3=0:lev3=0:rattack=740:rdefence=923:rteam=0:rduration=0:mid=12605:mname=榄斿寲鍍т汉:mtype=1:mlev=40:sceneid=222:scenex=163.198227:scenez=92.391853";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_die_bymonster:uid=(.+):rid=(.+):rlev=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+):rattack=(.+):rdefence=(.+):rteam=(.+):rduration=(.+):mid=(.+):mname=(.*):mtype=(.+):mlev=(.+):sceneid=(.+):scenex=(.+):scenez=(.+)$";
		
		systemout(text, reg, "role_die_bymonster_____");
	}
	
	//3
	public void role_die_bypk() {
		String text ="2013-11-11 00:09:07 :role_die_bypk:uid=346618307:rid=90071995139258699:rlev=55:pro1=3:grade1=1:lev1=17:pro2=8:grade2=1:lev2=1:pro3=-1:grade3=0:lev3=0:rattack=791:rdefence=1165:rteam=0:rpk=0:rduration=0:reducetizhi=18:reducenum=0:kid=90071995909723642:area=0:klev=60:kpro1=1:kgrade1=3:klev1=40:kpro2=3:kgrade2=2:klev2=23:kpro3=8:kgrade3=1:klev3=1:kattack=3196:kdefence=3757:kteam=0:kpk=0:addtizhi=-1:addnum=-1:sceneid=14:scenex=114.544754:scenez=106.101410";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_die_bypk:uid=(.+):rid=(.+):rlev=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+):rattack=(.+):rdefence=(.+):rteam=(.+):rpk=(.+):rduration=(.+):reducetizhi=(.+):reducenum=(.+):kid=(.+):area=(.+):klev=(.+):kpro1=(.+):kgrade1=(.+):klev1=(.+):kpro2=(.+):kgrade2=(.+):klev2=(.+):kpro3=(.+):kgrade3=(.+):klev3=(.+):kattack=(.+):kdefence=(.+):kteam=(.+):kpk=(.+):addtizhi=(.+):addnum=(.+):sceneid=(.+):scenex=(.+):scenez=(.+)$";
		
		systemout(text, reg, "role_die_bypk______");
	}
	
	//4
	public void role_levelup() {
		String text ="2013-11-11 00:09:08 :role_levelup:uid=343472540:rid=810647934901442395:rlevbefore=18:rlevafter=19:pro1=0:grade1=1:lev1=3:pro2=-1:grade2=0:lev2=0:pro3=-1:grade3=0:lev3=0:exp=67037:vigor=160:coin=220:stone=0:cash=0:worldrep=680:schoolrep=0:guildrep=0:copyrep=0:sportsrep=0:bankcoin=0:bankstone=0:totalonlinetime=1961";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_levelup:uid=(.+):rid=(.+):rlevbefore=(.+):rlevafter=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+):exp=(.+):vigor=(.+):coin=(.+):stone=(.+):cash=(.+):worldrep=(.+):schoolrep=(.+):guildrep=(.+):copyrep=(.+):sportsrep=(.+):bankcoin=(.+):bankstone=(.+):totalonlinetime=(.+)$";
		
		systemout(text, reg, "role_levelup_____");
	}
	
	//5
	public void role_login() {
		String text ="2013-11-11 00:09:10 :role_login:uid=119254038:rid=936748722622010552:rlev=13:rcoin=120:rstone=0:rcash=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_login:uid=(.+):rid=(.+):rlev=(.+):rcoin=(.+):rstone=(.+):rcash=(.+)$";
		
		systemout(text, reg, "role_login_____");
	}
	
	//6
	public void role_logout() {
		String text ="2013-11-11 00:09:10 :role_logout:uid=310039763:rid=810647934764571304:onlinetime=525:rlev=21:pro1=7:grade1=1:lev1=5:pro2=-1:grade2=0:lev2=0:pro3=-1:grade3=0:lev3=0:sceneid=9:scenex=285:scenez=277:rcoin=5986:rstone=0:rcash=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_logout:uid=(.+):rid=(.+):onlinetime=(.+):rlev=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+):sceneid=(.+):scenex=(.+):scenez=(.+):rcoin=(.+):rstone=(.+):rcash=(.+)$";
		
		systemout(text, reg, "role_logout_____");
	}
	
	//7
	public void task_abandon() {
		String text ="2013-11-11 00:10:12 :task_abandon:uid=207079173:rid=756604738239102466:taskid=38004:rlev=62:pro1=0:grade1=3:lev1=55:pro2=3:grade2=1:lev2=1:pro3=-1:grade3=0:lev3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_abandon:uid=(.+):rid=(.+):taskid=(.+):rlev=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+)$";
		
		systemout(text, reg, "task_abandon_____");
	}
	
	//8
	public void task_complete() {
		String text ="2013-11-11 00:10:13 :task_complete:uid=351681581:rid=666532748960411292:taskid=97010:rlev=23:money=0,8760;2,10:exp=12610:item=-1:pro1=3:grade1=1:lev1=7:pro2=-1:grade2=0:lev2=0:pro3=-1:grade3=0:lev3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_complete:uid=(.+):rid=(.+):taskid=(.+):rlev=(.+):money=(.+):exp=(.+):item=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+)$";
		
		systemout(text, reg, "task_complete_____");
	}
	
	//9
	public void activity_participate() {
		String text ="2013-11-11 00:10:13 :activity_participate:uid=351681581:rid=666532748960411292:rlev=23:activityid=51";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+activity_participate:uid=(.+):rid=(.+):rlev=(.+):activityid=(.+)$";
		
		systemout(text, reg, "activity_participate______");
	}
	
	//10
	public void bank_operation() {
		String text ="2013-11-11 00:10:14 :bank_operation:uid=342732221:rid=540431959542779219:op_moneytype=-1:coin=-1:stone=-1:op_itemtype=0:operation_item=13241001,1,562474998760142839";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+bank_operation:uid=(.+):rid=(.+):op_moneytype=(.+):coin=(.+):stone=(.+):op_itemtype=(.+):operation_item=(.+)$";
		
		systemout(text, reg, "bank_operation_____");
	}
	
	//11
	public void bind_item() {
		String text ="2013-11-11 00:10:17 :bind_item:uid=338117821:rid=630503950832586145:item=13080002,3,631154867306534170:reason=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+bind_item:uid=(.+):rid=(.+):item=(.+):reason=(.+)$";
		
		systemout(text, reg, "bind_item_____");
	}
	
	//12
	public void compound_item() {
		String text ="2013-11-11 00:10:17 :compound_item:uid=338117821:rid=630503950832586145:rlev=70:sitemid=13080001:sitemcount=12:titemid=13080002:titemcount=3:usecoin=30";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+compound_item:uid=(.+):rid=(.+):rlev=(.+):sitemid=(.+):sitemcount=(.+):titemid=(.+):titemcount=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "compound_item_____");
	}
	
	//13
	public void consume_item() {
		String text ="2013-11-11 00:10:17 :consume_item:uid=338117821:rid=630503950832586145:rlev=70:item=13080001,12,638474200247686694:reason=7";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+consume_item:uid=(.+):rid=(.+):rlev=(.+):item=(.+):reason=(.+)$";
		
		systemout(text, reg, "consume_item____");
	}
	
	//14
	public void create_item() {
		String text ="2013-11-11 00:10:17 :create_item:uid=338117821:rid=630503950832586145:rlev=70:item=13080002,3,631154867306534170,1:reason=22:param=13080001";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+create_item:uid=(.+):rid=(.+):rlev=(.+):item=(.+):reason=(.+):param=(.+)$";
		
		systemout(text, reg, "create_item_____");
	}
	
	//15
	public void decompound_item() {
		String text ="2013-11-11 00:10:16 :decompound_item:uid=343639529:rid=774619136861279304:rlev=26:itemid=10571102:itemguid=776395963879809203:getitem=13070000,3,776395963879809416:usecoin=5";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+decompound_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):getitem=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "decompound_item____");
	}
	
	//16
	public void enhance_divert_item() {
		String text ="2013-11-11 00:10:18 :enhance_divert_item:uid=349346657:rid=828662335354471473:rlev=55:sid=10561354:sguid=832690976401006015:tid=10561355:tguid=832690976401378666:level=8:moneytype=1:moneyvalue=50";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+enhance_divert_item:uid=(.+):rid=(.+):rlev=(.+):sid=(.+):sguid=(.+):tid=(.+):tguid=(.+):level=(.+):moneytype=(.+):moneyvalue=(.+)$";
		
		systemout(text, reg, "enhance_divert_item____");
	}
	
	//17
	public void enhance_item() {
		String text ="2013-11-11 00:10:20 :enhance_item:uid=348933736:rid=810647934856204622:rlev=23:itemid=10160202:itemguid=812988668628693120:level_b=0:level_a=1:isuserune=0:useitem=13080001,1,811298852400440602:usecoin=0:result=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+enhance_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):level_b=(.+):level_a=(.+):isuserune=(.+):useitem=(.+):usecoin=(.+):result=(.+)$";
		
		systemout(text, reg, "enhance_item_____");
	}
	
	//18
	public void growpoint_gather() {
		String text ="2013-11-11 00:10:20 :growpoint_gather:uid=337003822:rid=810647935115468587:rlev=36:growpointid=5047:type=3:gatheritem=13064102,5,810736847339855147:sceneid=222:scenex=321.949951:scenez=325.712524";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+growpoint_gather:uid=(.+):rid=(.+):rlev=(.+):growpointid=(.+):type=(.+):gatheritem=(.+):sceneid=(.+):scenex=(.+):scenez=(.+)$";
		systemout(text, reg, "growpoint_gather____");
	}
	
	//19
	public void guild_manager() {
		String text ="2013-11-11 00:10:34 :guild_manager:type=6:guildid=8:uid=341021171:rid=756604739528730277:rlev=62";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+guild_manager:type=(.+):guildid=(.+):uid=(.+):rid=(.+):rlev=(.+)$";
		
		systemout(text, reg, "guild_manager____");
	}
	
	//20
	public void guild_member() {
		String text ="2013-11-11 00:10:34 :guild_member:type=0:guildid=8:uid=348720432:rid=756604738398483419:rlev=60";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+guild_member:type=(.+):guildid=(.+):uid=(.+):rid=(.+):rlev=(.+)$";
		
		systemout(text, reg, "guild_member____");
	}
	
	//21
	public void guild_money() {
		String text ="2013-11-11 00:10:34 :guild_money:guildid=8:type=2:change=1:left=75064:reason=3";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+guild_money:guildid=(.+):type=(.+):change=(.+):left=(.+):reason=(.+)$";
		
		systemout(text, reg, "guild_money_____");
	}
	
	//22
	public void guild() {
		String text ="2013-11-11 00:10:58 :guild:type=3:guildid=14:guildmoney=2257:guildlev=4:peoplecount=37:leader=792633535809608579:leaderlev=53";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+guild:type=(.+):guildid=(.+):guildmoney=(.+):guildlev=(.+):peoplecount=(.+):leader=(.+):leaderlev=(.+)$";
		
		systemout(text, reg, "guild____");
	}
	
	//23
	public void inlay_divert_item() {
		String text ="2013-11-11 00:11:10 :inlay_divert_item:uid=1050127552:rid=378302371661543162:rlev=72:sid=10522305:sguid=274244622608971486:tid=10522306:tguid=271429851365534144:attributeid=46705:moneytype=1:moneyvalue=50";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+inlay_divert_item:uid=(.+):rid=(.+):rlev=(.+):sid=(.+):sguid=(.+):tid=(.+):tguid=(.+):attributeid=(.+):moneytype=(.+):moneyvalue=(.+)$";
		
		systemout(text, reg, "inlay_divert_item_____");
	}
	
	//24
	public void inlay_item() {
		String text ="2013-11-11 00:11:14 :inlay_item:uid=349028114:rid=828662332196565593:rlev=55:itemid=10523305:itemguid=832690976401318097:type=1:holenum=1:holeid_b=0:holeid_a=46501:level=0:useitem_id=13100651:useitem_guid=836069633898325279:usecoin=100:result=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+inlay_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):type=(.+):holenum=(.+):holeid_b=(.+):holeid_a=(.+):level=(.+):useitem_id=(.+):useitem_guid=(.+):usecoin=(.+):result=(.+)$";
		
		systemout(text, reg, "inlay_item____");
	}
	
	//25
	public void kill_monster() {
		String text ="2013-11-11 00:11:14 :kill_monster:uid=348436562:rid=828662332471579777:rlev=35:team=0:rattack=697:rdefence=875:rule=1:mid=35501:mlev=20:mtype=1:sceneid=41:scenex=65:scenez=65";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+kill_monster:uid=(.+):rid=(.+):rlev=(.+):team=(.+):rattack=(.+):rdefence=(.+):rule=(.+):mid=(.+):mlev=(.+):mtype=(.+):sceneid=(.+):scenex=(.+):scenez=(.+)$";
		
		systemout(text, reg, "kill_monster_____");
	}
	
	//26
	public void lucky_get() {
		String text ="2013-11-11 00:11:23 :lucky_get:uid=353224118:rid=918734325906264126:rlev=41:type=0:sceneid=8:scenex=295.615845:scenez=160.724625";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+lucky_get:uid=(.+):rid=(.+):rlev=(.+):type=(.+):sceneid=(.+):scenex=(.+):scenez=(.+)$";
		
		systemout(text, reg, "lucky_get_____");
	}
	
	//27
	public void npc_trade() {
		String text ="2013-11-11 00:11:23 :npc_trade:uid=42370186:rid=216172782539995307:rlev=76:flag=1:coin_b=4603077:stone_b=4048:moneytype=0:moneyvalue=1000:npcid=11219:item=13070001,2,166158231551561703";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+npc_trade:uid=(.+):rid=(.+):rlev=(.+):flag=(.+):coin_b=(.+):stone_b=(.+):moneytype=(.+):moneyvalue=(.+):npcid=(.+):item=(.+):ssoagentname=(.+)$";
		
		systemout(text, reg, "npc_trade____");
	}
	
	//28
	public void player_mail() {
		String text ="2013-11-11 00:11:24 :player_mail:srid=702561543839796236:trid=702561544630987876:mailid=666849404200058262:type=0:mailtype=0:mailsize=0:mailfee=110:money=-1:item=13063040,1,667183664325103663";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+player_mail:srid=(.+):trid=(.+):mailid=(.+):type=(.+):mailtype=(.+):mailsize=(.+):mailfee=(.+):money=(.+):item=(.+)$";
		
		systemout(text, reg, "player_mail____");
	}
	
	//29
	public void player_trade_fail() {
		String text ="2013-11-11 00:11:47 :player_trade_fail:suid=353134106:srid=810647934564955681:srlev=35:tuid=11175157:trid=810647936137601847:trlev=41:reason=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+player_trade_fail:suid=(.+):srid=(.+):srlev=(.+):tuid=(.+):trid=(.+):trlev=(.+):reason=(.+)$";
		
		systemout(text, reg, "player_trade_fail_____");
	}
	
	//30
	public void produce_life_skill() {
		String text ="2013-11-11 00:11:47 :produce_life_skill:uid=353104870:rid=810647934552536331:type=0:patternid=100100203:result=0:useitem=13060003,5,815239536434212294;13060023,1,815239673873062115;13060043,1,815239673873062058:mastery=-1:alchemyscore=-1:getitemid=13420009:getitemvalue=1:bind=1:usecoin=100";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+produce_life_skill:uid=(.+):rid=(.+):type=(.+):patternid=(.+):result=(.+):useitem=(.+):mastery=(.+):alchemyscore=(.+):getitemid=(.+):getitemvalue=(.+):bind=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "produce_life_skill____");
	}
	
	//31
	public void purify_item() {
		String text ="2013-11-11 00:11:47 :purify_item:uid=337853603:rid=594475152945007223:rlev=64:itemid=10543253:itemguid=598503795780986869:attributeid=1:level_b=3:level_a=4:usecoin=120:result=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+purify_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):attributeid=(.+):level_b=(.+):level_a=(.+):usecoin=(.+):result=(.+)$";
		
		systemout(text, reg, "purify_item____");
	}
	
	//32
	public void refine_trump() {
		String text ="2013-11-11 00:11:50 :refine_trump:uid=348817507:rid=90071996401579325:rlev=27:trumpid=11000000:trumpguid=90723762426006463:growth_b=531:growth_a=691:useitem=13120001,160,97479329369780802:usecoin=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+refine_trump:uid=(.+):rid=(.+):rlev=(.+):trumpid=(.+):trumpguid=(.+):growth_b=(.+):growth_a=(.+):useitem=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "refine_trump____");
	}
	
	//33
	public void role_revive() {
		String text ="2013-11-11 00:11:54 :role_revive:uid=338709407:rid=648518350546262784:rlev=54:type=3:eater_id=-1:sceneid_b=17:scenex_b=281:scenez_b=429:sceneid_a=17:scenex_a=260:scenez_a=469:usemoneytype=-1:moneyvalue=-1:useitem=-1,-1,-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_revive:uid=(.+):rid=(.+):rlev=(.+):type=(.+):eater_id=(.+):sceneid_b=(.+):scenex_b=(.+):scenez_b=(.+):sceneid_a=(.+):scenex_a=(.+):scenez_a=(.+):usemoneytype=(.+):moneyvalue=(.+):useitem=(.+)$";
		
		systemout(text, reg, "role_revive____");
	}
	
	//34
	public void safe_protect() {
		String text ="2013-11-11 00:35:49 :safe_protect:uid=343124277:rid=828662333360434688:password_b=-1:password_a=mxy283045";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+safe_protect:uid=(.+):rid=(.+):password_b=(.+):password_a=(.+)$";
		
		systemout(text, reg, "safe_protect____");
	}
	
	//35
	public void shengpin_trump() {
		String text ="2013-11-11 00:36:29 :shengpin_trump:uid=336896347:rid=810647933621395707:rlev=30:trumpid=11000000:trumpguid=810735923921747133:qualityid_b=3:qualityid_a=4:growth_b=889:growth_a=1000:useitem=13120101,1,814676577891216263:usecoin=10";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+shengpin_trump:uid=(.+):rid=(.+):rlev=(.+):trumpid=(.+):trumpguid=(.+):qualityid_b=(.+):qualityid_a=(.+):growth_b=(.+):growth_a=(.+):useitem=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "shengpin_trump____");
	}
	
	//36
	public void splayertrade() {
		String text ="2013-11-11 00:36:58 :splayertrade:suid=338749134:srid=450359963193198457:srlev=75:scb=2352731:ssb=1608:tuid=336365735:trid=450359966536845090:stc=0:sts=0:item=13130009,1,454388607704066716;13130006,2,454388607704066736;13130018,1,454388607704066724:tnum=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+splayertrade:suid=(.+):srid=(.+):srlev=(.+):scb=(.+):ssb=(.+):tuid=(.+):trid=(.+):stc=(.+):sts=(.+):item=(.+):tnum=(.+)$";
		
		systemout(text, reg, "splayertrade______");
	}
	
	//37
	public void stall_operation() {
		String text ="2013-11-11 00:37:00 :stall_operation:uid=342712289:rid=720575943365770707:rlev=49:type=0:sceneid=8";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+stall_operation:uid=(.+):rid=(.+):rlev=(.+):type=(.+):sceneid=(.+)$";
		
		systemout(text, reg, "stall_operation______");
	}
	
	//38
	public void tplayertrade() {
		String text ="2013-11-11 00:37:26 :tplayertrade:suid=348985053:srid=936748724681594378:tuid=1784521552:trid=936748725533094760:trlev=27:tcb=183:tsb=0:ttc=0:tts=0:item=-1:snum=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+tplayertrade:suid=(.+):srid=(.+):tuid=(.+):trid=(.+):trlev=(.+):tcb=(.+):tsb=(.+):ttc=(.+):tts=(.+):item=(.+):snum=(.+)$";
		
		systemout(text, reg, "stall_operation______");
	}
	
	//39
	public void transfer_trump() {
		String text ="2014-05-11 09:49:12 :transfer_trump:uid=166067506:rid=108086393268507285:rlev=88:strumpid=11020001:strumpguid=91848820520902771:ttrumpid=11010003:ttrumpguid=94100637520452441:tgrowth_b=81:tgrowth_a=12999:usecoin=2000:ssoagentname=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+transfer_trump:uid=(.+):rid=(.+):rlev=(.+):strumpguid=(.+):ttrumpid=(.+):ttrumpguid=(.+):tgrowth_b=(.+):tgrowth_a=(.+):usecoin=(.+):ssoagentname=(.+)$";
		
		systemout(text, reg, "stall_operation______");
	}
	
	//40
	public void troop_trump() {
		String text ="2013-11-11 00:45:33 :troop_trump:uid=338086309:rid=522417560769761843:rlev=74:trumpid=11020008:trumpguid=527009160282688409:useitemid=-1:useitemguid=-1:type=1:troopindex=3:skillid=10338201:usecoin=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+troop_trump:uid=(.+):rid=(.+):rlev=(.+):trumpid=(.+):trumpguid=(.+):useitemid=(.+):useitemguid=(.+):type=(.+):troopindex=(.+):skillid=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "troop_trump____");
	}
	
	//41
	public void role_profession_levelup() {
		String text ="2013-11-11 00:45:41 :role_profession_levelup:uid=772284448:rid=810647933558346856:rlev=43:pro1=2:grade1=2:lev1=24:pro2=3:grade2=1:lev2=1:pro3=-1:grade3=0:lev3=0:num=0:id=2:grade=2:level=24:usevigor=450:totalonlinetime=201240";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_profession_levelup:uid=(.+):rid=(.+):rlev=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+):num=(.+):id=(.+):grade=(.+):level=(.+):usevigor=(.+):totalonlinetime=(.+)$";
		
		systemout(text, reg, "role_profession_levelup____");
	}
	
	//42
	public void role_profession_upgrade() {
		String text ="2013-11-11 00:45:54 :role_profession_upgrade:uid=335919724:rid=594475152314275859:rlev=43:pro1=8:grade1=2:lev1=19:pro2=5:grade2=1:lev2=1:pro3=-1:grade3=0:lev3=0:num=0:id=8:grade=2:level=19:usevigour=500:useitem=13241000,1,598503795780987669:totalonlinetime=82715";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_profession_upgrade:uid=(.+):rid=(.+):rlev=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+):num=(.+):id=(.+):grade=(.+):level=(.+):usevigour=(.+):useitem=(.+):totalonlinetime=(.+)$";
		
		systemout(text, reg, "role_profession_upgrade____");
	}
	
	//43
	public void buy_item() {
		String text ="2013-11-11 00:45:55 :buy_item:uid=338480919:rid=936748722523637431:rlev=47:itemid=100005:itemcount=1:itemguid=-1:itembind=0:usecash=50:cashleft=100:usescore=-1:scoreleft=-1:order_id=-1:expire=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+buy_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemcount=(.+):itemguid=(.+):itembind=(.+):usecash=(.+):cashleft=(.+):usescore=(.+):scoreleft=(.+):order_id=(.+):expire=(.+)$";
		
		systemout(text, reg, "buy_item____");
	}
	
	//44
	public void stall_trade() {
		String text ="sw#10511#2013-11-11 00:46:03 :stall_trade:suid=324114734:srid=918734325521449421:srlev=21:buid=417299520:brid=918734324036880535:brlev=42:flag=0:tradecoin=-1:tradestone=336:taxcoin=-1:taxstone=14:unitpricecoin=-1:unitpricestone=42:item=13063030,8,921637094810761812";
		String reg = "^(.+)#(\\d{5})+#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+stall_trade:suid=(.+):srid=(.+):srlev=(.+):buid=(.+):brid=(.+):brlev=(.+):flag=(.+):tradecoin=(.+):tradestone=(.+):taxcoin=(.+):taxstone=(.+):unitpricecoin=(.+):unitpricestone=(.+):item=(.+)$";
		
		systemout(text, reg, "role_profession_upgrade____");
	}
	
	//45
	public void raise_star_item() {
		String text ="2013-11-11 00:46:04 :raise_star_item:uid=353641787:rid=810647933592085182:rlev=42:itemid=10561203:itemguid=819180181813278895:type=1:lowstarnum_b=1:lightstarnum_b=2:rate=0:useitem=13090003,1,815239712528127181:result=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+raise_star_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):type=(.+):lowstarnum_b=(.+):lightstarnum_b=(.+):rate=(.+):useitem=(.+):result=(.+)$";
		
		systemout(text, reg, "raise_star_item_____");
	}
	
	//46
	public void recast_item() {
		String text ="2013-11-11 00:46:08 :recast_item:uid=334942581:rid=792633534558874836:rlev=58:itemid=10571355:itemguid=796662179382714514:useitem_id=13150002:useitem_guid=796662179382714517:usecoin=2000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+recast_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):useitem_id=(.+):useitem_guid=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "recast_item____");
	}
	
	//47
	public void inlay_clean_item() {
		String text ="2013-11-11 00:52:44 :inlay_clean_item:uid=333992757:rid=90071992747820006:rlev=77:itemid=10130456:itemguid=90722912021858501:type=2:holenum=1:holeid_b=53000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+inlay_clean_item:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):type=(.+):holenum=(.+):holeid_b=(.+)$";
		
		systemout(text, reg, "inlay_clean_item____");
	}
	
	//48
	public void raisestar_divert_item() {
		String text ="2013-11-11 00:53:31 :raisestar_divert_item:uid=346948106:rid=936748722493668345:rlev=47:sid=10553202:sguid=941341253713334090:tid=10551304:tguid=940777367458001371:raisestarnum=1:lightstarnum=1:moneytype=0:moneyvalue=2000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+raisestar_divert_item:uid=(.+):rid=(.+):rlev=(.+):sid=(.+):sguid=(.+):tid=(.+):tguid=(.+):raisestarnum=(.+):lightstarnum=(.+):moneytype=(.+):moneyvalue=(.+)$";
		
		systemout(text, reg, "inlay_clean_item____");
	}
	
	//49
	public void shengpin_item() {
		String text ="2013-11-11 00:53:34 :shengpin_item:uid=351414451:rid=936748723042834409:rlev=47:itemid_b=10621002:itemguid_b=937399641966936476:itemid_a=10621102:itemguid_a=937399641966936476:useitem=13083000,8,941341288073711734:usecoin=1000";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+shengpin_item:uid=(.+):rid=(.+):rlev=(.+):itemid_b=(.+):itemguid_b=(.+):itemid_a=(.+):itemguid_a=(.+):useitem=(.+):usecoin=(.+)$";
		
		systemout(text, reg, "inlay_clean_item____");
	}
	
	//50
	public void recast_get_attribute() {
		String text ="2013-11-11 00:53:35 :recast_get_attribute:uid=351353114:rid=810647936936906426:rlev=42:itemid=10543304:itemguid=814676577891216533:attrid1=18:attrid2=22:attrid3=12:attrid4=22:attrid5=-1:attrid6=-1:attrid7=-1:attrid8=-1:attrid9=-1:attrid10=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+recast_get_attribute:uid=(.+):rid=(.+):rlev=(.+):itemid=(.+):itemguid=(.+):attrid1=(.+):attrid2=(.+):attrid3=(.+):attrid4=(.+):attrid5=(.+):attrid6=(.+):attrid7=(.+):attrid8=(.+):attrid9=(.+):attrid10=(.+)$";
		
		systemout(text, reg, "recast_get_attribute_____");
	}
	
	//51
	public void star_rune_compund_item() {
		String text ="2013-11-11 00:53:38 :star_rune_compund_item:uid=335191053:rid=252201583178793123:rlev=73:level_b=2:rate=0:result=1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+star_rune_compund_item:uid=(.+):rid=(.+):rlev=(.+):level_b=(.+):rate=(.+):result=(.+)$";
		
		systemout(text, reg, "star_rune_compund_item____");
	}
	
	//52
	public void guild_building_levelup() {
		String text ="2013-11-11 01:15:27 :guild_building_levelup:guildid=3:type=1:level=4:usemoney=5780:useexp=4000:uid=353099938:rid=810647936318946241";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+guild_building_levelup:guildid=(.+):type=(.+):level=(.+):usemoney=(.+):useexp=(.+):uid=(.+):rid=(.+)$";
		
		systemout(text, reg, "guild_building_levelup____");
	}
	
	//53
	public void accountlogout() {
		String text ="2014-05-11 00:04:59 :user_logout:username=18226533367:uid=389653007:userip=120.210.170.188:onlinetime=1166:reason=5:mid=:ssoagentname=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+user_logout:username=(.*):uid=(.+):userip=(.*):onlinetime=(.+):reason=(.+):mid=(.*):ssoagentname=(.+)$";
		
		systemout(text, reg, "accountlogout____");
	}
	
	//54
	public void money_consume() {
		String text ="2013-11-11 00:53:39 :money_consume:uid=348684313:rid=774619139349862664:rlev=54:type=0:before=106602:after=106002:change=600:reason=6:param1=10521255:param2=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+money_consume:uid=(.+):rid=(.+):rlev=(.+):type=(.+):before=(.+):after=(.+):change=(.+):reason=(.+):param1=(.+):param2=(.+)$";
		
		systemout(text, reg, "money_consume_____");
	}
	
	//55
	public void money_produce() {
		String text ="2013-11-11 00:53:39 :money_produce:uid=349590811:rid=936748722524439555:rlev=30:type=5:before=3200:after=3300:change=100:reason=4:param=13650301";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+money_produce:uid=(.+):rid=(.+):rlev=(.+):type=(.+):before=(.+):after=(.+):change=(.+):reason=(.+):param=(.+)$";
		
		systemout(text, reg, "money_produce______");
	}
	
	//56
	public void player_team() {
		String text ="2013-11-11 00:53:49 :player_team:uid=338078196:rid=522417560769761811:pro1=0:grade1=4:lev1=66:pro2=8:grade2=2:lev2=20:pro3=5:grade3=2:lev3=20:operation=1:teamid=46:teammember=1:rlev=74:teampos=0:pickuptype=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+player_team:uid=(.+):rid=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+):operation=(.+):teamid=(.+):teammember=(.+):rlev=(.+):teampos=(.+):pickuptype=(.+)$";
		
		systemout(text, reg, "player_team____");
	}
	
	//57
	public void role_create() {
		String text ="2013-11-11 00:54:14 :role_create:uid=1585841200:rid=936748722572389899:rsex=1:birthday=19700101";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_create:uid=(.+):rid=(.+):rsex=(.+):birthday=(.+)$";
		
		systemout(text, reg, "role_create_____");
	}
	
	//58
	public void task_accept() {
		String text ="2013-11-11 00:54:18 :task_accept:uid=239870681:rid=810647935480932434:taskid=100031:rlev=36:pro1=5:grade1=2:lev1=21:pro2=-1:grade2=0:lev2=0:pro3=-1:grade3=0:lev3=0";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+task_accept:uid=(.+):rid=(.+):taskid=(.+):rlev=(.+):pro1=(.+):grade1=(.+):lev1=(.+):pro2=(.+):grade2=(.+):lev2=(.+):pro3=(.+):grade3=(.+):lev3=(.+)$";
		
		systemout(text, reg, "task_accept_____");
	}
	
	//59
	public void user_login() {
		String text ="2014-05-11 22:28:11 :user_login:username=yanbao20021165:uid=333992757:userip=118.239.250.12:usermac=:mid=:ssoagentname=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+user_login:username=(.+):uid=(.+):userip=(.+):usermac=(.*):mid=(.*):ssoagentname=(.+)$";
		
		systemout(text, reg, "user_login_____");
	}
	
	//60
	public void addcash() {
		String text ="2014-05-14 00:03:22 :yuanbao_recharge:userid=356626020:oldserial=24:newserial=25:yuanbao_before=0:yuanbao_after=5000:totalyuanbao_before=139600:totalyuanbao_after=144600:rechargevalue=5000:ssoagentname=-1:sso_orderid=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+yuanbao_recharge:userid=([^:]*):oldserial=([^:]*):newserial=([^:]*):yuanbao_before=([^:]*).+:rechargevalue=([^:]*):ssoagentname=([^:]*)";
		
		systemout(text, reg, "addcash______");
	}
	
	//61
	public void forbid_login() {
		String text ="2014-05-14 00:03:22 :yuanbao_recharge:userid=356626020:oldserial=24:newserial=25:yuanbao_before=0:yuanbao_after=5000:totalyuanbao_before=139600:totalyuanbao_after=144600:rechargevalue=5000:ssoagentname=-1:sso_orderid=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+yuanbao_recharge:userid=([^:]*):oldserial=([^:]*):newserial=([^:]*):yuanbao_before=([^:]*).+:rechargevalue=([^:]*):ssoagentname=([^:]*)";
		
		systemout(text, reg, "forbid_login____");
	}
	
	//62
	public void onlineuser() {
		String text ="2014-05-14 00:06:46 :online_user:current_peoplenum=292:current_machinenum=182:maxnum_online=292";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+) :online_user:current_peoplenum=(\\d+)";
		
		systemout(text, reg, "onlineuser_____");
	}
	
	//63
	public void player_eat() {
		String text ="2014-05-14 00:06:46 :player_eat:uid=389428035:rid=1261007896498466675:eatid=80035:tizhitype=0:tizhinum=1:ssoagentname=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+player_eat:uid=(.+):rid=(.+):eatid=(.+):tizhitype=(.+):tizhinum=(.+):ssoagentname=(.+)$";
		
		systemout(text, reg, "player_eat____");
	}
	
	//64
	public void player_marry() {
		String text ="2014-05-11 15:10:35 :player_marry:source_uid=387270083:source_rid=1242993498800559693:source_rlev=51:target_uid=316864653:target_rid=1242993498633366779:target_rlev=51:marry_operation_type=0:sssoagentname=-1:tssoagentname=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+player_marry:source_uid=(.+):source_rid=(.+):source_rlev=(.+):target_uid=(.+):target_rid=(.+):target_rlev=(.+):marry_operation_type=(.+):sssoagentname=(.+):tssoagentname=(.+)$";
		
		systemout(text, reg, "player_marry____");
	}
	
	//65
	public void role_soulbaby_eat() {
		String text ="2014-05-14 00:07:14 :role_soulbaby_eat:uid=336475977:rid=144115191807896304:rlev=82:eater_b=228:eater_a=230:eaterchange=2:targetuid=336758254:targetrid=144115190514426273:targetlev=81:target_b=77:target_a=75:targetchange=2:ssoagentname=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+role_soulbaby_eat:uid=(.+):rid=(.+):rlev=(.+):eater_b=(.+):eater_a=(.+):eaterchange=(.+):targetuid=(.+):targetrid=(.+):targetlev=(.+):target_b=(.+):target_a=(.+):targetchange=(.+):ssoagentname=(.+)$";
		
		systemout(text, reg, "role_soulbaby_eat___");
	}
	
	//66
	public void shoptrade() {
		String text ="2014-05-14 00:07:15 :buy_item:uid=390110568:rid=1261007896660600950:rlev=32:itemid=100002:itemcount=1:itemguid=-1:itembind=0:usecash=100:cashleft=8750:usescore=-1:scoreleft=-1:order_id=-1:expire=-1:ssoagentname=qiyouwang";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+:buy_item:uid=(\\d+):rid=(\\d+):rlev=(\\d+):itemid=(\\d+):itemcount=(-?\\d+):itemguid=(-?\\d+):itembind=(-?\\d+):usecash=(-?\\d+):cashleft=(-?\\d+):usescore=(-?\\d+):scoreleft=(-?\\d+):order_id=(-?\\d+):expire=(-?\\d+):ssoagentname=([^:]*)";
		
		systemout(text, reg, "shoptrade____");
	}
	
	//67
	public void yuanbao_pick() {
		String text ="2014-05-14 00:14:33 :yuanbao_pick:userid=389997069:reason=0:recharge_serial=1:old_pick_serial=0:new_pick_serial=1:yuanbao_before=1000:yuanbao_after=0:pick_value=1000:ssoagentname=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+yuanbao_pick:userid=(.+):reason=(.+):recharge_serial=(.+):old_pick_serial=(.+):new_pick_serial=(.+):yuanbao_before=(.+):yuanbao_after=(.+):pick_value=(.+):ssoagentname=(.+)$";
		
		systemout(text, reg, "yuanbao_pick____");
	}
	
	//68
	public void yuanbao_recharge() {
		String text ="2014-05-14 00:19:43 :yuanbao_recharge:userid=276907947:oldserial=0:newserial=1:yuanbao_before=0:yuanbao_after=100:totalyuanbao_before=0:totalyuanbao_after=100:rechargevalue=100:ssoagentname=-1:sso_orderid=-1";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+yuanbao_recharge:userid=(.+):oldserial=(.+):newserial=(.+):yuanbao_before=(.+):yuanbao_after=(.+):totalyuanbao_before=(.+):totalyuanbao_after=(.+):rechargevalue=(.+):ssoagentname=(.+):sso_orderid=(.+)$";
		
		systemout(text, reg, "yuanbao_recharge_____");
	}
	
	public static void main(String[] args) {
		World2FormatLog w = new World2FormatLog();
		//w.accountlogout();
		//w.transfer_trump();
		//w.user_login();
		w.addcash();
		//w.onlineuser();
		//w.player_eat();
		//w.player_marry();
		//w.role_soulbaby_eat();
		//w.shoptrade();
		//w.yuanbao_pick();
		//w.yuanbao_recharge();
	}
}
