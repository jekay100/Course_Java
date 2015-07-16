package day10.abs;

public class Rect extends Shape{
	private double  width;
	private double height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public double area(){
		return width * height;
	}
}
