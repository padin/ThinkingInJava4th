package com.wyizd.chapter10.section04;


/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午4:24:39
 * @Title 内部类与向上转型
 * @Discription  内部类向接口转型
 */

interface Destination{ String readLabel(); }
interface Contents{ int value(); }
class Parce{
	private class PContents implements Contents{
		public int value() {
			return 11;
		}
	}
	protected class PDestination implements Destination{
		String s;
		public PDestination(String s) {
			this.s = s;
		}
		@Override
		public String readLabel() {
			return s;
		}
	}
	public Destination destination(String s) {
		return new PDestination(s);
	}
	public Contents contents() {
		return new PContents();
	}
}
public class InnerAndUpcase {
	public static void main(String[] args) {
		Parce p = new Parce();
		Contents contents = p.contents();
		Destination destination = p.destination("oh yeah!");
		System.out.println(contents.value());
		System.out.println(destination.readLabel());
	}
}
