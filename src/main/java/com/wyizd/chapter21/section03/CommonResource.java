package com.wyizd.chapter21.section03;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月17日 下午2:40:56 
 * @Title 共享受限资源
 * @Discription 
 * 	用一个银行取款的经典例子
 * 		某账户余额3000有两张卡,老公一张，老婆一张
 * 		老公和老婆同时去两个银行取钱
 * 		流程：
 * 			老公说要取2000
 * 			银行A查看有3000,嗯,您的余额是3000，可以取
 * 			就在这同一时刻。就在这同一时刻。就在这同一时刻。老婆说要取2000
 * 			银行B查看有3000,嗯,您的余额是3000，可以取
 * 			于是，老公取走了2000,余额1000
 * 				老婆取走了2000,余额-1000
 * 	这就是并发的问题。同时处理数据会造成不可思议的意外。
 * 	即使,取款的时候还要再核实一遍余额。可问题是前面说可以取又是什么鬼问题。
 * 	老婆这就不干了,因为她要去烫头发参加聚会。这时她就要满地打滚，跟她讲道理没有用。
 * 
 * 	为了解决这个问题，干脆只能这样干。当该账户在办理业务的时候,标识一个状态。当其他银行查看到这个状态后,等待该账户办理结束。
 * 	其实java已提供synchronized 关键字，以保护代码片段
 * 	同时,可以使用static synchroized ,防止对静态数据的并发访问
 */
class Account{
	int id;
	boolean isCanceled=false;
	double money;
}
class Bank{
	static Map<Integer,Account> map = new HashMap<>();
	//或者以static synchronized修饰这个方法
	void getMoney(int AccountId,double money) {
		Account a = map.get(AccountId);
		
		//增加的内容
		if(!a.isCanceled) {
			a.isCanceled=true;//冻结账户
		}else {
			System.out.println("账户正在操作,请稍后");
			return;
		}
		//增加的内容
		
		
		System.out.println("您的余额是"+a.money);
		if(a.money>money) {
			System.out.println("可以取");
		}else {
			System.out.println("余额不足");
			return;
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("模拟业务办理时间");
		
		a.money=a.money-money;
		System.out.println("取款完毕。您的余额是"+a.money+".");
		
		//增加的内容
		a.isCanceled=false;//冻结账户
		//增加的内容
	}
	
}
class People  implements Runnable{
	Account a;
	Bank b;

	@Override
	public void run() {
		b.getMoney(a.id, 2000);
	}
}
public class CommonResource {
	public static void main(String[] args) {
		Account a = new Account();
		a.money=3000;
		a.id=62260001;
		Bank.map.put(a.id, a);
		Bank ba = new Bank();
		Bank bb = new Bank();
	
		People husband = new People();
		husband.a=a;
		husband.b=ba;
		
		People wife = new People();
		wife.a=a;
		wife.b=bb;
		
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(husband);
		es.execute(wife);
		es.shutdown();

	}
}
