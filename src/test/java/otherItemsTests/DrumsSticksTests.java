package otherItemsTests;


import org.junit.Before;
import org.junit.Test;
import things.otherItems.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumsSticksTests {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drum Sticks", 10, 13);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30, drumSticks.calculateMarkup());
    }
}
