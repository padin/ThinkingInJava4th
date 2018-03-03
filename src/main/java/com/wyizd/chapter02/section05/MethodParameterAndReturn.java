package com.wyizd.chapter02.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 上午11:56:45
 * @Title 方法，参数和返回值
 * @Discription 
 * 	方法就是一个对象的子程序，
 * 	方法决定了该对象能够接收什么样的消息
 * 	方法只有通过对象才能够调用（除了静态方法），==> 对象.方法名()
 * 	
 *  方法名后的括号里是方法的参数列表
 * 	方法的参数列表指定要传递给方法什么样的消息
 *  
 *  return 关键字 之后的代码表示将要返回的值。
 *  
 *  如果不需要返回值 返回值类型可以设置为void	表示返回值为空
 *  此时 return 关键字的意义仅为 退出方法
 * 	
 * 
 */
public class MethodParameterAndReturn {
	
	返回值类型 方法名(参数类型1 a, 参数类型2 b) {
		//方法体
		return new 返回值类型();
	}
	
}

class 返回值类型{};
class 参数类型1{};
class 参数类型2{};
