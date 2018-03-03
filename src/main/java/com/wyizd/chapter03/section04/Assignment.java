package com.wyizd.chapter03.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午6:01:40
 * @Title 赋值
 * @Discription 
 * 	赋值：取=号右边的值，复制给左边
 * 		1.基本数据类型的赋值：直接复制值
 * 		2.	          对象的赋值：复制的是引用		
 */

class Tank {
	int level;
}

public class Assignment {
	/*
	 * 该案例说明：t1和t2本是两个独立的对象
	 * 	但是当t2值赋值给t1后
	 * 	t1的引用指向的就是t2的对象了。
	 * 	所以，t1就是t2,t2就是t1
	 * 	（原来指向t1的那个对象已经没有引用了）。
	 *  当修改t1时，实际上也是修改t2.
	 *  
	 */
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 11;
		t2.level = 22;
		System.out.println("t1.level= "+t1.level+" t2.level= "+t2.level);
		t1=t2;
		System.out.println("t1.level= "+t1.level+" t2.level= "+t2.level);
		t1.level = 27;
		System.out.println("t1.level= "+t1.level+" t2.level= "+t2.level);
		
	}
}
