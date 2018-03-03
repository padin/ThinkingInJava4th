package com.wyizd.chapter14.section03;

import com.wyizd.commons.Cat;
import com.wyizd.commons.Pet;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午5:30:44
 * @Title instanceOf
 * @Discription 
 * 	语法：
 * 	对象 instanceof 类名  ==> 返回一个boolean 确定该对象是否继承于该类
 * 	Class对象.isInstance(对象2)==> 返回一个boolean 确定该对象2是否继承于Class对象
 */
public class InstanceOf{
	public static void main(String[] args) {
		Pet pet = new Pet();
		Cat cat = new Cat();
		System.out.println(cat instanceof Pet);
		System.out.println(pet.getClass().isInstance(cat));
		
	}
}
