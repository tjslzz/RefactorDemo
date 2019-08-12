package gildedRose;

public abstract class RoseFather {
    protected Item item;

    public RoseFather(Item item) {
        this.item = item;
    }

    protected void subSellIn() {
        item.sellIn = item.sellIn - 1;
    }

    protected void addQuality(int num) {
        item.quality = item.quality + num;
    }

    public abstract Item GildedRose();
}
