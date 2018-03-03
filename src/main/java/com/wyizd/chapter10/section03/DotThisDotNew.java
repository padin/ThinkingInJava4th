package com.wyizd.chapter10.section03;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午4:07:19
 * @Title .this 与 .new
 * @Discription 当想在内部类使用外部类引用是 可以使用.this 当想使用外部类对象创建内部类时，可以是用 .new
 * 
 *              示例：
 */
class Outer {
	public class Inner {
		Outer getOuter() {
			return Outer.this;
		}
		void sayHello() {System.out.println("I'm Inner");}
	}
	void sayHello() {System.out.println("I'm Outer");}
}

public class DotThisDotNew {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.sayHello();
		Outer o2 = inner.getOuter();
		o2.sayHello();
	}
}
