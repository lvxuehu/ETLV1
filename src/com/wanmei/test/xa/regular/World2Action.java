package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class World2Action {
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
	public void join_team() {	
		String text = "2014-03-06 07:00:07 backup gdeliveryd: info:join_team:roleid=2323374089:teamid=3586:world_tid=0:scene_tag=101:mirror_id=2:join_type=1.";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bjoin_team\\b:roleid=(-?\\d+):teamid=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):mirror_id=(-?\\d+):join_type=(.+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"money_dec");
	}
	
	//2
	public void leave_team() {	
		String text = "2014-03-06 07:00:03 backup gdeliveryd: info:leave_team:roleid=1342566464:teamid=1143:world_tid=0:scene_tag=83:mirror_id=2:leave_type=0:team_time=2407.";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bleave_team\\b:roleid=(-?\\d+):teamid=(-?\\d+):world_tid=(-?\\d+):scene_tag=(-?\\d+):mirror_id=(-?\\d+):leave_type=(-?\\d+):team_time=(.+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"money_dec");
	}
	
	//3
	public void money_dec() {
		String text = "2013-07-25 07:00:26 database gs003: info:money_dec:roleid=148873231:native_zoneid=0:invader=0:prof=7:level=59:dec_type=9:money_type=0:value=-16";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmoney_dec\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=-?\\d+:prof=(-?\\d+):level=(-?\\d+):dec_type=(-?\\d+):money_type=(-?\\d+):value=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"money_dec");
	}
	
	//4
	public void money_inc() {
		String text = "2013-07-25 07:00:28 game1 gs001: info:money_inc:roleid=489730092:native_zoneid=0:invader=0:prof=3:level=39:inc_type=1:money_type=0:value=261";
		
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bmoney_inc\\b:roleid=(-?\\d+):native_zoneid=(-?\\d+):invader=-?\\d+:prof=(-?\\d+):level=(-?\\d+):inc_type=(-?\\d+):money_type=(-?\\d+):value=(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"money_inc");
	}
	
	public static void main(String[] args) {
		World2Action wa =  new World2Action();
		//wa.join_team();
		//wa.leave_team();
		wa.money_dec();
		//wa.money_inc();
	}
}
