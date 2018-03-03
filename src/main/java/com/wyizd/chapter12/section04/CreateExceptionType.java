package com.wyizd.chapter12.section04;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:05:36
 * @Title 创建自定义异常
 * @Discription 
 */
class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("LogginExcpetion");
	
	public MyException() {
		StringWriter sw = new StringWriter();
		printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
	}
	public MyException(String string) {
		
		super(string);
	}

	public void f() throws MyException{
		System.out.println("我的异常发生了");
		throw new MyException();
	}
}
public class CreateExceptionType {
	public static void main(String[] args) {
		MyException exception = new MyException();
		try {
			exception.f();
		} catch (Exception e) {
			System.out.println("捕获到了");
			e.printStackTrace(System.err);
		}
	}
}
