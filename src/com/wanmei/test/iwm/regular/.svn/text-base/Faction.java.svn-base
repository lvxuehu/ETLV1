package com.wanmei.test.iwm.regular;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;



public class Faction {
	private void systemout(Matcher m,String methodName) {
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i < count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	public void faction() {
		String text ="61519,\"◆依然辉煌◆\",2,26963568,2,1";
		String reg = "(.+),\\042(.*)\\042?,(.+),(.+),(.+),(.+)$";
		
		Pattern p = new Pattern(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"faction");
	}
	
	public static void main(String[] args) {
		Faction w = new Faction();
		w.faction();
	}
}
