package gildedRose;

public class Sulfuras {

    public Sulfuras(Item item) {
        this.item = item;
    }

    private Item item;

    public Item GildedRose() {
        if (item.quality < 50) addQuality( 1);
        return item;
    }
    private void addQuality(int num) {
        item.quality = item.quality + num;
    }
}
