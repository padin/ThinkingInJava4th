package com.wyizd.chapter09.section05;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午1:42:45
 * @Title 继承接口
 * @Discription 接口可以继承接口，扩展接口拥有父接口的抽象方法。
 * 				当实现类实现扩展接口，需要实现所有抽象方法
 */

interface Monster{
	void menace();
}
interface DangerousMonster extends Monster {
	void destroy();
}
class DragonZilla implements DangerousMonster{
	@Override
	public void menace() {
		System.out.println("会喷水淹没人");
	}
	@Override
	public void destroy() {
		System.out.println("会喷火烧人");
	}
}
public class InheritInterface {
	public static void main(String[] args) {
		DragonZilla dragonZilla = new DragonZilla();
		dragonZilla.menace();
		dragonZilla.destroy();
	}
}
