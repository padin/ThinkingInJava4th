package com.wyizd.chapter11.section09;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午10:13:36
 * @Title Set
 * @Discription
 * 	这里作者讲hashset没有排序,可能是版本的原因。我这里是1.8,排序了。
 *  
 * 	
 */
public class SetType {
	public static void main(String[] args) {
		Random random = new Random();
		long start=System.currentTimeMillis();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 10000; i++) {
			set.add(random.nextInt(10000));
		}
		System.out.println(set);
		long end=System.currentTimeMillis();
		System.out.println("hashset:"+(end-start));

		start=System.currentTimeMillis();
		Set<Integer> set2 = new TreeSet<>();
		for (int i = 0; i < 10000; i++) {
			set2.add(random.nextInt(10000));
		}
		System.out.println(set2);
		end=System.currentTimeMillis();
		System.out.println("treeset:"+(end-start));
	}

}
