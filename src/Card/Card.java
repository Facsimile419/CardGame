package Card;

public class Card {
    private String cardText;

    public Card(String cardText){
        this.cardText = cardText;
    }

    public String getCardText(){
        return this.cardText;
    }

    @Override
    public String toString(){
        return this.cardText;
    }
}
