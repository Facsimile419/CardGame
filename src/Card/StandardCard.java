package Card;

public class StandardCard extends Card {
    String rank;
    String suit;

    public StandardCard(String cardText, String rank, String suit) {
        super(cardText);
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank(){
        return "";
    }

    public String getSuit(){
        return "";
    }

    @Override
    public String toString(){
        return "";
    }
}
