package day14.worm;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Worm {

	public static final int UP = -10;
	public static final int DOWN = 10;
	public static final int RIGHT = 1;
	public static final int LEFT = -1;
	/** 当前方向 */
	private int dir;
	// 生活中的集合只放一种东西 ，不可能鸡蛋里面放石头吧
	// 泛型来约束集合中的元素，所有就拿出来不用强制类型转化 了
	// 有了泛型就不用强转了
	List<Node> body = new ArrayList<Node>();
	//应该换成linkList在头部加还是减，效率最高，但是对软件没有影响，这体现 了接口的好处
	public Worm() {
		// TODO Auto-generated constructor stub
	}

	public Worm(Node[] nodes, int dir) {
		// 数组添集合
		// 数组转化集合，as作为
		List<Node> list = Arrays.asList(nodes);// 这个集合只能读也就是不能add相当于临时 的
		body.addAll(list);
		this.dir = dir = -1;
	}

	// 走一步上，下左右是常量，固定 ，所以类里面还得定义一个

	public void step() {
		Node head = body.get(0);
		int i = head.getI() + dir / 10;
		int j = head.getJ() + dir % 10;
		Node newHead = new Node(i, j);
		body.add(0, newHead);
		if (eatSomething()) {
			return;
		}
		body.remove(body.size() - 1);
	}

	private boolean eatSomething() {
		// TODO Auto-generated method stub
		return false;
	}

	public void step(int dir) {
		if (this.dir + dir == 0) {
			throw new IllegalArgumentException("方向错误");
		}
		this.dir = dir;
		step();// 重载的方法全是cong用的
	}

	public boolean contains(int i, int j) {
		for (int index = 0; index < body.size(); index++) {// 数组
			Node n = body.get(index);
			if (n.getI() == i && n.getJ() == j) {
				return true;
			}
		}
		return false;
	}
	public String toString(){
		return body.toString();
		//蛇身上的结点打一下，可以用来调，这是个技巧
		//toString非常方便
	}

}
