package com.wyizd.chapter12.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:21:39
 * @Title 异常说明
 * @Discription 
 */
public class ExceptionExplain {
	public static void main(String[] args) {
		ExceptionExplain ee = new ExceptionExplain();
		ee.f();
	}
	void f() throws NullPointerException,RuntimeException{
		System.out.println("method f");
	}
}
