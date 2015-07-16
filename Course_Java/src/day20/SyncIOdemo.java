package day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SyncIOdemo {
//同步读取控制台写到一个文本文件 
	public static void main(String[] args) throws IOException{
		//传统写法
		BufferedReader console = new BufferedReader(
				new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter("sync.txt"));
		String str;
		while((str = console.readLine())!= null){
			out.println(str);
			if("exit".equalsIgnoreCase(str)){
				break;
			}
		}
		console.close();
		out.close();
	}
}
