package com.wyizd.chapter10.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午5:02:13
 * @Title 匿名内部类
 * @Discription 当你想使用接口,又不想实例化一个类只是临时使用一下,就不得不用匿名内部类了。
 */
interface Contents{ int value(); }
public class AnonymousInner {
	public static void main(String[] args) {
		Contents contents = new Contents() {
			@Override
			public int value() {
				return 5555;
			}
		};
		
		System.out.println(contents.value());
	}
}
