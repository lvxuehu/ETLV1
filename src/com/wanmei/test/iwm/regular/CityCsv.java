package com.wanmei.test.iwm.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CityCsv {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void factionmap() {
		String text ="8,1,81728,0,0,0,0,0,1395979222,1,0,0,180000000";
		String reg = "(.?\\d+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"factionmap");
	}
	
	public void city() {
		String text ="4,1,81888,0,0,0,0,0,1395979222,6,0,0,180000000";
		//String text = "id,level,owner,occupy_time,challenger,deposit,cutoff_time,battle_time,bonus_time,color,status,timeout,maxbonus";
		String reg = "(.?\\d+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"factionmap");
	}
	
	public static void main(String[] args) {
		CityCsv w = new CityCsv();
		//w.factionmap();
		w.city();
	}
}
