package day15;

import java.util.List;
import java.util.ArrayList;

import day14.Card;

public class Player {
	private int id;
	private String name;
	private List<Card> cards = new ArrayList<Card>();

	public Player() {

	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Player) {
			Player other = (Player) obj;
			return other.id == id;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 要唯一的
		return id;
	}

	@Override
	public String toString() {
		return name + ":" + cards;
	}

	public void add(Card c) {
		// TODO Auto-generated method stub
		 this.cards.add(c);
	}
}
