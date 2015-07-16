package day01;

public class VarDemo {
	public static void main(String[] args){
		int age; //变量的声明，领导不知道是谁了怎么用了
		age = 16;//变量的初始化
		age = 17; //变量的赋傎
		System.out.println(age);//变量的访问
		int score = 100;//直接声明变初始化。。声明和定义不是同一回事
		System.out.println(score);
		//int score = 150; //不永许重担定义
		if(score > 80){
			int iq = 200;
			System.out.println("优秀");
			System.out.println(iq);
		}
		int iq = 200;//作用域失效了
		System.out.println(iq);
		boolean isMan = true;
		if(isMan){
			System.out.println("爷们来了");
		}
	}
}
