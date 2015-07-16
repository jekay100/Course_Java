package day10;
import java.util.Arrays;
public class CardDemo {
	public static void main(String[] args) {
		// Card card = new Card(Card.SPADE, Card.TEEN);
		Card[] cards = new Card[54];
		int i = 0;
		for (int rank = Card.THREE; rank <= Card.DEUCE; rank++) {
			cards[i++] = new Card(Card.DIAMOND, rank);
			cards[i++] = new Card(Card.CLUB, rank);
			cards[i++] = new Card(Card.HEART, rank);
			cards[i++] = new Card(Card.SPADE, rank);

		}
		cards[i++] = new Card(Card.JOKER, Card.BLACK);
		cards[i++] = new Card(Card.JOKER, Card.COLOCR);

		Card.insertSort(cards);

		for (i = 0; i < cards.length; i++) {
			System.out.print(cards[i].getRankName() + ", " + cards[i].getSuitName());
		}
		System.out.println();
		System.out.println(Arrays.toString(cards));
		

	}

}
