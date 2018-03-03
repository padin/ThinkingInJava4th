package com.wyizd.chapter12.section08;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:47:42
 * @Title 使用finally进行清理
 * @Discription 如果希望无论程序是否正常执行，都能执行的代码块。可以使用finally包围
 * 
 */
public class Finally {
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			System.out.println("发现异常");
		}finally {
			System.out.println("关闭资源");
		}
		System.out.println("------------------------------------------");
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("发现异常");
		}finally {
			System.out.println("关闭资源");
		}
	}
}
