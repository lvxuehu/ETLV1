package com.wanmei.test.sw.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Province {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void province() {
		String text ="335085431,1188950302414335041,2,10552101,1192416950119910946,0,100,100,1601,0,0,0,19,4,0,101,10,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,255,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'打下',1,4294967295,4294967295,4294967295,4294967295,4294967295,1,0,c71eb9f840e38afe1ce778f969a0609f,99549,100000,'恶魔的前生'";
		String reg = "(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"province____");
	}
	
	public static void main(String[] args) {
		Province w = new Province();
		w.province();
	}
}
