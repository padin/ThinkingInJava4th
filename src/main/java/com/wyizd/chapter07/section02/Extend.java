package com.wyizd.chapter07.section02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午4:20:42
 * @Title 继承语法 
 * @Discription 
 * 1. 当创建一个类，默认继承自Object基类
 * 2. 如果要继承别的类 可以在类标识符后添加 extend 基类类名
 * 3. 实例化导出类时，会先调用基类的块方法，然后会调用基类的构造方法，(并且优先调用无参构造方法)
 */
class S{
	public S() {
		System.out.println("我是S类构造器");
	}
}
class A extends S{
	{
		System.out.println("A类块代码");
	}
	public A() {
		System.out.println("A类无参构造方法");
	}
	public A(int i) {
		System.out.println("A类有参构造方法");
	}
	public void sayHello() {
		System.out.println("A类普通方法");
	}
}
class B extends A{
	{
		System.out.println("B类块代码");
	}
	public B() {
		System.out.println("B类有参构造方法");
	}
	public B(int i) {
		System.out.println("B类有参构造方法");
	}
	public void sayHello() {
		System.out.println("B类普通方法");
		super.sayHello();
	}
	public void sayYes() {
		System.out.println("B类sayYes方法");
	}
}

public class Extend {
	public static void main(String[] args) {
		B b=new B();
		System.out.println("----------------------------------------------");
		B b2=new B(5);
		System.out.println("----------------------------------------------");
		b.sayHello();
		System.out.println("----------------------------------------------");
		b.sayYes();
	}

}
