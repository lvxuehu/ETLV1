package com.wanmei.test.regular;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegular {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("E:\\123.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(f));
		
		String line = br.readLine() ;
		String reg = "^(.*)#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsysmail\\b:sysid=(-?\\d+):sys_type=(-?\\d+):tid=([^:]*):receiver=([^:]*):itemid=(-?\\d+):count=(-?\\d+)$";
		//String reg = "^srbfile=(.+)#srbline=(.+)#srbgame=(.+)#srbip=(.+)#srbgn=(.+)#(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsysmail\\b:sysid=(-?\\d+):sys_type=(-?\\d+):tid=([^:]*):receiver=([^:]*):itemid=(-?\\d+):count=(-?\\d+)$";
		//String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bsysmail\\b:sysid=(-?\\d+):sys_type=(-?\\d+):tid=([^:]*):receiver=([^:]*):itemid=(-?\\d+):count=(-?\\d+)$";
		Pattern p = Pattern.compile(reg);
		
		long strat = System.currentTimeMillis();
		
		while(line != null) {
			//String text = "srbfile=world2.formatlog#srbline=9#srbgame=xa#srbip=172.21.214.254#srbgn=10919#2014-02-18 00:04:29 backup gdeliveryd: notice:formatlog:sysmail:sysid=32:sys_type=3:tid=1074084563:receiver=819503121:itemid=83687:count=1";
			
			
			Matcher m = p.matcher(line);
			
			if(m.find()) {
				int count = m.groupCount();
				
				for(int i = 1; i <= count; i++) {
					//System.out.println(m.group(i));
				}
			}
			
			line = br.readLine() ;
		}
		
		long stop = System.currentTimeMillis();
		
		System.out.println("耗时：____" + (stop - strat));
		//1个G的数据
		//72800;72533（有一点）
		//199320 （全匹配）
		//56105(都没有)
		//(.+) 比 (.*) 快
	}

}
