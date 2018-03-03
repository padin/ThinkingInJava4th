package com.wyizd.chapter03.section12;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午8:12:13
 * @Title 三元操作符 if-else
 * @Discription 
 * 	三元操作符
 * 	表达式1 ? 表达式2 : 表达式3
 * 
 * 如果表达式1为真，则计算表达式2,忽略表达式3
 * 如果表达式1为假，则计算表达式3,忽略表达式2
 *------------------------------------------------------ 
 *  if-else
 *  if(表达式1){
 *  	内容1
 *  }else{
 *  	内容2
 *  }
 *  如果表达式1为真，则运行内容1,忽略内容2
 *  如果表达式1为假，则运行内容2,忽略内容1
 * 
 */
public class TernaryOperation {
	public static void main(String[] args) {
		
		int i = (1==2) ? (1 +1) : (2 +2) ;
		
		System.out.println(i);
		if (1==2) {
			i = 1 + 1;
		}else {
			i = 2 + 2;
		}
		
		System.out.println(i);
		
	}
}
