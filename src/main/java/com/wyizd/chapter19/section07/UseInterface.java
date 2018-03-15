package com.wyizd.chapter19.section07;

import com.wyizd.chapter19.section07.Food.Appetizer;
import com.wyizd.chapter19.section07.Food.Coffee;
import com.wyizd.chapter19.section07.Food.MainCourse;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午5:44:16 
 * @Title 使用接口组织枚举
 * @Discription 
 * 
 */

interface Food{
	enum Appetizer implements Food{
		SALAD,SOUP,SPRING_ROOLS;
	}
	enum MainCourse implements Food{
		LASAGNE,BURRITO,PAD_THAI; 
	}
	enum Dessert implements Food{
		TIRAMISU,GELATO,BLACK_FOREST_CAKE;
	}
	enum Coffee implements Food{
		BLACK_COFFEE,LATTE,CAPPUCCINO;
	}
}

public class UseInterface {
	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
			 food = MainCourse.PAD_THAI;
			 food = Coffee.LATTE;
	}
}
