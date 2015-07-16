package day14.worm;

public class WormPane {
	private Worm worm;// 农场里要有条蛇

	public WormPane() {

	}

	public WormPane(Worm worm) {
		super();
		this.worm = worm;
	}

	public void print() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 40; j++) {
				if (i == 0 || i == 14) {
					System.out.print("-");
				} else if (j == 0 || j == 39) {
					System.out.print("|");
				} else if (worm.contains(i, j)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
