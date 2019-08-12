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
    public void should_return_when_call_updateQuality_given_(){
        //given
        items[0] = new Item("Not Sulfuras, Hand of Ragnaros",1,1);
        items[1] = new Item("Not Sulfuras, Hand of Ragnaros",1,1);
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0,items[0].quality);
    }

}