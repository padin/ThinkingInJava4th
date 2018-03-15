package com.wyizd.chapter18.section07;

import com.wyizd.commons.TextFile;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午2:42:29 
 * @Title	文件读写实用工具 
 * @Discription 请参考作者的工具类TextFile
 */
public class FileIOUsefulUtil {
	public static void main(String[] args) {
		//读
		String file = TextFile.read("C:\\app\\maven\\README.txt");
		//写
		TextFile.write("C:\\app\\maven\\README2.txt", file);
	}
}
