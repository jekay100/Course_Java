package day05;
import java.util.Scanner;
public class MethodDemo {
	public static void main(String[] args) {
		int x  = 5;
		int y = f(x);
		double m;
		Scanner console = new Scanner(System.in);
		m = console.nextDouble();
		double d = k(m);
		System.out.println(d);
		System.out.println(r(d));
	}
	//Java中的方法
	public static int f(int x) {
		int y = x *3 +2;
		return y;
	}
	public static double k(double time) {
		double g = 9.8;
		double m = g*time *time/2;
		return m;
	}
	
	public static long r (double d) {
		return(long)(d +0.5);
	}
}
