package day16;

import java.io.File;
import java.io.FilenameFilter;

public class ListAllDemo {
	public static void main(String[] args) {
		File src = new File("src");
		list(src, ".java");
	}
	/**
	 * 显示指定文件夹的指定类型的文件
	 * 递归处理子文件夹
	 * @param dir
	 * @param ext
	 */
	public static void list(File dir, String ext){
		//显示当前目录的所有文件
		listFile(dir,ext);
		//获得当前目录的所有子目录
		File[] all = dir.listFiles();
		for (int i = 0; i < all.length; i++) {
			File d = all[i];
			if(d.isDirectory()){
				list(d,ext);
			}
		}
		//遍历子目录列出每个子目录的文件 
		
		
	}
	private static void listFile(File dir, String ext){
		File[] all = dir.listFiles(new Filter(".java"));
		for(int i = 0; i <all.length; i++){
			File f = all[i];
			System.out.println(f.getName());
		}
	}
	static class Filter implements FilenameFilter{
		private String ext;
		public Filter(String ext) {
			this.ext = ext;
		}
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.endsWith(ext);
		}
		
	}
}
