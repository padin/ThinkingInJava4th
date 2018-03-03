package com.wyizd.chapter13.section05;

import java.util.Formatter;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午11:11:21
 * @Title 格式化输出
 * @Discription 
 * 	类型转换：
 * 	整数型	Unicode		boolean		String		浮点数	浮点数(科学计数)		字符%
 * 	d		c			b			s			f		e				%
 */
public class Format {
	Formatter formatter ;
	String name;
	public Format(String name,Formatter formatter) {
		this.name = name;
		this.formatter = formatter;
	}
	public void move(int x,int y) {
		formatter.format("%s The Turtle is at (%d,%d)\n", name,x,y);
	}
	public static void main(String[] args) {
		Format tom = new Format("tom",new Formatter(System.out));
		Format jerry= new Format("jerry",new Formatter(System.out));
		
		tom.move(0, 0);
		jerry.move(1, 0);
		tom.move(1, 0);
		jerry.move(2, 0);
	}
}
