package com.wyizd.chapter18.section09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午3:07:38
 * @Title 进程控制
 * @Discription
 */

public class ProcessControl {
	public static void command(String command) throws IOException {
		boolean err = false;
		// 执行命令
		Process process = new ProcessBuilder(command.split(" ")).start();
		// 读取线程输出
		BufferedReader bf = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String s;
		while ((s = bf.readLine()) != null) {
			System.out.println(s);
		}
		// 读取线程错误输出
		BufferedReader error = new BufferedReader(new InputStreamReader(process.getInputStream()));
		while ((s = error.readLine()) != null) {
			System.out.println(s);
			err = true;
		}
	}

	public static void main(String[] args) throws IOException {
		command("ping www.baidu.com");
	}
}
