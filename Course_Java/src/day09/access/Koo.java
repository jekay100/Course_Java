package day09.access;

import day09.access.demo.Goo;

public class Koo extends Goo{
	//在类里面不能直接输出
	public void demo(){
		//System.out.println(a);a有但不可见
	//	System.out.println(b);默认是同包
		System.out.println(this.getA());//1
		System.out.println(c);//子类
	}
	
}
