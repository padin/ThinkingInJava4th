package com.wyizd.chapter01.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月20日 下午9:56:43
 * @Title 继承
 * @Discription 
 * 	继承的优势：可以直接复制父类的属性和功能
 * 
 * 	继承的劣势：当父类改变时，子类也要改变
 * 
 * 	应用案例：1.当父类是一些子类的公共特性且不易改变
 * 		   2.当父类的功能不再满足需求，使用子类扩展
 */
public class Inherit {

}
class fruit{
	void eat() {};
	void juice() {};
}

class apple extends fruit {
	void Sober() {};
}
