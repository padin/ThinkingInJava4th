package com.wyizd.chapter02.section03.node02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 上午11:33:18
 * @Title 对象的作用域
 * @Discription 
 * 	由new创建的对象,如果超出了作用域范围，就无法再访问
 * 	但是它会一直存在下去。直到垃圾回收器释放这些对象的内存空间
 * 	这样做的好处是不用担心忘记释放空间的问题(也就是内存泄漏)
 */
public class ScopeOfObject {
	{
		String string = new String("something");
	}

}
