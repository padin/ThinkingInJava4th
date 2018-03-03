package com.wyizd.chapter07.section01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午4:00:35
 * @Title 组合语法
 * @Discription
 * 组合技术：只需将对象引用置于新类即可 
 */
class OldClass{
	String someThing;
}
class NewClass{
	OldClass oldClass;
	public NewClass() {
		oldClass = new OldClass();
	}
	@Override
	public String toString() {
		return "NewClass [oldClass=" + oldClass + "]";
	}
	
}
public class Component {
	public static void main(String[] args) {
		NewClass newClass  = new NewClass();
		System.out.println(newClass);
	}
}
