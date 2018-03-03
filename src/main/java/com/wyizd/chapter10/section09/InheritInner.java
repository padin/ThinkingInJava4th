package com.wyizd.chapter10.section09;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午6:27:51
 * @Title 继承内部类
 * @Discription 
 * 	需要在扩展类的 构造方法中 调用 外部类的super() 方法,不然编译不过。
 */
class Outer{
	class Inner{};
} 
public class InheritInner extends Outer.Inner{
	public InheritInner(Outer o) {
		o.super();
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		InheritInner inheritInner =new InheritInner(outer);
	}
}
