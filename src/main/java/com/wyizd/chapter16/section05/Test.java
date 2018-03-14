package com.wyizd.chapter16.section05;

import java.util.Arrays;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月13日 下午9:31:46 
 * @Title 数组与泛型
 * @Discription 不能很好结合。
 */

class ParameterizedArrayType<T>{
	private T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
}

public class Test {
	public static void main(String[] args) {
		ParameterizedArrayType<Integer> pat = new ParameterizedArrayType<>();
		Integer[] ints = {1,2,3,4,5};
		pat.setArray(ints);
		System.out.println(Arrays.toString(pat.getArray()));
	}
}
