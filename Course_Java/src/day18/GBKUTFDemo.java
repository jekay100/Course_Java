package day18;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class GBKUTFDemo {
	public static void main(String[] args) throws IOException{
		File file1 = new File("./test/demo_utf16be.txt");
		RandomAccessFile raf = new RandomAccessFile(file1, "r");
		byte[] buff = new byte[10];
		int count = raf.read(buff);
		int b;
		for(int i = 0; i <buff.length; i++){
		 b= buff[i]&0xff;
		 Integer.toHexString(b);
			
		}
		System.out.println(Arrays.toString(buff));
	}
}
