package com.wyizd.chapter03.section11;
/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月13日 下午3:40:59 
 * @Title 
 * @Discription 
 */
public class URShift {
	public static void main(String[] args) {
		int i= 1;
		System.out.println(Integer.toBinaryString(i));
		i <<= 1;
		System.out.println(Integer.toBinaryString(i));
		i <<= 1;
		System.out.println(Integer.toBinaryString(i));
		i <<= 1;
		System.out.println(Integer.toBinaryString(i));
		i >>= 1;
		System.out.println(Integer.toBinaryString(i));
		i >>= 1;
		System.out.println(Integer.toBinaryString(i));
		i >>= 1;
		System.out.println(Integer.toBinaryString(i));
	}
}
