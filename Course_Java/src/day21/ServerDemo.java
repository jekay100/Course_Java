package day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//服务器里面的TCP就是Socket编程
public class ServerDemo {
	public static void main(String[] args) throws Exception{
		ServerDemo server = new ServerDemo();// 服务器监听那个端口
		server.listen(8900);
	}

	public void listen(int port) throws Exception {// 这个东西有异常
		ServerSocket ss = new ServerSocket(port);// 计算机是食堂，new之后相当于开了个窗口，但是没有开张
		while (true) {
			Socket socket = ss.accept();// 可以接受请求了，是个阻塞方法.返回一个学生

			// 上面的方法一直等着，直到有学生进来
			new ClientAgent(socket).start();// 我要吃饭，有个客户代理给你找位置，给你点菜，是个线程，这个线程启动后，要回到下一个客户的连接
		}
	}
}
class ClientAgent extends Thread{
	Socket socket;
	public ClientAgent(Socket socket){
		this.socket = socket;
	}
	public void run(){
		//提供客户的服务，建立流，来交流
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//这个异常不能抛出
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			out.println("您好，今天来点啥");
			out.flush();//必须flusth
			String str = in.readLine();//阻塞式方法 ，等客户说话
			if(str.trim().equals("包子")){
				out.println("这个没有");
				out.flush();//因为服务器里面有个缓冲了全写到服务器里面的缓问里
			}
			socket.close();//没里面没有就找了，呵呵
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
