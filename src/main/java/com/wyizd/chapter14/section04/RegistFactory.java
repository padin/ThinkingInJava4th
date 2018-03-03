package com.wyizd.chapter14.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午6:47:20
 * @Title 注册工厂 
 * @Discription 
 */
public class RegistFactory {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Part.createRandom());
		}
	}
}
