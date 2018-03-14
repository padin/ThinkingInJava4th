package com.wyizd.chapter12.section09;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:58:17
 * @Title 异常的限制
 * @Discription 
 * 	当子类覆盖基类的方法后,只抛出基类方法的异常里列出的那些异常。
 */

class AException extends Exception{}
class BException extends AException{}
class CException extends Exception{}
abstract class S{
	abstract void add() throws AException;
}


public class RestraintException extends S {

//	@Override
//	public void add() throws CException {}
//	编译不过

	@Override
	void add() throws AException {}
	

}
