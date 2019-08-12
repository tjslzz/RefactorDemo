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
                items[i] = new AgedBrie(items[i]).GildedRose();
                break;
            case BACKSTAGE:
                items[i] = new Backstage(items[i]).GildedRose();
                break;
            case SULFURAS:
                items[i] = new Sulfuras(items[i]).GildedRose();
                break;
            default:
                items[i] = new OtherRose(items[i]).GildedRose();
                break;
        }
    }
}