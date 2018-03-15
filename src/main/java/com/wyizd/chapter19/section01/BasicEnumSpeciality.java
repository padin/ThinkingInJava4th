package com.wyizd.chapter19.section01;
/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午4:55:23 
 * @Title 基本enum特性 
 * @Discription 
 * 
 */
enum state{OK,FAIL}
public class BasicEnumSpeciality {
	public static void main(String[] args) {
		for(state s : state.values()) {
			System.out.println(s);
			System.out.println(s.ordinal());
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
		}
	}
}
