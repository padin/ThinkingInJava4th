package com.wyizd.chapter11.section10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午10:34:01
 * @Title Map
 * @Discription 
 * 1.get(key) 获得key对应的值,如果没有返回空
 * 2.put(key,value) 将键值对存入容器,如果键存在，则覆盖。
 * 3.keySet() 获得所有Key的set集合.
 */
public class MapType {
	public static void main(String[] args) {
		Map<Integer, String> map =new HashMap<>();
		map.put(1, "^^");
		map.put(1, "##");
		System.out.println(map.get(1));
		System.out.println("----------------------------------------");
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			map.put(random.nextInt(1000), random.nextInt(9999)+"-");
		}
		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
		}
		
	}
}
