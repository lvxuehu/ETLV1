package com.wanmei.test.xa.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FamilyUser {
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
	public void familyuser() {
		String text = "241668,16388,纳兰大壞蛋,53,大商,1371880226,1372234255";
		
		String reg = "(\\d+),(-?\\d+),([^\n]*),(-?\\d+),([^\n]*),(-?\\d+),(-?\\d+)$";
	
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"familyuser");
	}
	
	public static void main(String[] args) {
		FamilyUser r = new FamilyUser();
		r.familyuser();
	}
}
