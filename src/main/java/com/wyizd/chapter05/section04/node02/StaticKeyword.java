package com.wyizd.chapter05.section04.node02;

import com.wyizd.chapter05.section04.node01.ThisKeyword;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午8:48:24
 * @Title static 关键字
 * @Discription 
 * 	static 表示静态的
 * 
 * 1.static方法没有this.
 * 2.static方法不能调用非static方法,反过来可以。
 * 
 */
class MyClass{
	static String string="ABCDEFG";
	public MyClass generayMethod() {
		System.out.println("this is generay method");
		staticMethod(this);
		return this;
	}
	static MyClass staticMethod(MyClass myClass) {
		//generayMethod(); 编译不通过
		System.out.println("this is static method");
		return myClass;
	}
}
public class StaticKeyword {
	
	
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass().generayMethod();
		System.out.println("------------------------------------------------");
		MyClass.staticMethod(myClass).generayMethod();
	}
	

}
