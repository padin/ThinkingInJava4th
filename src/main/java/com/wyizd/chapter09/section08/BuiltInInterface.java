package com.wyizd.chapter09.section08;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午2:32:17
 * @Title 嵌套接口
 * @Discription 接口可以嵌套在类域中.虽然我也不知道这有什么用 -。-
 */
class A{
	interface B { void b() ;};
	interface C extends B { void c() ; };
	public class D implements C{
		@Override
		public void b() {
			System.out.println("method B");
		}

		@Override
		public void c() {
			System.out.println("method C");
		}
	}
	D getD() { return new D(); }
}
public class BuiltInInterface {
	public static void main(String[] args) {
		A a = new A ();
		a.getD().b();
		a.getD().c();
		
	}
}
