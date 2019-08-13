package gildedRose;

public class Backstage extends RoseFather {
    private static final int MIN_LIMIT = 6;
    private static final int MIN_NUM = 3;
    private static final int MID_LIMIT = 11;
    private static final int MID_NUM = 2;

    Backstage(Item item) {
        super(item);
    }

    @Override
    public Item GildedRose() {
        subSellIn();
        if (isItemValid()) resetQualityToZero();
        else addQuality(compareToBackstage());
        return item;
    }

    @Override
    public boolean isItemValid() {
        return item.sellIn < 0;
    }

    private int compareToBackstage() {
        if (item.quality < MIN_LIMIT)
            return MIN_NUM;
        else if (item.quality < MID_LIMIT)
            return MID_NUM;
        else if (item.quality < LIMIT)
            return 1;
        return 0;
    }

    private void resetQualityToZero() {
        item.quality = 0;
    }
}
