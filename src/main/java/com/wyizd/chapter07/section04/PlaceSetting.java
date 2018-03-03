package com.wyizd.chapter07.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午5:12:41
 * @Title 结合使用组合和继承
 * @Discription 
 */
class Plate{
	public Plate() {
		System.out.println("盘子构造");
	}
}
class DinnerPlate extends Plate{
	public DinnerPlate() {
		super();
		System.out.println("晚餐盘子构造");
	}
}
class Utensil{
	public Utensil() {
		System.out.println("器具构造");
	}
}
class Spoon extends Utensil{
	public Spoon() {
		super();
		System.out.println("汤勺构造");
	}
}
class Fork extends Utensil{
	public Fork() {
		super();
		System.out.println("叉子构造");
	}
}
class Knife extends Utensil{
	public Knife() {
		super();
		System.out.println("刀子构造");
	}
}
class Custom{
	public Custom() {
		System.out.println("客户构造");
	}
}
public class PlaceSetting extends Custom{
	private Spoon spoon;
	private Fork fork;
	private Knife knife;
	private DinnerPlate pl;
	public PlaceSetting(){
		super();
		spoon=new Spoon();
		fork=new Fork();
		knife=new Knife();
		pl=new DinnerPlate();
		System.out.println("晚餐准备完毕");
	}
	public static void main(String[] args) {
		PlaceSetting placeSetting = new PlaceSetting();
	}
}
