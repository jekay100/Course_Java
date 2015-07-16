package day21;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class FtpClient {
	OutputStream out;
	InputStream in;
	public static void main(String[] args) throws Exception{
		FtpClient client = new FtpClient();
		client.open("localhost", 8800);//把这个写在配置文件中去
	}
	public void open (String host, int port) throws Exception{
		Socket s = new Socket(host, port);
		//一个线程处理输出，一个线程对服务器的输入
		new RequestSender(out).start();//接收发送是同时进行的，各干各的没必要你一句，我一句的
		new ResponseReceiver(in).start();
	}
}

class RequestSender extends Thread{
	//请求发送者
	OutputStream out;
	public RequestSender(OutputStream out){
		this.out = out;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintWriter out = new PrintWriter(this.out, true);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try{
		while((str = in.readLine())!=null){
			out.println(str);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class ResponseReceiver extends Thread{
	//回馈接收者
	InputStream in;
	public ResponseReceiver(InputStream in){
		this.in = in;
	}
	public void run(){
		BufferedReader in = new BufferedReader(
				new InputStreamReader(this.in));
		try{
			String str;
			while((str = in.readLine())!=null){
				if(str.startsWith("text")){
					int num = Integer.parseInt(str.split(",")[1]);
				//	printText(in, num);
				}else if(str.startsWith("file")){
				//	saveFile(this.in,);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}
