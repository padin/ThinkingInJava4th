package com.wyizd.chapter18.section06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午2:12:13
 * @Title I/O典型使用方式
 * @Discription
 * 
 */
public class IOUsageMode {
	public static String testBufferedInputFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\app\\maven\\README.txt"));
			String s;
			StringBuilder sb = new StringBuilder();
			while ((s = br.readLine()) != null) {
				sb.append(s + "\n");
			}
			System.out.println(sb.toString());
			return sb.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void testMemoryInput() {
		StringReader sr = new StringReader(testBufferedInputFile());
		int c ;
		try {
			while((c=sr.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testFileWriter() {
		String file = "BasicFileOutput.out";
		try {
			BufferedReader br = new BufferedReader(new StringReader(testBufferedInputFile()));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			int lineCount = 1;
			String s ;
			while((s=br.readLine())!=null) {
				pw.println(lineCount++ + ":	"+s);
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//testBufferedInputFile();
		//testMemoryInput();
		testFileWriter();
		
	}
}
