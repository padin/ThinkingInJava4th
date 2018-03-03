package com.wyizd.chapter04.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午6:49:15
 * @Title foreach
 * @Discription 
 * foreach 在jdk1.5之后引入
 * 通常用于遍历集合
 * 语法：
 * 
 * for(元素类型 变量 : 集合){
 * 	循环体
 * }
 * 集合中的元素会依次赋值到变量中。
 * 
 * 
 */
public class Foreach {

	public static void main(String[] args) {
		
		int[] array= {0,1,2,3,4,5,6,7,8,9};
		
		for (int i : array) {
			System.out.println(i);
		}
		
	}
}
