package com.wyizd.chapter18.section02;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午6:35:36 
 * @Title 输入和输出
 * @Discription 
 * 	输入的抽象类 InputStream 
 * 	其子类有：
 * 		ByteArrayInputStream	读取字节数组到内存缓冲区
 * 		StringBufferInputStream		读取字符串转化为InputStream
 * 		FileInputStream		从文件中读取
 * 		PipedInputStream	实现管道
 * 		SequenceIputStream		将多个InputStream转为一个
 * 		FilterInputStream		抽象类,实现装饰者模式，其子类有
 * 			DataInputStream	读取基本类型
 * 			BufferedInputStream	使用缓存区
 * 			LineNumberInputStream	跟踪输入流中的行号
 * 			PushbackInputStream 	可以读到最后一个字符回退
 * 输出的抽象类 OutputStream
 * 	其子类有：
 * 		ByteArrayOutputStream	创建内存缓冲区
 * 		FileOutputStream		输出到磁盘文件
 * 		PipedOutputStream		实现管道
 * 		FilterOutputStream		抽象类,实现装饰者模式，其子类有
 * 			DataOutputStream	输出基本类型
 * 			PrintOutputStream	格式化输出
 * 			bufferedOutputStream	使用缓冲区
 */
public class InputAndOutput {

}
