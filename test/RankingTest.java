import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class RankingTest {

    @Test
    public void testStraightFlush(){
        Card card1 = new Card("10", "\u2661", 10);
        Card card2 = new Card("J", "\u2661", 11);
        Card card3 = new Card("Q", "\u2661", 12);
        Card card4 = new Card("K", "\u2661", 13);
        Card card5 = new Card("A", "\u2661", 14);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);


        Ranking ranking = new Ranking();

        assertEquals("Straight Flush", ranking.evaluateHand(testHand));

    }

    @Test
    public void testFlush(){
        Card card1 = new Card("A", "\u2661", 14);
        Card card2 = new Card("K", "\u2661", 13);
        Card card3 = new Card("Q", "\u2661", 12);
        Card card4 = new Card("7", "\u2661", 7);
        Card card5 = new Card("9", "\u2661", 9);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        Ranking ranking = new Ranking();

        assertEquals("Flush", ranking.evaluateHand(testHand));

    }

    @Test
    public void testFourOfAKind(){
        Card card1 = new Card("2", "\u2661", 2);
        Card card2 = new Card("K", "\u2661", 13);
        Card card3 = new Card("K", "\u2662", 13);
        Card card4 = new Card("K", "\u2664", 13);
        Card card5 = new Card("K", "\u2667", 13);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        Ranking ranking = new Ranking();

        assertEquals( "Four of a Kind", ranking.evaluateHand(testHand));

    }

    @Test
    public void testFullHouse(){
        Card card1 = new Card("2", "\u2661", 2);
        Card card2 = new Card("2", "\u2662", 2);
        Card card3 = new Card("K", "\u2662", 13);
        Card card4 = new Card("K", "\u2664", 13);
        Card card5 = new Card("K", "\u2667", 13);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        Ranking ranking = new Ranking();

        assertEquals("Full House", ranking.evaluateHand(testHand));

    }

    @Test
    public void testStraight(){
        Card card1 = new Card("2", "\u2661", 2);
        Card card2 = new Card("3", "\u2662", 3);
        Card card3 = new Card("4", "\u2662", 4);
        Card card4 = new Card("5", "\u2664", 5);
        Card card5 = new Card("6", "\u2667", 6);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        Ranking ranking = new Ranking();

        assertEquals("Straight", ranking.evaluateHand(testHand));

    }

    @Test
    public void testThreeOfAKind(){
        Card card1 = new Card("2", "\u2661", 2);
        Card card2 = new Card("3", "\u2662", 3);
        Card card3 = new Card("4", "\u2662", 4);
        Card card4 = new Card("4", "\u2664", 4);
        Card card5 = new Card("4", "\u2667", 4);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        Ranking ranking = new Ranking();

        assertEquals("Three of a Kind", ranking.evaluateHand(testHand));

    }

    @Test
    public void testTwoPair(){
        Card card1 = new Card("2", "\u2661", 2);
        Card card2 = new Card("2", "\u2662", 2);
        Card card3 = new Card("J", "\u2662", 11);
        Card card4 = new Card("4", "\u2664", 4);
        Card card5 = new Card("4", "\u2667", 4);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        Ranking ranking = new Ranking();

        assertEquals("Two Pair", ranking.evaluateHand(testHand));

    }

    @Test
    public void testOnePair(){
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

        Ranking ranking = new Ranking();

        assertEquals("One Pair", ranking.evaluateHand(testHand));

    }

    @Test
    public void testHighCard(){
        Card card1 = new Card("2", "\u2661", 2);
        Card card2 = new Card("6", "\u2662", 6);
        Card card3 = new Card("J", "\u2662", 11);
        Card card4 = new Card("7", "\u2664", 7);
        Card card5 = new Card("4", "\u2667", 4);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);

        Ranking ranking = new Ranking();

        assertEquals("High Card", ranking.evaluateHand(testHand));

    }

}
