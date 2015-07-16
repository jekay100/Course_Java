package day20;

public class SleepDemo {
	public static void main(String[] args) {
		Thread t = new Thread(){
			 public void run(){
				 for(int i = 0; i < 5; i++) {
					 System.out.println("睡觉 ");
					 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println("干嘛呢，破相了");
						break;//结束for循环
					}
				 }
			 }
		 };
		 t.start();
		 for(int i = 0; i< 5; i++){
			 System.out.println("砸墙");
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("砸了");
			 t.interrupt();//打断线程t的sleep，这个线程调用他的interrupt,在sleep期间出现interrupt异常
			 //一个非常复杂的网站，是不能停机的，服务器上的软件不可能一直正常运行，写上一段异常，如果发生异常，立马通知网管，
			 //发送消息，写文件都很慢，
			 
		 }
	}
}
