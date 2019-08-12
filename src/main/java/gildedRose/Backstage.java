package gildedRose;

public class Backstage {

    public Backstage(Item item) {
        this.item = item;
    }

    private Item item;

    public Item GildedRose() {
        subSellIn();
        if (item.sellIn < 0) resetQualityToZero();
        else addQuality(compareToBackstage());
        return item;
    }


    private void subSellIn() {
        item.sellIn = item.sellIn - 1;
    }


    private void addQuality(int num) {
        item.quality = item.quality + num;
    }


    private int compareToBackstage(){
        if (item.quality < 6)
            return 3;
        else if (item.quality < 11)
            return 2;
        else if (item.quality < 50)
            return 1;
        return 0;
    }


    private void resetQualityToZero() {
        item.quality = 0;
    }
}
