package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Family {
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
	public void family() {
		//String text = "20546,小萝莉,4,煞,1374929582";
		//String text = "9568270,cl,,6,l,1392572759";
		String text = "20546,123*,4,煞,1374929582";
		
		String reg = "(\\d+),([^\n]*),(-?\\d+),([^\n]*),(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"family");
	}
	
	public static void main(String[] args) {
		Family r = new Family();
		r.family();
	}
}
