package com.wyizd.chapter18.section10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午3:25:26
 * @Title 新I/O
 * @Discription
 */
public class NewIO {
	public static void main(String[] args) {

		try {
			FileChannel fc = new FileOutputStream("data.txt").getChannel();
			fc.write(ByteBuffer.wrap("创建的内容".getBytes()));
			fc.close();

			fc = new RandomAccessFile("data.txt", "rw").getChannel();
			fc.position(fc.size());
			fc.write(ByteBuffer.wrap("增加的内容".getBytes()));
			fc.close();

			fc = new FileInputStream("data.txt").getChannel();
			ByteBuffer bb = ByteBuffer.allocate(1024);

			fc.read(bb);
			bb.flip();
			byte[] bytes = new byte[bb.remaining()];
			while(bb.hasRemaining()) {
				bb.get(bytes, 0, bytes.length);
			}
			String s = new String(bytes, "UTF-8");
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

// public static String bytesToHexString(byte[] src){
//
// StringBuilder stringBuilder = new StringBuilder("");
// if (src == null || src.length <= 0) {
// return null;
// }
// for (int i = 0; i < src.length; i++) {
// int v = src[i] & 0xFF;
// String hv = Integer.toHexString(v);
// if (hv.length() < 2) {
// stringBuilder.append(0);
// }
// stringBuilder.append(hv);
// }
// return stringBuilder.toString();
//
// }
