package com.wyizd.chapter12.section02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午8:33:48
 * @Title 基本异常	
 * @Discription
 * 异常可以处理事务,如果出现什么问题,放弃整个计算就行。
 * 标准异常类有默认构造器，也有带参构造器。
 * 异常类型的根类时throwable。 
 */
public class BasicException {
	public static void main(String[] args) {
		if (true) {
			throw new NullPointerException("args = null");
		}
		System.out.println("接下来的程序");
	}
}
