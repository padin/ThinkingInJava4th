package com.wyizd.chapter12.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:21:39
 * @Title 异常说明
 * @Discription 
 */
public class ExceptionExplain extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExceptionExplain(String string) {
		super(string);
	}
	public static void main(String[] args) {
		ExceptionExplain ee = new ExceptionExplain("异常描述");
		ee.f();
	}
	void f() throws NullPointerException,RuntimeException{
		try {
			System.out.println("程序正常执行中...");
			throw new ExceptionExplain("程序遇到某某问题。。。");
			
		} catch (ExceptionExplain e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("程序进入另一个分支运行");
		}
	}
	
}
