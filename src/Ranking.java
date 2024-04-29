import java.util.ArrayList;

public class Ranking {
	private String handRank;
	private ArrayList<Card> handCardsList;
	private boolean rankNotFound, flushCheck;

	/**
	 * A constructor to instantiate a ranking.
	 */
	public Ranking() {
		this.handRank = "";
	}

	/**
	 * 
	 * @param hand list of Card objects which represents a player's hand.
	 * @return String which represents the strength of a player's hand.
	 */
	public String evaluateHand(ArrayList<Card> hand) {
		this.handCardsList = hand;
		return this.evaluateRank();
	}

	/**
	 * A method to evaluate a list of Card objects to determine it's strength.
	 * 
	 * @return String which represents the strength of a player's hand.
	 */
	private String evaluateRank() {
		this.handRank = "";
		this.rankNotFound = true;
		int itr = 0;
		String comparisonSuit = "";
		this.flushCheck = true;

		for (Card card : this.handCardsList) {
			if (itr == 0) {
				comparisonSuit = card.getCardSuit();
			} else if (comparisonSuit.equals(card.getCardSuit())) {
				continue;
			} else {
				this.flushCheck = false;
				break;
			}
			itr++;
		}

		if (this.flushCheck) {
			if (rankNotFound) {
				checkStraightFlush();
				this.handRank = "Straight Flush";
			}
			if (rankNotFound) {
				checkFlush();
				this.handRank = "Flush";
			}
		} else {
			if (this.rankNotFound) {
				checkFourOfAKind();
				this.handRank = "Four of a Kind";
			}
			if (this.rankNotFound) {
				checkFullHouse();
				this.handRank = "Full House";
			}
			if (this.rankNotFound) {
				checkStraight();
				this.handRank = "Straight";
			}
			if (this.rankNotFound) {
				checkThreeOfAKind();
				this.handRank = "Three of a Kind";
			}
			if (this.rankNotFound) {
				checkTwoPair();
				this.handRank = "Two Pair";
			}
			if (this.rankNotFound) {
				checkOnePair();
				this.handRank = "One Pair";
			}
			if (this.rankNotFound) {
				HighCard();
				this.handRank = "High Card";
			}
		}

		return this.handRank;
	}

	public void checkStraightFlush() {
		if ((this.handCardsList.get(0).getCardVal() + 3) == this.handCardsList.get(3).getCardVal()
				&& this.handCardsList.get(4).getCardVal() == 14 && this.handCardsList.get(0).getCardVal() == 2) {
			this.rankNotFound = false;
		} else if ((this.handCardsList.get(0).getCardVal() + 4) == this.handCardsList.get(4).getCardVal()) {
			this.rankNotFound = false;
		}
	}

	public void checkFlush() {
		this.rankNotFound = false;
	}

	public void checkFourOfAKind() {
		if (this.handCardsList.get(0).getCardVal() == this.handCardsList.get(1).getCardVal()
				&& this.handCardsList.get(1).getCardVal() == this.handCardsList.get(2).getCardVal()
				&& this.handCardsList.get(2).getCardVal() == this.handCardsList.get(3).getCardVal()
				|| this.handCardsList.get(1).getCardVal() == this.handCardsList.get(2).getCardVal()
						&& this.handCardsList.get(2).getCardVal() == this.handCardsList.get(3).getCardVal()
						&& this.handCardsList.get(3).getCardVal() == this.handCardsList.get(4).getCardVal()) {

			this.rankNotFound = false;
		}
	}

	public void checkFullHouse() {
		if (this.handCardsList.get(0).getCardVal() == this.handCardsList.get(1).getCardVal()
				&& this.handCardsList.get(1).getCardVal() == this.handCardsList.get(2).getCardVal()
				&& this.handCardsList.get(3).getCardVal() == this.handCardsList.get(4).getCardVal()
				|| this.handCardsList.get(0).getCardVal() == this.handCardsList.get(1).getCardVal()
						&& this.handCardsList.get(2).getCardVal() == this.handCardsList.get(3).getCardVal()
						&& this.handCardsList.get(3).getCardVal() == this.handCardsList.get(4).getCardVal()) {
			this.rankNotFound = false;
		}
	}

	public void checkStraight() {
		if ((this.handCardsList.get(0).getCardVal() + 1) == this.handCardsList.get(1).getCardVal()
				&& (this.handCardsList.get(1).getCardVal() + 1) == this.handCardsList.get(2).getCardVal()
				&& (this.handCardsList.get(2).getCardVal() + 1) == this.handCardsList.get(3).getCardVal()
				&& (this.handCardsList.get(3).getCardVal() + 1) == this.handCardsList.get(4).getCardVal()
				|| this.handCardsList.get(4).getCardVal() == 14 && this.handCardsList.get(0).getCardVal() == 2
						&& (this.handCardsList.get(0).getCardVal() + 1) == this.handCardsList.get(1).getCardVal()
						&& (this.handCardsList.get(1).getCardVal() + 1) == this.handCardsList.get(2).getCardVal()
						&& (this.handCardsList.get(2).getCardVal() + 1) == this.handCardsList.get(3).getCardVal()) {

			this.rankNotFound = false;
		}
	}

	public void checkThreeOfAKind() {
		if (this.handCardsList.get(0).getCardVal() == this.handCardsList.get(1).getCardVal()
				&& this.handCardsList.get(1).getCardVal() == this.handCardsList.get(2).getCardVal()
				|| this.handCardsList.get(1).getCardVal() == this.handCardsList.get(2).getCardVal()
						&& this.handCardsList.get(2).getCardVal() == this.handCardsList.get(3).getCardVal()
				|| this.handCardsList.get(2).getCardVal() == this.handCardsList.get(3).getCardVal()
						&& this.handCardsList.get(3).getCardVal() == this.handCardsList.get(4).getCardVal()) {
			this.rankNotFound = false;
		}
	}

	public void checkTwoPair() {
		if (this.handCardsList.get(0).getCardVal() == this.handCardsList.get(1).getCardVal()
				&& this.handCardsList.get(2).getCardVal() == this.handCardsList.get(3).getCardVal()
				|| this.handCardsList.get(1).getCardVal() == this.handCardsList.get(2).getCardVal()
						&& this.handCardsList.get(3).getCardVal() == this.handCardsList.get(4).getCardVal()
				|| this.handCardsList.get(0).getCardVal() == this.handCardsList.get(1).getCardVal()
						&& this.handCardsList.get(3).getCardVal() == this.handCardsList.get(4).getCardVal()) {
			this.rankNotFound = false;
		}
	}

	public void checkOnePair() {
		if (this.handCardsList.get(0).getCardVal() == this.handCardsList.get(1).getCardVal()) {
			this.rankNotFound = false;
		}
		if (this.handCardsList.get(1).getCardVal() == this.handCardsList.get(2).getCardVal()) {
			this.rankNotFound = false;
		}
		if (this.handCardsList.get(2).getCardVal() == this.handCardsList.get(3).getCardVal()) {
			this.rankNotFound = false;
		}
		if (this.handCardsList.get(3).getCardVal() == this.handCardsList.get(4).getCardVal()) {
			this.rankNotFound = false;
		}
	}
	
	public void HighCard() {
		this.rankNotFound = false;
	}
}
