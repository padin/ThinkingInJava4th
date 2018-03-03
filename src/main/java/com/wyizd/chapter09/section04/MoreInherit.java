package com.wyizd.chapter09.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午11:29:10
 * @Title 多重继承
 * @Discription 
 * 	如果直接继承的话会背负太多包袱。
 * 	想要多重继承可以使用组合接口的方式。
 */
interface CanFly{ void fly();}
interface CanSwim{ void swim();}
interface CanFight{ void fight();}
class ActionCharacter{ void fight() {System.out.println("我的天性是战斗");}}
class Hero extends ActionCharacter implements CanFly , CanSwim {

	@Override
	public void swim() {
		System.out.println("飞起来");
	}

	@Override
	public void fly() {
		System.out.println("潜入水");
	}
	
}

public class MoreInherit{
	static void swim(CanSwim x) { x.swim();}
	static void fly(CanFly x) {x.fly();}
	static void fight(CanFight x) {x.fight();}
	static void fight2(ActionCharacter x) {x.fight();}
	public static void main(String[] args) {
		Hero hero = new Hero();
		swim(hero);
		fly(hero);
//		fight(hero);	这里可能是版本的问题.我这里用的是1.8,当实现类有与接口相同的方法名时，就不能实现了该接口了。
		fight2(hero);
	}
}
