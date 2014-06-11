package com.wanmei.test.zx.regular;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;

public class TerritoryCsv {
	private void systemout(String text,String reg,String methodName) {
		Pattern p = new Pattern(reg);
		Matcher m = p.matcher(text);
		
		if(m.find()) {
			int count = m.groupCount();
			
			for(int i = 1; i < count; i++) {
				System.out.println(m.group(i));
			}
			
			System.out.println(methodName + "________");
		}
	}
	
	//1
	public void territory() {
		String text ="tid=1, owner=0";
		String reg ="tid=(.+),\\ owner=([^:]+)$";
		systemout(text, reg, "territory_______");
	}
	
	public static void main(String[] args) {
		TerritoryCsv w = new TerritoryCsv();
		w.territory();
	}
}
