package com.wyizd.chapter11.section06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.wyizd.commons.Pet;
import com.wyizd.commons.Pets;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午9:08:54
 * @Title 迭代器
 * @Discription 
 * 迭代器是一个对象，它的工作的是遍历并选择序列中的对象
 * 方法：	iterator() 获得迭代器
 * 		next() 获得下一个元素
 * 		hasNext() 检查是否有下一个元素
 * 		remove() 将当前元素删除
 */
public class IteratorTest {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arraylist(12);
		Iterator<Pet> iterator = pets.iterator();
		while (iterator.hasNext()) {
			Pet pet = (Pet) iterator.next();
			System.out.print(pet+" \t");
		}	
		System.out.println();
		for (Pet pet : pets) {
			System.out.print(pet+" \t");
			
		}
		System.out.println();
		iterator = pets.iterator();
		for (int i = 0; i < 6; i++) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(pets);
		
		System.out.println("------------------------------------------------------------");
		ArrayList<Pet> arrayList = Pets.arraylist(8);
		LinkedList<Pet> linkedList = new LinkedList<>(arrayList);
		HashSet<Pet> hashSet = new HashSet<>(arrayList);
		TreeSet<Pet> treeSet = new TreeSet<>(arrayList);
		
		display(arrayList.iterator());
		display(linkedList.iterator());
		display(hashSet.iterator());
		display(treeSet.iterator());
		
		
	}
	
	public static void display(Iterator<Pet> iterator ) {
		while (iterator.hasNext()) {
			Pet pets = (Pet) iterator.next();
			System.out.print(pets+"\t");
		}
		System.out.println();
	}
}
