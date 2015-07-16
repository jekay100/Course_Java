package day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropretiesDemo {
	public static void main(String[] args) throws IOException{
		Properties cfg = new Properties();//这个类的父类是map,这个类相当于map集合
		//等价于Map<String, String>他的key，value一定是字符串
		cfg.load(new FileInputStream("src/day21/config.properties"));//加载流，解析
		String url = cfg.getProperty("jdbc.url");
		System.out.println(url);
		Properties syscfg = System.getProperties();//这里面的System是Java的系统 
		syscfg.list(System.out);//输出系统的所有配置文件，
		//这些东西就是Java的配置环境
	}
}
