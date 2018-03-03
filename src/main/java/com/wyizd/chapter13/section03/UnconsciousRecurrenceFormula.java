package com.wyizd.chapter13.section03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午10:53:35
 * @Title 无意识递归
 * @Discription 当想要输出对象地址的时候，不要用this关键字。会向上转型并产生递归。
 * 		应该使用super.toString();
 */
public class UnconsciousRecurrenceFormula {
	@Override
	public String toString() {
//		return "UnconsciousRecurrenceFormula = "+ this;
		return super.toString();
	}
	public static void main(String[] args) {
		UnconsciousRecurrenceFormula urf = new UnconsciousRecurrenceFormula();
		System.out.println(urf);
	}
}
