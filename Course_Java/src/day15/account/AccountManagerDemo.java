package day15.account;

public class AccountManagerDemo {
	//如果调用了 有异常pao出的方法 必须处理异常，今天为了简单写一个不负责的写法
	//声明异常throws,pao出异常throw
	public static void main(String[] args)
	throws Exception{
		AccountManager manager = new AccountManagerImpl();
		manager.reg("林", "123", "liuyf@163.com");
		manager.reg("胡", "123", "liuyf@163.com");
		manager.reg("允", "123", "liuyf@163.com");
		User u = manager.login("林", "1234");
		System.out.println("欢迎你" + u.getName());
	}
}
