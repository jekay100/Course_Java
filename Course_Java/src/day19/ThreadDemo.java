package day19;

public class ThreadDemo {
	public static void main(String[] args) {
		// 不能把类名写成Thread，因为如果写成这样的话，下面的类不知道定义的是哪个了
		MyThread t = new MyThread();
		t.start();// 各做各的，启动了这个线程，然后再往下面运行
		// t.run没有出现并发，那个start就是启动了丢一边让run自己执行，而执行用run的话，就会出现顺序执行
		// 相当于发动了一台三轮，这台三轮自己运行了，我可以另为start一台汽车，这台汽车自己也运行了，我还可以做其他事了
		
		YouThread th = new YouThread();
		th.start();
		TheyThread t2 = new TheyThread();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY - 1);
		System.out.println("over");// 其实over这个也是线程，主线程，这个时候是主线程启动了两个线程
		// 先over因为main一直运行
		t.setDaemon(true);//设置成后台进程，守护者的意思，计时是后台进程，假如我交卷了，把它给杀了，
		//写游戏里面播放音乐，一直播放，假如软件结束了，就自动关了，所以是后台线程
		//Java的垃圾收集器也是后台线程，没有引用的对象 自动回收，启动的java程序，至少有两个线程main线程
		
	}

}

// 线程类
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("我抽出皮筋，打你家玻璃" + i);
			Thread.yield();// 出让线程的时间片，排到runnalbe
//			try {
//				Thread.sleep(1000);//他可以提前回来，当他没有睡够别人把它叫醒了，发生意常了，中断异常
//				//打断发生异常
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				//中断异常
//			}
		}
	}
}

// 100次太少了，所以创建两个线程，一个时间片就做完了
class YouThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("你干嘛了" + i);
			if (i % 2 == 0) {
				Thread.yield();// 出让线程的时间片，排到runnalbe
			}
		}
	}
}

class TheyThread extends Thread{
	@Override
	public void run() {
		System.out.println("我是谁呀");
	}
}
