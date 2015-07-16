package day11;

public class VehicleDemo {
	public static void main(String[] args) {
		//Vehicle v = new Vehicle();错误，不能实例话
		//只能实现接口，
		Vehicle v;
		v = new Bicycle();
		v.run();
		v.stop();
		
		v = new Auto();
		v.run();
		v.stop();
		v = new AudiR8();
		v.run();
		v.stop();
	}
}
