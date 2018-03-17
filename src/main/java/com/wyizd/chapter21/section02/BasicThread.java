package com.wyizd.chapter21.section02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月17日 下午1:48:38 
 * @Title 基本的线程机制
 * @Discription 
 * 	通过线程模型，我们可以很方便的定义任务
 * 	1.实现Runnable接口
 * 	2.交给Thread对象
 * 	如下例所示，各个线程由线程调度器自动控制，他们可能在一个cpu上运行，也可能在多个cpu上运行。
 */

class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	
	
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	public String status() {
		return "第"+id+"号发射站---"+(countDown>0?"倒计时："+countDown:"发射！");
	}
	@Override
	public void run() {
		while(countDown-- >0) {
			System.out.println(status());
			Thread.yield();	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class BasicThread {
	public static void main(String[] args)  {
		for(int i=0;i<5;i++) {
			new Thread(new LiftOff()).start();;
		}
		//采用线程缓存池
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++) {
			es.execute(new LiftOff());
		}
		es.shutdown();
		//采用单例执行器
		ExecutorService es2 = Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++) {
			es2.execute(new LiftOff(5));
		}
		
	}
}
