package com.wyizd.chapter19.section04;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

import com.wyizd.chapter18.section09.ProcessControl;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午5:13:49 
 * @Title	values()的神秘之处 
 * @Discription 
 * 	运行下例代码可见,
 * 	Explore的方法比Enum多了一个Values()
 * 	这个方法是编译器添加的静态方法。
 *	Enum继承自Object
 *	enum继承自Enum
 * 	并且将Explore添加final修饰符
 */
enum Explore{HERE,THERE}
public class MethodValues {
	
	public static Set<String> analyze(Class<?> enumClass){
		Set<String> methods = new TreeSet<>();
		for (Method m : enumClass.getMethods()) {
			methods.add(m.getName());
		}
		System.out.println("Base:"+enumClass.getSuperclass());
		return methods;
	}
	
	public static void main(String[] args) throws IOException {
		Set<String> exploreMethods = analyze(Explore.class);
		Set<String> enumMethods = analyze(Enum.class);
		
		System.out.println(exploreMethods);
		System.out.println(enumMethods);
		
		ProcessControl.command("javap Explore");
	}
}
