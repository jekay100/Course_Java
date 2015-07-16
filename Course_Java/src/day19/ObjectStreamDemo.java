package day19;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception{
		ByteArrayOutputStream out = new ByteArrayOutputStream();//目标结点流
		ObjectOutputStream oos = new ObjectOutputStream(out);//对象输出流
		Foo foo = new Foo(1,"ABC", 123);
		oos.writeObject(foo);//实例写到oos里面去了
		oos.close();
		byte[] ary = out.toByteArray();
		//foo->序列化的结果
		//过滤流,反序列化
		ObjectInputStream ois = new ObjectInputStream(
				new ByteArrayInputStream(ary));
		Object obj = ois.readObject();
		//关流把外层关了就行了
		ois.close();
		if(obj instanceof Foo){
			Foo f = (Foo)obj;
			System.out.println(f.id);
			System.out.println(f == foo);//false,
			//对象的序列化与反序列化变象的实现对象的复制 
			//JavaBean必须实现序列化接口
			//所有类必须实现序列化接口
			//String[] ary1 = {"1", "2"};
			//String[] ary2 = ary.clone();//数组备份，两个数组不是同一个了，里面的String还是同一个
			//数组元素引用复制了，元素没有复制
			//Java中默认对象的复制规则，浅层复制，只复制一层，数组对象这层复制了，数组元素没有被复制
			//集合复制有构造器list==l是false,集合中的元素没有复制
			//利用序列化和反序列化变相实现深层复制
		}
	}
}
