package com.wyizd.chapter10.section08;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午6:05:41
 * @Title 为什么需要内部类
 * @Discription 
 * 	内部类使得多重继承的解决方案变得完整。
 * 如下例：	C已经继承A,如果还想使用B的抽象方法,只能使用内部类
 */
class A {}
abstract class B {}
class C extends A{
	B getB() {
		return new B() {
		};
	}
}
public class WhyUseInner {
	static void takesA (A a) {}
	static void takesB (B b) {}
	public static void main(String[] args) {
		C c = new C();
		takesA(c);
		takesB(c.getB());
	}
}
