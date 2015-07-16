package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 统计一个字符串中每个字符的数量
 * “aabcdeeedaaa"
 * a:5
 * b:1  ....结果像Map,
 * 放在集合中的一般全是类，是包装类不能是基本类
 * @author user
 *
 */
public class CountCharDemo {
	//集合要求每个元素全是对象，可以自动包装
	public static void main(String[] args) {
		Map<Character, Integer> map = countChars("aaacccedsks");//拿到map集合
		System.out.println(map);//直接toString也行了，可以迭代map取出个个元素
		//使版不好看，对map迭代有2,3种方法
		//map是一对对的，一对叫一条Entry
		//Map迭代1
		//entry是无序的，不重复的所以 是Set
		Set<Map.Entry> set = (Set)map.entrySet();//返回一条一条的集合，条目的集合
		//a:5 b :2 c :1, Map.Entry静态内部接口，只有这么一个
		Iterator i = set.iterator();
		//弄表格
		System.out.println("+----------+----------+");
		System.out.println("|  字符  |  数量   |");
		while(i.hasNext()){
			Map.Entry entry = (Entry) i.next();
			System.out.print("|     " +entry.getKey() + "    " );
			System.out.println("|     " +entry.getValue() + "    |");
		}
		System.out.println("+----------+----------+");
		
		//Map迭代2
		//key无序，不重复所以是keySet
		Set<Character> keys= map.keySet();
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			char c = (Character) ite.next();
			int val = map.get(c);
			System.out.println("字符" +c);
			System.out.println("数量" + val);
		}
		
	}
	//所有的类都可以做为返回值
	public static Map<Character, Integer> countChars(String str){
		Map<Character, Integer>  map= new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);//这个要好好想了，
			if(map.containsKey(c)){//检查c是否被统计
				int val = map.get(c);//取出结果并加1
				val = val +1;
				map.put(c, val);//key是不永许重，如果有的话就会盖掉里面的值，如果没有就不说了
				//将新结果送回
			}else{
				map.put(c, 1);
			}		
		}
		return map;
	}
}
