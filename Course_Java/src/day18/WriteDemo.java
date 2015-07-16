package day18;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
public class WriteDemo {
	public static void main(String[] args) throws IOException{
		//
//		OutputStream os = new FileOutputStream("demo.txt", true);//追加就是true记住 了，
//		os.write("中国".getBytes("utf-8"));
//		BufferedOutputStream bos = new BufferedOutputStream(os);//这个是缓冲写在缓冲里了
//		OutputStreamWriter out = new OutputStreamWriter(bos, "utf-8");//完成的是java转码,转完之后交给outputstream
//		out.write("中国是我的祖国");//在Java中是unicode在硬盘上就成了utf-8
//		//中字符串送给out,out送给os,os写在磁盘文件上
//		//上面的这种统称结点流
		OutputStreamWriter os = new OutputStreamWriter(
				new BufferedOutputStream(
						new FileOutputStream("demo.txt")),"gbk");
		os.close();
		//GB2312是由于内存不足
	}
}
