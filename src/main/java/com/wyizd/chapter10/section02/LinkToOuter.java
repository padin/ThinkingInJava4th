package com.wyizd.chapter10.section02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午3:44:48
 * @Title 链接到外部类
 * @Discription 
 * 	内部类可以访问外部类的所有成员
 * 	下例是迭代器模式
 */
interface Selector{
	boolean end();
	Object current();
	void next();
}
class Sequence{
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object obj) {
		if (next < items.length) {
			items[next++] = obj;
		}
	}
	private class SequenceSelector implements Selector{
		int i;
		@Override
		public boolean end() {
			return i == items.length;
		}
		@Override
		public Object current() {
			return items[i];
		}
		@Override
		public void next() {
			if (items.length > i) {
				i++;
			}
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
}
public class LinkToOuter {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}

}
