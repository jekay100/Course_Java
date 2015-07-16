package day20;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		// Timer定时器
		final Timer t = new Timer();// 创建定时器5秒后干什么
		//底面是线程
		// schedule日程计划安排
		t.schedule(new TimerTask() {
			int i = 60;

			public void run() {
				System.out.println("还有" + i--);
				if (i == 0) {
					t.cancel();
					System.out.println("我会回来的");
				}
			}

		}, 100, 1000);// 有很多重截，指定时间，指定任务 ，一一次任务，task是个接口

	}
}
