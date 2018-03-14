package com.wyizd.chapter17.section04;

import java.util.Arrays;
import java.util.List;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午2:48:54 
 * @Title	可选操作 
 * @Discription 
 * Collectin 提供了很多接口，但是又的子类无法实现或子接口没有实现。
 * 当你试图调用这些接口的时候，该子类会抛出 UnsupportedOperationException.
 */
public class ChoosableOperation {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G".split(" "));
		//编译检查通过了，但是没有具体实现。
		list.clear();
	}
	
}
