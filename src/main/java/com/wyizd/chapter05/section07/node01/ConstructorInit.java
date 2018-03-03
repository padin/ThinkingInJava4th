package com.wyizd.chapter05.section07.node01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午10:33:56
 * @Title 构造器初始化顺序
 * @Discription 
 * 成员变量首先会被初始化
 * 其次到构造方法
 * 
 */
class Window{
	public Window(int marker) {
		System.out.println("窗户被建造"+marker);
	}
}
class House{
	Window window = new Window(1);
	public House() {
		System.out.println("房屋被建造");
		window = new Window(2);
	}
}
public class ConstructorInit {
	public static void main(String[] args) {
		House house = new House();
	}
}
