package com.wyizd.chapter09.section03;

import java.util.Arrays;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午10:10:19
 * @Title 完全解耦
 * @Discription 
 * 	如果一个方法操作的是一个类，那么你就只能使用这个类和其导出类。
 * 	如果一个方法操作的是一个接口,那么你就可以使用不在这个类继承体系之外的类了。
 */
interface Processor{
	public String name();
	Object process(Object input);
}
class Upcase implements Processor{
	public String name() {
		return getClass().getSimpleName(); 
	}
	public Object process(Object input) {
		return input.toString().toUpperCase();
	}
}
class Splitter implements Processor{
	public String name() {
		return getClass().getSimpleName();
	}
	public Object process(Object input) {
		return Arrays.toString(input.toString().split(" "));
	}
}

public class Dissection {
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Splitter(), s);
		//添加适配器时候，可以使用电波处理器
		process(new FilterAdapter(new Filter()), new Waveform());
	}
	public static void process(Processor p,Object o) {
		System.out.println("使用"+p.name()+"处理器");
		System.out.println(p.process(o));
	}
	public static String s = "Disagreement with beliefs is by definition incorrect ";
}

//-------------------------------下面添加电波处理器----------------------------------------------

class Waveform{
	private static long counter;
	private final long id = counter++;
	public String toString() {return "Waveform " + id;};
}


class Filter{
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input ;
	}
}
//-----------------------------------发现参数不能用，但是又不能改,只好使用适配器模式----------------------------------------

class FilterAdapter implements Processor{
	Filter filter;
	public FilterAdapter(Filter filter) {
		this.filter= filter;
	}
	public String name() {
		return filter.name();
	}
	public Object process(Object input) {
		return filter.process((Waveform)input);
	}
}
