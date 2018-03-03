package com.wyizd.chapter03.section07;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午7:15:56
 * @Title 关系运算符
 * @Discription 
 * 	<	>	>=		<=		==		!=		
 * 小于	大于	大或等于	小或等于	相等		不相等
 * 	
 */
public class RelationOperation {
	
	public static void main(String[] args) {
		Integer i1	= new Integer(47);
		Integer i2	= new Integer(47);
		int i3 = 47;
		int i4 = 47;
		
		System.out.println(i1 == i2);//因为 == 对于引用类型比较的是地址
		System.out.println(i3 == i4);//因为 == 对于基本类型比较的是值
		System.out.println(i1 == i4);//这个没有说明，不过实验数据表示：如果有一方是基本数据类型，会拆解出值再比较
		System.out.println(i3 == i2);
		
		System.out.println(i1.equals(i2)); //equals方法会比较实际内容
		
		MyInteger i5 = new MyInteger();
		MyInteger i6 = new MyInteger();
		i5.value = 47;
		i6.value = 47;
		System.out.println(i5 == i6);	//这里比较的是地址
		System.out.println(i5.equals(i6));//这里依然比较的是地址，因为是从object那里继承过来的
		
	}
}


class MyInteger{
	int value ;
}
