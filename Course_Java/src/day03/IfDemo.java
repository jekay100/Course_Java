package day03;
import java.util.Scanner;
//网页分页,方法
public class IfDemo {
	public static void main(String[] args){
		int rows;
		System.out.println("请输入行数：");
		Scanner console = new Scanner(System.in);
		rows = console.nextInt();
		int size = 10;
		int pages;
		if(rows % size == 0){
			pages = rows / size;
		}else{
			pages = rows / size + 1;
		}
		System.out.println(pages); 
		System.out.println(countPages(rows));
	}
	public static int countPages(int rows){
		int size = 10;
		int pages = rows / size + 1;
		if(rows % size == 0) {
			pages = rows /size;
		}
		return pages;
	}
}
