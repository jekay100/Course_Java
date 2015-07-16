package day09.shape;

import day08.Point;

public class Circle extends Shape{
	Point center;
	double r;
	
	public Circle(int x, int y, double r){
		this(new Point(x,y), r);
	}
	public Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}
	//属于当前对像的方法
	public double area(){
		return Math.PI * r *r;
	}
	public boolean contains(Point p) {
		return center.distance(p) <= r;
	}
}
