package otherItemsTests;
import org.junit.Before;
import org.junit.Test;
import things.otherItems.SheetMusic;

import static org.junit.Assert.assertEquals;


public class SheetMusicTests {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Sheet music", 3, 5);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(67, sheetMusic.calculateMarkup());
    }
}
