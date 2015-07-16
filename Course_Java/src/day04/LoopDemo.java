package day04;

public class LoopDemo {
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			boolean found = false;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					found = true;
					break;
				}
			}
			// 这里面要好好的弄了，这个有两种情况
			//上面的循环执行了做这个，没有执行做那个要用if所以我们就想到了用标记
			if (!found) {
				System.out.println(i);
			}
		}
	}
}
