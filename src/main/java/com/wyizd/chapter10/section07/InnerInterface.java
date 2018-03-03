package com.wyizd.chapter10.section07;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午5:15:29
 * @Title 接口内部类
 * @Discription
 * 	在接口内嵌套内部类 
 * 	为实现类提供一些可重复代码
 * 	好像没有什么用
 */
interface MyInterface{
	void add();
	class Test implements MyInterface{
		@Override
		public void add() {
			System.out.println("save");
		}
	}
	static void defaultAdd() {
		new Test().add();
	}
}

class MyInterfaceImpl implements MyInterface{
	@Override
	public void add() {
		MyInterface.defaultAdd();
	}
}

public class InnerInterface {
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.add();
	}
}
