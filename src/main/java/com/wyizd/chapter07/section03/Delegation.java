package com.wyizd.chapter07.section03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午4:46:07
 * @Title 代理
 * @Discription 
 * 当我们不想继承某个类，但是又想得到该类的部分功能时，可以使用代理
 */
class Butler{
	void clean() {
		System.out.println("打扫");
	}
	void washing() {
		System.out.println("洗涤");
	}
	void other() {
		System.out.println("佣人其他功能");
	}
}
class Rebot{
	Butler butler = new Butler();
	void clean() {
		butler.clean();
	}
	void washing() {
		butler.washing();
	}
	void other() {
		System.out.println("机器人其他功能");
	}
	
}
public class Delegation {
	
	public static void main(String[] args) {
		Rebot rebot = new Rebot();
		rebot.clean();
		rebot.washing();
		rebot.other();
	}
	
}
