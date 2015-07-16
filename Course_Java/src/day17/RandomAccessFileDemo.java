package day17;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileDemo {
	//再抛出
	public static void main(String[] args)throws IOException {
		File file = new File("demo.txt");
		//ABCDABCDABCDABCDABCD原始文件内容默认有个游标，用read读一下返回A的数值（无符号填充到整数中去了，返回是整数类型）
		//00000000 00000000 00000000 01000001 A把A填到低8位去了高位是空的   32个0是整数 
		//读一下就返回A,然后移动光标
		//
		RandomAccessFile raf = new RandomAccessFile(file, "rw");//如果没有可写属性就出现问题了
		System.out.println(raf.getFilePointer());	
		int b = raf.read();
		System.out.println(raf.getFilePointer());
		System.out.println(Integer.toHexString(b));
		System.out.println(b);
		raf.close();
		
		String str = "lsidfkjfdjkfjsdkfjksdjfkjfjlsqieiur";
		String code ="3,5,6";
		System.out.println(readMail("mail.txt", code));
		//自用mail加密返回一段序列
	}
	public static String readMail(String filename, 
			String code)throws IOException{
		File file = new File(filename);
		RandomAccessFile raf = new RandomAccessFile(filename, "r");//只读打开文件
		
		String[] idx = code.split(",");
		StringBuilder buf = new StringBuilder();
		for (int i =0; i < idx.length; i++){
			String s = idx[i];
			raf.seek(Integer.parseInt(s));
			int b = raf.read();
			char c = (char) b;
			buf.append(c);
		}
		raf.close();//务必关闭文件
		return buf.toString();
	}
	
	public static void lowecase(String filename) throws IOException{
		File file = new File(filename);
		RandomAccessFile raf = new RandomAccessFile(file, "rw");//打开文件
		int pos = 0;//相当于指针从头开始读
		while(pos < file.length()){//在文件内部
			int b = raf.read();//读一个Byte数据
			if(b >='A' && b <= 'Z'){//b是大写字母
				//怎么把一个字母转小写
				//'B' - ‘b' == 'A' - 'a';把那个B换成上面的b,然后运算
				b = b - ('A' - 'a');//小写的b
				raf.seek(raf.getFilePointer() -1);
				raf.write(b);//一读指针就动了，所以要很回退了 
			}
			pos++;//这个是什么意思了
		}
		raf.close();
	}
	/** 将一个小文件读取到内存的byte数组中去*/
	public static byte[] read(String filename)throws IOException{
		File file = new File(filename);
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		byte[] buf = new byte[(int) raf.length()];
		int count = raf.read(buf);
		raf.close();
		return buf;
	}
}
