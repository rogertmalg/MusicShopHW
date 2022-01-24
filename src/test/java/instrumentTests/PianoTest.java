package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import things.instruments.Instrument;
import things.instruments.InstrumentType;
import things.instruments.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("piano", 700, 850,
                "wood", "black", InstrumentType.KEYBOARD, "digital piano");
    }

    @Test
    public void canGetPianoType(){
        assertEquals("digital piano", piano.getPianoType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(21, piano.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("plink-a-plink-a-plink-a-plink", piano.play());
    }
}
