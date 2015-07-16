package day09.access;
//不在同一个包中时要写import
import day09.access.demo.Goo;
public class AccessDemo {
	public static void main(String[] args) {
		//同一个package中的现象package
		Foo foo = new Foo();
		//System.out.println(foo.a);私有的只有在那里面有用了
		System.out.println(foo.b);//同包就可以 
		System.out.println(foo.getA());//这样弄的话，a的值无法改了
		//有保护作用可控制的访问，可见，与不可见，非常推荐
		Goo goo = new Goo();
		//System.out.println(goo.a);
		//不对System.out.println(b);
		Koo koo = new Koo();
		koo.demo();
	}
	
		
}

class Foo{
	private int a = 1;
	int b = 2;
	protected int c = 3;
	public int d = 4;
	public int getA(){
		return a;
	}
}