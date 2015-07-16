package day02;

import java.util.Random;

public class CharDemo {
	public static void main(String[] args) {
		int i = 'A'; // 'A'的Unicode编码与acii英文编码相同
		System.out.println(i);
		char c = 'A';
		System.out.println(c);
		c = '中';
		i = '中';
		System.out.println(c);
		System.out.println(i);
		// 结论字符是一个数，println()根据参数返回结果
		char ch = 0x4e2d;
		System.out.println(ch);
		System.out.println((int) 'B');
		i = 'B' - 'A';
		System.out.println(i);
		i = 'C' - 'A';
		System.out.println(i);
		ch = 'F';
		i = ch - 'A' + 10;
		System.out.println(i);
		ch = '5';
		System.out.println(ch);
		System.out.println((int) ch);
		System.out.println((int) '0');
		// 产生26个英文字母
		Random r = new Random();
		int index = r.nextInt(26);
		System.out.println((char) (index + 'A'));
		// 产生随机字符数字
		index = r.nextInt(10);
		System.out.println((char) ('0' + index));
		// 常用的转义字符
		ch = '\'';
		System.out.println(ch);
		ch = '\n';
		System.out.println(ch);
		ch = '\\';
		System.out.println(ch);
		ch = '\u4e2d';
		System.out.println(ch);
		ch = 0x4e2d;
		System.out.println(ch);
		// 千万要小心0;
		ch = '\u0000';
		System.out.println(ch);
		ch = 0x0;
		System.out.println(ch);
		System.out.println('0' + 0);// 48
		System.out.println(0 == ch);
		System.out.println("a\tb");
		// 不同的操作系统结果好像不一样
		System.out.println("ok\u0000m123");
		System.out.println("你好中国人");

	}
}
