package gildedRose;

public class GildedRose {

    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGED = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            handleQuality(i);
            handleSellIn(i);

        }
    }

    private void handleSellIn(int i) {
        switch (items[i].name) {
            case AGED:
                sellinForAged(i);
                break;
            case BACKSTAGE:
                sellinForBackstage(i);
                break;
            case SULFURAS:
                break;
            default:
                checkQuality(i);
                break;
        }
    }

    private void sellinForBackstage(int i) {
        subSellIn(i);
        if (items[i].sellIn < 0) {
            resetQualityToZero(i);
        }
    }

    private void checkQuality(int i) {
        subSellIn(i);
        if (items[i].quality > 0 && items[i].sellIn < 0) {
            subQuality(i);
        }
    }

    private void sellinForAged(int i) {
        subSellIn(i);
        if (items[i].sellIn < 0 && items[i].quality < 50) {
            addQuality(i, 1);
        }
    }

    private void handleQuality(int i) {
        switch (items[i].name) {
            case AGED:
                qualityLittleFiftyForAandS(i);
                break;
            case BACKSTAGE:
                qualityLittleFiftyForBackstage(i);
                break;
            case SULFURAS:
                qualityLittleFiftyForAandS(i);
                break;
            default:
                subQuality(i);
                break;
        }
    }

    private void qualityLittleFiftyForBackstage(int i) {
        if (items[i].quality < 6)
            addQuality(i, 3);
        else if (items[i].quality < 11)
            addQuality(i, 2);
        else if (items[i].quality < 50)
            addQuality(i, 1);
    }

    private void qualityLittleFiftyForAandS(int i) {
        if (items[i].quality < 50)
            addQuality(i, 1);
    }

    private boolean isBackstage(Item item) {
        return item.name.equals(BACKSTAGE);
    }

    private boolean isAged(Item item) {
        return item.name.equals(AGED);
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals(SULFURAS);
    }

    private void resetQualityToZero(int i) {
        items[i].quality = 0;
    }

    private void subSellIn(int i) {
        items[i].sellIn = items[i].sellIn - 1;
    }

    private void addQuality(int i, int num) {
        items[i].quality = items[i].quality + num;
    }

    private void subQuality(int i) {
        items[i].quality = items[i].quality - 1;
    }
}