package day06;

import java.util.Scanner;

public class Ean13Demo {
	public static void main(String[] args) {
		System.out.print("请输入条形码：");
		Scanner console = new Scanner(System.in);
		String code = console.nextLine();
		System.out.println(ean(code));
	}

	public static String ean(String code) {
		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < 12; i += 2) {
			c1 += (code.charAt(i) - '0');
			c2 += (code.charAt(i + 1) - '0');
		}
		int c = (c1 + c2 * 3) % 10;
		int cc = (10 - c) % 10;
		return code + cc;
	}
}
