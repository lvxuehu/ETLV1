package com.wanmei.test.iwm.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewRolesbriefCsv {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i <= count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void chardata_inc() {
		//String text ="23055584,1216609328,素颜ζ倾城,7,6,1524,84032750,2,0,0,1396221704,1,0,0,0,0,0,0,6,0";
		
		String text = "1310594,1326392480,@#123@#12,4,4,505,0,0,0,0,1396236684,0,0,0,0,0,0,0,4,0";
		String reg = "(\\d+),(\\d+),([^\n]*?),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d*),(\\d*),(\\d*),(-?\\d*),?(-?\\d*),?(-?\\d*),?(-?\\d*)";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"chardata_inc");
	}
	
	public static void main(String[] args) {
		NewRolesbriefCsv w = new NewRolesbriefCsv();
		w.chardata_inc();
	}
}
