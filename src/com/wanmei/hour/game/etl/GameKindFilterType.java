package com.wanmei.hour.game.etl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.hadoop.mapreduce.Mapper.Context;

import com.wanmei.game.jregex.Pattern;
import com.wanmei.game.tool.GameTool;

/**
 * 笑傲的xa.world2.action 的正则表达式过滤
 *@author lihui
 *
 *  2013-8-4  下午01:16:03
 */
public class GameKindFilterType {
	/*
	 * 正则解析每一行的内容
	 * 获得过滤的内容
	 */
	@SuppressWarnings("rawtypes")
	public static List<String> getFilterContent(String yesterday,String gameFileName,String prefix,String[] gameKindFilterTypeSplit,String line,String gameKindName,Properties pro,Map <String,Pattern> patternMap,Context context) {
		//循环迭代
		//sysmail;stone_combine;player_get_valuable_item;equip_embed_stone;分割后成为split
		for(int i = 0; i < gameKindFilterTypeSplit.length; i++) {
			//游戏种类过滤类型 下一个
			String gameKindFilterTypeNextToken = gameKindFilterTypeSplit[i];//stone_combine
			
			//快照类游戏
			String gameKindSnapshot = pro .getProperty(gameKindFilterTypeNextToken + ".snapshot");//roleskill.snapshot=true
			
			//如果是快照
			if(gameKindSnapshot != null) {//如果是快照，就使用下面的方法处理
				return GameSnapshotKind.etl(yesterday,gameFileName,prefix,gameKindFilterTypeNextToken, line, patternMap, context,pro);
			}else {
				//游戏种类特殊过滤的类型关键key
				String gameKindSpecialFilterKey = pro .getProperty(gameKindFilterTypeNextToken + ".special.filter.key");
				
				//如果有特殊 关键字
				if(gameKindSpecialFilterKey != null) {
					//没有切开返回 null,line中没有特殊关键字，跳过循环，继续判断正则。
					if(!GameTool.contains(GameTool.getUTF8String(gameKindSpecialFilterKey), line)) {
						continue;
					}
				}else {
					//没有切开返回 null，line中没有普通关键字也跳过这次循环，继续判断正则。
					if(!GameTool.contains(gameKindFilterTypeNextToken, line)) {
						continue;
					}
				}
				
				//不需要解析的组
				String noNeedEtlGroup = pro.getProperty(gameKindFilterTypeNextToken + ".no.need.etl.group");

				//不需要etl的组，直接通过分割符号分割，取得不需要解析的关键字，如果line中的确有这个关键字，说明这行不需要解析，直接返回一个空的list。解析
				//此line的工作结束。
				if(noNeedEtlGroup != null) {
					StringTokenizer colonStringTokenizer = new StringTokenizer(noNeedEtlGroup,pro.getProperty("game.split.symbol"));
					
					while(colonStringTokenizer.hasMoreTokens()) {
						//如果包含不需要解析的组号
						if(line.contains(colonStringTokenizer.nextToken())) {
							return new ArrayList<String>();
						}
					}
				}
				
				//不可以包含的关键字
				String canNotContainKey = pro.getProperty(gameKindFilterTypeNextToken + ".can.not.contain.key");
				
				if(canNotContainKey != null) {
					//包含不能包含的关键字则 直接返回
					if(line.contains(canNotContainKey)) {
						return new ArrayList<String>();
					}
				}
				
				//必须包含的关键字
				String mustContainKey = pro.getProperty(gameKindFilterTypeNextToken + ".must.contain.key");
				
				//必须包含的关键字
				if(mustContainKey != null) {
					StringTokenizer colonStringTokenizer = new StringTokenizer(mustContainKey,pro.getProperty("game.split.symbol"));
					
					while(colonStringTokenizer.hasMoreTokens()) {
						//如果不包含必须包含的关键字
						if(!line.contains(colonStringTokenizer.nextToken())) {
							return new ArrayList<String>();
						}
					}
				}
				
				//过滤的关键字都一样
				//clear360cash.has.same.filter.key=clear360
				String sameFilterKey = pro.getProperty(gameKindFilterTypeNextToken + ".has.same.filter.key");
				
				//存在
				if(sameFilterKey != null) {
					return GameSameFilterKeyKind.etl(pro,prefix, line, patternMap, context, gameFileName, sameFilterKey);
				}else {
					//说明一个文件是多个正则
					//每个正则的关键字还不一致
					String hasIndexNumber = pro.getProperty(gameKindFilterTypeNextToken + ".has.index.number");
					
					//获取正确的文件名称
					if(hasIndexNumber != null) {
						//真的文件名称 //stone_combine-》stone
						String realFileName = GameTool.getRealFileName(gameKindFilterTypeNextToken);//stone_combine
						
						
						//prefix=//xa.world2.formatlog/
						//contain_key 计数器加1
						GameTool.countContainKeyNumber(prefix + realFileName, context);//xa.world2.formatlog/stone
					}else{
						//通过了说明包含解析的key
						GameTool.countContainKeyNumber(prefix + gameKindFilterTypeNextToken, context);//xa.world2.formatlog/stone_combine
					}
					

					//mid_report.matcher.index=1,2,3,4,5,7,8,9,6
					String gameMatcherIndex = pro .getProperty(gameKindFilterTypeNextToken + ".matcher.index");
					//游戏 分组 trade.combination.index=8;9
					String combinationIndex = pro .getProperty(gameKindFilterTypeNextToken + ".combination.index");
					
					//多个 正则的数量 accountlogin.multiple.regular.number=2
					String multipleRegularNumber =  pro.getProperty(gameKindFilterTypeNextToken + ".multiple.regular.number");
					
					//StringTokenizer 方式分割
					String stringTokenizerColumn = pro.getProperty(gameKindFilterTypeNextToken + ".string.tokenizer.filter.key");
					
					//如果 需要指定匹配顺序 stone_combine.regular.filter.key=(\\d+-\\d+-\\d+\\s+\\d+:\\d+:\\d+).+\\bstone_combine\\b:roleid=(-?\\d+):combiner=(
					if(gameMatcherIndex != null) {
						return GameDisorderKind.etl(prefix,gameKindFilterTypeNextToken, gameMatcherIndex, line, patternMap,context);
					}//组合
					else if(combinationIndex != null) {
						return  GameCombinationKind.etl(prefix,gameKindFilterTypeNextToken, combinationIndex, line, patternMap,context);
					}else if(multipleRegularNumber != null){
						return GameMultipleRegularKind.etl(prefix, multipleRegularNumber, gameKindFilterTypeNextToken, line, patternMap, context, pro);
					}else if(stringTokenizerColumn != null) {
						return GameStringTokenizerCommonKind.etl(stringTokenizerColumn, prefix, pro, gameFileName, gameKindFilterTypeNextToken, line, context);
					} else{
						return GameRegularCommonKind.etl(prefix,pro, gameFileName, gameKindFilterTypeNextToken, line, patternMap, context);
					}
				}
			}
		}
		
		return new ArrayList<String>();
	}
}
