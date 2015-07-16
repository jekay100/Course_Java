package day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutDemo {
	public static void main(String[] args) throws IOException{
		append ("中国".getBytes("gbk"), "demo1.txt");
		//文件的读写与编码有关，假如上面按utf可能有乱码
	}
	public static void write(byte[] buf, String filename) throws IOException{
		OutputStream out = new FileOutputStream(filename);
		
		out.write(buf);
		out.close();
	}
	public static void append(byte[] buf, String filename) throws IOException{
		//追加，byte数组代表任意东西
		OutputStream out = new FileOutputStream(filename,true);//不加true的话，把里面清空了，true的话不覆盖在尾部写，false覆盖
		out.write(buf);
		out.close();
	}
}
