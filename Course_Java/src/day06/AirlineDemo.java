package day06;

import java.util.Scanner;

public class AirlineDemo {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		char date = str.charAt(0);
		if (hasAirline(date)) {
			System.out.println("有航班");
		} else {
			System.out.println("没有");
		}
	}

	public static boolean hasAirline(char date) {
		boolean[] hasLine = { false, true, false, true, false, true, false };
		return hasLine[parseDay(date)];
	}

	public static int parseDay(char date) {
		int level = 0;
		switch (date) {
		case '一':
		case '1':
			level = 1;
			break;
		case '二':
		case '2':
			level = 2;
			break;
		case '三':
		case '3':
			level = 3;
			break;
		case '四':
		case '4':
			level = 4;
			break;
		case '五':
		case '5':
			level = 5;
			break;
		case '六':
		case '6':
			level = 6;
			break;
		default:
			throw new IllegalArgumentException("错误");
			// throw new IllegalArgumentException
		}
		return level;
	}
}
