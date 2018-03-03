package com.wyizd.chapter07.section07;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午6:31:51
 * @Title 想上转型
 * @Discription 
 * 	新类是现有类的一种类型
 *  这种说法在向上转型中得到很好的阐述。
 *  
 *  如果纠结 组合 与 继承 的选择,如果 需求可以满足向上转型，继承是更好的选择。不然就要考虑一下了。
 * 
 */
class Amphibian{
	void inWater(Amphibian amphibian) {
		amphibian.swimming();
	}
	void swimming () {
		System.out.println("两栖动物在游泳");
	}
}

class Frog extends Amphibian{
	void swimming() {
		System.out.println("青蛙在游泳");
	}
}

public class Upcase {
	public static void main(String[] args) {
		Amphibian qingwa = new Frog();
		qingwa.inWater(qingwa);
	}

}
