package com.wyizd.commons;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午3:18:08
 * @Title 
 * @Discription 
 */
public class Individual implements Comparable<Pet> {
	int id;
	String name;
	
	public Individual() {
		this.name = getClass().getSimpleName();
	}
	public Individual(String name) {
		this.name = name;
	}
	int id() {
		return this.id;
	}
	@Override
	public int compareTo(Pet o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return this.name; 
	}
	

}
