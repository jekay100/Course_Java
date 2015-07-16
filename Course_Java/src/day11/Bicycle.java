package day11;
/**
 * 自行车，是交通工具 的实现，是一种具体的交通工具 
 * @author user
 *
 */
public class Bicycle implements Vehicle{

	public int getType() {
		// TODO Auto-generated method stub
		return BICYCLE;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("用腿蹬");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("撞墙");
	}
	
}
