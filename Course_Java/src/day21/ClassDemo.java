package day21;

public class ClassDemo {
	public static void main(String[] args) throws Exception{
		Class c1 = Foo.class;//Class的具体实例
		System.out.println(c1.getName());//类名
		Foo f = new Foo();
		Class c2 = f.getClass();//实例只加载一次
		System.out.println(c1 == c2);//true;
		Class c3 = Class.forName("day21.Foo");
	}
}
class Foo{
	static{
		System.out.println("load");
	}
}
