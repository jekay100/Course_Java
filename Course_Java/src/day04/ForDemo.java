package day04;

public class ForDemo {
	public static void main(String[] args) {
		int[] ary = { 6, 3, 5, 1, 5, 7 };
		int sum = 0;
		for (int i = 0; i < ary.length; i += 2) {
			sum += ary[i];
		}
		System.out.println(sum);
		char[] c = { '6', '3', '5', '1', '5', '7' };
		sum = 0;
		for (int i = 0; i < ary.length; i += 2) {
			sum += (c[i] - '0');
		}
		System.out.println(sum);
	}
}
