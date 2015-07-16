package day16;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FileDemo {
	public static void main(String[] args) {
		File bin = new File("bin");//相对路径，相对于当前项目
		System.out.println(bin.getAbsolutePath());//pwd
		//操作系统文件的管理命令File全能做了
		System.out.println(bin.isDirectory());//true;
		System.out.println(bin.canRead());//true
		long time = bin.lastModified();//最后改的时间
		long size = bin.length();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(time);
		System.out.println(df.format(date));
		//文件的属性
		File file = new File("src\\day16\\FileDemo.java");
		
		System.out.println(file.isDirectory());//false
		System.out.println(file.isFile());//true
		
		//管理文件/目录
		File dir = new File("demo");
		System.out.println(dir.exists());
		if(!dir.exists()){
			dir.mkdir();
			//dir.createNewFile();//touch
		}
		System.out.println(dir.exists());
		//dir.delete();//Java没有cp
		//dir.renameTo(dest);
		File test = new File("test");
		dir.renameTo(test);
		test.delete();
		
		//访问文件系统
		File work = new File(".");//当前目录，项目文件夹当前目录
		String[] list = work.list();//ls相当于数组的迭代
		System.out.println("Content in"+ work.getAbsolutePath());
		for(int i = 0; i <list.length; i++){
			String name = list[i];
			System.out.println(name);
		}
	}
}
