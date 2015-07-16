package day11;
/**
 * 抽象类实现了接口，汽车部分具体，部分抽象
 * @author user
 *
 */
public abstract class   Car implements Vehicle{
	public int getType(){
		return CAR;
	}
	public void run(){
		System.out.println("给油就走");
	}
	//抽象类没必要全实现接口方法
	//public abstract void stop();
}
