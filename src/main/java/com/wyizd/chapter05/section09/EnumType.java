package com.wyizd.chapter05.section09;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午12:58:37
 * @Title 枚举类型
 * @Discription 
 * 枚举是常量集,在JDK1.7之前,常用于switch语句。
 * 
 * 这用法有点诡异，感觉有点反人类 -。-
 * 
 * 
 * 
 */
enum RMB{
	YUAN,JIAO,FEN
}

public class EnumType{
	RMB rmb;
	public EnumType(RMB rmb) {
		this.rmb=rmb;
	}
	
	public void describe() {
		System.out.print("This RMB is ");
		switch (rmb) {
		case YUAN:
			System.out.println("元");
			break;
		case JIAO:
			System.out.println("角");
			break;
		case FEN:
			System.out.println("分");
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		
		EnumType 
			yuan = new EnumType(RMB.YUAN),
			jiao = new EnumType(RMB.JIAO),
			fen = new EnumType(RMB.FEN);
		yuan.describe();
		jiao.describe();
		fen.describe();
			
		
		
		
	}
	
}

