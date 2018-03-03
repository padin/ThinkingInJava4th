package com.wyizd.chapter04.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午7:03:03
 * @Title break continue
 * @Discription 
 * break 和 continue 分别用来控制循环
 * 
 * break 表示退出循环
 * continue 表示跳到下一次循环
 */
public class BreakAndContinue {
	
	public static void main(String[] args) {
		int a = 0;
		while (true) {
			a++;
			if (a%2==0) {
				continue;
			}
			System.out.println(a);
			if (a > 20) {
				break;
			}
		}
	}

}
