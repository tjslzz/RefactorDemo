package gildedRose;

public class Sulfuras extends RoseFather {

    Sulfuras(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        if (item.quality < LIMIT) addQuality(1);
        return item;
    }
}
