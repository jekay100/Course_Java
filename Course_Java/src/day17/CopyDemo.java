package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
	//文件的拆分与
	public static void main(String[] args) throws IOException{
		copy("test.txt", "demo1.txt");
	}

	private static void copy(String src, String dst) throws IOException{
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);
		byte[] buff = new byte[1024];
		int count;
		while((count = in.read(buff))!= -1){
			out.write(buff, 0, count);
		}
		in.close();
		out.close();
	}
}
