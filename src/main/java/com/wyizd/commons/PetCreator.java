package com.wyizd.commons;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午3:43:03
 * @Title 
 * @Discription 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
	private Random random = new Random();
	public abstract List<Class<? extends Pet>> types();
	public Pet randomPet(){
		int n = random.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = randomPet();
		}
		return result;
	}
	
	public ArrayList<Pet> arrayList (int size){
		ArrayList<Pet> list = new ArrayList<>();
		Collections.addAll(list, createArray(size));
		return list;
	}
	
}
