package com.wyizd.chapter01.section07;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月20日 下午10:47:25
 * @Title 伴随多态的可互换对象
 * @Discription 
 * 	有的时候我们经常想把子类当做父类来使用，为了解决这个问题，编译器被设计为 被调用到的代码才能够确定类型。
 * 	编译器只确定调用方法的存在，并检验参数和返回值（这点是和弱类型语言的区别）
 * 	这种方式叫 向上转型的多态
 */
public class Upcasting {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Duck duck=new Duck();
		
		doSomeThing(duck);
		doSomeThing(dog);
	}
	
	public static void doSomeThing(Animal animal) {
		animal.move();
	}
}

class Animal{
	public void move() {}
}
class Dog extends Animal{
	public void move() { System.out.println("狗跳"); }
}
class Duck extends Animal {
	public void move() { System.out.println("鸡飞"); }
}
