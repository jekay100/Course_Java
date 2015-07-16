package day05;
import java.util.Arrays;
public class FindDemo {
	public static void main(String[] args) {
		String s = "今天学习数组和数组的动态扩展";
		char c = '数';
		int[] location = {};
		for (int i = 0; i < s.length(); i ++) {
			char ch = s.charAt(i);
			if(ch == c) {
				location = Arrays.copyOf(location, location.length+1);
				location[location.length-1] = i;
			}
		}
		for(int i = 0; i < location.length; i++) {
			System.out.println(location[i]);
		}
	}
}
