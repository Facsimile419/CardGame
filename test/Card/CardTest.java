package Card;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void getCardText() {
        Card card = new Card("Ace of Spade");
        assertEquals("Ace of Spade", card.getCardText());
    }

    @Test
    public void testToString() {
        Card card = new Card("Ace of Spade");
        assertEquals("Ace of Spade", card.toString());
    }
}