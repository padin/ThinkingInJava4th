package com.wyizd.chapter13.section01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午10:10:25
 * @Title 不可变String 
 * @Discription 
 * 如下例所示：
 *  对象b拿到a的引用，当修改b的时候，按道理是修改a.实则不然。a并没有被修改。
 */
public class StringNaverChange {
	public static void main(String[] args) {
		String a = "abcdefg";
		String b = a;
		b =  "hijklmn";
		System.out.println(a);
		System.out.println(b);
		
	}
}
