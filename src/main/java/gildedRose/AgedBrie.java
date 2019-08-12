package gildedRose;

public class AgedBrie {

    public AgedBrie(Item item) {
        this.item = item;
    }

    private Item item;

    public Item GildedRose() {
        subSellIn();
        int addNum = item.sellIn < 0 && item.quality < 50 ? 2 : 1;
        addQuality(addNum);
        return item;
    }


    private void subSellIn() {
        item.sellIn = item.sellIn - 1;
    }


    private void addQuality(int num) {
        item.quality = item.quality + num;
    }
}
