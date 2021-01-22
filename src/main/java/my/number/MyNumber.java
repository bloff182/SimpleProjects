package my.number;

public class MyNumber {

	private Double value;

	public MyNumber(Double x) {
		this.value = x;
	}

	public boolean isOdd() {
		if (value%2 == 0)
			return false;
		return true;
	}

	public boolean isEven() {
		if (value%2 != 0)
			return false;
		return true;
	}

	public MyNumber sqrt() {
		
		MyNumber y = new MyNumber(Math.sqrt(value));
		
		return y;
	}

	public MyNumber pow(MyNumber x) {
	
		return new MyNumber(Math.pow(value, x.getValue()));
	}

	public MyNumber add(MyNumber x) {
		return new MyNumber(x.getValue() + value);
	}

	public MyNumber subtract(MyNumber x) {
		return new MyNumber(value - x.getValue() );
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double x) {
		this.value = x;
	}
	
	
}
