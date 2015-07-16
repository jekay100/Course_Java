package day06;

public class LogicalDemo {
	public static void main(String[] args) {
		int age = 12;
		char sex = '男';
		boolean isChild = age < 14;
		boolean isMan = sex == '男';
		boolean isBoy = isChild && isMan;
		boolean isGirl = isChild && !isMan;
		boolean isKid = isBoy || isGirl;
		
		int i = 1;
		if (i != 1 &&(i++) == 2) {
			System.out.println(i);
		}
		System.out.println(i);
		i = 1;
		if (i != 1 & (i++) == 2) {
			System.out.println(i);
		}
		System.out.println(i);
		i = 1;
		if(i !=1 || (i++) == 2) {
			System.out.println(i);
		}
		System.out.println(i);
		i = 1;
		if(i !=1 | (i++) == 2) {
			System.out.println(i);
		}
		int a = 1;
		a = a++;
		System.out.println(a);//1内存中a的值
	}
}
