package gildedRose;

public class Sulfuras extends RoseFather{
    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        if (item.quality < 50) addQuality( 1);
        return item;
    }
}
