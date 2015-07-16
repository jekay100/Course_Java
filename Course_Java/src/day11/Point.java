package day11;

public class Point {
	// 画一下内存中的占用
	int x;
	int y;

	public Point(int x, int y) {// 没有static 和返回类型
		// 这里面是构造的过程,x,y就是前提，要创建一个点必须有x,y
		this.x = x;// this相当于对象的实例给了当前对像的x
		this.y = y;
	}

	public double distance(Point other) {
		return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y)
				* (y - other.y));
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return x*10000 +y; // x=1,y =2,x =2, y =2;x是万以上的y是0000的位置的
		//return id;
	}
	public boolean equals(Object obj) {
		//模式化的写法
		if(obj == null) {
			return false;
		}
		if(this == obj) {//同一个equals的自反性自己和自己相等
			return true;
		}
		if(obj instanceof Point){
			Point p2 = (Point) obj;
			return x == p2.x && y == p2.y;//equals对称性可以写成p2.x ==x 这是对称性
			//x ==y ==z具有传递性，//一致性是个背论（持久性，），如果相等就永远相等，如果属性改了就不对了，QQ号 申请下来就不能变了，变象的实现永久一致
			//比较永远不变的属性，id
		}
		return false;
	}

}
