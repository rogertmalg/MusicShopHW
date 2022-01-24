package things.instruments;

public class Flute extends Instrument{
    private String fluteType;

    public Flute(String itemName, double buyPrice, double sellPrice,
                 String material, String colour, InstrumentType type, String fluteType) {
        super(itemName, buyPrice, sellPrice, material, colour, type);
        this.fluteType = fluteType;
    }

    public String getFluteType() {
        return fluteType;
    }

    @Override
    public int calculateMarkup() {
        double profit = getSellPrice() - getBuyPrice();
        double markup =(profit/getBuyPrice())*100;

        return (int) Math.round(markup);
    }

    @Override
    public String play() {
        return "tootle-too";

    }
}
