package day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
	//流适合处理大文件，按一个一个的byte读
	public static void split(String filename, int size)throws IOException{
		int fileIndex = 0;
		String file = filename + "." + fileIndex;//输出文件名
		InputStream in = new BufferedInputStream(new FileInputStream(filename));//可以指定大小，缓冲
		OutputStream out = new BufferedOutputStream(new FileOutputStream(file));
		int b = 0;
		int i = 0;
		while((b = in.read())!= -1){
			out.write(b);
			i++;//判断文件的指针是不是与size相等
			if(i%size == 0){
				out.close();
				file = filename + "." + fileIndex++;
				out = new BufferedOutputStream(new FileOutputStream(file));
			//	i = 0;上面取余就是这个
			}
		}
		in.close();
		out.close();	
	}
	public static void join(String filename) throws IOException{
		String file = filename.substring(0, filename.lastIndexOf("."));//拆名字
		int index = Integer.parseInt(filename.substring(filename.lastIndexOf(".")+1));
		OutputStream out = new BufferedOutputStream(new FileOutputStream(file));
		while(true){
			File f = new File(file + "." + index++);
			if(! f.exists()){
				break;//写软件不要嵌套
			}
			InputStream in = new BufferedInputStream(new FileInputStream(f));
			int b ;
			while((b = in.read()) != -1){
				out.write(b);
			}
			in.close();
		}
		out.close();
	}
}
