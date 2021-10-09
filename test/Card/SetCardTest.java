package Card;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetCardTest {

    @Test
    public void testGetShape(){
        SetCard set = new SetCard(3, "diamond", "dashed", "blue");
        assertEquals("diamond", set.getShape());
    }

    @Test
    public void testGetShading(){
        SetCard set = new SetCard(3, "diamond", "dashed", "blue");
        assertEquals("dashed", set.getShading());
    }

    @Test
    public void testGetColor(){
        SetCard set = new SetCard(3, "diamond", "dashed", "blue");
        assertEquals("blue", set.getColor());
    }

    @Test
    public void testGetNumber(){
        SetCard set = new SetCard(3, "diamond", "dashed", "blue");
        assertEquals(3, set.getNumber());
    }

    @Test
    public void testToString(){
        SetCard set = new SetCard(3, "diamond", "dashed", "blue");
        String testString = "dashed-" + "blue " + "diamond " + 3;
        assertEquals(testString, set.toString());
    }
}