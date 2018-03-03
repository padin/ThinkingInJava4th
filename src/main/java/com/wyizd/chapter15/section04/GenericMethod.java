package com.wyizd.chapter15.section04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.wyizd.commons.Generator;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月25日 上午8:34:35
 * @Title 泛型方法
 * @Discription 下例演示任意类型生成器
 * 
 */
public class GenericMethod<T> implements Generator<T> {
	private Class<T> type;

	public GenericMethod(Class<T> type) {
		this.type = type;
	}

	@Override
	public T next() {
		try {
			return type.newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static <T> Generator<T> create(Class<T> type) {
		return new GenericMethod<>(type);
	}

	public static void main(String[] args) {
		Generator<Random> generator = GenericMethod.create(Random.class);
		Random next = generator.next();

		System.out.println(next.nextInt(100));

		List list = GenericMethod.create(ArrayList.class).next();
	}

}
