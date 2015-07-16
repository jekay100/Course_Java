package day10.abs;

public class ShapeDemo {
	public static void main(String[] args) {
		//Shape s = new Shape();错，抽象类不能实例话，但可以有变量
		Shape s  = new Rect(3,4);
		System.out.println(s.area());
	}
}
