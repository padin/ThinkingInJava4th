package com.wyizd.chapter07.section08.node01;

import java.util.Arrays;
import java.util.Random;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午7:25:46
 * @Title Final 关键字
 * @Discription final 关键字表示：这是不可改变的 ,但是作用于不同的位置,有不同的含义
 * 
 * 	1.修饰于 基本数据类型 , 表示 该变量的值不可改变。
 *  2.修饰于 引用数据类型， 表示 该引用不可改变，但内容是可以修改的。
 *  3.如需要在对象实例化时才确定值，可以使用空白final,在构造方法中赋值,如下例useful变量
 * 	
 */

class Value{
	int i;
	public Value(int i) {
		this.i=i;
	}
}

public class FinalData{
	private static Random random=new Random(47);
	private String id;
	private final String useful;
	public FinalData(String id,String useful) {
		this.id=id;
		this.useful=useful;
	}
	private final int 		VALUE_ONE= 19;
	public static final int VALUE_TWO= 29;
	public static final int VALUE_THREE= 39;
	
	private final int i4 = random.nextInt(20);
	static  final int i5 = random.nextInt(20);
	
	private  	  		 Value v1 = new Value(11);
	private final		 Value v2 = new Value(22);
	private static final Value v3 = new Value(33);
	
	private final int[] a = {1,2,3,4,5,6};
	
	
	
	@Override
	public String toString() {
		return "FinalData [id=" + id +",useful="+useful+ ", VALUE_ONE=" + VALUE_ONE + ", i4=" + i4 + "i5=" + i5 +", v1=" + v1 + ", v2=" + v2 + ", a="
				+ Arrays.toString(a) + "]";
	}



	public static void main(String[] args) {
		FinalData finalData=new FinalData("FD1","TEST");
		finalData.v2.i++;				//final引用类型的值可以改变
		finalData.v1 = new Value(9);	
		
		for (int i = 0; i < finalData.a.length; i++) {
			finalData.a[i]++;			//数组的元素值可以改变
		}
//		finalData.v2=new Value(0); 编译不通过
//		finalData.v3=new Value(0); 编译不通过
//		finalData.a = new int[3];  编译不通过
//		finalData.useful="TEST3";  编译不通过
		
		System.out.println(finalData);
		System.out.println("----------------------------------------------------");
		FinalData finalData2 = new FinalData("FD2","TEST2");		
		System.out.println(finalData2);
		
	}
}