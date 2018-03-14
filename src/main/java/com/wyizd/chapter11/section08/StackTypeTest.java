package com.wyizd.chapter11.section08;

import java.util.LinkedList;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月13日 下午7:10:15 
 * @Title	栈 
 * @Discription 
 */
class Stack<T> {
	private LinkedList<T> storage = new LinkedList<>();
	public void push(T v) {storage.addFirst(v);}
	public T peek() {return storage.getFirst();}
	public T pop() {return storage.removeFirst();}
	public boolean empty() {return storage.isEmpty();}
	public String toString() {return storage.toString();}
}
public class StackTypeTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for(String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while(!stack.empty()) {
			System.out.println(stack.pop());
			//这里注意特性,先进后出。
		}
	}
}
