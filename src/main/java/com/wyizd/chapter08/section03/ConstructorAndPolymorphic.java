package com.wyizd.chapter08.section03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午7:35:59
 * @Title 构造器与多态性
 * @Discription 构造器的调用顺序,首先会调用Object,然后一层一层的往下调用导出类。
 * 				这样做是确保对象是否被正确的构造(首先要有上帝，上帝说要有光，才会有光。不可以一开始就有光)。
 * 		注意：
 * 			D类继承了C类,
 * 			C类构造调用了doSomeThing方法。在此，调用的是导出类的方法。
 * 			但是导出类的变量值还没来得及初始化,所以,name=null;
 */
class A{
	public A() {System.out.println("A");}
}
class B extends A{
	public B() {System.out.println("B");}
}
class C extends B{
	public C() {System.out.println("C");doSomeThing();}
	void doSomeThing() {
		System.out.println("Methed C");
	}
}
class D extends C{
	String name = "D";
	public D() {System.out.println("D");}
	@Override
	void doSomeThing() {
		System.out.println("Methed D , my Name is " + name );
	}
}
public class ConstructorAndPolymorphic {
	public static void main(String[] args) {
		D d = new D();
	}
}
