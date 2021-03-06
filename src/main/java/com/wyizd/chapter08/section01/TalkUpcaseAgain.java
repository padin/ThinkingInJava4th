package com.wyizd.chapter08.section01;

import java.util.Random;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 上午6:43:11
 * @Title 再论向上转型
 * @Discription 
 * tune 方法接收一个Instrument 引用 ,同时 也接收 所有 Instrument 的导出类。 这样是 合理的，风乐器本来就是乐器 ，
 * 乐器的功能 ，风乐器一定会有。
 */

//音符
enum Note{
	哆,唻,咪,嗦,啦
}
//乐器
class Instrument{
	void play(Note note) {};
}
//风乐器
class Wind extends Instrument {

	void play(Note note) { System.out.println("Wind play -" + note) ;}
}

public class TalkUpcaseAgain {
	public static void main(String[] args) {
		Wind wind = new Wind();
		tune(wind);
	}

	private static void tune(Instrument i) {
		Random random = new Random();
		int r = random.nextInt(6);
		
		switch (r) {
		case 1:
			i.play(Note.哆);
			break;
		case 2:
			i.play(Note.唻);
			break;
		case 3:
			i.play(Note.咪);
			break;
		case 4:
			i.play(Note.嗦);
			break;
		case 5:
			i.play(Note.啦);
			break;

		default:
			break;
		}
		
	}

}
