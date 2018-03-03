package com.wyizd.chapter01.section11;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 上午9:02:00
 * @Title 错误处理
 * @Discription 编程难免会有很多错误。
 * 	编程的错误问题：异常处理
 * 		异常处理提供了一种从错误状态进行可靠恢复的途径而不用再退出程序。
 */
public class ErrorHandle {
	
	public static void main(String[] args) {
		errorFunction();
	}
	static void errorFunction() {
		try {
			int i=1/0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("发生错误");
		}
		
	}

}
