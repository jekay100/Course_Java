package day16;

public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println(test());
	}
	//考试考了
	public static int test(){
		try{
			String s = null;
			return s.length();//空调属性和方法 会出现空指针异常，就不执行return
		}catch(NullPointerException e){
			return 1;
		}catch(RuntimeException e) {
			return 4;
		}catch(Exception e){//处理异常e是nullPointException的实例
			return 2;//放在缓冲区中了
		}finally{//没有（）,不管前面 怎么运行都会被运行
			return 3;
		}
		//Java不充许把大类型的异常放前面，这样后面没法弄了，不同于捕鱼把大的放前面
	}
}
