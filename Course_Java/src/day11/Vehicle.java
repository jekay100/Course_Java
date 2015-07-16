package day11;


public interface Vehicle {
	/** 当前交通工具的类型，0代表汽车，1代表自行车2*/
	public static final int CAR = 0;
	int BICYCLE = 1;
	int BUS = 2;
	public abstract int getType();
	void run();
	void stop();
}
