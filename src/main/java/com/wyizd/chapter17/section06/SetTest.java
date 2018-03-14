package com.wyizd.chapter17.section06;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午3:40:57
 * @Title Set 和储存顺序
 * @Discription Set 接口的三个重要子类 
 * HashSet 为快速查找而设计的Set(最常用) 
 * TreeSet 保持次序的Set
 * LinkedHashSet 内部使用链表维护顺序的Set
 */
class SetType {
	int i;

	public SetType(int n) {
		i = n;
	}

	public boolean equals(Object o) {
		return o instanceof SetType && (i == ((SetType) o).i);
	}

	@Override
	public String toString() {
		return "SetType [i=" + i + "]";
	}
}

class HashType extends SetType {

	public HashType(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}
}

class TreeType extends SetType implements Comparable<TreeType> {

	public TreeType(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 通过i值排序
	 */
	@Override
	public int compareTo(TreeType o) {
		// TODO Auto-generated method stub
		return o.i < i ? -1 : (o.i == i ? 0 : 1);
	}
}

public class SetTest {
	static <T> Set<T> fill(Set<T> set, Class<T> type) {
		for (int i = 0; i < 10; i++) {
			try {
				set.add(type.getConstructor(int.class).newInstance(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return set;
	}

	static <T> void test(Set<T> set, Class<T> type) {
		fill(set, type);
		fill(set, type);
		fill(set, type);
		System.out.println(set);
	}

	public static void main(String[] args) {

	    test(new HashSet<HashType>(), HashType.class);

	    test(new LinkedHashSet<HashType>(), HashType.class);
	
	    test(new TreeSet<TreeType>(), TreeType.class);

	    test(new HashSet<SetType>(), SetType.class);

	    test(new HashSet<TreeType>(), TreeType.class);

	    test(new LinkedHashSet<SetType>(), SetType.class);

	    test(new LinkedHashSet<TreeType>(), TreeType.class);

	    try {

	      test(new TreeSet<SetType>(), SetType.class);

	    } catch(Exception e) {

	      System.out.println(e.getMessage());

	    }

	    try {

	      test(new TreeSet<HashType>(), HashType.class);

	    } catch(Exception e) {

	      System.out.println(e.getMessage());

	    }

	  }

		
}
