package day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		readDemo("demo.txt");
		readByBufferDemo();
	}

	private static void readByBufferDemo()throws IOException {
		//用缓冲区读就先得有缓冲区了
		InputStream in = new FileInputStream("demo2.txt");
		byte[] buff = new byte[10];
		//count是读取的数据个数是1~10之间，永远大于0的，如果-1表示到文件尾了
		//有缓冲区的就快好多倍了
	//	int count = in.read(buff);
		int count;
		while((count = in.read(buff)) != -1){//这个容易丢，数组里面始终是空的
			System.out.println(toHexString(buff));			//转化成16进制的每个有2个16进制
		}
		in.close();
		
	}
		//byte按16进制显示
	private static String toHexString(byte[] ary) {
		// TODO Auto-generated method stub
		StringBuilder buf = new StringBuilder();
		for(int i = 0; i <ary.length; i++){
			byte b = ary[i];//byte转化为int就变成有符号的了，所以要进行掩码，但是假如字转成是负数那前面全是11，不好看我们就要把
			//前面的1去了，相当于个*法，
			//一个中文是2个byte在GBK，UTF-8是3个byte
			int a = b &0xfff ;
			String hex = Integer.toHexString(a);
			buf.append(hex).append(" ");
		}
		return buf.toString();
	}

	public static void readDemo(String filename) throws IOException {
		// 抽象类，InputStream,FileInputStream定义了从文件读取
		InputStream in = new FileInputStream(filename);
		// 读取文件，的一个byte,无符号填充到int,低8位填充
		// 返回值是0x000000ff~0x00000000;
		// 如果到文件尾了返回-1，此时最高位为1，所以有区别了
		// int b = in.read();
		// System.out.println(b);//a
		// b = in.read();
		// System.out.println(b);//b
		// b = in.read();
		// System.out.println(b);//c
		// b = in.read();
		// System.out.println(b);//-1
		int b;
		while ((b = in.read()) != -1) {
			System.out.print(b);
		}
		in.close();
	}
}
