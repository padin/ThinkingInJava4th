package com.wyizd.chapter02.section07;

import java.util.Date;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午1:15:35
 * @Title 你的第一个java程序
 * @Discription 
 * 	import 表示引入一个额外的类，如import java.util.Date;
 * 		而对于System来说,java.lang包是自动导入的，可以直接使用java.lang包下的类。
 * 		我们可以发现，out,是System类下的一个静态属性，所以可以直接 以System使用
 */
public class YourFirstJavaProgram {
	
	public static void main(String[] args) {
		System.out.println("hello , it's ");
		System.out.println(new Date());
		System.out.println("I'm ");
		System.out.println(System.getProperty("user.name"));
		System.out.println("path:");
		System.out.println(System.getProperty("java.library.path"));
	}

}
