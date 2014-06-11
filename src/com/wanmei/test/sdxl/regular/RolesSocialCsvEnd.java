package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RolesSocialCsvEnd {
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
	public void roles_social() {
		String text ="348043051,234721408,352384,0,0,0,0";
		String reg = "(\\d+),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"roles_social___");
	}
	
	public static void main(String[] args) {
		RolesSocialCsvEnd w = new RolesSocialCsvEnd();
		//w.cash_change();
		w.roles_social();
	}
}
