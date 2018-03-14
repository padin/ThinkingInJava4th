package com.wyizd.chapter16.section07;

import java.util.Arrays;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月13日 下午9:37:36 
 * @Title Arrays实用功能
 * @Discription 
 */
public class ArraysUtils {
	public static void main(String[] args) {
		int[] i = new int[7];
		int[] j = new int[10];
		
		//填充数组
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		/*
		 * 复制数组
		 * @param      src      the source array. 源数组
		 * @param      srcPos   starting position in the source array.从源数组第几个下标开始
		 * @param      dest     the destination array.目标数组
		 * @param      destPos  starting position in the destination data.从目标数组第几个下标开始
		 * @param      length   the number of array elements to be copied.拷贝长度
		 */
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println(Arrays.toString(j));
		
		System.out.println("//----------------------------------------------------------------------");
		int[] k=new int[i.length];
		Arrays.fill(k, 47);
		
		//比较数组
		System.out.println(Arrays.equals(i, k));
		System.out.println(Arrays.equals(i, j));
		
		System.out.println("//----------------------------------------------------------------------");
		
		int[] l = {5,2,3,7,8,6,1,9,0};
		//数组排序
		Arrays.sort(l);
		System.out.println(Arrays.toString(l));
		
	}
	
}
