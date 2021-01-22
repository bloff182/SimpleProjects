package enumm.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import enumm.type.Computation;

public class ComputationTest {

	@Test
	public void sum() {
		assertEquals(Computation.ADD.perform(20, 4), 24, 0);
	}

	@Test
	public void subtract() {
		assertEquals(Computation.SUBTRACT.perform(20, 4), 16, 0);
	}

	@Test
	public void multiply() {
		assertEquals(Computation.MULTIPY.perform(20, 4), 80, 0);
	}

	@Test
	public void devide() {
		assertEquals(Computation.DIVIDE.perform(20, 4), 5, 0);
	}
}
