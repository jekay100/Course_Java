package day11.str;

public class StaticString {
	public static void main(String[] args) {
		//字符串对象池在缓冲池里面找有没有这个字符串有的话就弄成同一个对象
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "ab" + "c";//一个对象，中间的优化掉了
		System.out.println(s1==s2);
		System.out.println(s1 == s3);
		//静态字符串，也就是直接量
		String s4 = new String("abc");//动态字符串就不一样了，他们不是在缓冲池里面找的而是直接用new创建
		//在堆里面重新分配一个字符串对象
		//上面有两个字符串对象有个静态的有个动态的
		
	}
}
