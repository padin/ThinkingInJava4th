package com.wyizd.chapter14.section07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午8:08:39
 * @Title 动态代理
 * @Discription
 */

class MethodSelector implements InvocationHandler {
	private Object proxied;

	public MethodSelector(Object obj) {
		proxied = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getName().equals("interesting")) {
			System.out.println("Proxy detected the interesting method");
		}
		return method.invoke(proxied, args);
	}
}

interface SomeMethod {
	void interesting(String args);
}

class Implementaion implements SomeMethod {

	@Override
	public void interesting(String args) {
		System.out.println("interesting " + args);
	}
}

public class InvokeDemo {
	public static void main(String[] args) {
		SomeMethod proxy = (SomeMethod) Proxy.newProxyInstance(
				SomeMethod.class.getClassLoader(),
				new Class[] {SomeMethod.class},
				new MethodSelector(new Implementaion()));
		proxy.interesting("boboob");
		
	}
}
