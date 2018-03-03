package com.wyizd.chapter09.section02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午9:59:21
 * @Title 接口
 * @Discription 
 * 	接口比抽象类 更近一步，所有方法都是抽象方法。
 *  如果想要创建一个接口，需要将interface关键字代替class关键字。
 *  如果想要一个类遵循 某个接口 ， 需要使用implements 关键字，表示该类要描述如何工作。
 *  
 *  注意：接口中的抽象方法必须是public,不写也是public
 *  
 */
interface Instrument{
	void play();
}

class Wind implements Instrument{
	@Override
	public void play() {
		System.out.println("风管乐演奏");
	}
}
public class Interface{
	public static void main(String[] args) {
		Instrument instrument = new Wind();
		instrument.play();
	}
}
