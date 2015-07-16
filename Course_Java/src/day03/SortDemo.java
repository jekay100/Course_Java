package day03;

import java.util.Arrays;
//三大排序
public class SortDemo {
	public static void main(String[] args) {
		int[] ary = { 6, 57, 83, 5, 73, 768, 4, 84, 34, 8 };
		System.out.println(selectSort(ary));
		System.out.println(maopaoSort(ary));
		System.out.println(insertSort(ary));
		System.out.println(classInsertSort(ary));
	}

	public static String selectSort(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[j] < ary[i]) {
					int temp = 0;
					temp = ary[j];
					ary[j] = ary[i];
					ary[i] = temp;
				}
			}
		}
		return Arrays.toString(ary);
	}

	public static String maopaoSort(int[] ary) {
		for (int i = 0; i < ary.length - 1; i++) {
			for (int j = 0; j < ary.length - i - 1; j++) {
				if (ary[j] > ary[j++]) {
					int temp = 0;
					temp = ary[j];
					ary[j] = ary[j++];
					ary[j++] = temp;
				}
			}
		}
		return Arrays.toString(ary);
	}

	public static String insertSort(int[] ary) {
		for(int i = 1; i < ary.length; i++) {
			int temp = ary[i];
			int j;
			for( j = i-1; j >=0; j--) {
				if(temp < ary[j]) {
					ary[j+1] = ary[j];
				}else{
					break;
				}
			}
			ary[j+1] = temp;
		}
		return Arrays.toString(ary);
	}
	//最经典的插入算法
	public static String classInsertSort(int[] ary) {
		for(int i = 1; i < ary.length; i ++) {
			int temp = ary[i];
			int j;
			for(j = i - 1; j >=0 && temp < ary[j]; j--) {
				ary[j+1] = ary[j];
			}
			ary[j+1] = temp;
		}
		return Arrays.toString(ary);
	}
}
