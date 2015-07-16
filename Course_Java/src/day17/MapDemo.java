package day17;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class MapDemo {
	//发礼物
	public static void main(String[] args) {
		//可以放多个礼物
		Map<String, String> map = 
				new HashMap<String, String>();
		map.put("张三", "皮鞋");
		map.put("李四", "拖鞋");
		map.put("王五", "鞋垫");
		System.out.println(map);
		//更换礼物
		map.put("王五", "鞋拔子");
		System.out.println(map);
		//拿出礼物
		//模式化写法，记住
		Set<Map.Entry<String, String>> entrySet = 
				map.entrySet();
		for(Iterator i = entrySet.iterator();
				i.hasNext();){
			Map.Entry entry = (Map.Entry) i.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(map.containsKey("小宝"));
	}
}
