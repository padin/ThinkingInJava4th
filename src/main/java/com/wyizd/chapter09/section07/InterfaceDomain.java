package com.wyizd.chapter09.section07;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午2:24:30
 * @Title 接口中的域
 * @Discription 在interface 中定义的变量 隐式 修饰了static 和 final
 */
interface MyInterface{
	int A = 123;
	double π = 3.14;
	String name = "localhost";
}

class MyClass implements MyInterface{

	@Override
	public String toString() {
		return "MyClass [A= "+A+",π = "+π+", name = "+name+"]";
	}
	
}

public class InterfaceDomain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass() ;
		System.out.println(myClass);
		
//		myClass.A = 456;
	}
}
