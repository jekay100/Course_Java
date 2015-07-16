package day16;

import day15.account.User;

public class ExceptionDemo {
	User u1 = new User(1, "tom", "123");
	User u2 = new User(2, "jerry", "123");
	User u3 = new User(3, "john", "123");
	User u4 = new User(4, "robin", "123");
	User u5 = new User(5, "gg", "123");
	User u6 = new User(6, "mm", "123");
	User u7 = new User(7, "dd", "123");
	User[] us = { u1, u2, u3, u4, u5, u6, u7 };

	public static void main(String[] args) {
		// 如果调用了有异常抛出的方法 ,一定要处理这个异常，处理异常折方法 是再抛出（不好），
		ExceptionDemo demo = new ExceptionDemo();
		try {// try尝试做，如果对的话，就行，如果不对，的话下面是zhua
			User u = demo.findByName("mmm");// 这里面出现个错误异常
			// 出现异常的时候跳出到catch不做那个复值了
			System.out.println(u.getName());
			u = demo.login("abx", "123");
		} catch (UserNotFoundException e) {// cach这个是准备好抓，这个e的类型和上面方法错误声明的方法类型一样
			// 上面的那个方法 抛出的异常将被传递给E类型一样e就是那个对象
			System.out.println(e.getMessage());
			//catch可以连的写
		} catch (NameOrPasswordException e) {//异常必须处理
			// TODO Auto-generated catch block
			//打印出来的是错误跟踪堆栈
			//:后面的是个消息（相当于个内部）
			e.printStackTrace();
			//先打印错误跟踪堆栈，然后做处理
		}
	}

	public User login2(String name, String pwd) throws PasswordException,UserNotFoundException {
		User u = findByName(name);
		if(u.getPwd().equals(pwd)){
			return u;
		}
		throw new PasswordException("pwd");
	}
	public User login(String name, String pwd) throws NameOrPasswordException {
		//捕获再抛出
		try {
			User u = findByName(name);//这个叫异常的再抛出
			if (u.getPwd().equals(pwd)) {
				return u;
			}
			throw new NameOrPasswordException("pwd");
		} catch (UserNotFoundException e) {
			//e是个引用相当于包装再抛出，好处，把这个异常变换了类型了，（用户名没找到也可以说成用户名，错误）
			//找票板子，他包装了
			throw new NameOrPasswordException(e);
			//返回调用者
		}
		//return null;
	}

	public User findByName(String name) throws UserNotFoundException {

		for (int i = 0; i < us.length; i++) {
			User u = us[i];
			if (u.getName().equals(name)) {
				return u;
			}
		}
		throw new UserNotFoundException("用户名不存在");
		// 如果一个方法有异常抛出必须要声明异常，这是个语法细结，在方法 上声明的
		// 异常结束了返回，如果没有返回值就报错了，
	}
}
