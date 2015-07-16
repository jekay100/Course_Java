package day17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException{
		//打开具有输入缓冲的流，当取出流中的数据的时候，BufferedInputStream会将数据成块的读入内存，再读入
		//家里的水钢，就是、为了不让频繁访问硬盘（读取），前面写的那些，缓冲全是我维护的
		BufferedInputStream in = //他的父类型还是InputStream
				new BufferedInputStream(//缓冲的文件输出，和输入
						new FileInputStream("demo.txt"));//包装类可以为任务流不只是文件流
		int b = in.read();//重缓冲区里取出第一个个的byte
		System.out.println(b);
		in.close();
		//创建带有输出缓冲的流
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("demo1.txt"));
		//提高效率，copy的那个不用Buffer也行了
		//先缓冲到BufferedOutputStream中的byte数组中然后一次性写入硬盘
		out.write(0x41);//先写在缓冲区里了没有真正写上，有可能写上close就有了因为执行close时，执行了flush刷出，强行把缓冲区里的东西刷出
		//可以不写flush，close默认带了
		out.flush();
		out.close();
	}
}
