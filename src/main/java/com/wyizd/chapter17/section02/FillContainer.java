package com.wyizd.chapter17.section02;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import com.wyizd.commons.Generator;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午1:50:21 
 * @Title	填充容器 
 * @Discription 填充容器我们可以使用Collections的fill静态方法
 * 	不过，为了更好的测试数据，我们选择使用前面我们创建的Generator类。
 * 	首先，我们先创建一个适配器,CollectionData
 * 
 */

/*
 * 适配器
 */
class CollectionData<T> extends ArrayList<T> {
	public CollectionData(Generator<T> gen ,int quantity) {
		for(int i = 0; i<quantity; i++) {
			add(gen.next());
		}
	}
	public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
		return new CollectionData<T>(gen,quantity);
	}
}

/**
 * 字符串数组生成器
 */
class Government implements Generator<String> {
	String[] foundation = 
			("strange women lying in ponds distributing swords is no basis for a system of government")
			.split(" ");
	private int index;
	@Override
	public String next() {
		return foundation[index++];
	}
	
}

public class FillContainer {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(new CollectionData(new Government(), 15));
//		或者使用这种方式
//		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}
}
