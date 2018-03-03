package com.wyizd.chapter09.section01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午9:52:23
 * @Title 抽象类和抽象方法
 * @Discription 
 * 	在之前的例子，在基类中创建一个空方法作为接口，让导出类重写其特色。
 * 	但是如果基类被实例化，调用到这个空方法，这是危险的，因为没有任何意义。
 *  
 *  为此，java提供了 抽象方法，这种方法没有方法体。含有抽象方法的类必须显式注明抽象类。
 *  语法：
 *  abstract返回值 方法名();
 */

abstract class Instrument{
	abstract void play();
}
class Wind extends Instrument{
	@Override
	void play() {
		System.out.println("风管乐演奏");
	}
}

public class AbstractClassAndMethod {
	public static void main(String[] args) {
		Instrument instrument = new Wind();
		instrument.play();
	}
}
