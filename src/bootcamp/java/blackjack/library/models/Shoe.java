package bootcamp.java.blackjack.library.models;

import java.util.ArrayList;
import java.util.Collections;

public class Shoe {
	
	private ArrayList<Card> shoe;
	
	private int reshuffleAtSize;

	public Shoe() {
		
		this.shoe = new ArrayList<Card>();
		
		for (int i = 1; i <= 6; i++) {
			
			Deck deck = new Deck();
			
			for (Card card : deck.getDeck()) {
				
				shoe.add(card);
			}
		}
		
		Collections.shuffle(shoe);
		
		this.reshuffleAtSize = (int)(Math.random() * 15) + 60;
	}
	
	/* Getters & Setters */
	public ArrayList<Card> getShoe() {
		return shoe;
	}

	public void setShoe(ArrayList<Card> shoe) {
		this.shoe = shoe;
	}

	public int getReshuffleAtSize() {
		return reshuffleAtSize;
	}

	public void setReshuffleAtSize(int reshuffleAtSize) {
		this.reshuffleAtSize = reshuffleAtSize;
	}
}
