package day09.shape;

public class ShapeDemo {
	public static  void main(String[] args) {
		Shape[] shapes = new Shape[2];//没有图形因为默认是空
		//图形的实例是多态的，方法 的fugai返回类型兼容，方法名相同，参数相同
		shapes[0] = new Circle(2,2,1);//3.14
		shapes[1] = new Rectangle(2,2, 3,4);//12
		System.out.println(shapes[0].area());
		System.out.println(shapes[1].area());
	} 
}
