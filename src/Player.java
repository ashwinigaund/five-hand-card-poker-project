import java.util.ArrayList;

public class Player {
	private ArrayList<Card> handList;
	private Deck deck;
	private Ranking rank;
	private PokerOps pokerAlgorithms = new PokerOps();

	/**
	 * A Constructor to instantiate a player's object which specifies the dealing
	 * size for the player's deck object.
	 * 
	 * @param handsize the number of cards which the player can have per game.
	 */
	public Player(int handsize) {
		this.deck = new Deck(handsize);
		this.rank = new Ranking();
	}

	/**
	 * A method to evaluate the player's hand to determine it's strength.
	 * 
	 * @return a string which represents the player's hand strength.
	 */
	public String evaluate() {
		return this.rank.evaluateHand(this.handList);
	}

	/**
	 * A method to draw cards to the players hand. Invokes the deck's dealCards
	 * method and shuffles the deck to increase card order randomness.
	 */
	public void drawCards() {
		this.deck.shuffle();
		this.handList = this.pokerAlgorithms.sortHandCards(this.deck.dealCards());
	}

	/**
	 * A method to print your hand.
	 */
	public void printHand() {
		for (Card card : this.handList) {
			card.printCard();
		}
		System.out.println();
	}

	/**
	 * A method to print player's rank.
	 */
	public void printPlayerRank() {
		System.out.println(this.evaluate());
	}

	public Deck getGameDeck() {
		return this.deck;
	}

	public ArrayList<Card> getPlayerHand() {
		return this.handList;
	}
}
