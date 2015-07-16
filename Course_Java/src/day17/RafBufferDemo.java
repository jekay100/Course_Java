package day17;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafBufferDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("demo.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		byte[] buf = new byte[5];//1024的话是1k.
		int count = raf.read(buf);//将文件中的数据读取到buf里反回读取了几个byte的数据，返回到5个，最后一次读取可能出现小于5
		//读几次指针移动几次指针移动到5的位置
		System.out.println(count+",");
		System.out.println(Arrays.toString(buf));
		System.out.println(raf.getFilePointer());//5
		raf.seek(raf.length());
		raf.write(buf,1,3);//从一个位置开始连续写3个
		raf.close();
	}
}
