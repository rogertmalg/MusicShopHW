package otherItemsTests;
import org.junit.Before;
import org.junit.Test;
import things.otherItems.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTests {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Guitar strings", 15, 23);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(53, guitarStrings.calculateMarkup());
    }
}
