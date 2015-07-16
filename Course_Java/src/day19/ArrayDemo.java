package day19;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[][] ary = {{2,3},{4,5},{6,7}};
		int[] sum = new int[ary[0].length];
		System.out.println(sum.length);
		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j < ary[i].length; j++){
				sum[j]+=ary[i][j];//安列汇总
			}
			System.out.println(Arrays.toString(sum));
		}
	}
}
