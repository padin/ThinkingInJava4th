package com.wyizd.chapter05.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午10:23:22
 * @Title 成员初始化
 * @Discription 
 * 1.	变量在定义时，会得到一个默认值;
 * 2.	变量必须赋值才可以操作。（否则会编译不通过）
 * 3.	基本数据类型的默认值为0(尽管char没有给出),引用数据类型为null.
 * 4.	为变量初始化值时可以直接赋值
 */
class MyClass{
	int i;
	double d;
	float f = 123;
	char c;
	short s;
	String string;
	MyClass myClass;
	
}
public class MenberInit {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		System.out.println(myClass.i);
		//System.out.println(i++);
		System.out.println(myClass.d);
		System.out.println(myClass.c);
		System.out.println(myClass.f);
		System.out.println(myClass.string);
		System.out.println(myClass.myClass);
	
	}

}
