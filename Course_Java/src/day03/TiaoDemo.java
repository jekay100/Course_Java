package day03;

public class TiaoDemo {
	public static void main(String[] args){
		int rows = 137;
		int size = 10;
		int pages = rows % size == 0 ? rows/size:rows/size+1;
		System.out.println(pages);
	}
}
