package day04;

public class BreakContinueDemo {
	public static void main(String[] args) {
		char[] chs ={'据','说','胡','主','席','说','要','访','问','美','国','了'};
		//找出胡的位置2
		for(int i = 0; i < 11; i++) {
			if(chs[i] == '胡') {
				System.out.println(i);
				break;
			}
		}
		//输出所有说的位置1,5
		for (int j = 0; j < 12; j++) {
			if(chs[j] != '说') {
				continue;
			}
			System.out.print(j+",");
		}
	}
}
