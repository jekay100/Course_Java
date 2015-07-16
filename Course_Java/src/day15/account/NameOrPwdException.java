package day15.account;

//不继承Object。必须继承Exception
//手工的把父类构造器写上
public class NameOrPwdException extends Exception {

	public NameOrPwdException() {
		//默认有super
	}

	public NameOrPwdException(String message) {
	
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NameOrPwdException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
