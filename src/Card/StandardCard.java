package Card;

/**
 * this class represents a standard playing card with a suit and rank, and it extends
 * the Card class
 *
 * @author Facsimile Nimely
 */
public class StandardCard extends Card {
    String rank;
    String suit;

    /**
     * Creates a standard playing card with a rank and suit
     *
     * @param rank of a Card - "Jack", "2", "Queen", etc
     * @param suit of Card - "Hearts", "Spaded", etc
     */
    public StandardCard(String rank, String suit) {
        super(rank + " of " + suit);
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * @return rank of standard card
     */
    public String getRank(){
        return this.rank;
    }

    /**
     * @return suit of a standard card
     */
    public String getSuit(){
        return this.suit;
    }

    /**
     * @return string representation of standard card - "2 of Hearts"
     */
    @Override
    public String toString(){
        return rank + " of " + suit;
    }
}
