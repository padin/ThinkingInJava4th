package com.wyizd.chapter11.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午7:31:32
 * @Title 添加一组元素
 * @Discription 
 * 		Arrays.asList();接收一个数组或用逗号分隔的多个参数 并转化为一个list对象
 * 		Collection.addAll();接收一个Collection对象以及一个数组或可变参数列表，并添加到对象中。
 * 		
 */
public class IncreaseCollection {
	public static void main(String[] args) {
		Collection<Integer> collection = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {4,5,6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection, moreInts);
		
		for (Integer integer : collection) {
			System.out.println(integer);
		}
		
		
	}
}
