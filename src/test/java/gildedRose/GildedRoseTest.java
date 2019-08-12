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
    public void should_return_0_when_call_updateQuality_given_not_a_sulfuras(){
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
    public void should_return_0_when_call_updateQuality_given_a_sulfuras(){
        //given
        items[0] = new Item("Sulfuras, Hand of Ragnaros",1,1);
        items[1] = new Item("Sulfuras, Hand of Ragnaros",1,1);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(1,items[0].quality);
    }

}