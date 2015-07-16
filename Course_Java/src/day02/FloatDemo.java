package day02;

import java.util.Scanner;

public class FloatDemo {
	public static void main(String[] args){
		//下面的代码为了说明float比double差
		int ax = 0x7fffffff;
		System.out.println(ax);
		int ay = 0xffffff0;
		System.out.println(ay);
		float fx = ax;
		System.out.println(fx);
		float fy = ay;
		System.out.println(fy);
		System.out.println(ax - ay);
		System.out.println(fx - fy);
		
		double dx = ax;
		double dy = ay;
		System.out.println(dx - dy);
		float f = 2.0f;//不加f就错了
		System.out.println(f);
		short s = 2;//short是小写的
		System.out.println(s);
		//计算机输出的是10进制的，但是是按二进制取舍，全部是按二进制运算
		Scanner console = new Scanner(System.in);
		double d = console.nextDouble();
		System.out.println(d);
		System.out.println((int)(d + 0.5));
	}
}
