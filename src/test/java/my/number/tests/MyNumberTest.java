package my.number.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import my.number.MyNumber;

public class MyNumberTest {

	MyNumber number;
	
	@Before
	public void setUp() {
		
		number = new MyNumber(16.0);
	}
	
	@Test
	public void should_create_number() {
		
		assertNotNull(number);
		
	}
	
	@Test
	public void should_check_odd_number() {
		
		assertFalse(number.isOdd());
	}
	
	@Test
	public void should_check_even_number() {
		
		assertTrue(number.isEven());
	}
	
	@Test
	public void should_return_sqrt_of_my_number() {
		assertEquals(number.sqrt().getValue(), 4.0, 0);
	}
	
	@Test
	public void should_return_power_of_my_number() {
		assertEquals(number.pow(new MyNumber(3.0)).getValue(), 4096.0, 0);
	}
	
	@Test
	public void should_add_my_number() {
		assertEquals(number.add(new MyNumber(9.0)).getValue(),25.0 ,0);
	}
	
	@Test
	public void should_subtract_my_number() {
		assertEquals(number.subtract(new MyNumber(7.0)).getValue(),9.0, 0);
	}
	
}
