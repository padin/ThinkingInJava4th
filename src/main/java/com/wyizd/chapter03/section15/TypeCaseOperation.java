package com.wyizd.chapter03.section15;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午8:44:35
 * @Title 类型转换操作符
 * @Discription 
 * 1.低类型向高类型转换 可以隐式转换
 * 2.高类型向低类型转换 必须显式转换
 * 3.高类型与低类型算术运算，其结果类型为高类型
 * 4.boolean 不能转换
 * 5.String 不能向数据类型转换
 * 
 */
public class TypeCaseOperation {
	public static void main(String[] args) {
		int i = 100;
		int i2= 100;
		double d = 456.78;
		double d2= 456.78;
		
		
		
		d=i;		//隐式类型转换
		System.out.println(d);
		i=(int) d2;//强制类型转换
		System.out.println(i);//注意，结果并没有四舍五入。
		
		i2=(int) Math.round(d2);
		System.out.println(i2);//需要先将double类型舍入再赋值
		
		
		
		
		String string = "12345678";
	//	i= (int) string;	//这样就不行。String不能转为整形
		
		
		
		
	}

}
