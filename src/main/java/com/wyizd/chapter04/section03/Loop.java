package com.wyizd.chapter04.section03;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午6:38:02
 * @Title 迭代
 * @Discription 
 * while do-while for 用来控制循环,语句会重复执行，除非条件表达式为假时。
 * 
 * while(条件){
 * 	循环体
 * }
 * 
 * do{
 * 	循环体(无条件的先执行一次)
 * }while(条件);
 * 
 * for(初始化表达式;条件表达式;步进表达式){
 * 	循环体
 * }
 * 
 * 需要注意到的是：for语句中的参数可以有多个，只要类型相同就可以。
 * 如：
 * for(int i=0,j=10;i<10;i++,j--){
 *		 
 * }
 * 
 */
public class Loop {
	/**
	 * 以下案例分别表示三种迭代输出0-9
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		while (a< 10){
			System.out.println(a);
		}
		
		int b = 0;
		do {
			System.out.println(b);
		} while (b<10);
		
		for(int c=0;c<10;c++) {
			System.out.println(c);
		}
		
	}
}
