import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
    @Test
    public void testCardInstantiation(){
        Card testCard = new Card("2", "\u2662", 2);

        assertEquals("2", testCard.getCardRank());
        assertEquals("\u2662", testCard.getCardSuit());
        assertEquals(2, testCard.getCardVal());
    }
}
