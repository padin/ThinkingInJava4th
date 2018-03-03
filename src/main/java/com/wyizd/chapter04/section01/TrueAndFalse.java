package com.wyizd.chapter04.section01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午6:29:05
 * @Title true 和 false
 * @Discription 所有的条件语句都可以使用条件表达式来决定执行路径
 * 在弱类型语言里，非零 表示 真
 * 但在java里 非零 需要写成 args!=0
 * 
 */
public class TrueAndFalse {
	
	
	public static void main(String[] args) {
		int a = 1;
		if (a != 0) {
			System.out.println("a != null");
		}
	}

}
