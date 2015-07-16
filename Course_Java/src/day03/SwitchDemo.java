package day03;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		int score = 86;
		String level = "不及格";
		switch (score / 10) {// switch全是小写
		case 10:
		case 9:
			level = "优秀";
			break;
		case 8:
			level = "良好";
			break;
		case 7:
			level = "中等";
			break;
		case 6:
			level = "及格";
			break;
		default:
			level = "不及格";
		}
		System.out.println(level);
		// 把那个星期几转化为数字
		System.out.println("请输入星期几：");
		char dayName;
		Scanner console = new Scanner(System.in);
		String s = console.nextLine();
		dayName = s.charAt(0);

		System.out.println(parseDay(dayName));
	}

	public static int parseDay(char dayName) {
		int day = 0;
		switch (dayName) {
		case '六':
		case '6':// 不能写成||的形式
			day = 6;
			break;
		case '一':
		case '1':
			day = 1;
			break;
		case '二':
		case '2':
			day = 2;
			break;
		case '三':
		case '3':
			day = 3;
			break;
		case '四':
		case '4':
			day = 4;
			break;
		case '五':
		case '5':
			break;

		default:
			day = 0;
		}
		return day;
	}
}
