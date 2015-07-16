package day15;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class InteratorOverSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String> ();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		System.out.print(set.size());//4重的没有加进去
		for(Iterator i = set.iterator(); i.hasNext();){
			String s =(String) i.next();
			System.out.println(s);//无序不重
		}
		
	}
}
