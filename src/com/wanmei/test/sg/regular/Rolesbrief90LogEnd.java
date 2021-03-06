package com.wanmei.test.sg.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rolesbrief90LogEnd {
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
		String text ="27162,'丨非法聚众丨',5,3257546,10,2014-03-20 13:01:14,0,0,0,1,5153,'丨巅峰丨永恒丨',1,1,19,69459,0,105,";
		String reg = "(.+),(\\d+),\\042(.*)\\042?,(\\d+),(.+),(.+),(.+),(.+),(.+),(.+),(-?\\d+\\.\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"chardata");
	}
	
	public static void main(String[] args) {
		Rolesbrief90LogEnd w = new Rolesbrief90LogEnd();
		w.chardata();
	}
}
