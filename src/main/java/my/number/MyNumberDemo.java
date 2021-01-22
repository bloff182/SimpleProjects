package my.number;

import java.math.BigDecimal;

public class MyNumberDemo {

	public static void main(String[] args) {

		MyNumber myNumber = new MyNumber(5.0);
		
		System.out.println(myNumber.isOdd());
		System.out.println(myNumber.isEven());
		System.out.println(myNumber.sqrt().getValue());
		System.out.println(myNumber.pow(new MyNumber(3.0)).getValue());
		

	}

}
