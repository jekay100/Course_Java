package day20;

public class SyncDemo {
	Object monitor = new Object();
	int i = 1;

	// 两个线程在i = 19时最容易出错，两个线程同时进去
	// i是个临界资源，两个线程公共的资源，公共资源的访问要并发，一个一个来，公共厕所
	public int getNumber() {
		//Object，有个锁的属性了，所有子类全继承了
		//t1，进去了，t2Block不是Runnable,然后进入Running,此时抢，看谁先抢到锁
		//synchroized(new Object())自己创建一个锁，同一把锁才可以
		//这里经常被写成this,当前类的实例
		//这个方法全是synchronized可以写成方法上
		//public  synchronized int  getNumber(){
		synchronized (monitor) {//java中任何对象实例都可以当锁
			if (i == 20) {
				throw new RuntimeException("Over");
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
			return i++;
		}
	}

	class MyThread extends Thread {
		public void run() {
			while (true) {
				System.out.println(getNumber());
			}
		}
	}

	public void go() {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		//不能写成new SyncDeme.go
		new SyncDemo().go();
	}

}
