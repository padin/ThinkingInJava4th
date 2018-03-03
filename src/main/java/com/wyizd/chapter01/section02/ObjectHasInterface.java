package com.wyizd.chapter01.section02;
/**
 * 
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月20日 下午9:07:18
 * @Title 每个对象都有一个接口
 * @Discription 一个类实际上就是一个数据类型
 * 	类描述了具有相同特性(元素)和行为(方法)的对象集合
 * 
 * 	
 *
 */
public class ObjectHasInterface {
	//特性
	private String name="padin";
	//行为
	public void sayName() {
		System.out.println("my name is "+name);
	}
	public static void main(String[] args) {
		//声明类型			 //对象名称    //使用new构造出对象
		ObjectHasInterface object=new ObjectHasInterface();
		//使用对象的功能
		object.sayName();
		
	}
	
}
