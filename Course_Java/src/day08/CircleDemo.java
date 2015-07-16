package day08;

import day09.shape.Circle;

public class CircleDemo {
	public static void main(String[] args) {
		Point p = new Point(1,1);
		Point o= new Point(0,0);
		Point p1 =new Point(2,2);
		Circle c = new Circle(o, 2);
		System.out.println(c.contains(p));
	}
}
