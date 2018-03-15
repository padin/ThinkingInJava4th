package com.wyizd.chapter19.section08;

import java.util.EnumSet;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午5:52:55 
 * @Title 使用EnumSet代替标志
 * @Discription 
 */
enum AlarmPoints{
	STAIR1,STAIR2,LOBBY,OFFICE1,OFFICE2,OFFICE3; 
}
public class UseEnumSet {
	public static void main(String[] args) {
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
		points.add(AlarmPoints.LOBBY);
		System.out.println(points);
		points.addAll(EnumSet.of(AlarmPoints.STAIR1,AlarmPoints.STAIR2));
		System.out.println(points);
		points.addAll(EnumSet.allOf(AlarmPoints.class));
		System.out.println(points);
		points.removeAll(EnumSet.of(AlarmPoints.STAIR1,AlarmPoints.STAIR2));
		System.out.println(points);
		points.removeAll(EnumSet.range(AlarmPoints.OFFICE1,AlarmPoints.OFFICE2));
		System.out.println(points);
		points=EnumSet.complementOf(points);
		System.out.println(points);
		
	}
}
