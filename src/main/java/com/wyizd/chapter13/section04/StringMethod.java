package com.wyizd.chapter13.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午10:58:35
 * @Title String上的操作
 * @Discription 太多，随便举例一些。用的时候，靠代码提示或者找api
 * 				不可能全部记，常用的死都忘不了，不常用的死都记不住。
 */
public class StringMethod {
	public static void main(String[] args) {
		String string = new String(new StringBuilder());
		string = new String(new StringBuffer());
		string = new String("");
		string = new String(new String());
		string = new String(new char[] {});
		string = new String(new byte[] {});
		
		string.length();
		string.charAt(0);
		string.toCharArray();
		string.equals("");
		string.compareTo("");
		string.contains("");
		string.startsWith("");
		string.endsWith("");
		string.indexOf("");
		string.substring(0);
		string.concat("");
		string.replace('o', 'n');
		string.toUpperCase();
		string.trim();
		string.intern();
	}
}
