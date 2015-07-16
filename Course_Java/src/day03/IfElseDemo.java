package day03;

public class IfElseDemo {
	public static void main(String[] args){
		int score = 86;
		score = 95;
		if(score <= 100&&score >= 90){
			System.out.println("成绩优异");
		}else if(score >= 80){
			System.out.println("良好");
		}else if(score >= 70){
			System.out.println("中等");
		}else if(score >= 60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
	}
}
