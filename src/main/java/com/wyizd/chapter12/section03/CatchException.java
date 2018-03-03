package com.wyizd.chapter12.section03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午8:42:21
 * @Title 捕获异常
 * @Discription 
 * 如果方法内出现异常，并想让他继续运行下去，可以是try语句
 * catch 块只会处理 该类异常参数 的 异常
 * 
 */
public class CatchException {
	public static void main(String[] args) {
		try {
			int i = 1 /0 ;
			CatchException catchException = null;
			catchException.toString();
			
		} catch (NullPointerException e) {
			System.out.println("使用了空对象");
		}
		System.out.println("接下来的程序");
	}
}
