package com.wyizd.chapter15.section03;


import com.wyizd.commons.Generator;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月25日 上午8:26:09
 * @Title 泛型接口
 * @Discription 泛型接口演示斐波拉契
 * 
 */
public class GenericInterface implements Generator<Integer> {
	private int count = 0;
	@Override
	public Integer next() {
		return fib(count++);
	}
	private Integer fib(int i) {
		if (i < 2) {
			return 1;
		}else {
			return fib(i - 2) + fib(i - 1);
		}
	}
	public static void main(String[] args) {
		GenericInterface gi = new GenericInterface();
		for (int i = 0; i < 18; i++) {
			System.out.println(gi.next());
		}
	}
	
	

}
