package day14;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo {

	public static void main(String[] args) {
		Collection cards = null;//上面的是空的连集合也没有
		cards = new ArrayList();//这个是空集
		//ArrayList,和StringBuilder很像也是实现了，变长是个数组
		//是个对象数组可以放任何东西 ，而Builder是字符
		System.out.println(cards.isEmpty());
		cards.add(new Card(Card.SPADE, Card.NINE));
		System.out.println(cards.isEmpty());
		System.out.println(cards.size());//1size是大小的意思
		cards.add(new Card(Card.SPADE, Card.NINE));
		cards.add(new Card(Card.SPADE, Card.EIGHT));
		cards.add(new Card(Card.SPADE, Card.SEVEN));
		cards.add(new Card(Card.SPADE, Card.SIX));
		System.out.println(cards.size());	//这个就是个顺子了，呵呵
		System.out.println(cards);//可以把我们的每个元素打印出来
		Collection card1 = new ArrayList();
		card1.add(new Card(Card.SPADE, Card.DEUCE));
		card1.add(new Card(Card.HEART, Card.DEUCE));
		card1.add(new Card(Card.CLUB,Card.DEUCE));
		card1.add(new Card(Card.DIAMOND,Card.DEUCE));
		cards.addAll(card1);
		System.out.println(cards);
		cards.removeAll(card1);
		System.out.println(cards);
		cards.addAll(card1);
		cards.retainAll(card1);
		System.out.println(cards);
		Card ace = new Card(Card.SPADE, Card.ACE);
		System.out.println(cards.contains(ace));//这个肯定是比较相等不这个元素和里面的有没有相等的
		//按equals进行比较因为这个里面底层是数组，所以还是用equals 如果不覆盖equals永远也不相等
		//Alt + /可以帮助覆盖tab键能实现快
		//概念类要覆盖equals和hashCode这个时候出错了
		
	
	}

}
