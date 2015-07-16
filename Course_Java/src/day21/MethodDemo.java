package day21;

import java.lang.reflect.Method;

public class MethodDemo {
	public static void main(String[] args) throws Exception{
		Class cls = Class.forName("day21.Goo");
		Method[] ms = cls.getMethods();//返回所有公有方法
		for(Method method: ms){
			System.out.println(method.getName());
		}
	}
}
class Goo{
	public int getValue(){
		return 4;
	}
}
