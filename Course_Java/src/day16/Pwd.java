package day16;

import java.io.File;

public class Pwd {
	public static void main(String[] args) {
		File file = new File(".");
		System.out.println(file.getAbsoluteFile());//保存就是编译
		
	}
}
