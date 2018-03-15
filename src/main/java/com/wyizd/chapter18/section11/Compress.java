package com.wyizd.chapter18.section11;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午4:07:46
 * @Title 压缩
 * @Discription
 */

public class Compress {

	static void gzip(String fileName, String gzipName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedOutputStream bos = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(gzipName)));
		int c;
		while ((c = br.read()) != -1) {
			bos.write(c);
		}
		br.close();
		bos.close();
	}

	static void zip(String fileName, String zipName) throws Exception {
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipName));
		BufferedOutputStream bos = new BufferedOutputStream(zos);
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		zos.putNextEntry(new ZipEntry(fileName));
		int c;
		while((c=br.read())!=-1) {
			bos.write(c);
		}
		bos.close();
		zos.close();
		

	}

	public static void main(String[] args) throws Exception {
			gzip("data.txt", "data.gz");
			gzip("data.txt", "data.zip");
	}

}
