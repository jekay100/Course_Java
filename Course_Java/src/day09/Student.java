package day09;


public class Student extends Persion{
	String studentNo; // 学号
	String school;

//	public Student() {
//		super();// 子类的构造器默认调用父类的无参构造器
//		// 子类构造器不继承父类构造器
//		// 递归调用多层父类构造器
//		// 父类写了有参构造器，子类没有写构造器，就会报错，因为子类默认调用 无参的
//		// 默认构造器没有了编译器就无语了,有两种方法，一种是父类添加无参构造器，二是子类不写super写其他的
//	}
	public Student(){
		super("aaa");
	}
}
