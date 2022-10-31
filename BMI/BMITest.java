import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*Project: Lab 3
 * Class: BMITest.java
 * Author: Amritpal Singh
 * Date: March 7, 2021
 * This class tests three methods in the BMI class using three different types of assertion expressions
 */

class BMITest {

	// ---------------------------------------------------------------
	// This method creates an object, test1 and uses the getBMI method from the BMI
	// class to assert that the returned BMI is equal to the expected BMI
	@Test
	public void testGetBMI() {
		BMI test1 = new BMI("Mark", 23, 165, 73);
		double returnedBMI = test1.getBMI();
		assertEquals(21.77, returnedBMI);
	}

	// ---------------------------------------------------------------
	// This method creates an object, test2 and uses the getAge method from the BMI
	// class to assert that it is true that the returned age is equal to the entered
	// age
	@Test
	public void testGetAge() {
		BMI test2 = new BMI("Jack", 37, 187, 70);
		int returnedAge = test2.getAge();
		assertTrue(returnedAge == 37);
	}

	// ---------------------------------------------------------------
	// This method creates an object, test3 and uses the getName method from the BMI
	// class to assert that the returned name is not null
	@Test
	public void testGetName() {
		BMI test3 = new BMI("Samantha", 19, 131, 67);
		String returnedName = test3.getName();
		assertNotNull(returnedName);
	}
}
