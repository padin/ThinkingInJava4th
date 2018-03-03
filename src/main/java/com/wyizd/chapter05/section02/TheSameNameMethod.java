package com.wyizd.chapter05.section02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午8:04:16
 * @Title 方法重载
 * @Discription 
 * 同个类下,名称相同,参数类型不同或者顺序不同的方法属于方法重载
 * 
 * 1.方法接收的参数被称为【形参】
 * 2.传入方法的参数被称为【实参】
 * 3.重载尽量不要使用顺序不同的方式，这样很容易混淆
 * 4.当形参是基本数据类型时而实参是一个数字,如果没有对应的形参，那么实参会被提升。
 * 	 
 */

public class TheSameNameMethod {
	/**
	 * 该案例，c是实际参数，a是形式参数
	 * @param args
	 */
	public static void main(String[] args) {
		char c = 'b';
		getMeANum(c);
	}
	public static void getMeANum(int a) { System.out.println("我是接收int的方法");}
	//public static void getMeANum(char a) { System.out.println("我是接收char的方法");}
	public static void getMeANum(byte a) { System.out.println("我是接收byte的方法");}
	public static void getMeANum(short a) { System.out.println("我是接收short的方法");}
	public static void getMeANum(long a) { System.out.println("我是接收long的方法");}
	public static void getMeANum(float a) { System.out.println("我是接收float的方法");}
	public static void getMeANum(double a) { System.out.println("我是接收double的方法");}
}
