package gildedRose;

public class OtherRose extends RoseFather {
    public OtherRose(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        subSellIn();
        int subNum = item.sellIn < 0 && item.quality < LIMIT ? 2 : 1;
        subQuality(subNum);
        return item;
    }

    private void subQuality(int subNum) {
        item.quality = item.quality - subNum;
    }
}
