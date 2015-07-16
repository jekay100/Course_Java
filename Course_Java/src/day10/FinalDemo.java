package day10;

public class FinalDemo {
	public static void main(String[] args) {
		final int a = 1;
		System.out.println(a);
		//a++;//错
		final int b;
		b = 2;
		System.out.println(b);
		//b++;错
	}
	public static int add(final int a, int b){
	//	a++;错
		b++;
		return a+b;
	}
}
final class Xoo{}
//class Yoo extends Xoo{} final就不能继承了
//class MyString extends String{};
class Yoo{
	final int getVal(){
		return 1;//不能覆盖，因为剧终了
	}
}
//class Zoo extends Yoo{
//	int getVal(){
//		return 11;
//	}
//}
