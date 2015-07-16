package day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ReadDemo {
	public static void main(String[] args) throws IOException{
		InputStream is = new FileInputStream("demo.txt");//中是6d60
		//打开文件，打开流
		InputStreamReader in = new InputStreamReader(is, "utf-8");//按GBK读取大小写全行了
		char c = (char)in.read();//这个read根据in读取is//低16位弄了变成 char
		//这个c就成了4e2d了说明这个方法得到是是编码解析后的字符
		System.out.println(c);//read一个按照一个字符经过编码以后的字符 ，不是一个byte
		//所以读文本用inputstreamreader，用前面的弄出来还有转码
		
	}
}
