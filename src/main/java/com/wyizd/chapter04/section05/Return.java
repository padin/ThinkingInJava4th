package com.wyizd.chapter04.section05;

import static org.junit.Assert.assertArrayEquals;

import org.junit.rules.ExpectedException;

import com.wyizd.chapter04.section02.IfElse;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午6:54:29
 * @Title return
 * @Discription 
 * return 表示退出方法 后面可以跟一个方法的返回值(如果方法有返回值)。
 */
public class Return {
	
	public static void main(String[] args) {
		Method();
	}
	
	static void Method() {
		int a =0;
		while (true) {
			System.out.println(a++);
			if (a >= 10) {
				return;
			}
		}
	}

}
