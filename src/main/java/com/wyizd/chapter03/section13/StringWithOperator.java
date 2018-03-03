package com.wyizd.chapter03.section13;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午8:33:39
 * @Title 字符串操作符 + +=
 * @Discription 
 * 当String与数字进行操作的时候，会将字符串与数字拼接
 * 当String与对象进行操作的时候，会将字符串与对象的特征码拼接
 */
public class StringWithOperator {
	
	public static void main(String[] args) {
		int i = 100;
		int j = 100;
		String s = "100+100=";
		
		System.out.println(s+i+j);
		
		s+=200;
		System.out.println(s);
		
		
		s+=new StringWithOperator();
		System.out.println(s);
		
	}

}
