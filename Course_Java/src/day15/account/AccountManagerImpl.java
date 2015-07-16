package day15.account;

import java.util.HashMap;
import java.util.Map;

/**
 * 在实现类里注册用用户n多个所以要写上集合 实现接口的类一般结尾写成Impl
 * 
 * @author User
 * 
 */
public class AccountManagerImpl implements AccountManager {
	private Map<String, User> users = new HashMap<String, User>();
	private int id = 1;

	public User reg(String name, String pwd, String email)
			throws UserExistException {
		// containsKey()
		User u = users.get(name);
		if (u != null) {
			// 业务异常写成类
			throw new UserExistException("已经注册过了");
		}
		User user = new User();
		// id是不能变的东西
		// id为什么是类的
		user.setId(id++);
		user.setEmail(email);
		user.setName(name);
		user.setPwd(pwd);
		users.put(name, user);
		return user;
	}

	public User login(String name, String pwd) throws NameOrPwdException {
		User u = users.get(name);
		if (u == null) {
			throw new NameOrPwdException("用户没有");
		}
		if (!u.getPwd().equals(pwd)) {
			throw new NameOrPwdException("密码不对");

		}
		return u;
	}

}
