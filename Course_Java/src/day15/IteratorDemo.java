package day15;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> eggs = new ArrayList<String>();
		//add是谁实现 的是arraylist
		eggs.add("egg1");
		eggs.add("egg2");
		eggs.add("egg3");
		eggs.add("egg4");
		eggs.add("egg5");
		eggs.add("egg6");
		Iterator<String> ite = eggs.iterator();//所有集合都有iterator方法
		//ite是谁实现的接口没有new呀
		//好象是方法里面有个new了，这个就是工厂，我们天天用工厂 ，在这个方法中邦我们实现了接口，用内部类
		//ite是个数组引用，（想成这样）里面含有所有集合的引用，是个数组
		//ite有个游标（第一个元素的前面）
		//hasNext有没有下一个，游标 相当于看一下有没有鸡蛋
		int sum = 0;
		//一般用while写这两个方法，是个模式化的写法,用这两个方法方法遍历
		while(ite.hasNext()){
			String e = ite.next();//移动游标了，返回游标指向的那个数，移动鸡
			sum ++;
		}
		System.out.println(sum);
		
	}
}
