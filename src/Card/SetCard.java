package Card;

public class SetCard extends Card{
    private String shape;
    private int number;
    private String shading;
    private String color;

    public SetCard(int number, String shape, String shading, String color) {
        super(shading + "-" + color + " " + shape + " " + number);
//        super(cardText);
        this.shape = shape;
        this.number =number;
        this.shading = shading;
        this.color = color;
    }

    public String getShape(){
        return this.shape;
    }

    public int getNumber(){
        return this.number;
    }

    public String getShading(){
        return this.shading;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return shading + "-" + color + " " + shape + " " + number;
    }
}
