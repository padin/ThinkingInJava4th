package com.wyizd.chapter05.section07.node02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午10:52:19
 * @Title 静态数据的初始化
 * @Discription 
 * 	静态数据不论新建多少对象，在内存中只占一份
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
		System.out.println(cupboard.table.bowl==cupboard2.table.bowl);
		//因为设计上的问题,这里相当匪夷所思.两个碗橱的碗竟然是同一个碗。
		
		
	}

}
