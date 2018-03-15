package com.wyizd.chapter19.section03;
/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午5:09:03 
 * @Title 	switch中的enum
 * @Discription 
 */
enum Signal{GREEN,YELLOW,RED}
public class EnumInSwitch {
	public static void main(String[] args) {
		Signal s = Signal.GREEN;
		switch (s) {
		case RED:
			System.out.println("红");
			break;
		case YELLOW:
			System.out.println("黄");
			break;
		case GREEN:
			System.out.println("绿");
			break;
		default:
			break;
		}
	}
}
