package day14;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.LinkedList;
public class ArrayListDemo {
	public static void main(String[] args) {
	//	List cards = new ArrayList();
		List cards = new LinkedList();
		for (int rand = Card.THREE; rand <= Card.DEUCE; rand++){
			cards.add(new Card(Card.DIAMOND, rand));
			cards.add(new Card(Card.CLUB, rand));
			cards.add(new Card(Card.HEART, rand));
			cards.add(new Card(Card.SPADE, rand));			
		}
		cards.add(new Card(Card.JOKER, Card.BLACK));
		cards.add(new Card(Card.JOKER, Card.COLOCR));
		System.out.println(cards);
		Card c = (Card)cards.get(3);
		System.out.println(c);
		//洗牌用get，set
		Random r = new Random();
		for(int i  = cards.size() -1; i >0; i--) {
			int index = r.nextInt(i);
//			Card ca = (Card)cards.get(i);
//			ca = (Card)cards.set(index, ca);
//			cards.set(i,ca);		
			cards.set(i, cards.set(index, cards.get(i)));
		}
		System.out.println(cards);
	}
}
