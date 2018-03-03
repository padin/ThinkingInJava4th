package com.wyizd.chapter02.section06.node03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午12:56:16
 * @Title static 关键字
 * @Discription 
 * 	需求：1.不愿意创建对象而使用属性或方法
 * 		2.只与类关联，不和类中其他属性和方法关联。
 * 	static可以同时满足以上两个需求。
 * 
 * 	注意：1.static 的方法 不能调用非static 的字段或方法。因为非static的字段或方法必须是归属于某个对象。
 * 		2.含static 属性的对象即使创建多个，其static属性在内存中也只有一份。
 */
public class Static {
	
	static double π=3.14158265;
	static String name="abc";
	
	static void function() {
		Static static1=new Static();
		Static static2=new Static();
		System.out.println(static1.name==static2.name);
		return ;
	}
	
	public static void main(String[] args) {
		function();
	}

}
