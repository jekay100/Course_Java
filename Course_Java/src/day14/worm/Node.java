package day14.worm;

public class Node {
	// 是个实体类就要JavaBean
	private int i;// 横向
	private int j;// 纵向

	public Node() {
	}// 直接写Node

	public Node(int i, int j) {// 右键
		super();
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return i * 10000 + j;
	}
	@Override
	//override 不能丢，丢了可能覆盖失败//Java5以后有
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;

		}
		if (obj instanceof Node) {
			Node other = (Node) obj;
			return i == other.i && j == other.j;
		}
		return super.equals(obj);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "#";
		//return i +"," + j;
	}

}
