package gildedRose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    private Item[] items;

    @Before
    public void setUp(){
        items = new Item[2];
    }

    @Test
    public void should_return_0_quality_when_call_updateQuality_given_not_a_sulfuras(){
        //given
        items[0] = new Item("Not Sulfuras, Hand of Ragnaros",1,1);
        items[1] = new Item("Not Sulfuras, Hand of Ragnaros",1,1);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0,items[0].quality);
    }
    @Test
    public void should_return_1_quality_when_call_updateQuality_given_a_sulfuras(){
        //given
        items[0] = new Item("Sulfuras, Hand of Ragnaros",1,1);
        items[1] = new Item("Sulfuras, Hand of Ragnaros",1,1);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(1,items[0].quality);
    }
    @Test
    public void should_return_0_quality_when_call_updateQuality_given_0_of_quality(){
        //given
        items[0] = new Item("somethingCool",1,0);
        items[1] = new Item("somethingCool",1,0);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0,items[0].quality);
    }

    @Test
    public void should_return_50_quality_when_call_updateQuality_given_50_of_quality_and_aged_brie(){
        //given
        items[0] = new Item("Aged Brie",1,50);
        items[1] = new Item("Backstage passes to a TAFKAL80ETC concert",1,0);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(50,items[0].quality);
    }

    @Test
    public void should_return_41_quality_when_call_updateQuality_given_40_of_quality_and_aged_brie(){
        //given
        items[0] = new Item("Aged Brie",1,40);
        items[1] = new Item("Backstage passes to a TAFKAL80ETC concert",1,0);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(41,items[0].quality);
    }

    @Test
    public void should_return_41_quality_when_call_updateQuality_given_40_of_quality_and_backstage_and_40_of_sellin(){
        //given
        items[0] = new Item("Aged Brie",1,40);
        items[1] = new Item("Backstage passes to a TAFKAL80ETC concert",40,40);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(41,items[1].quality);
    }
    @Test
    public void should_return_42_quality_when_call_updateQuality_given_40_of_quality_and_backstage_and_10_of_sellin(){
        //given
        items[0] = new Item("Aged Brie",1,40);
        items[1] = new Item("Backstage passes to a TAFKAL80ETC concert",10,40);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(42,items[1].quality);
    }
    @Test
    public void should_return_43_quality_when_call_updateQuality_given_40_of_quality_and_backstage_and_5_of_sellin(){
        //given
        items[0] = new Item("Aged Brie",1,40);
        items[1] = new Item("Backstage passes to a TAFKAL80ETC concert",5,40);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(43,items[1].quality);
    }
    @Test
    public void should_return_0_sellin_when_call_updateQuality_given_aged_brie_and_1_of_sellin(){
        //given
        items[0] = new Item("Aged Brie",1,0);
        items[1] = new Item("Backstage passes to a TAFKAL80ETC concert",1,0);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0,items[0].sellIn);
    }
}