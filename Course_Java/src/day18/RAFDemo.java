package day18;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("demo.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		RandomAccessFile raf = 
				new RandomAccessFile(file, "rw");
		///这个千万要看老师的代码了，这个是读成byte数组了
		raf.writeInt(65);//新方法 ，write写出数据的后8位，前面的0去了，writeInt();把后面的数按整数形式输出
		//raf.writeLong(65)
		//raf.write("中国".getBytes("GBK"));
		System.out.println(raf.getFilePointer());//4int不去前面的位数
		raf.seek(0);
	//	byte[] buf = new byte[(int)raf.length()];
		raf.close();
		//文本按编码，
		//一个byte一个byte的就形成了流
		
		System.out.println(raf.read());
	}
}
