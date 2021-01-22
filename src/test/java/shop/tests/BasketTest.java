package shop.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import shop.Basket;
import shop.Item;

public class BasketTest {

	private Map<Item, Integer> map;
	private Basket basket;
	private Item item1;
	private Item item2;
	private Item item3;

	@Before
	public void setUp() {
		
		map = new TreeMap<Item,Integer>();
		basket = new Basket(map);
		item1 = new Item("socks", 5.0);
		item2 = new Item("glasses", 10);
		item3 = new Item("hat", 15);
			
	}
	
	@Test
	public void should_add_one_item() {
		
		basket.addItem(item1);
		
		assertNotNull(basket);
		assertEquals(1, basket.getOrderedItems().size());
		
	}
	
	@Test
	public void should_check_value_of_added_one_item() {
		
		basket.addItem(item1);
		
		assertEquals(item1.getPrice(), basket.sum(),0);
		
	}
	
	
	@Test
	public void should_add_more_items_test() {
		
		basket.addItem(item2, 2);
		basket.addItem(item3, 3);
		
		assertNotNull(basket);
		assertEquals(2, basket.getOrderedItems().size());
		
	}
	
	@Test
	public void should_check_value_of_added_many_items() {
		
		basket.addItem(item1);
		basket.addItem(item2,2);
		basket.addItem(item3,2);
		basket.addItem(item1,2);
		
		assertEquals(65, basket.sum(),0);
		
	}
	
	@Test
	public void should_remove_one_item() {
		
		basket.addItem(item1);
		basket.removeItem(item1,1);
		

		assertNull(basket.getOrderedItems().get(item1));
		
	}
	
	@Test
	public void should_remove_many_items() {
		
		basket.addItem(item1,5);
		basket.removeItem(item1,2);
		
		assertEquals(3,basket.getOrderedItems().get(item1),0);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_not_remove_from_empty_basket_throw_exception() {
		
		
		basket.removeItem(item1,-1);
		basket.removeItem(item1,0);
		basket.removeItem(item1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_not_remove_not_exist_item_throw_exception() {
		
		basket.addItem(item1);
		basket.removeItem(item2);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_not_add_with_minus_quantity_throw_exception() {
		
		basket.addItem(item1, -2);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_not_add_with_zero_quantity_throw_exception() {
		
		basket.addItem(item1, 0);
		
	}
	
}
