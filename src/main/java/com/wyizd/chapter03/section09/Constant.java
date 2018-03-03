package com.wyizd.chapter03.section09;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午7:57:51
 * @Title 直接常量
 * @Discription 
 */
public class Constant {
	public static void main(String[] args) {
		//如要指明十六进制，以0x为前缀
		int i1 = 0x2f;
		System.out.println(Integer.toBinaryString(i1));
		int i2 = 0x2F;
		System.out.println(Integer.toBinaryString(i2));
		int i3 = 0177;
		System.out.println(Integer.toBinaryString(i3));
		
		char c = 0xffff;
		System.out.println(Integer.toBinaryString(c));
		byte b = 0x7f;
		System.out.println(Integer.toBinaryString(b));
		short s = 0x7fff;
		System.out.println(Integer.toBinaryString(s));
		
		//如要指明数据类型 以后缀修饰
		long n1 = 1;
		long n2 = 1l;
		long n3 = 1L;
		
		float f1 = 1;
		float f2 = 1f;
		float f3 = 1F;
		
		double d1 = 1d;
		double d2 = 1D;
		
		System.out.println(n1==n2&&n2==n3&&n3==f1);
		
		
		
	}
}
