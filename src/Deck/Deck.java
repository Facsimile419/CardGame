package Deck;

import Card.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * this class represents two group of cards, a dealer pile and a discard pile
 *
 * @author Facsimile Nimely
 */
public class Deck {
    private ArrayList<Card> dealerPile;
    private ArrayList<Card> discardPile;

    /**
     * Creates a new Deck
     * Instantiates dealerPile and discardPile
     */
    public Deck(){
       dealerPile = new ArrayList<>();
       discardPile = new ArrayList<>();
    }

    /**
     * Adds a card to dealerPile
     * @param card to be added
     */
    public void addCard(Card card){
        dealerPile.add(card);
    }

    /**
     * moves all card from discardPile to dealerPile
     */
    public void shuffle(){
        dealerPile.addAll(discardPile);
        discardPile.removeAll(dealerPile);
        Collections.shuffle(dealerPile);
    }

    /**
     * removes "top" (first) card from dealerPile and places it in discardPile, returns removed card
     *
     * @return card removed from dealerPile
     */
    public Card dealTopCard(){
        discardPile.add(dealerPile.get(0));
        return dealerPile.remove(0);
    }

    /**
     * @return number of cards in the dealerPile
     */
    public int cardCount(){
        return dealerPile.size();
    }

    /**
     * @return sting representation of Deck
     */
    @Override
    public String toString(){
        StringBuilder builtString = new StringBuilder(dealerPile.size() + 
                                    " cards in deck" + System.lineSeparator()
                                    + "********************");
        for (Card card : dealerPile) {
            builtString.append(System.lineSeparator() +card );
        }
        builtString.append(System.lineSeparator());

        builtString.append(System.lineSeparator() + discardPile.size() +
                " cards in discard" + System.lineSeparator()
                + "********************" + System.lineSeparator());

        for (Card card : discardPile) {
            builtString.append(card + System.lineSeparator());
        }

        return builtString.toString();
    }
}
