package day20;

public class RunnableDemo {
	public static void main(String[] args) {
		Thread t = new Thread(new Foo());
		t.start();
	}
	
}

class Foo implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++){
			System.out.println("HI");
		}
	}
	
}
