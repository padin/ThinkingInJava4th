package com.wyizd.chapter10.section10;

import java.io.IOError;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午6:36:56
 * @Title 覆盖内部类
 * @Discription 覆盖没有什么用。
 */
class Outer{
	class Inner{
		void sayHello() {System.out.println("hello");}
	}
}
public class OverrideInner extends Outer{
	class Inner{
		void sayHello() {System.out.println("你好");}
	}
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.sayHello();
		new Outer().new Inner().sayHello();
	}

}
