package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoleSkill {
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
	public void roleskill() {
		String text = "1728573,2014-03-05 23:03:39,23:24:25:26:860:862:871:875:878:2230:2232:2233:2239:2241:2242:2244:2245:2246:2248:2711:2797:3104:3106:3107:3108:3114:3591:4584:4585:4586:4589:4778:4779:4780:4781:4782:4783:4784:5415:5469:5470:6111:6114:6115:6287:6289:6295:6296:6297:6298:7789:8455:8456:8457:8458:8459:8460:8461:8635:8949:8951:";
		//String text = "roleid,lastlogin_time,skills";
		String reg = "(\\d+),([^,]*),([^,]*)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"recast_equip");
	}
	
	public static void main(String[] args) {
		RoleSkill r = new RoleSkill();
		r.roleskill();
	}
}
