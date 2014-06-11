package com.wanmei.test.sw.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuildlevelRank {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void guildlevel_rank() {
		String text ="335085431,12,123";
		String reg = "(-?\\d+),(-?\\d+),(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"guildlevel_rank___");
	}
	
	public static void main(String[] args) {
		GuildlevelRank w = new GuildlevelRank();
		w.guildlevel_rank();
	}
}
