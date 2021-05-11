package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<>();
	private static final String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
	private static final String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	public void createDeck() {
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				Card newCard = new Card(suit, i);
				cards.add(newCard);
			}
		}
	}
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	public Card drawCard() {
		return cards.remove(0);
		
	}
	
	
	
}