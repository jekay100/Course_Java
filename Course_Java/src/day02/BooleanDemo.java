package day02;

public class BooleanDemo {
	public static void main(String[] args){
		boolean isMan = true;
		System.out.println(isMan);
		boolean finished = true;
		if(finished){
			System.out.println("欢迎你再来");
		}
		long l = 1024l * 1024 * 1024 * 4;//这个32位全是0;
		int i = (int)l;
		System.out.println(i);
		System.out.println(l);
		System.out.println(Long.toBinaryString(l));
		System.out.println(Integer.toBinaryString(i));
	}
}
