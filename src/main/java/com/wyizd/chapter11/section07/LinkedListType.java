package com.wyizd.chapter11.section07;

import java.util.LinkedList;

import com.wyizd.commons.Pet;
import com.wyizd.commons.Pets;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午9:42:57
 * @Title LinkedList
 * @Discription 
 * 1.getFirst() 	返回链表第一个元素
 * 2.element() 		返回链表第一个元素
 * 3.peek()			返回链表第一个元素
 * 4.remove()		返回链表第一个元素,并删除
 * 5.removeFirst()	返回链表第一个元素,并删除
 * 6.poll()			返回链表第一个元素,并删除.列表为空时返回NULL
 * 7.addFirst()		添加一个元素到第一个位置
 * 7.push()			添加一个元素到第一个位置
 * 8.offer()		添加一个元素到最后一个位置
 * 9.add()			添加一个元素到最后一个位置
 *10.addLast()		添加一个元素到最后一个位置
 *11.removeLast()	返回最后一个元素,并删除
 * 
 * 
 */
public class LinkedListType {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<>(Pets.arraylist(5));
		System.out.println(pets);
//		System.out.println(pets.getFirst()+"--"+pets.getFirst());
//		System.out.println(pets.element()+"--"+pets.element());
//		System.out.println(pets.peek()+"--"+pets.peek());
//		System.out.println(pets.remove()+"--"+pets.remove());
//		System.out.println(pets.removeFirst()+"--"+pets.removeFirst());
//		System.out.println(pets.poll()+"--"+pets.poll());
//		pets.addFirst(Pets.arraylist(1).get(0));
//		System.out.println("after addFirst" + pets);
//		pets.offer(Pets.getPet());
//		System.out.println("After offer "+ pets);
//		pets.add(Pets.getPet());
//		System.out.println("after add" + pets);
//		pets.addLast(Pets.getPet());
//		System.out.println("after addLast" + pets);
//		System.out.println("after removeLast" + pets.removeLast());
		pets.push(Pets.getPet());
		System.out.println("after push  "+ pets);
		
		
		
	}
}
