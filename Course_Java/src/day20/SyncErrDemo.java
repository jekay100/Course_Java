package day20;

public class SyncErrDemo {
	int i = 1;
//两个线程在i = 19时最容易出错，两个线程同时进去
	//i是个临界资源，两个线程公共的资源，公共资源的访问要并发，一个一个来，公共厕所
	public int getNumber() {
		if (i == 20) {
			throw new RuntimeException("Over");
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		return i++;
	}
	class MyThread extends Thread{
		public void run(){
			while(true){
				System.out.println(getNumber());
			}
		}
	}
	public void go(){
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		new SyncErrDemo().go();
	}

}
