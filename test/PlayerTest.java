import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void testPlayerInstantiation(){
        Player testPlayer = new Player(5);
         assertEquals(52, testPlayer.getGameDeck().getDeckSize());
    }

    @Test
    public void testPlayerDrawCards(){
        Player testPlayer = new Player(5);
        testPlayer.drawCards();

        assertEquals(5, testPlayer.getPlayerHand().size());
    }

    @Test
    public void testPlayerEvaluate(){
        Player testPlayer = new Player(5);
        testPlayer.drawCards();

        assertEquals(String.class, testPlayer.evaluate().getClass());
    }
}
