package day10;
/**
 * 属性是静态绑定到变量类型（类型）
 * 方法是动态绑定，有最终对象次定
 * 
 * 属性没有覆盖
 * @author user
 * 父类中可以有a子类中也可以有a
 *
 */
public class FiledAccessDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();//一个对象两个引用
		Foo foo = goo;
		System.out.println(goo.a + "," + goo.getA());//2,1
		System.out.println(foo.a + "," + foo.getA());//1,1
	}
	
}
class Foo{
	int a = 1;
	public int getA(){
		return a;
	}
}
class Goo extends Foo{
	int a = 2;
	public int getA(){
		return super.a;
	}
}
