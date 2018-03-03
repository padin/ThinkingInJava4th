package com.wyizd.commons;

import java.util.ArrayList;
import java.util.List;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午3:55:10
 * @Title 
 * @Discription 
 */
public class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>> types = new ArrayList<>(); 
	private static String[] typeNames = {
			"com.wyizd.commons.Mutt",
			"com.wyizd.commons.Pug",
			"com.wyizd.commons.EgyptianMau",
			"com.wyizd.commons.Manx",
			"com.wyizd.commons.Cymric",
			"com.wyizd.commons.Rat",
			"com.wyizd.commons.Mouse",
			"com.wyizd.commons.Hamster"
	};
	@SuppressWarnings("unchecked")
	private static void loader() {
		try {
			for (String string : typeNames) {
				types.add((Class<? extends Pet>) Class.forName(string));
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	static {loader();
		System.out.println("静态块加载");
	}
	@Override
	public List<Class<? extends Pet>> types() {
		return types ;
	}
	

}
