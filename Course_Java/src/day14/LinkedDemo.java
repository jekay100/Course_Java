package day14;

public class LinkedDemo {
	public static void main(String[] args) {
		Node head = new Node(new Card(Card.HEART, Card.NINE));// data是扑扣牌
		head.next = new Node(new Card(Card.HEART, Card.TEEN));
		head.next.next = new Node(new Card(Card.HEART, Card.SEVEN));
		System.out.println(head);

	}
}
//这个看一下老师写的
//class LinkedList {
//	Node head;
//	//增删改查
	class Node {
		Object data;
		Node next;// 引用

		public Node(Object data) {
			this.data = data;
		}

		public String toString() {
			return data + (next != null ? "->" + next : "");// 递归
		}
	}
//}
