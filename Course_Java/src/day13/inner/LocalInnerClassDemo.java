package day13.inner;

public class LocalInnerClassDemo {

	public static void main(String[] args) {
		class Goo{//局部内部类，类似于局部变量 ，在方法中定义的，紧当前方法有效
			int a = 1;
		}
		Goo goo = new Goo();
		System.out.println(goo.a);//1
	}

}
