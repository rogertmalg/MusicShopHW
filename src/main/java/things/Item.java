package things;

import behaviours.ISell;

public abstract class Item implements ISell {
    private String itemName;
    private double buyPrice;
    private double sellPrice;

    public Item(String itemName, double buyPrice, double sellPrice) {
        this.itemName = itemName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
