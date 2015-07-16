package day19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterDemo {
	public static void main(String[] args) throws IOException{
		//不存在自动创建，
		//相当于高级包装吧
		PrintWriter out = new PrintWriter(
				new FileWriter("question.txt"));
		out.println("1 \"同福客栈\"的老板是谁了()");
		out.println("\tA.莫小贝");
		out.println("\tB.李莫愁");
		out.println("\tC.白展堂");
		out.println("\tD.佟湘玉");
		out.println("A");
		out.println();
		
		out.println("2 \"同福客栈\"原先老板是谁了()");
		out.println("\tA.莫小贝");
		out.println("\tB.李莫愁");
		out.println("\tC.白展堂");
		out.println("\tD.佟湘玉");
		out.println("B");
		out.println();
		out.println("3 \"同福客栈\"老板的老婆是谁了()");
		out.println("\tA.莫小贝");
		out.println("\tB.李莫愁");
		out.println("\tC.白展堂");
		out.println("\tD.佟湘玉");
		out.println("C");
		out.println();
		out.println("4 \"同福客栈\"原先老板的老婆是谁了()");
		out.println("\tA.莫小贝");
		out.println("\tB.李莫愁");
		out.println("\tC.白展堂");
		out.println("\tD.佟湘玉");
		out.println("D");
		out.println();
		out.flush();//强行写到硬盘写close可以不写flush
		out.close();
		//从硬盘读回来，要写一个集合，集合是question问题里面有选项
	}
	
}
