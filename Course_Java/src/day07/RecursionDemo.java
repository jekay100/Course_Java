package day07;

public class RecursionDemo {
	public static void main(String[] args) {
		int x = f(233);
		System.out.println(x);
		long d  = g(3);
		System.out.println(d);
	}
	public static int f(int n) {
		if(n == 1) {
			return 1;
		}
		return n + f(n - 1);
	}
	public static long g(int n) {
		if (n == 1) {
			return 1;
		}
		return n * g(n-1);
	}
	
	public static double m(int n) {
		if (n==2) {
			return 0.5;
		}
		return 1.0 /n + m(n-1);
	}
}
