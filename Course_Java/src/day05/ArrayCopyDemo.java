package day05;
import java.util.Arrays;
public class ArrayCopyDemo {
	public static void main(String[] args) {
		int[] ary = {2,3,4,4,5,5,6,6};
		int[] ary1 = ary;
		ary1[1] = 2;
		System.out.println(ary[1]);//可以得出是同一个数组一个变另一个也变
		int[] ary2 = new int[ary.length];//这样不是同一个数组了
		for(int i = 0; i < ary2.length; i++) {
			ary2[i] = ary[i];
			System.out.print(ary2[i]);
		}
		System.out.println();
		ary2[1] = 30;
		System.out.println(ary2[1]);
		System.out.println(ary[1]);
		//int[] ary3 = null;会报空指针异常 ,必须分配空间才可以提制了
		int[] ary3 = new int[ary.length];
		System.arraycopy(ary, 0, ary3, 0, ary.length);
		System.out.println(ary3[3]);
		ary3[3] = 33;
		System.out.println(ary[3]);
		int[] ary4 = new int[ary.length+1];
		System.arraycopy(ary, 0, ary4, 0, ary.length);
		System.out.println(ary4[ary.length]);
		int[] ary5 = Arrays.copyOf(ary,ary.length+1);
		System.out.println(ary5[ary.length]);
	}
}
