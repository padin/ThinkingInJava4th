package com.wyizd.chapter03.section04.node01;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午6:22:12
 * @Title 方法调用中别名的问题
 * @Discription 
 * 下列案例说明：
 * 	f1接收的是 对象，但其实接收到的是引用 
 * 		所以操作其引用结果是改变了 该对象
 * 
 *  f2接收的是基本类型，其实接收的是一个数字或值，
 *  	在其作用域结束之后， 并没有改变到作用域外的那个 π
 */

class Letter{
	char c;
}

public class IssueOfMethod {
	
	public static void main(String[] args) {
		Letter letter = new Letter();
		letter.c='A';
		System.out.println("letter.c="+letter.c);
		f1(letter);
		System.out.println("letter.c="+letter.c);
		
		float π=(float) 3.14;
		System.out.println("进入方法前：π="+π);
		f2(π);
		System.out.println("退出方法后π="+π);
		
		
	}
	static void f1(Letter l) {
		l.c='Z';
	}
	static void f2(float f) {
		f+=1;
		System.out.println("在方法体中π="+f);
	}

}
