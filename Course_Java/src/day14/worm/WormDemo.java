package day14.worm;

import java.util.Scanner;

public class WormDemo {
	public static void main(String[] args) {
		Node[] nodes = {new Node(4,2),
				new Node(4,3),
				new Node(4,4),
				new Node(5,4),
				new Node(6,4),
				new Node(7,4),
				};
		Worm worm = new Worm(nodes, Worm.LEFT);
		WormPane wormPane = new WormPane(worm);
//		wormPane.print();
//		worm.step();
//		wormPane.print();
//		worm.step(Worm.LEFT);
//		wormPane.print();
		Scanner console = new Scanner(System.in);
		while(true) {
			wormPane.print();
			String str = console.nextLine();
			if(str.trim().equals("")){
				worm.step();
			}else if(str.equalsIgnoreCase("u")) {
				worm.step(Worm.UP);
			}else if(str.equalsIgnoreCase("d")) {
				worm.step(Worm.DOWN);
			}else if(str.equalsIgnoreCase("r")) {
				worm.step(Worm.RIGHT);
			}else if(str.equalsIgnoreCase("l")){
				worm.step(Worm.LEFT);
			}
		}
	}
}
