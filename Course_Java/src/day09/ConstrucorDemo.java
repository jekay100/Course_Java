package day09;

public class ConstrucorDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		System.out.println(goo.a);
	}
}
class Foo{
	int a = 1;
	public Foo(int a){
		this.a = a;
	}
}
//class Goo extends Foo{
	//}错没有无参默认构造器了有两种解决方法
class Goo extends Foo{
	//字类里面就不用写a父类里面有
	public Goo() {
		super(5);//明确调用有参的
	}
}
