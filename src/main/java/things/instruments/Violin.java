package things.instruments;

public class Violin extends Instrument{

    private int numberOfStrings;

    public Violin(String itemName, double buyPrice, double sellPrice,
                  String material, String colour, InstrumentType type, int numberOfStrings) {
        super(itemName, buyPrice, sellPrice, material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public int calculateMarkup() {
        double profit = getSellPrice() - getBuyPrice();
        double markup =(profit/getBuyPrice())*100;

        return (int) Math.round(markup);
    }

    @Override
    public String play() {
        return "zing, zing, zing";

    }
}
