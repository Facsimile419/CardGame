package Deck;

import Card.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> dealerPile;
    private ArrayList<Card> discardPile;

    public Deck(){
       dealerPile = new ArrayList<>();
       discardPile = new ArrayList<>();
    }

    public void addCard(Card card){
        dealerPile.add(card);
    }
    
    public void shuffle(){
        discardPile.addAll(dealerPile);
        Collections.shuffle(dealerPile);
    }
    
    public Card dealTopCard(){
        discardPile.add(dealerPile.get(0));
        return dealerPile.remove(0);
    }
    
    public int cardCount(){
        return dealerPile.size();
    }
    
    @Override
    public String toString(){
        StringBuilder builtString = new StringBuilder(dealerPile.size() + 
                                    " cards in deck" + System.lineSeparator()
                                    + "********************");
        for (Card card : dealerPile) {
            builtString.append(card);
        }
        builtString.append(System.lineSeparator());
        builtString.append(discardPile.size() +
                " cards in discard" + System.lineSeparator()
                + "********************");

        for (Card card : discardPile) {
            builtString.append(card);
        }

        return builtString.toString();
    }
}
