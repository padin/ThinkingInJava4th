package com.wyizd.chapter17.section08;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

import com.wyizd.commons.CountingMapData;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午4:30:22 
 * @Title 理解Map
 * @Discription 
 * 	Map的常用子类
 * 	HashMap
 * 	基于散列表的实现,性能固定
 * 	TreeMap
 * 	基于红黑树的实现,使用comparable排序
 * 	LinkedHashMap
 * 	类似HashMap,采用链表的形式,迭代快。
 * 	WeakHashMap
 * 	弱键映射,为特殊垃圾回收问题设计。
 * 	ConcurrentHashMap
 * 	线程安全Map
 * 	IdentityHashMap
 * 	散列方式采用==代替equals
 */

public class MapTest {
	static void printKeys(Map<Integer,String> map) {
		System.out.println("Size = "+map.size());
		System.out.println("Keys = "+map.keySet());	
	}
	static void test(Map<Integer,String> map) {
		System.out.println("===================================【"+map.getClass().getSimpleName()
						  +"】===================================");
		map.putAll(new CountingMapData(25));
		map.putAll(new CountingMapData(25));
		printKeys(map);
		System.out.println("Values:	");
		System.out.println(map.values());
		System.out.println(map);
		System.out.println("map.containsKey===>"+map.containsKey(11));
		System.out.println("map.get(11)===>"+map.get(11));
		Iterator<Integer> iterator = map.keySet().iterator();
		map.remove(11);
		map.clear();
		map.putAll(new CountingMapData(25));
		try {
			while(iterator.hasNext()) {
				System.out.print(map.get(iterator.next())+",");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		test(new HashMap<Integer,String>());
		test(new LinkedHashMap<Integer,String>());
		test(new TreeMap<Integer,String>());
		test(new WeakHashMap<Integer,String>());
		test(new ConcurrentHashMap<Integer,String>());
		test(new IdentityHashMap<Integer,String>());
	}
}
