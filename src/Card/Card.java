package Card;

/**
 * This class represents a playing card in a card game
 *
 * @author Facsimile Nimely
 */
public class Card {
    private String cardText;

    /**
     * Creates a new card with String - "Ace of Spade" or "dashed-blue diamond 3"
     * @param cardText description of a card
     */
    public Card(String cardText){
        this.cardText = cardText;
    }

    /**
     * @return description text
     */
    public String getCardText(){
        return this.cardText;
    }

    /**
     * @return the description text
     */
    @Override
    public String toString(){
        return this.cardText;
    }
}
