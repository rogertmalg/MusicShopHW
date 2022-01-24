import behaviours.ISell;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Shop {

    private ArrayList<ISell> stock = new ArrayList<>();


    public int getStockSize() {
        return stock.size();
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        int i = stock.indexOf(item);
        stock.remove(i);
    }

    public double totalAverageMarkup(){
       IntStream markups = stock.stream().map(item -> item.calculateMarkup()).mapToInt(item -> item);
       OptionalDouble averageMarkup = markups.average();
       return averageMarkup.getAsDouble();


    }
}
