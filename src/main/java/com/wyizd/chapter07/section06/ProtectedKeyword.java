package com.wyizd.chapter07.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午6:16:57
 * @Title protected 关键字
 * @Discription 
 *  当前类 有属性或方法 需要只能被子类使用的时候，可以使用protected关键字 
 *  	
 */
class MyClass{
	String name;
	protected void setName(String name){
		this.name = name;
	}
}

class MyExClass extends MyClass{
	int age;
	public MyExClass(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class ProtectedKeyword {
	public static void main(String[] args) {
		MyExClass myExClass=new MyExClass("Jack", 28);
		System.out.println(myExClass.name + "-" +myExClass.age);
	}
}
