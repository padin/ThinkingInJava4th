package com.wyizd.chapter08.section02;

import java.util.Random;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午7:12:51
 * @Title 转机
 * @Discription 
 * 	create 方法 返回的是一个 图像 类型 ,而 创建的却是它的导出类 ，其原理就是 运行时绑定 。
 *  编译器只负责 匹配相同的类型 ，没错 ，圆形，正方形，三角形 都是 图像 类型。
 *  这样做具有可扩展性，如果业务要求 还有一个五角形 ，只需要添加 一个五角形类继承自图像类型,
 *  然后工厂创建方法添加一个五角形就可以了
 *  交给客户使用的main方法根本都不用动。
 *  
 *  注意：private,final,static 是不支持动态绑定的。
 *  
 */
//图像
class Shape{
	public void draw() {};
	public void erase() {};
}
//圆形
class Circle extends Shape{
	public void draw() {System.out.println("画出圆形");};
	public void erase() {};
}
//正方形
class Square extends Shape{
	public void draw() {System.out.println("画出正方形");};
	public void erase() {};
}
//三角形
class Triangle extends Shape{
	public void draw() {System.out.println("画出三角形");};
	public void erase() {};
}
//随机图像生成器
class RandomShapleGenerator{
	private static Random random = new Random();
	public static Shape create() {
		switch (random.nextInt(3)) {
			case 0: return new Circle() ;
			case 1: return new Square() ;
			case 2: return new Triangle() ;
		}
		return null;
	}
}
public class Rove {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = RandomShapleGenerator.create(); 
		}
		for (Shape shape : shapes) {
			shape.draw();
			
		}
	}
}
