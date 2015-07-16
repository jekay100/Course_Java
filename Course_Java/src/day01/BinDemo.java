package day01;
public class BinDemo {
	public static void main(String[] args){
		int i = 15;
		System.out.println(Integer.toBinaryString(i));//1111
		i = 'A';
		System.out.println(Integer.toBinaryString(i));
		/*
		 65(10) = 6 * 10 + 5 * 1 = 6*10^1 + 5*10^0;
		 1111(2) = 1*2^3 + 1*2^2+1*2^1 + 1*2^0
		 1*8 + 1*4 + 1 *2 + 1
		 15
		 二进制的权：基数的n次幂 128 64 32 16 8 4 2 1 
		 1000001(2) = 64 + 1 = 65
		 65（10）减64 写上1 剩下的写上0
		 不会出现比256大一般不会超过8位二进制
		*/
		i = 192;
		System.out.println(Integer.toBinaryString(i));
		i = 0xc0;
		System.out.println(Integer.toBinaryString(i));
		i = 0xffff;
		System.out.println(Integer.toBinaryString(i));
		i = 0xaaaa;
		System.out.println(Integer.toBinaryString(i));
		i = 0x5555;
		System.out.println(Integer.toBinaryString(i));
		i = '中';
		System.out.println(Integer.toBinaryString(i));
		//1Byte = 8bit
	}
}
