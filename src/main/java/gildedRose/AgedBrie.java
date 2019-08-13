package gildedRose;

public class AgedBrie extends RoseFather {
    AgedBrie(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        subSellIn();
        addQuality(isItemValid()? 2 : 1);
        return item;
    }

    @Override
    public boolean isItemValid() {
        return item.sellIn < 0 && item.quality < LIMIT ;
    }
}
