package shop;

public class Item implements Comparable<Item>{

	private String name;
	
	private double price;

	public Item(String name, double price) {
		
		if (price < 0)
			throw new IllegalArgumentException("Price should be plus");
		
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

	public int compareTo(Item o) {

		return name.compareTo(o.name);

	}
	
	
	
	
	
}
