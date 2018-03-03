package com.wyizd.chapter03.section05;

import java.util.Random;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午6:51:08
 * @Title 随机数
 * @Discription 
 * 	程序要么是确定性，要么是不确定性。
 * 	不确定性依靠随机数决定
 * 
 * 	随机数的生成可以使用random类对象
 */
public class ClassRandom {
	
	public static void main(String[] args) {
		
		System.out.println(new Random().nextInt());
		System.out.println(new Random().nextFloat());
		System.out.println(new Random().nextLong());
		System.out.println(new Random().nextDouble());		
		
	}

}
