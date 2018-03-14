package com.wyizd.chapter14.section07;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午7:57:55
 * @Title 普通代理
 * @Discription
 */

interface MyInterface {
	void doSomeThing();

	void someThingElse();
}

class RealObject implements MyInterface {
	
	@Override
	public void doSomeThing() {
		System.out.println("object do some thing");
	}

	@Override
	public void someThingElse() {
		System.out.println("object some thing else");
	}
}

class SimpleProxyDemo implements MyInterface {
	private MyInterface proxied;
	public SimpleProxyDemo(MyInterface proxied) {
		this.proxied = proxied;
	}
	
	@Override
	public void doSomeThing() {
		System.out.println("before");
		proxied.doSomeThing();
		System.out.println("after");
	}

	@Override
	public void someThingElse() {
		System.out.println("before");
		proxied.someThingElse();
		System.out.println("after");
	}
}

public class SimpleProxy {
	public static void consumer(MyInterface iface) {
		iface.doSomeThing();
		iface.someThingElse();
	}
	public static void main(String[] args) {
		RealObject ro = new RealObject();
		//consumer(ro);
		consumer(new SimpleProxyDemo(ro));
	}
}
