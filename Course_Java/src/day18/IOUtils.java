package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
	public static byte[] read(String filename) throws IOException{
		return read(new FileInputStream(filename));
	}
	public static byte[] read(File file ) throws IOException{
		return read(new FileInputStream(file));//重载
	}
	public static byte[] read(InputStream in) throws IOException{
		byte[] buf = new byte[in.available()];
		in.read(buf);
		in.close();
		return buf;
	}
	public static void write(byte[] buf, String filename) throws IOException{
		write(buf, filename, false);
	}
	private static void write(byte[] buf, String filename, boolean b) throws IOException{
		OutputStream out = new FileOutputStream(filename, b);
		out.write(buf);
		out.close();
	}
	public static void append (byte[] buf, String filename) throws IOException{
		write(buf, filename, true);
	}
	public static String toHex(byte[] buf) {
		StringBuilder s = new StringBuilder();
		for(byte b :buf){
			String hex = Integer.toHexString(b&0xff);
		//	hex = leftPad(hex, '0', 2);看老师的代码 
			s.append(hex).append(" ");
		}
		return s.toString();
	}
}
