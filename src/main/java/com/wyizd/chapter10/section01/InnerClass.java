package com.wyizd.chapter10.section01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午3:25:53
 * @Title 内部类
 * @Discription 
 * 	内部类只对外部类提供访问,可以作为代码隐藏机制使用
 */

class Outer{
	class Inner{
		void sayHello() {System.out.println("hello");};
	}
	Inner getInner() {
		return new Inner();
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getInner().sayHello();
	}
}
