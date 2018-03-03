package com.wyizd.chapter12.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:30:33
 * @Title 捕获所有的异常
 * @Discription 
 */
public class CatchAllException {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception"); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
	}

}
