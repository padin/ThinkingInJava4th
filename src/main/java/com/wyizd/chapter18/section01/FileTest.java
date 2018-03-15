package com.wyizd.chapter18.section01;
/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午6:02:55 
 * @Title	 File类
 * @Discription 
 * File file = new File(".");
 * 这里我猜是引用了Linux的思想，
 * .代表目录，那么也就是说，一切都是文件（包括文件夹）
 * FilenameFilter用于过滤文件名
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter{
	private Pattern pattern ;
	public DirFilter(String regex) {
		this.pattern = Pattern.compile(regex);
	}
	@Override
	public boolean accept(File dir, String name) {
		
		return pattern.matcher(name).matches();
	}
}
public class FileTest {
	public static void main(String[] args) {
		test(new String[] {});
		System.out.println("======================================================");
		test(new String[] {"^[a-zA-Z0-9]+\\.xml$"});
	}
	public static void test(String[] args) {
		File file = new File(".");
		String[] list;
		if(args.length == 0) {
			list = file.list();
		}else {
			list = file.list(new DirFilter(args[0]));
		}
		
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
