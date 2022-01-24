package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import things.instruments.Guitar;
import things.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar", 40.00, 70.00,
                "wood", "white", InstrumentType.STRING, 6);
    }

    @Test
    public void canGerNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(75, guitar.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("strum, strum, strum", guitar.play());
    }
}
