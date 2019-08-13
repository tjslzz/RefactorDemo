package gildedRose;

public class Conjured extends BasicRose {
    public Conjured(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        subSellIn();
        int subNum = item.sellIn < 0 && item.quality < LIMIT ? 4 : 2;
        subQuality(subNum);
        return item;
    }
}
