package gildedRose;

public class AgedBrie extends RoseFather {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        subSellIn();
        int addNum = item.sellIn < 0 && item.quality < LIMIT ? 2 : 1;
        addQuality(addNum);
        return item;
    }
}
