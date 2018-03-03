package com.wyizd.chapter13.section02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午10:22:27
 * @Title String + 与 Stringbuider
 * @Discription 性能问题差距有，但是不大。
 * 				字符串长度越常,差距越大。
 */
public class StringAndStringBuider {
	public String implicit(String[] fields) {
		String ret ="" ;
		for (int i = 0; i < fields.length; i++) {
			ret+=fields[i];
		}
		return ret;
	}
	public String explicit(String[] fields) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			sb.append(fields[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		StringAndStringBuider assb = new StringAndStringBuider();
		String s="";
		for (int i = 0; i < 1000; i++) {
			s+="ABCDEFGHIJKMLNOPQRSTUVWXYZ";
		}
		String[] strings = s.split("");
		long start = System.currentTimeMillis();
		assb.implicit(strings);
		long end= System.currentTimeMillis();
		System.out.println("string+"+(end - start));
		
		start = System.currentTimeMillis();
		assb.explicit(strings);
		end= System.currentTimeMillis();
		System.out.println("stringbuider"+(end - start));
	}
}
