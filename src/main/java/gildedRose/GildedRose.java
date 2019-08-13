package gildedRose;

class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i] = new RoseFactory().handleQualityWithSellIn(items[i]);
        }
    }
}