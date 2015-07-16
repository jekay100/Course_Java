package day16;

import java.io.File;
import java.io.FilenameFilter;

public class LsDemo {
	//列有条件的目录
	public static void main(String[] args) {
		File work = new File("src/day16");
		String sss = ".java";
		String[] list= work.list(new Fileter(sss));//这是个回调函数
		System.out.println(work.getAbsolutePath());
		
		for(int i = 0; i < list.length; i ++) {
			String name = list[i];
			System.out.println(name);
		}
	}
	//静态内部类
	//过滤器（文件名字过滤器）
	static class Fileter 
		implements FilenameFilter{
		private String sss;
		public Fileter(String sss){
			this.sss = sss;
		}
		//接受，软件安装时，你接不接受当前文件目录和文件
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.endsWith(sss);
		}
	}
}
