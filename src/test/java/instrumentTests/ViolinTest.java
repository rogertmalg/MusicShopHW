package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import things.instruments.InstrumentType;
import things.instruments.Violin;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("violin", 300, 420,
                "wood", "black", InstrumentType.STRING, 4);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(40, violin.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("zing, zing, zing", violin.play());
    }
}
