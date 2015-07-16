package day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class IODemo {
	public static void main(String[] args) {
		
	}
	//返回的是最根本的二进制，这些全与二进制打交道，
	public static byte[] read(String filename) throws IOException{
		//不用随机方式读取了，用流式方式读取
		InputStream in = new FileInputStream(filename);//将文件打开，按输入流的方式打开，
		byte[] buf = new byte[in.available()];//新方法 ，可用的意思
		//返回流里面可读取的数据的长度，读取文件时是文件的长度
		//读到内存中的缓冲中去
		//一张照片，用的频fan如果每次用IO就很影响性能，所以先读到缓冲中去，
		in.read(buf);//把in里的东西装到buf里面，指针是单向的
		in.close();
		return buf;
	}
	//千万要看老师写的，
	//这个输入流还要自己研究编码问题
	public static String toHex(byte[] buf){//1个byte2个16进制的String
		//[00 00 00 41] -> 00000041
		//  0  0  0 41 转化成这种形式的
		char[] cs = new char[buf.length*2];
		Arrays.fill(cs,'0');
		int idx=0;
		for(byte b : buf) {
			String hex = Integer.toHexString(b&0xff);
			System.arraycopy(hex.toCharArray(), 0, cs, idx+hex.length()%2, hex.length());
			
		}
		return Arrays.toString(cs);
	}
}
