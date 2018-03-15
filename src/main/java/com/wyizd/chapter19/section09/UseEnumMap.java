package com.wyizd.chapter19.section09;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午6:06:03 
 * @Title 使用EnumMap
 * @Discription 
 * 	EnumMap是专为enum设计的Map
 * 	键必须使用enum
 */
interface Command{void action();}
enum AlarmPoints{
	STAIR1,STAIR2,LOBBY,OFFICE1,OFFICE2,OFFICE3; 
}
public class UseEnumMap {
	public static void main(String[] args) {
		EnumMap<AlarmPoints, Command> em = new EnumMap<>(AlarmPoints.class);
		em.put(AlarmPoints.OFFICE1, new Command() {
			@Override
			public void action() {
				System.out.println("work in office1");
			}
		});
		em.put(AlarmPoints.LOBBY, new Command() {
			@Override
			public void action() {
				System.out.println("rest in lobby");
			}
		});
		
		for (Map.Entry<AlarmPoints, Command> a : em.entrySet()) {
			a.getValue().action();	
		}
	}
}
