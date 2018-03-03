package com.wyizd.chapter09.section06;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午1:58:02
 * @Title 适配接口
 * @Discription 
 * 	接口的一个常见用法就是 策略模式 ,方法只接受一个接口。只要你的对象实现了这个接口。就可以调用这个方法。
 */

class RandomWords implements Readable{
	private static Random random = new Random();
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers= "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels= "aeiou".toCharArray();
	private int count;
	public RandomWords(int count) {
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		cb.append(capitals[random.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(lowers[random.nextInt(lowers.length)]);
			cb.append(vowels[random.nextInt(vowels.length)]);
		}
		cb.append(" ");
		return 5;
	}
	
}

public class AdapterInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new RandomWords(10)); 
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}
}
