package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YuanbaoCsvEnd {
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
	public void yuanbao() {
		String text ="366432847,1395490740171,0,0,0,0,0,0,0,0,0,0,0";
		String reg = "(\\d+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"yuanbao___");
	}
	
	//2
	public void cashstat_rest () {
		String text ="366432847,1395490740171,0,0,0,0,0,0,0,0,0,0,0";
		String reg = "(\\d+),.+,(.+),(.+),(.+),(.+),(.+),.+,.+,.+,.+,.+,.+$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"cashstat_rest___");
	}
	
	public static void main(String[] args) {
		YuanbaoCsvEnd w = new YuanbaoCsvEnd();
		//w.yuanbao();
		//w.cashstat_rest();
	}
}
