package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    private Item[] items = new Item[1];


    @Test
    public void should_return_42_quality_when_call_updateQuality_given_40_of_quality_and_aged_brie_and_1_of_sellin() {
        //given
        items[0] = new Item("Aged Brie", -1, 40);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals("Aged Brie, -2, 42", items[0].toString());
    }

    @Test
    public void should_return_0_quality_when_call_updateQuality_given_51_of_quality_and_backstage_and_1_of_sellin() {
        //given
        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 40);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0", items[0].toString());
    }

    @Test
    public void should_return_0_quality_when_call_updateQuality_given_1_of_sellin_and_something_cool() {
        //given
        items[0] = new Item("somethingCool", -1, 2);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals("somethingCool, -2, 0", items[0].toString());
    }
//
//    @Test
//    public void should_return_0_quality_when_call_updateQuality_given_not_a_sulfuras() {
//        //given
//        items[0] = new Item("Not Sulfuras, Hand of Ragnaros", 1, 1);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals("Not Sulfuras, Hand of Ragnaros, 0, 0", items[0].toString());
//    }
//
//    @Test
//    public void should_return_1_quality_when_call_updateQuality_given_a_sulfuras() {
//        //given
//        items[0] = new Item("Sulfuras, Hand of Ragnaros", 1, 1);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals("Sulfuras, Hand of Ragnaros, 1, 1", items[0].toString());
//    }
//
//    @Test
//    public void should_return_50_quality_when_call_updateQuality_given_50_of_quality_and_aged_brie() {
//        //given
//        items[0] = new Item("Aged Brie", 1, 50);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals("Aged Brie, 0, 50", items[0].toString());
//    }
//
//    @Test
//    public void should_return_41_quality_when_call_updateQuality_given_40_of_quality_and_aged_brie() {
//        //given
//        items[0] = new Item("Aged Brie", 1, 40);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals("Aged Brie, 0, 41", items[0].toString());
//    }
//
//    @Test
//    public void should_return_41_quality_when_call_updateQuality_given_40_of_quality_and_backstage_and_40_of_sellin() {
//        //given
//        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 40, 40);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals("Backstage passes to a TAFKAL80ETC concert, 39, 41", items[0].toString());
//    }
//
//    @Test
//    public void should_return_42_quality_when_call_updateQuality_given_40_of_quality_and_backstage_and_10_of_sellin() {
//        //given
//        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 40);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals(42, items[0].quality);
//    }
//
//    @Test
//    public void should_return_43_quality_when_call_updateQuality_given_40_of_quality_and_backstage_and_5_of_sellin() {
//        //given
//        items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 43", items[0].toString());
//    }
//
//    @Test
//    public void should_return_1_quality_when_call_updateQuality_given_1_of_sellin_and_something_cool() {
//        //given
//        items[0] = new Item("somethingCool", -1, -1);
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals(-1, items[0].quality);
//    }
}