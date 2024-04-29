import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PokerOps {

	/**
	 * A method to shuffle a deck object.
	 * 
	 * @param deck object to be shuffled.
	 */
	public void shuffle(Deck deck) {
		Random random = new Random();
		Card temp;
		int size = deck.getDeckSize();
		ArrayList<Card> cardList = deck.getCardList();

		for (int j, i = 0; i < size; i++) {
			j = i + random.nextInt(size - i);

			temp = cardList.get(j);
			cardList.set(j, cardList.get(i));
			cardList.set(i, temp);
		}
	}

	/**
	 * A method to deal cards to a player's hand.
	 * 
	 * @param noOfCards number of cards to be dealt to a player's hand.
	 * @param cardList  list cards from which to draw cards.
	 * @return list of card objects for the player's hand.
	 */
	public ArrayList<Card> dealCards(int noOfCards, ArrayList<Card> cardList) {
		ArrayList<Card> returnHand = new ArrayList<>();

		for (int i = 0; i < noOfCards; i++) {
			returnHand.add(cardList.get(i));
		}

		return returnHand;
	}

	/**
	 * A method to sort cards in a player's hand.
	 * 
	 * @param handCardList list of Card objects representing a player's hand cards
	 * @return list of Card objects that is sorted in Ascending order.
	 */
	public ArrayList<Card> sortHandCards(ArrayList<Card> handCardList) {
		ArrayList<Card> unsortedCards = new ArrayList<>();
		int handSize = handCardList.size();

		for (Card card : handCardList) {
			unsortedCards.add(card);
		}
		handCardList = new ArrayList<>();

		ArrayList<Integer> cardValues = new ArrayList<>();
		for (int i = 0; i < handSize; i++) {
			cardValues.add(unsortedCards.get(i).getCardVal());
		}
		Collections.sort(cardValues);

		Card tempCard = null;
		for (int cardValue : cardValues) {
			for (Card card : unsortedCards) {
				if (cardValue == card.getCardVal()) {
					tempCard = card;
					break;
				}
			}
			handCardList.add(tempCard);
			unsortedCards.remove(tempCard);
		}

		return handCardList;
	}
}