package day08;

public class Point {
	// 画一下内存中的占用
	int x;
	int y;

	public Point(int x, int y) {//没有static 和返回类型
		//这里面是构造的过程,x,y就是前提，要创建一个点必须有x,y
		this.x = x;// this相当于对象的实例给了当前对像的x
		this.y = y;
	}
	public double distance (Point other) {
		return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
	}
	
}
