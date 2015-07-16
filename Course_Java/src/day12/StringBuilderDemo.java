package day12;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder buf = new StringBuilder();
		//buf缓冲区
		//append追加append返回值是对象本身不是生成个新对象
		//buf一路点
		buf.append("刘玉峰：")
		.append("的妻子是")
		.append("绝对佳人！")
		.insert(0,"大师")
		.delete(5,6);
		System.out.println(buf);
		
		String s1 = "abc";
		String s2 = "def";
		String s3 = "ghi";
		//String s4 = s1+s2+s4;其实java是用下面的代码实现的
		String s4 = new StringBuilder(s1).append(s2).append(s3).toString();
		String s5 = s1;
		s5 += s1; // s5 = new StringBuilder(s5).append(s1)。append(s1)。append(s1)。append(s1).toString();
		s5 += s1;					//不被任何引用引用的对象是内存垃圾,刚开始的是StringBuilder对象最后toString了才被引用 
		s5 += s1;
		//优化方法
		StringBuilder b = new StringBuilder(s1);
		b.append(s1);
		b.append(s1);
		b.append(s1);
		System.out.println(b.toString());
	}
}
