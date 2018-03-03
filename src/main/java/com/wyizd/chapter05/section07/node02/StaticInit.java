package com.wyizd.chapter05.section07.node02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午10:52:19
 * @Title 静态数据的初始化
 * @Discription 
 * 1.	静态数据不论新建多少对象，在内存中只占一份
 * 2.	
 */

class Bowl{
	public Bowl(int marker) {
		System.out.println("Bowl("+marker+")");
	}
}
class Table{
	static Bowl bowl = new Bowl(1);
	public Table(int marker) {
		System.out.println("Table("+marker+")");
	}
}
class Cupboard{
	static Table table = new Table(2);
	public Cupboard(int marker) {
		System.out.println("Cupboard("+marker+")");
	}
}

public class StaticInit {
	public static void main(String[] args) {
		Cupboard cupboard = new Cupboard(3);
		Cupboard cupboard2 = new Cupboard(3);
		
	}

}
