package com.wanmei.test.sdxl.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatLog {
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
	public void chatvip() {
		String text ="2014-05-19 00:16:09 chat_vip:from=2691:userid=389828759:roleid=83140739:shapeid=1010108:school=14:lev=69:type=1:msg=PFQgdD0i5pS2NjDnuqflpb3pnovlrZDvvIzmnInljZbnmoRNTU0iIGM9IkZGRkZGRkZGIj48L1Q+PEUgZT0iMjAiPjwvRT4=";
		String reg = "(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+)\\s+chat_vip:from=(\\d+):userid=(\\d+):roleid=(\\d+):shapeid=(\\d+):school=(\\d+):lev=(\\d+):type=(\\d+):msg=(.*)$";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(text);
		
		systemout(m,"chatvip____");
	}
	
	public static void main(String[] args) {
		ChatLog w = new ChatLog();
		w.chatvip();
	}
}
