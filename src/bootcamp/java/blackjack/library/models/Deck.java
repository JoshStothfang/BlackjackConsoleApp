package bootcamp.java.blackjack.library.models;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deck;
	
	public Deck() {
		
		this.deck = new ArrayList<Card>();
		
		Card aceOfSpades = new Card("Ace", "Spades", 11);
		Card twoOfSpades = new Card("2", "Spades", 2);
		Card threeOfSpades = new Card("3", "Spades", 3);
		Card fourOfSpades = new Card("4", "Spades", 4);
		Card fiveOfSpades = new Card("5", "Spades", 5);
		Card sixOfSpades = new Card("6", "Spades", 6);
		Card sevenOfSpades = new Card("7", "Spades", 7);
		Card eightOfSpades = new Card("8", "Spades", 8);
		Card nineOfSpades = new Card("9", "Spades", 9);
		Card tenOfSpades = new Card("10", "Spades", 10);
		Card jackOfSpades = new Card("Jack", "Spades", 10);
		Card queenOfSpades = new Card("Queen", "Spades", 10);
		Card kingOfSpades = new Card("King", "Spades", 10);
		
		Card aceOfClubs = new Card("Ace", "Clubs", 11);
		Card twoOfClubs = new Card("2", "Clubs", 2);
		Card threeOfClubs = new Card("3", "Clubs", 3);
		Card fourOfClubs = new Card("4", "Clubs", 4);
		Card fiveOfClubs = new Card("5", "Clubs", 5);
		Card sixOfClubs = new Card("6", "Clubs", 6);
		Card sevenOfClubs = new Card("7", "Clubs", 7);
		Card eightOfClubs = new Card("8", "Clubs", 8);
		Card nineOfClubs = new Card("9", "Clubs", 9);
		Card tenOfClubs = new Card("10", "Clubs", 10);
		Card jackOfClubs = new Card("Jack", "Clubs", 10);
		Card queenOfClubs = new Card("Queen", "Clubs", 10);
		Card kingOfClubs = new Card("King", "Clubs", 10);
		
		Card aceOfHearts = new Card("Ace", "Hearts", 11);
		Card twoOfHearts = new Card("2", "Hearts", 2);
		Card threeOfHearts = new Card("3", "Hearts", 3);
		Card fourOfHearts = new Card("4", "Hearts", 4);
		Card fiveOfHearts = new Card("5", "Hearts", 5);
		Card sixOfHearts = new Card("6", "Hearts", 6);
		Card sevenOfHearts = new Card("7", "Hearts", 7);
		Card eightOfHearts = new Card("8", "Hearts", 8);
		Card nineOfHearts = new Card("9", "Hearts", 9);
		Card tenOfHearts = new Card("10", "Hearts", 10);
		Card jackOfHearts = new Card("Jack", "Hearts", 10);
		Card queenOfHearts = new Card("Queen", "Hearts", 10);
		Card kingOfHearts = new Card("King", "Hearts", 10);
		
		Card aceOfDiamonds = new Card("Ace", "Diamonds", 11);
		Card twoOfDiamonds = new Card("2", "Diamonds", 2);
		Card threeOfDiamonds = new Card("3", "Diamonds", 3);
		Card fourOfDiamonds = new Card("4", "Diamonds", 4);
		Card fiveOfDiamonds = new Card("5", "Diamonds", 5);
		Card sixOfDiamonds = new Card("6", "Diamonds", 6);
		Card sevenOfDiamonds = new Card("7", "Diamonds", 7);
		Card eightOfDiamonds = new Card("8", "Diamonds", 8);
		Card nineOfDiamonds = new Card("9", "Diamonds", 9);
		Card tenOfDiamonds = new Card("10", "Diamonds", 10);
		Card jackOfDiamonds = new Card("Jack", "Diamonds", 10);
		Card queenOfDiamonds = new Card("Queen", "Diamonds", 10);
		Card kingOfDiamonds = new Card("King", "Diamonds", 10);
		
		deck.add(aceOfSpades);
		deck.add(twoOfSpades);
		deck.add(threeOfSpades);
		deck.add(fourOfSpades);
		deck.add(fiveOfSpades);
		deck.add(sixOfSpades);
		deck.add(sevenOfSpades);
		deck.add(eightOfSpades);
		deck.add(nineOfSpades);
		deck.add(tenOfSpades);
		deck.add(jackOfSpades);
		deck.add(queenOfSpades);
		deck.add(kingOfSpades);
		
		deck.add(aceOfClubs);
		deck.add(twoOfClubs);
		deck.add(threeOfClubs);
		deck.add(fourOfClubs);
		deck.add(fiveOfClubs);
		deck.add(sixOfClubs);
		deck.add(sevenOfClubs);
		deck.add(eightOfClubs);
		deck.add(nineOfClubs);
		deck.add(tenOfClubs);
		deck.add(jackOfClubs);
		deck.add(queenOfClubs);
		deck.add(kingOfClubs);
		
		deck.add(aceOfHearts);
		deck.add(twoOfHearts);
		deck.add(threeOfHearts);
		deck.add(fourOfHearts);
		deck.add(fiveOfHearts);
		deck.add(sixOfHearts);
		deck.add(sevenOfHearts);
		deck.add(eightOfHearts);
		deck.add(nineOfHearts);
		deck.add(tenOfHearts);
		deck.add(jackOfHearts);
		deck.add(queenOfHearts);
		deck.add(kingOfHearts);
		
		deck.add(aceOfDiamonds);
		deck.add(twoOfDiamonds);
		deck.add(threeOfDiamonds);
		deck.add(fourOfDiamonds);
		deck.add(fiveOfDiamonds);
		deck.add(sixOfDiamonds);
		deck.add(sevenOfDiamonds);
		deck.add(eightOfDiamonds);
		deck.add(nineOfDiamonds);
		deck.add(tenOfDiamonds);
		deck.add(jackOfDiamonds);
		deck.add(queenOfDiamonds);
		deck.add(kingOfDiamonds);
	}
	
	/* Getters & Setters */
	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
}
