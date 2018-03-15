package com.wyizd.chapter19.section05;

import java.util.Random;

import com.wyizd.commons.Generator;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午5:30:26 
 * @Title 实现,而非继承
 * @Discription 由于enum继承了Enum,所以不能再继承别的类
 * 但是可以实现一个或多个接口
 */

enum ARMS implements Generator<ARMS>{
	BAD,SIMPLE,GOOD,NICE,BEAUTY,BEST;
	Random r = new Random();
	@Override
	public ARMS next() {
		return values()[r.nextInt(values().length)];
	}
	
}

public class ImplementWithoutExtends {
	public static void main(String[] args) {
		ARMS a = ARMS.BAD;
		System.out.println(a.next());
	}
}
