package com.wyizd.chapter12.section09;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:58:17
 * @Title 异常的限制
 * @Discription 
 */
interface I{
	void add() throws RuntimeException;
}
abstract class A{
	abstract void del() throws RuntimeException;
}
public class RestraintException extends A implements I{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int i = 1/0;
	}

	@Override
	void del() {
		// TODO Auto-generated method stub
		int i = 1/0;
	}
	public static void main(String[] args) {
		RestraintException restraintException = new RestraintException();
		restraintException.add();
		restraintException.del();
	}

}
