package day04;

public class WhileDemo {
	public static void main(String[] args){
		int i = 0;
		while(i < 54) {
			System.out.print(i++%3);
			if(i % 3 == 0){
				System.out.println();
			}
		}
	}
}
