package com.wyizd.chapter17.section05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.wyizd.commons.Countries;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午3:02:18
 * @Title List的功能方法
 * @Discription List接口最常用的两个子类 ArrayList LinkedList
 */
public class ListMethod {
	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;

	// 测试基本方法
	public static void basicTest(List<String> a) {
		a.add(1, "x");
		a.add("y");

		a.addAll(Countries.names(25));
		a.addAll(3, Countries.names(25));

		b = a.contains("1");
		b = a.containsAll(Countries.names(25));

		s = a.get(1);
		i = a.indexOf("1");
		b = a.isEmpty();

		it = a.iterator();
		lit = a.listIterator();
		lit = a.listIterator(3);

		i = a.lastIndexOf("1");
		a.remove(1);
		a.remove("3");
		a.set(1, "z");

		a.retainAll(Countries.names(25));
		a.retainAll(Countries.names(25));

		i = a.size();
		a.clear();

	}

	// 测试迭代
	public static void iterTest(List<String> a) {
		lit = a.listIterator();
		while (lit.hasNext()) {
			s = lit.next();
			i = lit.nextIndex();
			System.out.println(i + "====>" + s);
		}
		// b = lit.hasPrevious();
		// s = lit.previous();
		// i = lit.previousIndex();
		// lit.add("47");
		// lit.remove();
		// lit.set("47");

	}

	// LinkedList专有方法
	public static void testLinkedList() {
		System.out.println("================================================================");
		LinkedList<String> ll = new LinkedList<>();
		ll.addAll(Countries.names(25));
		System.out.println(ll);
		ll.addFirst("AAAAA");
		ll.addFirst("BBBBB");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);

	}

	public static void main(String[] args) {
		basicTest(new ArrayList<String>(Countries.names(25)));
		basicTest(new LinkedList<String>(Countries.names(25)));
		iterTest(new ArrayList<String>(Countries.names(25)));
		iterTest(new LinkedList<String>(Countries.names(25)));
		testLinkedList();
	}

}
