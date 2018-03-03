package com.wyizd.chapter05.section07.node03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午11:02:44
 * @Title 显式的静态初始化
 * @Discription 
 * 静态块与非静态块常用于初始化工作
 * 静态块与非静态块只会运行一次(因为不能调用)
 * 静态块不能为非静态成员赋值,非静态块可以为所有成员赋值
 */
class MyClass{
	static int i ;
	double d;
	
	static {
		i=1;
		//d=1.0;
	}
	{
		i=1;
		d=2.5;
	}
}
public class StaticBlock {
	public static void main(String[] args) {
		MyClass myClass= new MyClass();
		System.out.println(myClass.i);
		System.out.println(myClass.d);
	}
}
