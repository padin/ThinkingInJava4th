package com.wyizd.chapter11.section01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午7:04:17
 * @Title 泛型和类型安全的容器
 * @Discription 
 * 	
 * Arraylist 是 List 的一个实现类。可以理解为一个集合。
 * add() 方法可以在arraylist对象中存入一个对象。
 * get() 方法可以取出指定对象。
 * 
 * ArrayList<类名> 是泛型的写法，表示该集合只能存放 某类型的数据。
 */
class Apple{
	public String toString() {
		return "一个苹果";
	}
}
class Orange{
	public String toString() {
		return "一个橘子"; 
	}
}
public class GeneralAndSafeConnection {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Apple());
		list.add(new Orange());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		List<Apple> list2 = new ArrayList<>(); 
		list2.add(new Apple());
		Apple apple = list2.get(0);
		System.out.println(apple);
	}
}
