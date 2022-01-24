package things.otherItems;

import things.Item;

public class GuitarStrings extends Item {

    public GuitarStrings(String itemName, double buyPrice, double sellPrice) {
        super(itemName, buyPrice, sellPrice);
    }

    @Override
    public int calculateMarkup() {
        double profit = getSellPrice() - getBuyPrice();
        double markup =(profit/getBuyPrice())*100;

        return (int) Math.round(markup);
    }
}
