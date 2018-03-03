package com.wyizd.chapter07.section08.node02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午8:12:05
 * @Title Final 方法
 * @Discription final 关键字修饰于方法 表示 该方法不可重写
 */
class MyClass{
	final void finalMethod() {
		System.out.println("this is finalMethod" );
	}
}

public class FinalMethod extends MyClass{
//	void finalMethod() {};  		编译不通过
}
