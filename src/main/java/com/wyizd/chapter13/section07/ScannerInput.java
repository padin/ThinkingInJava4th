package com.wyizd.chapter13.section07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 上午11:48:58
 * @Title 扫描输入
 * @Discription 
 * Scanner构造器可以接受 实现 Readable 的对象。包括 File,Inputstream,String等等。
 */
public class ScannerInput {
	public static void main(String[] args) throws FileNotFoundException {
		File file =new File("C:\\Users\\pandi\\Desktop\\备忘.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()){
			System.out.println(scanner.nextLine());
		}
		
		scanner = new Scanner(System.in) ;
		System.out.println("请输入：");
		while (scanner.hasNextLine()){
			System.out.println(scanner.nextLine());
		}
	}
}
