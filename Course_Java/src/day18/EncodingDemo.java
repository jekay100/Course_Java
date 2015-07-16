package day18;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EncodingDemo {
	public static void main(String[] args) throws IOException{
		printFile("./test/demo.utf16be.txt");
	}
	/**按照16进制方式输出文件内容*/
	public static void printFile(String filename) throws IOException{
		File file = new File(filename);
		//打开文件
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		byte[] buf = new byte[(int) file.length()];
		int size = raf.read(buf);
		printBytes(buf);
		String str = new String(buf, "GBK");//Java中的字符串支持编码
		System.out.println(size);
	}
	private static void printBytes(byte[] buf) {
		int j;
//		for(int i = 0; i < buf.length; i++){
//			j = buf[i] & 0xff;
//			System.out.println(j);
//		}
		//简化版的for语句for each
		for(byte b: buf){//b是buf中的每个
			String str = Integer.toHexString(b&0xff);
			System.out.print(str);
		}
		//硬盘里存的是编码
		System.out.println();
		
		
	}
}
