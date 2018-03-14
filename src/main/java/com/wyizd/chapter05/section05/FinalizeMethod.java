package com.wyizd.chapter05.section05;

import java.time.DayOfWeek;

import javax.print.attribute.standard.MediaSize.Other;


/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午9:27:18
 * @Title finalize
 * @Discription
 * 	finalize 方法用来处理 对象被垃圾回收器 回收前需要做的事(但是垃圾回收期不一定会执行,也不知道什么时候执行)
 *  finalize 方法内不能处理异常，程序会继续运行。
 *  System.gc() 可以告诉垃圾回收器 清理一遍 不再使用的对象
 */

class MyClass{
	String id;
	String stats="OPEN";
	public MyClass(String id) {
		this.id=id;
	}
	@Override
	protected void finalize() throws Throwable {
		stats="CLOSE";
		System.out.println("我是编号："+id+" ,调用了finalize方法");
		System.out.println("stats="+this.stats);
		super.finalize();
	}
}

public class FinalizeMethod {
		public static void main(String[] args) throws Throwable {
			MyClass myClass=new MyClass("89757");
			System.out.println("stats="+myClass.stats);
			MyClass myClass2=new MyClass("9527");
			myClass=myClass2;
			System.gc();
		}
}
