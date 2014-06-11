package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RolesCsvEnd {
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
	public void chardata() {
		String text ="390663672,118833283,1010109,11,25,1132,0,72433,146073,0,0,0,1400238171323,85,0,1400239804880,灬未語淚先流ぃ〞,536398,3687,0,0";
		String reg = "(\\d+),(\\d+),(\\d+),(\\d+),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),(.+),([^,]*),([^,]*),([^,]*),([^,]*)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"chardata_____");
	}
	
	public static void main(String[] args) {
		RolesCsvEnd w = new RolesCsvEnd();
		w.chardata();
	}
}
