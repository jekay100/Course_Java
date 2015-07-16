package day01;

public class IntegerDemo {
	//int是32位的，char是2进制的
	//Java的整数全是有符号的C++不是
	//short是16位，int是32位的，long是64位
	public static void main(String[] args){
		//byte b = 0138; 8进制不包含8，不对
		//用short要转化所以效率不高
		int age = 12;
		short ages = 12;
		System.out.println(age);
		System.out.println(ages);
		int size = 1024 * 1024 * 1024 * 4;
		System.out.println(size);//0，4亿是不行的
		size = 1024* 1024 * 1024 * 2;//是负数，也大
		System.out.println(size);
		long l = 1;
		System.out.println(l);//是1不是1.0
		//l = 22222222222222222222222222;//错误，字面量不能超过int的范围，
		l = 2222222222222222222l;//后面加上l;超出l的范围也要报错
		//short s = 32768;//不能超过short的范围
		short s = 32767;//32767是对的
		System.out.println(s);
		int x  = 32767;
		System.out.println(x);
		//s = x;这个是不对的，变量之间要进行强转，字面量和变量之间不用,编辑器进行优化了
	}
}
