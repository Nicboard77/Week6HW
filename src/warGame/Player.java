package warGame;

import java.util.ArrayList;
import java.util.List;


public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name = "";
	
	public Player(String name) {
		this.name = name;
		
	}
	
	public void describePlayer() {
		System.out.println("Player is named: " + name);
		System.out.println("Player's score is: " + score);
		for (Card card : hand) {
			System.out.println(card.describe());
		}
	}
	public Card flip() {
		Card card1 = hand.remove(0);
		return card1;
	}
	public void draw(Deck deck) {
		hand.add(deck.drawCard());
	}
	public void incrementScore() {
		this.score = score += 1;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
