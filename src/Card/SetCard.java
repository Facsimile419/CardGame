package Card;

/**
 * This class represents a card in a Set card game and extends the Card class
 * @author Facsimile Nimely
 */
public class SetCard extends Card{

    private String shape;
    private int number;
    private String shading;
    private String color;

    /**
     * Creates a new card for the Set card given a number, shape, shading, and color
     *
     * @param number of a Set card
     * @param shape of a Set card
     * @param shading to be added to Set card
     * @param color of a Set card
     */
    public SetCard(int number, String shape, String shading, String color) {
        super(shading + "-" + color + " " + shape + " " + number);
//        super(cardText);
        this.shape = shape;
        this.number =number;
        this.shading = shading;
        this.color = color;
    }

    /**
     * @return shape of a Set card
     */
    public String getShape(){
        return this.shape;
    }

    /**
     * @return number of a Set card
     */
    public int getNumber(){
        return this.number;
    }

    /**
     * @return shading of a Set card
     */
    public String getShading(){
        return this.shading;
    }

    /**
     * @return color of Set card
     */
    public String getColor(){
        return this.color;
    }

    /**
     * @return string representation of Set card in the format "dashed-blue diamond 3"
     */
    @Override
    public String toString(){
        return shading + "-" + color + " " + shape + " " + number;
    }
}
