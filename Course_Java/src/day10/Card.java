package day10;

import java.util.Random;

/** 扑克牌 斗地主 */
public class Card {
	/**
	 * 点数 0代表3,1,代表4.。。。。。 12代表2,13代表小王
	 */
	private int rank;
	/** 花色 写成数字好比大小好处理业务 */
	private int suit;
	// 下面的写成static 是一份，但是能改所以写成不能改的
	public static final int THREE = 0;
	public static final int FOUR = 1;
	public static final int FIVE = 2;
	public static final int SIX = 3;
	public static final int SEVEN = 4;
	public static final int EIGHT = 5;
	public static final int NINE = 6;
	public static final int TEEN = 7;
	public static final int JACK = 8;
	public static final int QUEEN = 9;
	public static final int KING = 10;
	public static final int ACE = 11;
	public static final int DEUCE = 12;
	public static final int BLACK = 13;
	public static final int COLOCR = 14;

	public static final int DIAMOND = 0;
	public static final int CLUB = 1;
	public static final int HEART = 2;
	public static final int SPADE = 3;
	public static final int JOKER = 4;

	public Card() {
	}

	public Card(int suit, int rank) {
		// this.rank = rank;
		// this.suit = suit;
		setRank(rank);
		setSuit(suit);
	}

	public String getRankName() {
		String[] RankName = "3,4,5,6,7,8,9,10,J,Q,K,A,2,小,大".split(",");
		return RankName[this.rank];
	}

	public String getSuitName() {
		String[] SuitNames = { "方块", "梅花", "黑桃", "红桃" ,"王" };
		return SuitNames[this.suit];
	}

	public void setRank(int rank) {
		if (rank < THREE || rank > COLOCR) {
			throw new IllegalArgumentException("超了");
		}
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getSuit() {
		return suit;
	}

	public static Card[] insertSort(Card[] cards) {
		for (int i = cards.length - 1; i >= 1; i--) {
			Random r = new Random();
			int index = r.nextInt(i);
			Card temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
		return cards;
	}
	public String toString(){
		return getRankName() +" ," + getSuitName();
	}

	public int hashCode(){
		return suit*100+rank; //花色向上窜，点数向下窜
	}
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(this == obj) {
			return true;
		}
		if(obj instanceof Card){
			Card c = (Card)obj;
			return suit == c.suit&&rank == c.rank;
		}
		return false;
	}
	
}
