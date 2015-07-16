package day13.inner;

public class StaticInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo.Goo goo = Foo.instanceGoo();
		Foo.Goo xoo = new Foo.Goo();
	}

}
//静态内部类用的不多
//静态内部类可以访问外部类的静态资源，不是一个时期的看不见
//类的内部定义类，叫内部类，加static  叫静态内部类，体现封闭，叫写内部类，电视机里面也有类，我们不用知道
class Foo {
	//Goo是类Foo的静态成员什么时候可以用了，Goo可以访问Foo的静态资源
	static int a = 2;
	static class Goo{
		//静态的资源是可以相互调用的
		int getA(){
			return a;//调用了a
		}
	}
	static Goo instanceGoo(){//static 可以省，因为内存里有了Goo
		return new Goo();
	}
	
}
