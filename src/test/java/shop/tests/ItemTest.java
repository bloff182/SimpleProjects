package shop.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import shop.Item;

public class ItemTest {

	
	@Test
	public void items_with_the_same_name_and_price_equals() {
		
		Item item = new Item("Table", 100);
		
		assertEquals(item, item);
	}
	
	@Test
	public void items_with_the_same_name_but_different_price_not_equals() {
		
		Item item = new Item("Table", 100);
		Item item2 = new Item("Table", 101);
		
		assertNotEquals(item, item2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void create_item_with_minus_price() {
		
		new Item("Table", -1);
		
	}
	
	@Test
	public void items_with_differrent_name_but_the_same_price_not_equals() {
		
		Item item = new Item("Table", 100);
		Item item2 = new Item("Table2", 100);
		
		assertNotEquals(item, item2);
	}
	
	@Test
	public void items_with_differrent_name_and_differrent_price_not_equals() {
		
		Item item = new Item("Table", 100);
		Item item2 = new Item("Table2", 102);
		
		assertNotEquals(item, item2);
	}
	
	
}
