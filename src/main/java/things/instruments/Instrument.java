package things.instruments;

import behaviours.IPlay;
import things.Item;

public abstract class Instrument extends Item implements IPlay {

    private String material;
    private String colour;
    private InstrumentType type;

    public Instrument(String itemName, double buyPrice, double sellPrice,
                      String material, String colour, InstrumentType type) {
        super(itemName, buyPrice, sellPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }
}
