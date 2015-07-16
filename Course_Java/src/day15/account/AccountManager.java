package day15.account;
/**
 * 用户注册
 * 用户登陆
 * 修改密码
 * 用户删除
 * 用户查询
 * 修改密码
 * @author User
 *
 */
public interface AccountManager {
	User reg(String name, String pwd, String email)
	//异常是行为的异位的结果，特殊的方法 的返回，注册用户时用户已经出现了这个是意外，所以要异常
	//Exception是根
	//接口有个实现类
	throws UserExistException;//throws是异常的声明
	User login(String name, String pwd)//有可能登陆失败
	throws NameOrPwdException;//这两个软件写成一个怕锖
}
