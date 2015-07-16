package day05;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] ary;
		ary = new int[] {3,4,5,6};
		System.out.println(ary[2]);
		int[] ary1 = {1,2,3};
		int[] ary2 = new int[10];
		for(int i = 0; i < ary2.length; i++) {
			System.out.print(ary2[i] + ",");
		//	System.out.print(ary1[i] + ",");数组越界			
		}
		char[] ary3 = new char[10];
		System.out.println("00a" + ary3[3] + "aaa");//里面是0不是字符0
		System.out.println(ary3[3] + ',');
		System.out.println(ary3[3] + ",");//这俩句的区别;
		System.out.println(ary3.length);
	}
}
