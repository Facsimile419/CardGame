package Card;

public class StandardCard extends Card {
    String rank;
    String suit;

    public StandardCard(String cardText, String rank, String suit) {
        super(rank + " of " + suit);
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    @Override
    public String toString(){
        return rank + " of " + suit;
    }
}
