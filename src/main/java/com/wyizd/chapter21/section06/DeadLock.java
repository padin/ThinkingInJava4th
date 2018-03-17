package com.wyizd.chapter21.section06;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月17日 下午7:10:42 
 * @Title 死锁
 * @Discription
 * 	经典死锁案例
 * 	哲学家就餐问题
 * 	
 */

/**
 * 筷子
 */
class Chopstick{
	private boolean taken = false;
	public synchronized void take() throws Exception{
		while(taken) {
			wait();
		}
		taken = true;
	}
	public synchronized void drop() {
		taken = false;
		notifyAll();
	}
}
/**
 * 
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月17日 下午8:45:43
 * @Title 
 * @Discription
 */
class Philosopher implements Runnable{
	private Chopstick left;
	private Chopstick right;
	private final int id ;
	private final int ponderFactor;
	private Random r = new Random();
	private void pause() throws Exception{
		if(ponderFactor == 0) return ;
		TimeUnit.MILLISECONDS.sleep(ponderFactor*250);
	}
	public Philosopher(Chopstick l,Chopstick r,int id,int ponder) {
		left = l;
		right = r;
		this.id=id;
		ponderFactor=ponder;
	}
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				System.out.println("哲学家["+id+"]在思考");
				pause();
				System.out.println("哲学家["+id+"]摸摸左边");
				left.take();
				System.out.println("哲学家["+id+"]摸摸右边");
				right.take();
				System.out.println("哲学家["+id+"]在进餐");
				pause();
				left.drop();
				right.drop();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}


public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		int ponder = 10;
		ExecutorService es = Executors.newCachedThreadPool();
		Chopstick[] cs = new Chopstick[5];
		for(int i = 0;i<5;i++) {
			cs[i] = new Chopstick();
		}
		for(int i= 0;i<5;i++) {
			es.execute(new Philosopher(cs[i],cs[(i+1)%5], i, ponder));
		}
		TimeUnit.SECONDS.sleep(5);
		es.shutdown();
		
	}
}
