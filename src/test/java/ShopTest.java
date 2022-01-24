import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import things.instruments.InstrumentType;
import things.instruments.Piano;
import things.otherItems.DrumSticks;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks;
    Piano piano;

    @Before
    public void before() {
        shop = new Shop();
        drumSticks = new DrumSticks("Drum Sticks", 10, 13);
        piano = new Piano("piano", 700, 850,
                "wood", "black", InstrumentType.KEYBOARD, "digital piano");
        shop.addItem(drumSticks);
        shop.addItem(piano);

    }

    @Test
    public void canGetStockSize() {
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canAddItems() {
        shop.addItem(piano);
        assertEquals(3, shop.getStockSize() );
    }

    @Test
    public void canRemoveItems() {
        shop.removeItem(drumSticks);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canGetAverageMarkup() {
        assertEquals(25.5, shop.totalAverageMarkup(), 0.0);
    }

}
