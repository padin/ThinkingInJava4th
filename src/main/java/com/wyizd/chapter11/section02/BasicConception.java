package com.wyizd.chapter11.section02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午7:23:04
 * @Title 基本概念
 * @Discription 
 * 1.Collection ：一个独立元素的序列。
 * 2.List		:必须按照插入顺序保存的序列。
 * 3.Set		:不嫩重复的序列。
 * 4.Queue		:按照排队规则来确定对象产生的顺序。
 * 
 * 5.Map		:一组成对的"键值对"对象，可以用键来查找值
 */
public class BasicConception {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			collection.add(i);
		}
		for (Integer integer : collection) {
			System.out.println(integer);
		}
	}
}
