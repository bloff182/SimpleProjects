package shop;

import java.util.Map;

public class Basket {

	private Map<Item, Integer> orderedItems;
	
	private double sum;

	public Basket() {
	}

	public Basket(Map<Item, Integer> orderedItems) {
		this.orderedItems = orderedItems;
	}

	public Map<Item, Integer> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(Map<Item, Integer> orderedItems) {
		this.orderedItems = orderedItems;
	}

	@Override
	public String toString() {
		return "Basket [orderedItems=" + orderedItems + "]";
	}
	
	public void addItem(Item item) {
		
		addItem(item, 1);
	}
	
	public void addItem(Item item, Integer quantity) {
		
		if (quantity <= 0)
			throw new IllegalArgumentException("Wrong number of quantity");
		
		if(orderedItems.containsKey(item))
			quantity = orderedItems.get(item) + quantity;
		
		orderedItems.put(item, quantity);
	}
	
	
	public void removeItem(Item item) {
		
		removeItem(item, 1);
	}
	
	public void removeItem(Item item, Integer quantity) {
		
		if (quantity <= 0)
			throw new IllegalArgumentException("Wrong number of quantity");
		
		if(!orderedItems.containsKey(item))
			throw new IllegalArgumentException(item.toString() +"does not exist in basket");
		
		quantity = orderedItems.get(item) - quantity;
		
		if (quantity < 0)
			throw new IllegalArgumentException("Wrong number of quantity");
		
		else if(quantity == 0)
			orderedItems.remove(item);
		else
		orderedItems.put(item, quantity);
	}
	
	public double sum() {
		
		for (Map.Entry<Item, Integer> map : orderedItems.entrySet()) {
			
			sum += map.getKey().getPrice() * map.getValue();
			
		}
		
		return sum;
	}
	
}
