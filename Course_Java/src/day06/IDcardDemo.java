package day06;

import java.util.Scanner;

public class IDcardDemo {
	public static void main(String[] args) {
		String id = "";
		Scanner console = new Scanner(System.in);
		do {
			id = console.nextLine();
		} while (verify(id));
	}

	public static boolean verify(String id) {
		if (id.length() != 18) {
			return false;
		}
		int [] w = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		int sum = 0;
		for (int i = 0; i < w.length; i++) {
			sum += (id.charAt(i)-'0')*w[i];			
		}
		int c = sum %11;
		char[] ch = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
		char code = ch[c];
		char last = id.charAt(17);
		last = last =='x'?'X':last;
		return last == code;
	}
}
