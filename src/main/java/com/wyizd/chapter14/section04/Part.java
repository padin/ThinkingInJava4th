package com.wyizd.chapter14.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午6:49:02
 * @Title 
 * @Discription 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = new ArrayList<>();
	static {
		partFactories.add(new FuelFilter.Fac());
		partFactories.add(new AirFilter.Fac());
		partFactories.add(new CabinAirFilter.Fac());
		partFactories.add(new OilFilter.Fac());
	}
	
	private static Random random = new Random();
	public static Part createRandom() {
		int n = random.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}
