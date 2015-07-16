package day19;

import java.io.Serializable;

//类要实现 序列化必须实现接口
public class Foo implements Serializable {
	int id;
	String name;
	int age;

	public Foo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
