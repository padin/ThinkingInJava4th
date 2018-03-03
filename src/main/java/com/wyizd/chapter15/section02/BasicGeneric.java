package com.wyizd.chapter15.section02;

import java.awt.event.ItemEvent;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月25日 上午8:08:44
 * @Title 基本泛型
 * @Discription 
 * 下例模拟一个stack
 */
public class BasicGeneric<T>  {
	private static class Node<U> {
		U item;
		Node<U> next;
		public Node() {
			item = null;next = null;
		}
		public Node(U item,Node<U> next) {
			this.item = item;this.next = next;
		}
		boolean end() {return item == null && next == null ;}
	}
	
	private Node<T>	 top = new Node<>();
	public void push(T item) {
		top = new Node<>(item,top);
	}
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	public static void main(String[] args) {
		BasicGeneric<String> bgs = new BasicGeneric<>();
		for (String string : "A B C D E F G".split(" ")) {
			bgs.push(string);
		}
		String s;
		while ((s =bgs.pop()) !=null) {
			System.out.println(s);
		}
	}
}
