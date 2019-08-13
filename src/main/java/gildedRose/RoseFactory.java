package gildedRose;

public class RoseFactory implements RoseFactoryInterface {
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGED = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String CONJURED = "Conjured";
    @Override
    public Item handleQualityWithSellIn(Item item) {
        switch (item.name) {
            case AGED:
                return new AgedBrie(item).GildedRose();
            case BACKSTAGE:
                return new Backstage(item).GildedRose();
            case SULFURAS:
                return new Sulfuras(item).GildedRose();
            case CONJURED:
                return new Conjured(item).GildedRose();
            default:
                return new BasicRose(item).GildedRose();
        }
    }
}
