package com.wyizd.chapter12.section07;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午9:42:17
 * @Title java标准异常
 * @Discription 
 * 	异常分error与exception.
 *  error 通常与编译和系统错误有关。
 *  exception通常与编程相关，我们只需关心它。
 *  
 *  runtimeException 如果没有被捕获，会调用 printstackTrace();
 */
public class JavaNormalException {

		public static void main(String[] args) {
			a();
		}

		private static void a() {
			b();
		}

		private static void b() {
			throw new RuntimeException();
		}
}
