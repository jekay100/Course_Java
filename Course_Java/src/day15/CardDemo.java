package day15;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import day14.Card;
import java.util.Iterator;
public class CardDemo {
	public static void main(String[] args) {
		List<Card> cards = new LinkedList<Card>();
		for (int rand = Card.THREE; rand <= Card.DEUCE; rand++){
			cards.add(new Card(Card.DIAMOND, rand));
			cards.add(new Card(Card.CLUB, rand));
			cards.add(new Card(Card.HEART, rand));
			cards.add(new Card(Card.SPADE, rand));			
		}
		cards.add(new Card(Card.JOKER, Card.BLACK));
		cards.add(new Card(Card.JOKER, Card.COLOCR));
		//shuffle打乱
		Collections.shuffle(cards);
		Player[] players = {new Player(1,"佟湘玉"),
				new Player(2, "金湘玉"),
				new Player(3, "张曼玉")};
		//怎么表示每个人了呢
		int idx = 0;
		for(Iterator<Card> i = cards.iterator();
				i.hasNext();){
			Card c = i.next();
			//每个人有好几张，所以有个集合
			players[idx++%players.length].add(c);
			//cards.remove(c);报错
			i.remove();//删除掉刚才迭代的牌
			if(cards.size() == 3){
				break;
			}
		}
		//发一张，删除一张，正在迭代的时候是不能操作集合的否则报错
		System.out.println(cards);
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
	}
	
}
