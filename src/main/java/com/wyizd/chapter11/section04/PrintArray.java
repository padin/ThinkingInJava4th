package com.wyizd.chapter11.section04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.wyizd.chapter01.section09.Collctions;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午7:43:00
 * @Title 容器的打印
 * @Discription
 * 	很多时候,想要看看容器里面的元素,可以使用Arrays.toString(); 
 */
public class PrintArray {
	static Collection<String> fill(Collection<String> c) {
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");
		return c;
	}
	static Map<Integer,String> fill(Map<Integer,String> m) {
		m.put(1, "一");
		m.put(2, "二");
		m.put(3, "三");
		m.put(4, "四");
		return m;
	}
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		
		System.out.println(fill(new HashMap<Integer,String>()));
		System.out.println(fill(new TreeMap<Integer,String>()));
		System.out.println(fill(new LinkedHashMap<Integer,String>()));
	}

}
