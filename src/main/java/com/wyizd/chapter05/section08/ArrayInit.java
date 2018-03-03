package com.wyizd.chapter05.section08;

import java.util.Arrays;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午11:11:45
 * @Title 数组初始化
 * @Discription 
 * 数组：用一个标识符把相同类型封装到一起的序列
 * 定义：在该类型后添加一个方括号   Type[] t;
 * 	   也可以定义在标识符之后 Type t[]; 
 * 初始化：使用花括号(相当于new)	Type[] t = {t1,t2,t3,t4,t5}
 * 
 * 注意：数组也只是引用
 * 
 * Arrays是java.utils包中的类,有一些数组常用工具
 */
public class ArrayInit {
	public static void main(String[] args) {
		int [] a1= {1,2,3,4,5};
		int [] a2;
		a2 = a1;
		
		for(int i = 0; i < a2.length; i++)
			a2[i] +=1;
		
		for(int i = 0; i< a1.length; i++)
			System.out.println("a1["+i+"] = " +a1[i]);
		
		System.out.println(Arrays.toString(a1));
		
	}
}
