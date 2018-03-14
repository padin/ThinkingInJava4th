package com.wyizd.chapter12.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:30:33
 * @Title 捕获所有的异常
 * @Discription
 * 	因为所有异常继承于Exception
 * 	所以捕获的时候,Exception可以捕获所有的异常 
 */
public class CatchAllException extends Exception {

	private static final long serialVersionUID = -1458122766377133412L;

	public CatchAllException(String string) {
		super(string);
	}

	public static void main(String[] args) {
		try {
			throw new CatchAllException("这是自定义异常"); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
	}

}
