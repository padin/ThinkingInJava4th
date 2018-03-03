package com.wyizd.chapter03.section08;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午7:34:30
 * @Title 逻辑运算符
 * @Discription 
 * 	逻辑运算符包含 
 * 	&&	||	！
 *  与	或	非
 *  
 */
public class LogicalOperator {
	public static void main(String[] args) {
		System.out.println(1==1&&2==2); //同时满足条件
		System.out.println(1==1&&2==3); //有一个不满足
		
		System.out.println(1==1||2==3); //有一个满足
		System.out.println(1==2||2==3); //没有一个满足
		
		System.out.println(!(1==3)); //不满足，取反
		
		//短路示例
		
		System.out.println("------------------------分割线------------------------------");
		System.out.println(f()&&t()); //第一个条件不满足，不再运行后面的
		System.out.println("------------------------分割线------------------------------");
		System.out.println(t()||f()); //第一个条件满足，不再运行后面的
	}
	
	static boolean f() {
		System.out.println("返回假");
		return false;
	}
	static boolean t() {
		System.out.println("返回真");
		return true;
	}
}

