package day17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException{
		writeDemo();
	}

	private static void writeDemo() throws IOException{
		//写小说，RandomAccessFile这个能同时读写，面InputStream只能读，只能按顺序的来
		OutputStream out = new FileOutputStream("test.txt");//向文件中写
		//写出一个int的第八位，也就是按byte写的
		out.write(65);//A高24位是0
		out.write(66);
		byte[] buff = {98,99,90};
		out.write(buff);//有三个，
		out.write(buff,1,2);
		out.write("试试吧".getBytes("UTF-8"));
		out.close();
	}
}
