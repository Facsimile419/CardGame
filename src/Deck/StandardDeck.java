package Deck;

import Card.StandardCard;

public class StandardDeck extends Deck {
    public StandardDeck(){

    }

    @Override
    public StandardCard dealTopCard(){
        return (StandardCard) super.dealTopCard();
    }
}
