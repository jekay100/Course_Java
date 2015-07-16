package day17;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
public class FileFilterDemo {
	public static void main(String[] args) {
		File dir = new File(".");
		System.out.println("Call listFiles");
		File[] list = dir.listFiles(new MyFilter());
		System.out.println("End listFiles");
		System.out.println(Arrays.toString(list));
		list = dir.listFiles(new FileFilter() {
			
			public boolean accept(File pathname) {
				
				return pathname.getName().startsWith(".");
			}
		});
	}
	static class MyFilter implements FileFilter{
		public boolean accept(File pathname) {//listfile方法接受还是不接受，这个方法的返回值
			// TODO Auto-generated method stub
			//有一个文件调用一次，被调用还是
			System.out.println(pathname.getName());//跟踪代码
			return false;
		}
	}
}
