package com.wanmei.hour.game.etl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.hadoop.mapreduce.Mapper.Context;

import com.wanmei.game.jregex.Matcher;
import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameTool;

/**
 * 游戏无序 类型etl
 *@author lihui
 *
 *  2014-3-13  下午01:41:16
 */
public class GameDisorderKind {
	/**
	 * 日志处理
	 * @param gameKindFilterType 游戏的文件名
	 * @param gameMatcherIndex 解析的顺序
	 * @param line 读取的一行
	 * @param pro 配置文件
	 * @param patternMap
	 * @return
	 * prefix="mid_report/"
	 * mgameKindFilterType=mid_report
	 * gameMatcherIndex=mid_report.matcher.index=1,2,3,4,5,7,8,9,6
	 * s_ln=157543#srbip=172.22.71.254#srbgn=11142# 2014-05-30 00:09:07 backup gs002: notice:formatlog:playerlogout:userid=393844740:roleid=2127310970:offline_type=2:world_tid=0:scene_tag=68:x=-5.000000:y=54.052612:z=-129.000000:level=31:time_used=15364:exp_delta=0:money_delta=0:bind_money_delta=0
	 * 2014-05-30 00:00:00	11142	393844740	2127310970	offical		2	31	0	1!s_ln=2251#srbip=172.22.71.254#srbgn=11142
	 * 
	 * 
	 * mid_report=^(.+)#(\d+-\d+-\d+\s+\d+:\d+:\d+).+\bmid_report\b:userid=(-?\d+):roleid=(-?\d+):mid=([^:]*)[:]*mac=([^:]*):minimode=(-?\d+):prof=(-?\d+):level=(-?\d+):cash_add=(-?\d+)$
	 */
	@SuppressWarnings("rawtypes")
	public static List<String> etl(String prefix,String gameKindFilterType,String gameMatcherIndex,String line,Map <String,Pattern> patternMap,Context context) {
		//切分的开
		//s_ln=157543#srbip=172.22.71.254#srbgn=11142# 2014-05-30 00:09:07 backup gs002: notice:formatlog:playerlogout:userid=393844740:roleid=2127310970:offline_type=2:world_tid=0:scene_tag=68:x=-5.000000:y=54.052612:z=-129.000000:level=31:time_used=15364:exp_delta=0:money_delta=0:bind_money_delta=0
		Pattern pattern = patternMap.get(gameKindFilterType);//得到切分规则 stone_combine.regular.filter.key=(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bstone_combine\\b:roleid=(-?\\d+):combiner=(

		//如果map中不存在
		if(pattern == null) {
			return new ArrayList<String>();
		}
		
		Matcher matcher = pattern.matcher(line);
		
		//如果匹配上了
		if(matcher.find()) {
			//计数器 //prefix=xa.world2.formatlog/  gamekindfitertype=stone_combine->xa.world2.formatlog/stone_combine
			GameTool.countAnalyzeKeyNumber(prefix + gameKindFilterType, context);
			
			//切割字符 gameMatcherIndex=1,2,3,4,5,7,8,9,6
			StringTokenizer st = new StringTokenizer(gameMatcherIndex,",");
			
			//没切出来
			if(st.countTokens() == 1) {
				return new ArrayList<String>();
			}
			
			//存储 位置
			int indexArray[] = new int[st.countTokens()];
			
			//最大位置的值
			int maxIndex = 0;
			//位置
			int step = -1;
			
			//遍历循环
			while(st.hasMoreTokens()) {
				try{
					//顺序次位
					int index = Integer.parseInt(st.nextToken().trim());
					
					//找出最大的位置
					if(index > maxIndex) {
						maxIndex = index;
					}
					
					//++
					step ++;
					//加入顺序
					indexArray[step] = index;
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			//如果最大的位置 比 解析出来的 数量 还大 说明
			//位置设置的有问题
			if(maxIndex > (matcher.groupCount() - 2)) {
				return new ArrayList<String>();
			}
			
			StringBuilder sb = new StringBuilder();
			
			//唯一标识
			String uniqueMark = "";
			
			//循环  最后一个不要 
			//		m.group(1) = s_ln=16506#srbip=172.22.71.254#srbgn=11142
//					m.group(2) = 2014-05-30 00:00:01
//					m.group(3) = 385439706
//					m.group(4) = 14446714
//					m.group(5) = offical
//					m.group(6) = 94-DE-80-C3-A6-E5
//					m.group(7) = 1
//					m.group(8) = 10
//					m.group(9) = 70
			//indexArray[0]=1
//2014-05-30 00:00:01	11142	385439706	14446714	offical	94-DE-80-C3-A6-E5	10	70	4320	1!s_ln=16506#srbip=172.22.71.254#srbgn=11142			
			for(int i = 1; i <= indexArray.length; i++) {
				if(i == 1) {
					//第一个字段就是唯一标识的 s_ln=3#srbip=172.20.217.254#srbgn=10404
					uniqueMark = matcher.group(i);
				}
				else {
					//匹配的内容
					String matcherString = matcher.group(indexArray[i - 2] + 1);
					
					//如果为 空 字符串
//					if(StringUtils.isBlank(matcherString)) {
//						matcherString = " ";
//					}
					
					//其他的是 etl 解析的
					sb.append(matcherString + "\t");
				}
			}
		    
			//最后匹配上的
			//1,2,3,4,5,7,8,9,6
			String lastMatcher = matcher.group(indexArray[indexArray.length - 1] + 1);
			
			//如果为空
//			if(StringUtils.isBlank(lastMatcher)) {
//				//加入最后一行 解析 解决最后一位不需要
//				//制表符的问题
//				sb.append(" ");
//			}else{
				sb.append(lastMatcher);
//		/	}
			
				

//s_ln=3#srbip=172.20.217.254#srbgn=10404#8196,"天涯海阁",4,149,2,12204870,0,3:3:3:0:3:3:3:0:0:0:3,622698,70173,0,,14418,0,0,2,3,,81924	
//2014-05-28	10404	8196	天涯海阁	4	149	2	12204870	0	3:3:3:0:3:3:3:0:0:0:3	622698	70173	0		14418	0	0	2	3		81924!s_ln=3#srbip=172.20.217.254#srbgn=10404
//faction.regular.filter.key=(\\d+),\\042(.*)\\042?,(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),([^,]*),(-?\\d+),(-?\\d+),(-?\\d+),([^,]*),(-?\\d+),(-?\\d+),(-?\\d+),(-?\\d+),([^,]*),([^,]*),([^,]*)$
				
				
			//在最后面 加入唯一标识
			sb.append("!").append(uniqueMark);
			
			//唯一标识按“=” 切割 
			StringTokenizer stringTokenizer =  new StringTokenizer(uniqueMark,"=");	
			
			//	取得服务器组号
			String  groupNumnber = GameTool.getStringTokenizerLastValue(stringTokenizer) + "\t";
			
			//20 这个位置是时间日期的长度 不会改变
			sb.insert(20,groupNumnber);
			
			//截取 日期 2014-03-05
			String date = sb.substring(0, 10);
			
			gameKindFilterType = GameTool.FILE_NAME_PREFIX + gameKindFilterType;

			//prefix=//xa.world2.formatlog/
			//字符串样式etl内容!唯一标识%生成文件的目录  %2013-09-23//xa.world2.formatlog/gamelog_xa_world2.formatlog/gamelog_xa_world2.formatlog
			sb.append("%").append(date).append("/").append(prefix).append(gameKindFilterType).append("/").append(gameKindFilterType);
			
			List <String> list = new ArrayList<String>();
			list.add(sb.toString());
			
			return list;
		}
		
		return new ArrayList<String>();
	}
}
