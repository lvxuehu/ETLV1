package com.wanmei.test.regular;

import java.util.StringTokenizer;

/**
 *  java 自带的StringTokenizer 与 jregex的对比
 * 测试结果 java 自带的StringTokenizer 比 jregex 的要快很多
 *@author lihui
 *
 *  2014-3-6  下午12:42:37
 */
public class TestStringTokenizer {


	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		//String str = "sysmail;stone_combine;player_get_valuable_item;equip_embed_stone;equip_unembed_stone;mail_pack;marriageSave;mid_report;acforbiduser;player_get_reward;modify_reputation;round_pk_result;mafia_activity_deliver_reward;player_status;market_sell;trade;mafia_activity_close;mafia_activity_open;instance_begin;instance_end;roam_rolelogout;tiguan_end;tiguan_begin;player_start_parading;mafia_player_get_activity_reward;player_marry;mafia_generate_treasure;change_face;player_get_equipment;destroy_inst;create_mafia;createrole;playerlogout;levelup;userlogout;userlogin;equip_upgrade;death;rolelogin;task_accept;task_failed;task_giveup;task_accomplished;use_vp;mall_service;player_enter_instance;player_finish_instance;create_inst;mafia_level;stockbuycash;stocksellcash;stockcancel;addcash;shoptrade;stocktrade;clear360cash;clear360item";
		String str="xa.world2.formatlog/equip_unembed_stone%srbfile=world2.formatlog#srbline=360172#srbgame=xa#srbip=172.21.207.254#srbgn=10917%2014-02-18 00:04:42	11735049	4639	720	56667	0	0	1";
//		Pattern p = new Pattern(";");
//		
//		for(int i =0 ; i< 100000; i++) {
//			RETokenizer stringTokenizer = new RETokenizer(p,str);
//			//循环遍历
//			while(stringTokenizer.hasMoreElements()) {
//				// 下一个遍历结果
//				String s = stringTokenizer.nextToken().trim();
//				
//			}//680
//		}
		
		for(int i =0 ; i< 1; i++) {
			StringTokenizer gameFileNameFilterStringTokenizer = new StringTokenizer(str,"%");
			//System.out.println(gameFileNameFilterStringTokenizer.nextElement());
			
//			System.out.println(gameFileNameFilterStringTokenizer.countTokens());
//			//循环遍历
//			if(gameFileNameFilterStringTokenizer.hasMoreTokens()) {
//				// 下一个遍历结果
//				String gameFileNameFilterNextToken = gameFileNameFilterStringTokenizer.nextToken();
//				//System.out.println(gameFileNameFilterStringTokenizer.countTokens());
//				//System.out.println(gameFileNameFilterNextToken);
//				//655
//				System.out.println(gameFileNameFilterNextToken);
//			}
			String s1="" ;
			String s2 ="";
			 while(gameFileNameFilterStringTokenizer.hasMoreTokens()) {
				 if(gameFileNameFilterStringTokenizer.hasMoreTokens()) {
					 s1 = gameFileNameFilterStringTokenizer.nextToken();
				 }
				 
				 if(gameFileNameFilterStringTokenizer.hasMoreTokens()) {
					 s2 = gameFileNameFilterStringTokenizer.nextToken();
				 }
			 }
			 
			 System.out.println(s1);
			 System.out.println(s2);
		}
		
//		for(int i =0 ; i< 1000000; i++) {
//			String s = str.split("%")[0];
//			//System.out.println(gameFileNameFilterStringTokenizer.nextElement());
//			//System.out.println(s);
//			
//		}

//		
//		FileInputStream f = new FileInputStream("d:\\3244000.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(f));
//		
//		String line = br.readLine() ;
//		
//		int i = 0;
//		
//		while(line != null) {
		 
			
			

			

			
			//line = br.readLine() ;
			
		//}
	//	System.out.println(i);
		long endTime = System.currentTimeMillis();
		System.out.println("正则耗时:______" + (endTime - startTime));
	}
}
