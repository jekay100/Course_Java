package day21;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FtpServer {
	public static void main(String[] args) throws Exception {
		FtpServer server = new FtpServer();
		server.listen(8800);
	}

	public void listen(int port) throws Exception {
		ServerSocket ss = new ServerSocket(port);
		while (true) {
			Socket socket = ss.accept();// 等待客服端连接
			System.out.println("客户端连上了");
			new ClientAgent1(socket).start();
		}
	}
}

class ClientAgent1 extends Thread {
	Socket socket;
	InputStream in;
	OutputStream out;

	public ClientAgent1(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader in = new BufferedReader(new InputStreamReader(this.in));
		PrintWriter out = new PrintWriter(this.out, true);// 有个方法
															// 自动清缓冲，调println自动清理缓冲看API
		try {
			while (true) {
				out.println("你好欢迎使用FTP Demo");
				String cmd = in.readLine();//有异常,客户端给的是命令
				if("?".equals(cmd)){
					out.println("支持，ls,get,?,bye");
				}else{
					out.println("不知可否！");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
