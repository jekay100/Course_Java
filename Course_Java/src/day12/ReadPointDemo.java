package day12;

import day11.Point;
import java.util.Scanner;

public class ReadPointDemo {
	public static void main(String[] args) {
		Point p = readPoint();
		System.out.println(p);
	}

	public static Point readPoint() {
		Scanner console = new Scanner(System.in);
		while (true) {//return把true给杀掉了好方法，可以改成输入正确的email
			System.out.println("输入坐标");
			String str = console.nextLine();
			String reg = "^\\d+[,\\s]\\s*\\d+$";
			if (str.matches(reg)) {
				String[] data = str.split("[,\\s]\\s*");
				int x = Integer.parseInt(data[0]);
				int y = Integer.parseInt(data[1]);
				return new Point(x, y);
			}
		}
	}

}
