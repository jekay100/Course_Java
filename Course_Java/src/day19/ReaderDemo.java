package day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
	public static void main(String[] args) throws IOException{
		//过滤性的流，不能直接打开流
		BufferedReader in = new BufferedReader(new FileReader("question.txt"));
		//读到尾返回的是空
		String str;
		while((str=in.readLine())!= null){
			System.out.println(str);
		}
	}
}
