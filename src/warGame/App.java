package warGame;



public class App {
	public static void main(String[] args) {
		//Creation of the deck objects
		Deck deck = new Deck();
		deck.createDeck();
		deck.shuffleDeck();
		//Creation of the player objects
		Player player1 = new Player("Sett");
		Player player2 = new Player("Henry");
		for (int i = 0; i++ < 52;) {
			if (i%2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		for (int i = 0; i++ < 26;) {
			int player1Card = player1.flip().getValue();
			int player2Card = player2.flip().getValue();
			if (player1Card > player2Card) {
				player1.incrementScore();
				System.out.println(player1.getName() + " wins!");
				System.out.println(player1.getScore() + " vs " + player2.getScore());
			} else if (player1Card < player2Card) {
				player2.incrementScore();
				System.out.println(player2.getName() + " wins!");
				System.out.println(player1.getScore() + " vs " + player2.getScore());
			} else if (player1Card == player2Card) {
				System.out.println("Draw!");
			}
			
		}
		System.out.println("Here's the final scores! ");
		System.out.println(player1.getName() + " ended the game with... " + player1.getScore());
		System.out.println(player2.getName() + " ended the game with... " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!!!!!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " wins!!!!!");
		} else if (player1.getScore() == player2.getScore()) {
			System.out.println("Wow! The game ended in a draw!!!!");
		}
	}
}
