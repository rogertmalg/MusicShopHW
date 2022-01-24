package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import things.instruments.Flute;
import things.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("flute", 70.00, 100.00,
                "silver", "silver", InstrumentType.WOODWIND, "concert");
    }

    @Test
    public void hasItemName(){
        assertEquals("flute", flute.getItemName() );
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(70.00, flute.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100, flute.getSellPrice(), 0.0);
    }

    @Test
    public void hasMaterial(){
        assertEquals("silver", flute.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("silver", flute.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, flute.getType());
    }

    @Test
    public void hasFluteType() {
        assertEquals("concert", flute.getFluteType());
    }

    @Test
    public void canCalculateMarkup(){
        int markup = flute.calculateMarkup();
        assertEquals(43, markup, 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("tootle-too", flute.play());
    }

}
