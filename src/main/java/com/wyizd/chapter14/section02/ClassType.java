package com.wyizd.chapter14.section02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午2:49:32
 * @Title Class对象
 * @Discription 
 *	类名.class 或 对象.getClass() 可以获得 该类的Class对象
 *  Class对象.newInstace() 可以创建该类的实例 
 */

import java.util.ArrayList;
import java.util.List;

import com.wyizd.commons.Pet;

class CountedInteger{
	private static long counter ;
	private final long id = counter ++;
	public String toString() {
		return Long.toString(id); 
	}
}
public class ClassType<T> {
	private Class<T> type;
	public ClassType(Class<T> type) {
		this.type = type;
	}
	public List<T> create(int nElements){
		List<T>	 list = new ArrayList<>();
		try {
			for (int i = 0; i < nElements ; i++) {
				list.add(type.newInstance());
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return list;
	}
	
	public static void main(String[] args) {
		ClassType<CountedInteger> ct = new ClassType<>(CountedInteger.class); 
		System.out.println(ct.create(10));
		ClassType<Pet> ct2 = new ClassType<>(Pet.class); 
		System.out.println(ct2.create(10));
		
	}
}
