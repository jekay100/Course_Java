package day14;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
	public static void main(String[] args) {
		Map users = new HashMap();
		//怎么体现散列表了我们往里面放数据时就是按照key的hashcode值做为散列依据，根据散列运算，put往进添，key是个对象，
		//读和取就是查找了
		//写泛型就没有黄了
		users.put("jhon", new User("jhon","123"));//把Jhon放在系统中了
		users.put("tom", new User("tom","123"));//构建散列表
		users.put("jerry", new User("jerry", "123"));
		users.put("robin", new User("robin", "123"));
		//get和containsKey全是散列查找 
		//User u =(User) users.get("jhon");
		
		//登陆过程
		String name = "tom";
		String pwd = "1234";//从控制台读取
		if(!users.containsKey(name)) {
			System.out.println("无此用户");
			return;//下面的不执行了
		}
		User u = (User)users.get(name);
		if(u ==null){//一般用这个
			System.out.println("无此用户");
		}
		
		if(u.pwd.equals(pwd)){
			System.out.println("密码错误");
			return;
		}
		System.out.println("欢迎："+u.name);
		
	}
}
class User{
	String name;
	String pwd;
	public User(String name, String pwd){
		this.name = name;
		this.pwd = pwd;
	}
}
