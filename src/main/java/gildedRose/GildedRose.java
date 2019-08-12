package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!isAged(items[i])
                    && !isBackstage(items[i])) {
                if (items[i].quality > 0) {
                    if (!isSulfuras(items[i])) {
                        subQuality(i);
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    addQuality(i);
                    if (isBackstage(items[i])) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                addQuality(i);
                            }
                        }
                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                addQuality(i);
                            }
                        }
                    }
                }
            }

            if (!isSulfuras(items[i])) {
                subSellIn(i);
            }

            if (items[i].sellIn < 0) {
                if (!isAged(items[i])) {
                    if (!isBackstage(items[i])) {
                        if (items[i].quality > 0) {
                            if (!isSulfuras(items[i])) {
                                subQuality(i);
                            }
                        }
                    } else {
                        resetQualityToZero(i);
                    }
                } else {
                    if (items[i].quality < 50) {
                        addQuality(i);
                    }
                }
            }
        }
    }
    private boolean isBackstage(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAged(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private void resetQualityToZero(int i) {
        items[i].quality = 0;
    }

    private void subSellIn(int i) {
        items[i].sellIn = items[i].sellIn - 1;
    }

    private void addQuality(int i) {
        items[i].quality = items[i].quality + 1;
    }

    private void subQuality(int i) {
        items[i].quality = items[i].quality - 1;
    }
}