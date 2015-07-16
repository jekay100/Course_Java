package day20;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

public class UnsyncIODemo {

	// 这两个线程共享一个缓冲区
	WriteThread w = new WriteThread();
	ReadThread r = new ReadThread();
	List<String> buf = new ArrayList<String>();

	class WriteThread extends Thread {
		public void run() {
			try {
				PrintWriter out = new PrintWriter(new FileWriter("sync1.txt",true));
				while (true) {
					if (buf.isEmpty()) {
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// 这个异常没用不会出现
							//InpterruptedException可以实现 通信
						}
						continue;
					}
					out.println(buf);
					System.out.println("wringln");
					buf.clear();//写完之后缓冲区淤清调
					out.close();//文件别长期战用，不行的，用完了关，关完了用
				}
				
			} catch (IOException e) {
				System.out.println("文件出错了");
			}
		}
	}

	// 线程的异常不能抛了
	class ReadThread extends Thread {
		public void run() {
			BufferedReader console = new BufferedReader(new InputStreamReader(
					System.in));
			String str;
			try {
				while ((str = console.readLine()) != null) {
					buf.add(str);
					w.interrupt();
					if ("exit".equalsIgnoreCase(str)) {
						w.interrupt();
						break;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("文件读取出错了，亲");
			}
		}
	}

	public void go() {
		WriteThread w = new WriteThread();
		ReadThread r = new ReadThread();
		w.setDaemon(true);
		w.start();
		
		r.start();
	}

	public static void main(String[] args) {
		new UnsyncIODemo().go();
	}
}
