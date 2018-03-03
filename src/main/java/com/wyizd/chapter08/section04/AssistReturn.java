package com.wyizd.chapter08.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午9:04:19
 * @Title 协变返回类型
 * @Discription 
 */
class Grain{
	public String toString() {
		return "谷物";
	}
}
class wheat extends Grain{
	public String toString() {
		return "小麦";
	}
}
//磨坊	
class Mill {
	Grain process() {return new Grain(); }
}
//小麦磨坊	
class WheatMill extends Mill{
	wheat process() {return new wheat(); }
}

public class AssistReturn {
	public static void main(String[] args) {
		Mill mill = new Mill();
		Grain grain =mill.process();
		System.out.println(grain);
		System.out.println("-----------------------------------");
		mill = new WheatMill();
		grain = mill.process();
		System.out.println(grain);
		
	}
}
