import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {
    @Test
    public void testBuildDeck(){
        Deck testDeck = new Deck(5);

        assertEquals(52, testDeck.getDeckSize());
    }

    @Test
    public void testDealCards(){
        Deck testDeck = new Deck(5);

        assertEquals(5, testDeck.getHandDealSize());
        assertEquals(5, testDeck.dealCards().size());
    }
}
