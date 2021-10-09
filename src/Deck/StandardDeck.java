package Deck;

import Card.Card;
import Card.StandardCard;

/**
 * this class represents a 52-card deck of playing cards
 *
 * @author Facsimile Nimely
 */
public class StandardDeck extends Deck {
    /**
     * Creates a standard 52-card deck with each combination of the rank and suit values
     */
    public StandardDeck(){
        // create an array of ranks, array of suits
        // ranks 2,3
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        for (String rank : ranks) {
            for (String suit : suits) {
                super.addCard(new Card(rank + " of " + suit));
            }
        }
        // standard 52-card deck can be created with loops using both arrays
    }

    /**
     * retrieves the card from the parent class using its dealTopCard() on the parent class
     * @return StandardCard cast from a Card object
     */
    @Override
    public StandardCard dealTopCard(){
        return (StandardCard) super.dealTopCard();
    }
}
