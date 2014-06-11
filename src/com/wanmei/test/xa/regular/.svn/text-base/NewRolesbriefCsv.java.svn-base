package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewRolesbriefCsv {
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
	public void chardata_inc() {
		String text = "2,16,默认角色女,0,1,0,0,0,0,0,1364847615,-1,-1,-1";
		
		String reg = "(\\d+),(\\d+),([^\n]*?),(\\d+),(\\d+),(\\d+),(\\d+),(-?\\d*),?(-?\\d*),?(-?\\d*),?(-?\\d*),?(-?\\d*),?(-?\\d*),?(-?\\d*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"recast_equip");
	}
	
	public static void main(String[] args) {
		NewRolesbriefCsv r = new NewRolesbriefCsv();
		r.chardata_inc();
	}
}

