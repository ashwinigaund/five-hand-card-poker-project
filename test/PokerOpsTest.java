import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class PokerOpsTest {
    @Test
    public void testDealCards(){
        Deck testDeck = new Deck(5);
        ArrayList<Card> testHand = testDeck.dealCards();
    
        assertEquals(5, testHand.size());
    }

    @Test
    public void testSortHand(){
        Card card1 = new Card("2", "\u2661", 2);
        Card card2 = new Card("6", "\u2662", 6);
        Card card3 = new Card("J", "\u2662", 11);
        Card card4 = new Card("4", "\u2664", 4);
        Card card5 = new Card("4", "\u2667", 4);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        PokerOps testPokerAlgos = new PokerOps();

        testHand = testPokerAlgos.sortHandCards(testHand);

        assertEquals("2", testHand.get(0).getCardRank());
        assertEquals("4", testHand.get(1).getCardRank());
        assertEquals("4", testHand.get(2).getCardRank());
        assertEquals("6", testHand.get(3).getCardRank());
        assertEquals("J", testHand.get(4).getCardRank());
    }
}
