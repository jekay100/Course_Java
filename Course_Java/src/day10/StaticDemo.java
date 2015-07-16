package day10;

public class StaticDemo {
	public static void main(String[] args) {
		System.out.println("ssssss");//跟踪语词方便调试
		Koo.b = 1;//第一次用就要加载类，不只是new
		System.out.println("sss");
		//静态关键字是在类的加载时就有了，在类区里加载 
		Koo k1 = new Koo();
		Koo k2 = new Koo();
		//b一样用K1,k2也行，静态的属性tuijian用类名访问
		System.out.println(Koo.b+","+k1.a+","+k2.a);
		System.out.println(Koo.getB());
		int a = Math.abs(-1);
		String str = Integer.toHexString('中');
		System.out.println(str);
		System.out.println(a);
	}
}

class Koo{
	static {
		//静态代码块
		System.out.println("加载类Koo");
	}
	int a;//实例变量
	static int b;//静态变量所有变量共有的
	public Koo(){
		a = b++;
	}
	//不創建对象没有意义，因为a是对象的,b是类的
	public int getA(){
		return a;
	}
	static int getB(){
		return b;
		//return b+a;静态方法不能访问动态成员，因为可能没有对象this.a不生存
		//静态类经常做工具方法的
		//什么写成静态方法就是经常用的着的，比如加密方法什么东西也要加密就写成静态的，只要传进去就能加密
		
	}
}

