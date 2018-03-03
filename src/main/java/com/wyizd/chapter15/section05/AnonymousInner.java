package com.wyizd.chapter15.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月25日 上午8:49:45
 * @Title 匿名内部类
 * @Discription
 *  
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import com.wyizd.chapter15.section04.Generators;
import com.wyizd.commons.Generator;

class Customer{
	private  static long counter = 1;
	private final long id = counter ++;
	private Customer() {};
	@Override
	public String toString() {
		return getClass().getSimpleName() + id; 
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {
			public Customer next() { return new Customer();}
		};
	}
}

class Teller{
	private  static long counter = 1;
	private final long id = counter ++;
	private Teller() {};
	@Override
	public String toString() {
		return getClass().getSimpleName() + id; 
	}
	public static Generator<Teller> generator(){
		return new Generator<Teller>() {
			public Teller next() { return new Teller();}
		};
	}
}
public class AnonymousInner {
	public static void serve(Teller teller , Customer customer) {
		System.out.println(teller + " serves " + customer);
	}
	public static void main(String[] args) {
		Random random = new Random() ;
		Queue<Customer> line = new LinkedList<>();
		List<Teller> tellers = new ArrayList<>();
		Generators.fill(line, Customer.generator(), 15);
		Generators.fill(tellers, Teller.generator(), 4);
		for (Customer c: line) {
			serve(tellers.get(random.nextInt(tellers.size())), c);
		}
	}
}
