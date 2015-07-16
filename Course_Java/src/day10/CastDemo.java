package day10;

import day09.shape.Circle;
import day09.shape.Shape;
import day09.shape.Rectangle;

public class CastDemo {
	public static void main(String[] args) {
		Circle c = new Circle(2,2,4);//自动类型转换
		Shape s = c;
		//instanceof实例的, 对象和类型 的比较.这是个运算符
		//这个运算符经常和if语句配合
		boolean isCircleType = s instanceof Circle;
		System.out.println(isCircleType);
		Circle c1 = (Circle)s;
		System.out.println(c1);
		Shape s3 = new Rectangle(2, 3, 3,4);
		boolean isShape = s3 instanceof Circle;
		System.out.println(isShape);
		//Circle c3 = (Circle) s3;//出现运行错误
		if(s3 instanceof Rectangle) {
			Rectangle c2 = (Rectangle)s3;
			System.out.println(c2.area());
		}
		
	}
}
