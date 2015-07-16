package day09.shape;

import day08.Point;

/**
 * 矩形，长方形
 * 
 * @author user
 * 
 */
public class Rectangle extends Shape {
	private Point location;
	private int width;
	private int height;
	//这个好呵呵
	public Rectangle(int x, int y ,int width, int height) {
		this(new Point(x, y), width, height);
	}
	public Rectangle(Point location, int width, int height) {
		this.location = location;
		this.width = width;
		this.height = height;
	}
	
	public double area(){
		return width * height;
	}
}
