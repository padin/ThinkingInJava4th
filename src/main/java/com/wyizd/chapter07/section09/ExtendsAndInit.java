package com.wyizd.chapter07.section09;
/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月13日 下午5:40:56 
 * @Title 
 * @Discription 
 */
class Insect{
	private int i = 10;

	public Insect() {
		System.out.println("i="+i);
		i=20;
		System.out.println("i="+i);
	}
	
	
}
public class ExtendsAndInit extends Insect {
	private int i = 30;
	public ExtendsAndInit(){
		System.out.println("i="+i);
		i=40;
		System.out.println("i="+i);
		
	}
	public static void main(String[] args) {
		ExtendsAndInit eai = new ExtendsAndInit();
	}
}
