package day16;

import day15.account.User;

public class HashMapDemo {
	public static void main(String[] args) {
		User u1 = new User(1, "tom", "123");
		User u2 = new User(2, "jerry", "123");
		User u3 = new User(3, "john", "123");
		User u4 = new User(4, "robin", "123");
		User u5 = new User(5, "gg", "123");
		User u6 = new User(6, "mm", "123");
		User u7 = new User(7, "dd", "123");
		User[] us = {u1, u2, u3, u4, u5, u6, u7};
		String name = "mm";
		String pwd = "123";
		User u = null;
		//把下面的变成一张图，是个表格顺序查找，
		for(int i = 0; i < us.length; i++){
			if(us[i].getName().equals(name)){
				u = us[i];
			}
		}
		//求散列
		System.out.println("tom".hashCode());
		System.out.println("jerry".hashCode());
		System.out.println("john".hashCode());
		System.out.println("robin".hashCode());
		System.out.println("gg".hashCode());
		System.out.println("mm".hashCode());
		System.out.println("dd".hashCode());
		//这个是散列运算，根据结果组织散列表，长度是10
		System.out.println("tom".hashCode()%10);
		System.out.println("jerry".hashCode()%10);
		System.out.println("john".hashCode()%10);
		System.out.println("robin".hashCode()%10);
		System.out.println("gg".hashCode()%10);
		System.out.println("mm".hashCode()%10);
		System.out.println("dd".hashCode()%10);
		//散列查找比较复杂，但是效率是高的
	}
}
