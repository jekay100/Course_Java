package day20;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("demo.txt");
		RandomAccessFile in = new RandomAccessFile(file, "r");
		//int i = in.read();
		 int i = in.read();
		System.out.println(Integer.toHexString(i));
		System.out.println(in.read());
		
	}
}
