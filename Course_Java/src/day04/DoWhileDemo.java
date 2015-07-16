package day04;
import java.util.Scanner;
public class DoWhileDemo {
	public static void main(String[] args){
		int balance = 1000;
		int bet = 0;
		Scanner console = new Scanner(System.in);
		do{
			System.out.print("请输入赌注：");
			bet = console.nextInt();
		}while(bet <= 0 || bet > balance);
		System.out.println("赌注是"+bet);
	}
}
