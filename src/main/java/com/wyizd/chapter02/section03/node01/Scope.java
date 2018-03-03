package com.wyizd.chapter02.section03.node01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 上午11:21:11
 * @Title 作用域
 * @Discription 
 * 	作用域决定了在其内定义的变量的可见性和生命周期
 * 		作用域由花括号的位置决定。
 * 		作用域内定义的变量只能在作用域范围内生效
 * 	
 */
public class Scope {
	int scopeA;
	{
		int scopeA;
	}
	void method() {
		int scopeA;
	}
	
	

}
