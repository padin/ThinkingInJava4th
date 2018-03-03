package com.wyizd.commons;

import java.util.ArrayList;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午8:05:28
 * @Title List
 * @Discription List在collection基础上添加了很多方法，可以在中间插入和删除元素 ArrayList :
 *              善于随机访问元素,但是在中间插入和删除效率比较慢 LinkedList :
 *              善于在中间插入和删除数据,提供了优化顺序访问。但是随机访问效率比较差.
 */


public class Pets {
//	public static final PetCreator CREATOR = new ForNameCreator();
	public static final PetCreator CREATOR = new LiteralPetCreator();
	public static Pet getPet() {
		return CREATOR.randomPet();
	}
	public static Pet[] createArray(int size) {
		return CREATOR.createArray(size);
	}
	public static ArrayList<Pet> arraylist(int size){
		return CREATOR.arrayList(size);
	}
	
}

		
		
		
		
		
		
		
		
