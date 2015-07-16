package day13.inner;

public class InnerClassDemo {

	public static void main(String[] args) {
		//Koo.Goo goo = new Koo.Goo();不对，成员
		//内部类就在内部用别在外面用
		Koo koo = new Koo();
		System.out.println(koo.testGoo());
	}

}
//内部类也有构造器，也可以继承，可以实现接口
//静态只能访问静态，非静态可以访问静态，
//非静态可以访问非静态
class Koo{
	//成员内部类，和成员变量一样，只有创建对象koo是才能创建 
	class Goo{
		//经常用
		int a = 2;
		int getA(){
			return a;//成员内部类可以共享外部类的资源
		}
	}
	int testGoo(){
		Goo goo = new Goo();
		
		return goo.getA();
	}
}
