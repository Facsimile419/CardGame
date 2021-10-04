package Card;

public class SetCard extends Card{
    String shape;
    int number;
    String shading;
    String color;

    public SetCard(String shape, int number, String shading, String color, String cardText) {
        super(cardText);
        this.shape = shape;
        this.number =number;
        this.shading = shading;
        this.color = color;
    }

    public String getShape(){
        return "";
    }

    public int getNumber(){
        return 0;
    }

    public String getShading(){
        return "";
    }

    public String getColor(){
        return "";
    }

    @Override
    public String toString(){
        return "";
    }
}
