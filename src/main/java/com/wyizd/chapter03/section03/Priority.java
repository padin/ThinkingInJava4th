package com.wyizd.chapter03.section03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午5:55:01
 * @Title 优先级
 * @Discription 
 * 	优先级规则：先乘除后加减
 * 			如有括号 先算最里的括号
 * 	
 */
public class Priority {

	public static void main(String[] args) {
		
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x +(y - 2)/(2 + z);
		
		System.out.println("a = " +a + ",b = "+ b);
		
	}
	
}
