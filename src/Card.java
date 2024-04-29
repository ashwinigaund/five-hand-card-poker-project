public class Card {
	private String rank;
	private String suit;
	private int value;

	/**
	 * A Constructor to instantiate a card object.
	 * 
	 * @param rank representing the rank of a card.
	 * @param suit representing the suit of a card.
	 * @param val  representing the value associated with the card's rank.
	 */
	public Card(String rank, String suit, int val) {
		this.rank = rank;
		this.suit = suit;
		this.value = val;
	}

	/**
	 * A method to print the card's rank and suit.
	 */
	public void printCard() {
		System.out.print(this.rank + this.suit + " ");
	}

	public String getCardRank() {
		return this.rank;
	}

	public String getCardSuit() {
		return this.suit;
	}

	public int getCardVal() {
		return this.value;
	}
}
