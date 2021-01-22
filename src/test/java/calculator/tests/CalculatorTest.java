package calculator.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import strefa.zadaniowa.kalkulator.Calculator;

public class CalculatorTest {
	
	private List<String> operations;
	private List<Integer> numbers;
	
	@Test
	public void  test_calculator_with_no_operations() {
		String [] tab = {"apply"};
		Integer [] numb = {5};
		operations =  Arrays.asList(tab);
		numbers =  Arrays.asList(numb);

		assertEquals(5, Calculator.calc(operations, numbers, 0));
		
	}
	
	@Test
	public void test_calculator_with_three_operations() {
		String [] tab = {"add", "multiply", "divide", "apply"};
		Integer [] numb = {7,4,8,5};
		operations =  Arrays.asList(tab);
		numbers =  Arrays.asList(numb);

		assertEquals(6, Calculator.calc(operations, numbers, 4));
		
	}
	
	@Test
	public void should_return_number_muliply_twice() {
		String [] tab = {"multiply", "multiply", "apply"};
		Integer [] numb = {2,4,5};
		operations =  Arrays.asList(tab);
		numbers =  Arrays.asList(numb);

		assertEquals(40, Calculator.calc(operations, numbers, 3));
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void should_throw_exception_divide_by_zero() {
		String [] tab = {"multiply", "divide", "apply"};
		Integer [] numb = {2,0,5};
		operations =  Arrays.asList(tab);
		numbers =  Arrays.asList(numb);

		Calculator.calc(operations, numbers, 3);
		
	}
	
	@Test
	public void test_calculator_with_two_operations() {
		String [] tab = {"multiply", "add", "apply"};
		Integer [] numb = {0,4,5};
		operations =  Arrays.asList(tab);
		numbers =  Arrays.asList(numb);

		assertEquals(4, Calculator.calc(operations, numbers, 3));
		
	}
}
