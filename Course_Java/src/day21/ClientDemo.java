package day21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8900);
		// 有返回值代表连上了，客户端的Socket代表服务器，服务器的socket代表客户
		BufferedReader in = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));// 这个异常不能抛出
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		String str = in.readLine();
		System.out.println(str);
		out.println("包子");//必须flush否则在肚子里了
		out.flush();
		str = in.readLine();
		System.out.println(str);
	}
}
