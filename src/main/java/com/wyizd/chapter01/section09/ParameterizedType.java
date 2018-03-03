package com.wyizd.chapter01.section09;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 上午8:35:30
 * @Title 参数化类型（泛型）
 * @Discription 
 * 	尽管所有的类型都是Object类型，我们可以把所有对象当做object储存，但是取出的时候需要转化为实际类型。
 * 	这种转型叫做 向下转型，维护向下转型需要更大的精力，运行效率也很低。
 *  	解决方案：使用参数化类型（泛型），在储存的时候就指定其类型
 */

import java.util.ArrayList;

public class ParameterizedType {
	
	ArrayList<ParameterizedType> list = new ArrayList<>();

}
