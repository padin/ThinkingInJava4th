package com.wyizd.chapter15.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月25日 上午9:00:07
 * @Title 使用Generators 填充 collection
 * @Discription 
 */

import java.util.Collection;

import com.wyizd.commons.Generator;

public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll , Generator<T> gen, int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
}
