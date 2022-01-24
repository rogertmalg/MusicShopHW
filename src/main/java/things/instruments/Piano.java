package things.instruments;

public class Piano extends Instrument{

    private String pianoType;

    public Piano(String itemName, double buyPrice, double sellPrice,
                 String material, String colour, InstrumentType type, String pianoType) {
        super(itemName, buyPrice, sellPrice, material, colour, type);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    @Override
    public int calculateMarkup() {
        double profit = getSellPrice() - getBuyPrice();
        double markup =(profit/getBuyPrice())*100;

        return (int) Math.round(markup);
    }

    @Override
    public String play() {
        return "plink-a-plink-a-plink-a-plink";

    }
}
