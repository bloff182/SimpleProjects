package enumm.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import enumm.type.Human;
import enumm.type.Human_color_eye;
import enumm.type.Human_color_hair;

public class HumanTest {

	private Human human;
	
	@Before
	public void setUp() {
		human = new Human("Alicja", 4, Human_color_eye.BLUE, Human_color_hair.BLOND);
	}
	
	@Test
	public void checkCreateTest() {
		assertNotNull(human);
		
	}
	
	@Test
	public void checkName() {
		assertEquals(human.getName(), "Alicja");
	}
	
	@Test
	public void checkAge() {
		assertEquals(human.getAge(), 4, 0);
	}
	
	
	@Test
	public void checkColorEye() {
		
		assertEquals(human.getColorEye().BLUE, Human_color_eye.BLUE);
	}
	
	@Test
	public void checkColorHair() {
		
		assertEquals(human.getColorHair().BLOND, Human_color_hair.BLOND);
	}
	
}
