package com.wyizd.chapter08.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午9:12:59
 * @Title 用继承进行设计
 * @Discription 
 * 准则：用继承表达行为间的差异，用字段表达状态上的变化
 */
class Actor{ void act() {}}

class HappyActor extends Actor{
	@Override
	void act() {
		System.out.println("逗乐");
	}
}
class SadActor extends Actor{
	@Override
	void act() {
		System.out.println("催泪");
	}
}
class Stage{
	private Actor actor;
	public Stage(Actor actor) {
		this.actor = actor;
	}
	void changeActor(Actor actor) {
		this.actor = actor;
	}
	void play(){
		actor.act();
	}
}


public class UseExtendsDesign {
	public static void main(String[] args) {
		Stage stage = new Stage(new HappyActor());
		stage.play();
		stage.changeActor(new SadActor());
		stage.play();
	}
}
