package com.wyizd.chapter01.section08;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月20日 下午11:38:21
 * @Title 单根继承结构
 * @Discription 
 * 	java采取单根继承结构，所有的类都继承于Object
 * 		1.那么所有的类都是同一个类型，这样带来了编程的灵活性。
 * 		2.所有对象都可以得到Object的功能，提高了编程的效率
 */
public class SingleRoot {
	public static void main(String[] args) {
		SingleRoot singleRoot=new SingleRoot();
		System.out.println(singleRoot.toString());
		System.out.println(singleRoot.getClass());
		System.out.println(singleRoot.hashCode());
	}
}
