package com.wyizd.chapter10.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午4:49:36
 * @Title 局部内部类
 * @Discription 
 * 	在方法中可以使用内部类。这相当于是一种包装，方法的返回值这里使用了向上转型。
 */
interface Destination{ String readLabel(); }
class Parce{
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			public String readLabel() {	return label;}
			
		}
		return new PDestination(s);
	}
}

public class ClassInMethod {
	public static void main(String[] args) {
		Parce parce = new Parce();
		Destination destination = parce.destination("塔斯马尼亚州");
		System.out.println(destination.readLabel());
	}

}
