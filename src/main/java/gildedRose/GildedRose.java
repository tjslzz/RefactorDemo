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
            handleQualityWithSellIn(i);
        }
    }

    private void handleQualityWithSellIn(int i) {
        switch (items[i].name) {
            case AGED:
                handleAged(i);
                break;
            case BACKSTAGE:
                handleBackstage(i);
                break;
            case SULFURAS:
                handleSulfuras(i);
                break;
            default:
                handleOther(i);
                break;
        }
    }

    private void handleAged(int i) {
        subSellIn(i);
        int addNum = items[i].sellIn < 0 && items[i].quality < 50 ? 2 : 1;
        addQuality(i, addNum);
    }

    private void handleBackstage(int i) {
        subSellIn(i);
        if (items[i].sellIn < 0) resetQualityToZero(i);
        else addQuality(i,compareToBackstage(i));
    }

    private int compareToBackstage(int i){
        if (items[i].quality < 6)
            return 3;
        else if (items[i].quality < 11)
            return 2;
        else if (items[i].quality < 50)
            return 1;
        return 0;
    }

    private void handleSulfuras(int i) {
        if (items[i].quality < 50) addQuality(i, 1);
    }

    private void handleOther(int i) {
        subSellIn(i);
        int subNum = items[i].sellIn < 0 && items[i].quality < 50 ? 2 : 1;
        subQuality(i, subNum);
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

    private void subQuality(int i,int subNum) {
        items[i].quality = items[i].quality - subNum;
    }
}