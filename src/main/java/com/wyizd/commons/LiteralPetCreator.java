package com.wyizd.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午3:55:10
 * @Title 
 * @Discription 
 */
public class LiteralPetCreator extends PetCreator{
	private final static List<Class<? extends Pet>> Alltype =
			Collections.unmodifiableList(
					Arrays.asList(
			Pet.class,Dog.class,Cat.class,Rodent.class,
			Mutt.class,Pug.class,EgyptianMau.class,Manx.class,
			Cymric.class,Rat.class,Mouse.class,Hamster.class));
	private final static List<Class<? extends Pet>> types =
			Alltype.subList(Alltype.indexOf(Mutt.class), Alltype.size()) ;
			
	@Override
	public List<Class<? extends Pet>> types() {
		return types ;
	}
}
