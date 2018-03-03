package com.wyizd.chapter11.section05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.wyizd.commons.Cat;
import com.wyizd.commons.Cymric;
import com.wyizd.commons.Dog;
import com.wyizd.commons.Hamster;
import com.wyizd.commons.Mouse;
import com.wyizd.commons.Pet;
import com.wyizd.commons.Pets;
import com.wyizd.commons.Rat;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午8:05:28
 * @Title List
 * @Discription List在collection基础上添加了很多方法，可以在中间插入和删除元素 ArrayList :
 *              善于随机访问元素,但是在中间插入和删除效率比较慢 LinkedList :
 *              善于在中间插入和删除数据,提供了优化顺序访问。但是随机访问效率比较差.
 */


public class ListType{

	static Random random=new Random();
	public static ArrayList<Pet> arraylist(int i) {
		ArrayList<Pet> list = new ArrayList<Pet>();
		for (int j = 0; j < i; j++) {
			list.add(getPet());
			
		}
		return list;
	}

	public static Pet getPet() {
		int k = random.nextInt(5);
		switch (k) {
		case 0: return new Dog();
		case 1: return new Cat();
		case 2: return new Rat();
		case 3: return new Hamster();
		case 4: return new Cymric();
		case 5: return new Mouse();
		}
		return null;
	}
	public static void main(String[] args) {
		Random random = new Random();
		List<Pet> pets = Pets.arraylist(7);
		System.out.println("1."+pets);
		Hamster h = new Hamster();
		pets.add(h);
		System.out.println("2."+pets);
		System.out.println("3."+pets.contains(h));
		pets.remove(h);
		Pet p = pets.get(2);
		System.out.println("4."+p+pets.indexOf(p));
		Pet cymric = new Cymric();
		System.out.println("5."+pets.indexOf(cymric));
		System.out.println("6."+pets.remove(cymric));
		System.out.println("7."+pets.remove(p));
		System.out.println("8."+pets);
		pets.add(3,new Mouse());
		System.out.println("9."+pets);
		List<Pet> sub = pets.subList(1, 4) ;
		System.out.println("subList:"+sub);
		System.out.println("10:"+pets.containsAll(sub));
//		Collections.sort(sub);      这里有问题啊。我明明是泛型哦。
		System.out.println("11");
		
		//打不下去了。。。有空再来打
	}		
	
}

		
		
		
		
		
		
		
		
