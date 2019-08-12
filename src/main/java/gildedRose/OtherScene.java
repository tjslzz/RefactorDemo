package gildedRose;

public class OtherScene {
    public OtherScene(Item item) {
        this.item = item;
    }

    private Item item;

    public Item GildedRose() {
        subSellIn();
        int subNum = item.sellIn < 0 && item.quality < 50 ? 2 : 1;
        subQuality(subNum);
        return item;
    }


    private void subSellIn() {
        item.sellIn = item.sellIn - 1;
    }

    private void subQuality(int subNum) {
        item.quality = item.quality - subNum;
    }
}
