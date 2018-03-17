package com.wyizd.chapter21.section05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月17日 下午5:47:41 
 * @Title 线程之间协作
 * @Discription 
 * 	wait()	挂起，表示已处理完毕当前任务，处于等待任务状态
 * 	notify()	通知
 * 	与notifyAll()	通知所有
 */
class Meal {
	private final int orderNum;

	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}
	@Override
	public String toString() {
		return "Meal [orderNum=" + orderNum + "]";
	}
}
class Restaurant{
	Meal meal;
	ExecutorService es = Executors.newCachedThreadPool();
	Waiter w = new Waiter(this);
	Chef c = new Chef(this);
	public Restaurant() {
		es.execute(c);
		es.execute(w);
	}
}

class Chef implements Runnable{
	private Restaurant restaurant;
	private int count = 0;
	public Chef(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				synchronized(this) {
					while(restaurant.meal!=null) {
						wait();
						System.out.println("厨师在休息");
					}
					if(++count==10) {
						System.out.println("厨师：没菜了,下班");
						restaurant.es.shutdownNow();
					}else {
						
					}
				}
				
				
				synchronized(restaurant.w) {
					if(count<10) {
						restaurant.meal= new Meal(count);
						System.out.println("厨师：上菜");
						restaurant.w.notify();
						
					}
					
					
				}
				TimeUnit.MILLISECONDS.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("厨师休息了");
		}
		
	}
	
}
class Waiter implements Runnable{
	private Restaurant restaurant;
	public Waiter(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				synchronized(this) {
					while(restaurant.meal == null) {
						System.out.println("服务员在看电视");
						wait();
					}	
				}
				System.out.println("服务员：菜来了==>"+restaurant.meal);
				synchronized(restaurant.c) {
					restaurant.meal=null;
					restaurant.c.notify();
				}
			}
		} catch (InterruptedException e) {
			System.out.println("服务员休息了");
		}
	}
	
	
}
public class TaskCoordination {
	public static void main(String[] args) {
		new Restaurant();
	}
}
