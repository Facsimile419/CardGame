package Card;

import org.junit.Test;

import static org.junit.Assert.*;

public class StandardCardTest {

    @Test
    public void getRank() {
        StandardCard card = new StandardCard("Jack", "Hearts");
        assertEquals("Jack", card.getRank());
    }

    @Test
    public void getSuit() {
        StandardCard card = new StandardCard("Jack", "Hearts");
        assertEquals("Hearts", card.getSuit());
    }

    @Test
    public void testToString() {
        StandardCard card = new StandardCard("Jack", "Hearts");
        String testString = "Jack of Hearts";
        assertEquals(testString, card.toString());
    }
}