package gildedRose;

public abstract class RoseFather {
    static final int LIMIT = 50;

    Item item;

    RoseFather(Item item) {
        this.item = item;
    }

    void subSellIn() {
        item.sellIn = --item.sellIn;
    }

    void addQuality(int num) {
        item.quality = item.quality + num;
    }

    public abstract Item GildedRose();

    public abstract boolean isItemValid();
}
