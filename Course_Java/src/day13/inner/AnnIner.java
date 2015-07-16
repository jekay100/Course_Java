package day13.inner;

import java.util.Arrays;
import java.util.Comparator;


public class AnnIner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xoo xoo = new Xoo() {
			public int getX() {
				return 2;
			}// 内部类的好处就是我改造一个类不用继承，临时就改了
		};// 加上个{} 就是匿名内部类了是对当前类的继承
			// {}继承中提供的类体{};是父类型的一个实例，父类型可以引用子类型的实例
		System.out.println(xoo);// "2"1"方法是动态绑定的
		Yoo yoo = new Yoo() {
			public int getNum() {
				return 88;
			}// 非常常 见
		};// 加上{}就是接口的实现类内部类，实现所有的方法
		System.out.println(yoo.getNum());// 从下往上执行不是固定顺序
		// CharSequence //Java带的接口;字符序例
		CharSequence cs = new CharSequence() {

			public int length() {
				// TODO Auto-generated method stub
				return 10;// 10个A的字符序列
			}

			public char charAt(int index) {
				// TODO Auto-generated method stub
				return 'A';
			}

			public CharSequence subSequence(int start, int end) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		StringBuilder buff = new StringBuilder(cs);
		System.out.println(buff);
		String[] stri = { "abcdk", "adk", "kdjslfjfjkdfj", "a" };
		Arrays.sort(stri,new Comparator() {		
			public int compare(Object o1, Object o2) {
				String s1 = (String)o1;
				String s2 = (String)o2;
				return s1.length() - s2.length();
			}
		});
		System.out.println(Arrays.toString(stri));
	}

	interface Yoo {
		int getNum();
	}

	// 这是个普通的类，匿名内部类必须有个基类

}

class Xoo {

	public int getX() {
		return 1;
	}

	public String toString() {
		return Integer.toString(getX());
	}
}