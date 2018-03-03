package com.wyizd.chapter06.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 下午2:55:31
 * @Title 类访问权限
 * @Discription 
 *  类的访问权限只有两种，private 与 protected 没有意义。
 *  如果 不想让外部对该类有访问权限，可以把构造器设置private。
 */
class Connection{
	
}

class ConnectionManager{
	private Connection[] conns = new Connection[10]; 
	private Connection retConn; 
	private Connection temp;
	{
		for (int i = 0; i < conns.length; i++) {
			conns[i]=new Connection();
		}
	}
	private static ConnectionManager connectionManager = new ConnectionManager();
	private ConnectionManager() {};
	public static ConnectionManager getConnectionManager() {
		return connectionManager;
	}
	public Connection getConn() {
		for (int i = 0; i < conns.length; i++) {
			if (conns[i]!=null) {
				retConn=conns[i];
				conns[i]=temp;
				return retConn;
			}
		}
		return null;
	}
	
}

public class ClassAccessJurisdiction {
	
	public static void main(String[] args) {
		ConnectionManager cManager=ConnectionManager.getConnectionManager();
		while(cManager.getConn()!=null) {
			System.out.println("获得connetion");
		}
		
	}

}
