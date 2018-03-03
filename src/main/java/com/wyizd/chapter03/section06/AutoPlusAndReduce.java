package com.wyizd.chapter03.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月21日 下午6:56:33
 * @Title 自增与自减
 * @Discription 
 * 		递增和递减不仅改变了变量，同时把变量的值作为结果
 * 类型：
 * 		前缀递增/减:先执行运行，再生成值
 * 			++a;
 * 			--a;
 * 		后缀递增/减:先生成值，再进行运行
 * 			a++;
 * 			a--;
 */
public class AutoPlusAndReduce {
	
	public static void main(String[] args) {
		int a=5;
		System.out.println(a++);//此时a:6
		System.out.println(a--);//此时a:5
		System.out.println(++a);//此时a:6
		System.out.println(--a);//此时a:5
	}

}
