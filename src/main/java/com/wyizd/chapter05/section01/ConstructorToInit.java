package com.wyizd.chapter05.section01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午7:40:22
 * @Title 使用构造器确保初始化
 * @Discription 
 * 1.构造器方法用于初始化对象
 * 2.构造器的名称与类名相同(为避免与其他成员冲突)
 * 3.无参构造器是默认构造器，如果添加了有参构造器，默认构造器会取消，如果还需要无参构造器，需要显式提供
 * 4.构造器没有返回值，因为new已经代表返回一个对象的引用了。即便如此，你还是可以返回值,但是他就变成一个普通方法了。
 */
class MyClass{
	int value = 0;
	public MyClass() {
		System.out.println("这是默认构造器");
	}
	public MyClass(int para) {
		value = para;
		System.out.println("这是有参构造器");
	}
	public String MyClass(String string) {
		return string;
	}
}

public class ConstructorToInit {
	
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(5);
		String mc3 = new MyClass().MyClass("asdf");
	}

}
