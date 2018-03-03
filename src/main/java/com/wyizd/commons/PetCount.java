package com.wyizd.commons;

import java.util.HashMap;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午4:27:03
 * @Title 宠物计数器
 * @Discription 
 */
public class PetCount {
	static class PetCounter extends HashMap<String, Integer>{
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null) {
				put(type, 1);
			}else {
				put(type, quantity + 1);
			}
		}
	}
	
	public static void countPets(PetCreator petCreator) {
		PetCounter petCounter = new PetCounter();
		for (Pet pet: petCreator.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() +"\t");
			if (pet instanceof Pet) 
				petCounter.count("Pet");
			if (pet instanceof Dog) 
				petCounter.count("Dog");
			if (pet instanceof Mutt) 
				petCounter.count("Mutt");
			if (pet instanceof Pug) 
				petCounter.count("Pug");
			if (pet instanceof Cat) 
				petCounter.count("Cat");
			if (pet instanceof Manx) 
				petCounter.count("Manx");
			if (pet instanceof EgyptianMau) 
				petCounter.count("EgyptianMau");
			if (pet instanceof Cymric) 
				petCounter.count("Cymric");
			if (pet instanceof Rodent) 
				petCounter.count("Rodent");
			if (pet instanceof Rat) 
				petCounter.count("Rat");
			if (pet instanceof Mouse) 
				petCounter.count("Mouse");
			if (pet instanceof Hamster) 
				petCounter.count("Hamster");
		}
		System.out.println();
		System.out.println(petCounter);
	}
	
	public static void main(String[] args) {
//		countPets(new ForNameCreator());
		countPets(new LiteralPetCreator());
		
	}
}
