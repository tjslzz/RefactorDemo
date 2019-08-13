package gildedRose;

public class BasicRose extends RoseFather {
    BasicRose(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        subSellIn();
        subQuality(isItemValid()? 2 : 1);
        return item;
    }

    @Override
    public boolean isItemValid() {
        return item.sellIn < 0 && item.quality < LIMIT;
    }

    void subQuality(int subNum) {
        item.quality = item.quality - subNum;
    }
}
