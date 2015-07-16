package day19;

public class InnerThreadDemo {
	public static void main(String[] args) {
		new Thread(){
			//Thread里面的run方法是空的什么也做不了
			//new Thread(){}返回子类的引用 
			//run里面的方法 是覆盖
			public void run(){
				for(int i = 0; i < 5; i++){
					System.out.println("HI");
				}
			}
		}.start();//匿名类是对原类的继承
		//这么写彻底把线程封装了，封装在线程的内部了
		new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i< 3; i++){
					System.out.println("HI");
				}
			}
		}).start();//这里面start调用run
	}	
}
