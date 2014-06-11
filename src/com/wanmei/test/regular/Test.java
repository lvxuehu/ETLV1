package com.wanmei.test.regular;

import java.util.Map;
import java.util.Properties;

import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameProperties;
import com.wanmei.hour.game.etl.GameFileType;

public class Test {


	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
		Properties pro = GameProperties.getProperties("xa");
		Map <String,Pattern> map = GameFileType.getPatternMap(pro);
		String prefixString = "srbfile=world2.formatlog#srbline=5996#srbgame=xa#srbip=172.21.198.254#srbgn=11022#";
//		
//		FileInputStream f = new FileInputStream("d:\\3244000.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(f));
//		
//		String line = br.readLine() ;
//		
//		int i = 0;
//		
//		while(line != null) {
		    String text = prefixString + "2014-02-18 00:04:42 game1 gs007: notice:formatlog:equip_unembed_stone:roleid=11735049:equip=4639:money=720:stone1=56667:stone2=0:stone3=0:bind=1";
		 
			String filePath = "xa.world2.formatlog.1.08";
			
		   String filterMap =null;
			   //GameFileType.getFilterContentByFilePath(filePath, text, pro,map);
			

			
			if(filterMap != null) {
//				String fileName = filterMap.get(GameFileType.KEY);
//				String content = filterMap.get(GameFileType.VALUE);
				
//				System.out.println("fileName___" + fileName);
//				System.out.println("content____" + content);
			}
			
			//line = br.readLine() ;
			
		//}
	//	System.out.println(i);
		long endTime = System.currentTimeMillis();
		System.out.println("正则耗时:______" + (endTime - startTime));
		
		String sub = "123456";
		System.out.println(sub.substring(1));
	}
}
