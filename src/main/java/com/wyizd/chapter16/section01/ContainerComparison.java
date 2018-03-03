package com.wyizd.chapter16.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月25日 下午4:22:44
 * @Title 数组为什么特殊
 * @Discription 
 * 1.效率
 * 2.可以持有基本数据类型
 */
//: arrays/ContainerComparison.java

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Sphere " + id;
	}
}

public class ContainerComparison {
	public static void main(String[] args) {
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for (int i = 0; i < 5; i++)
			spheres[i] = new BerylliumSphere();
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);

		List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
		for (int i = 0; i < 5; i++)
			sphereList.add(new BerylliumSphere());
		System.out.println(sphereList);
		System.out.println(sphereList.get(4));

		int[] integers = { 0, 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);

		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
		intList.add(97);
		System.out.println(intList);
		System.out.println(intList.get(4));
	}
} 