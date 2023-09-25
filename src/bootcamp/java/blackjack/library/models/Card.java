package bootcamp.java.blackjack.library.models;

public class Card {
	
	private String suit;
	
	private String rank;
	
	private int value;
	
	public void print() {
		
		System.out.println(rank + " of " + suit);
	}

	/* Getters & Setters */
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Card(String rank, String suit, int value) {
		
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
}
