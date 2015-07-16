package day11.str;

public class StringDemo {
	public static void main(String[] args){
		String s1 = "abc";
		String s2 = s1;//两个引用一个对象
		s1+= "def";
		System.out.println(s1);//字符串对象没有变，引用变了
		System.out.println(s2);//abc对象永远不变
		System.out.println(s2 == s1);//false说明s1变了s1指向了一个新对象
		//字符串是不可变的
		String s3 = s1.concat("123");
		System.out.println(s1);//输出没有123
		System.out.println(s3);//记住String 的方法全产生一个新的对象不会改变原来 的对象
		String s4  = s3.toUpperCase();
		s4 = s3.toUpperCase();
		System.out.println(s4);
		s4 = s4.toLowerCase();
		System.out.println(s4);
		String s5 = "abcdecab";
		System.out.println(s5.indexOf("c"));
		System.out.println(s5.indexOf("c",3));
		System.out.println(s5.indexOf("x"));//没有返回-1
		//用法==经常用于检索
		String file = "photo.jsp.bak";
		if(file.indexOf(".jsp") > -1) {
			System.out.println("图书文件存在");
		}
		if(file.endsWith(".jsp")){
			System.out.println("图书文件存在");
		}
		String name = file.substring(0, 9);
		System.out.println(name);
		String ext = file.substring(file.lastIndexOf("."));//这个好看
		System.out.println(ext);
		String login = "\tm\ntom\r";
		login = login.trim(); 
		System.out.println(login);
		
	}
}
