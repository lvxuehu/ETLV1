package com.wanmei.test.sdsxs.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RolesbriefCsv {
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
		String text = "312197669,90122,★|丶轻语_ζ,1,190,2,3,0,446,0,0,0,0,0,840,1368873048,0,0,0,0,0,0,0,0,794,0,1368873352,0,0,6122114,0,0,0,0,0,0,0,39,0,0,407,0,0,0,0";
		
		String reg = "(\\d+),(\\d+),([^\n]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*),([^,]*)";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"chardata");
	}
	
	public static void main(String[] args) {
		RolesbriefCsv s = new RolesbriefCsv();
		s.chardata();
	}
}
