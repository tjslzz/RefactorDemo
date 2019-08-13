package gildedRose;

public class Sulfuras extends RoseFather {

    Sulfuras(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        if (isItemValid()) addQuality(1);
        return item;
    }

    @Override
    public boolean isItemValid() {
        return item.quality < LIMIT;
    }
}
