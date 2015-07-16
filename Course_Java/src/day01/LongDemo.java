package day01;

public class LongDemo {
	public static void main(String[] args){
		long maxTime = 0x7fffffffffffffffl;//后面加l//2进制也是一样的
		long years = maxTime/1000/60/60/24/365;//整除了，亲
		System.out.println(years);
		long now = System.currentTimeMillis();
		System.out.println(now);
		now = now / 1000 / 60 / 60 / 24 / 365 + 1970;
		System.out.println(now);
		long l = 1024 * 1024 * 1024 * 4;//0不报错
		System.out.println(l);
		long ll = 1024l * 1024 * 1024 * 4;
		System.out.println(Long.toBinaryString(ll));
		double d = 5D / 1;//加上个d是非常不错的
		System.out.println(d);
		
		char c = 'A';
		char x = '1';
		char ch = (char)(c + x); //要强转，因为默认int计算
		System.out.println(ch);
		char cha = 'A' + '1';//字面量与变量之间是不用的;在编译之前就把字面量加起来的了;
		System.out.println(cha + '0');//返回的是整数
		byte[] mp3 = new byte[1024 * 1024 * 5];//5M没有超，5G的话就超了
		System.out.println(mp3[1]);
		int i = 0 / 3;
		System.out.println(i); //i = 0;
		i = 0 % 3; ////0; 0除以任何数的余数还是０;这个是以前不懂的
		System.out.println(i);
		int r = (int)System.currentTimeMillis()%5;//求余还是long所以要转
		System.out.println(r);
		int r1 = (int)(System.currentTimeMillis()%5);
		System.out.println(r1);
		System.out.println("r = " + r1);
	}
}
