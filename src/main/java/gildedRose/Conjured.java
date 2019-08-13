package gildedRose;

public class Conjured extends BasicRose {
    public Conjured(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        subSellIn();
        subQuality(isItemValid() ? 4 : 2);
        return item;
    }

    @Override
    public boolean isItemValid() {
        return item.sellIn < 0 && item.quality < LIMIT;
    }
}
