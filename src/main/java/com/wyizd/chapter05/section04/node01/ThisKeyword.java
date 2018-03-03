package com.wyizd.chapter05.section04.node01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午8:22:51
 * @Title this 关键字
 * @Discription 
 * 当你需要在方法中返回本对象时，或方法形参与成员变量名称相同时，你可以使用this关键字
 * 
 * 1.this关键字表示当前对象
 * 2.构造器中，可以使用this关键字调用构造器
 * 
 */

class MyClass{
	int value = 12345;
	public MyClass() {
		this(55555);
	}
	public MyClass(int value) {
		this.value=value;
	}
	public MyClass returnThisObject() {
		return this;
	}
	public int returnThisValue(int value) {
		return this.value;
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		MyClass myClass=new MyClass().returnThisObject();
		System.out.println(myClass.returnThisValue(54321));
	}
}
