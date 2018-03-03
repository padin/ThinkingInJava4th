package com.wyizd.chapter14.section06;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午7:19:23
 * @Title 反射
 * @Discription 
 * 这个示例需要给args带一个全限定名的参数。
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethod {
	private static String usage = "usage:\n" 
			+ "ShowMethod qualified.class.name\n"
			+ "To show all methods in class or:\n" 
			+ "ShowMethods qualified.class.name word\n"
			+ "To search for methods involving 'word'";
	private static Pattern pattern = Pattern.compile("\\w+\\.");

	public static void main(String[] args) {
//		if (args.length < 1) {
//			System.out.println(usage);
//			System.exit(1);
//		}
		int lines = 0;
		try {
			Class<?> c = Class.forName("com.wyizd.chapter14.section06.ShowMethod");
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
//			if (args.length == 1) {
			if (true) {
				for (Method method : methods) {
					System.out.println(pattern.matcher(method.toString()).replaceAll(" "));
				}
				for (Constructor constructor : ctors) {
					System.out.println(pattern.matcher(constructor.toString()).replaceAll(" "));
				}
				lines = methods.length +ctors.length;
			} else {
				for (Method method : methods) {
					if (method.toString().indexOf(args[1]) != -1) {
						System.out.println(pattern.matcher(method.toString()).replaceAll(" "));
					}
					lines++;
				}
				for (Constructor constructor : ctors) {
					if (constructor.toString().indexOf(args[1]) != -1) {
						System.out.println(pattern.matcher(constructor.toString()).replaceAll(" "));
					}
					lines++;
				}
			}

		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
//	output
//	public static void      main(  String[])
//	public final void    wait() throws   InterruptedException
//	public final void    wait(long,int) throws   InterruptedException
//	public final native void    wait(long) throws   InterruptedException
//	public boolean    equals(  Object)
//	public   String    toString()
//	public native int    hashCode()
//	public final native   Class    getClass()
//	public final native void    notify()
//	public final native void    notifyAll()
//	public     ShowMethod()

}
