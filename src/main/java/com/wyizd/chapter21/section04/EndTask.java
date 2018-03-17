package com.wyizd.chapter21.section04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月17日 下午4:17:26 
 * @Title 终结任务
 * @Discription 
 */
class Count{
	private int count =0;
	private Random rand = new Random();
	public synchronized int increment() {
		int temp = count ;
		if(rand.nextBoolean()) {
			Thread.yield();
		}
		return (count = ++temp);
	}
	public synchronized int value() { return count ; };
}
class Entrance implements Runnable{
	private static Count count = new Count();
	private static List<Entrance> list = new ArrayList<>();
	private int number = 0;
	private final int id;
	private static volatile boolean canceled = false;
	public static void cancel() { canceled = true ; }
	
	public Entrance(int id) {
		this.id = id;
		list.add(this);
	}

	@Override
	public void run() {
		while(!canceled) {
			//同步块
			synchronized(this){
				++number;
			}
			System.out.println(this+"已过关卡："+count.increment());
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("停止："+this);
	}
	public synchronized int getValue() {return number;}

	@Override
	public String toString() {
		return "Entrance [关卡=" + id + ", 已通过=" + number + "]";
	}	
	
	public static int getTotalCount() {
		return count.value();
	}
	public static int sumEntrances() {
		int sum = 0;
		for(Entrance entrance : list) {
			sum+=entrance.getValue();
		}
		return sum;
	}
	
}
public class EndTask {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		
		for(int i = 0 ; i < 5 ; i++) {
			es.execute(new Entrance(i));
		}
		//休眠三秒
		TimeUnit.SECONDS.sleep(10);
		//停止业务
		Entrance.cancel();
		//停止线程
		es.shutdown();

		//等待三秒,检查线程池状态
		if(!es.awaitTermination(3, TimeUnit.SECONDS)) {
			System.out.println("有的任务没有结束");
		}
			
		System.out.println("总量："+Entrance.getTotalCount());
		System.out.println("总关卡:"+Entrance.sumEntrances());
		
	}
}
