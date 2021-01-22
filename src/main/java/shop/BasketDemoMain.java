package shop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BasketDemoMain {

	public static void main(String[] args) {

		Item it1 = new Item("pen", 1);
		Item it2 = new Item("ruler", 3.5);
		Item it3 = new Item("note", 2);
		
		Map<Item, Integer> orderedItems = new TreeMap<Item, Integer>();
		
		Basket basket = new Basket(orderedItems);

		basket.addItem(it1,2);
		basket.addItem(it2,2);
		basket.addItem(it3,4);
		
		basket.removeItem(it1,1);
		basket.removeItem(it3,1);
		basket.addItem(it3,3);
		
		double suma1 = basket.sum();

		System.out.println("suma: " + suma1);
		
	
	}

}
