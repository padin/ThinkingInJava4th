package com.wyizd.chapter01.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月20日 下午9:42:23
 * @Title 复用具体实现
 * @Discription 
 * 	一个类可以由其他很多个类组成
 */
public class Composition {
	
}
class Engine {
	
}

class Car {
	private Engine engine;
	public Engine getEngine() {
		return engine;
	}
}
