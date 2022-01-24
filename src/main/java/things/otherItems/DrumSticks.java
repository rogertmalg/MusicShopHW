package things.otherItems;

import things.Item;

public class DrumSticks extends Item {


    public DrumSticks(String itemName, double buyPrice, double sellPrice) {
        super(itemName, buyPrice, sellPrice);
    }

    @Override
    public int calculateMarkup() {
        double profit = getSellPrice() - getBuyPrice();
        double markup =(profit/getBuyPrice())*100;

        return (int) Math.round(markup);
    }
}
