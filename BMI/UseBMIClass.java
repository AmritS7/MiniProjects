/*Project: Lab 3
 * Class: UseBMIClass.java
 * Author: Amritpal Singh
 * Date: March 7, 2021
 * This class serves as the main method and creates two objects, bmi1 and bmi2 and prints out the names and their respective BMIs using methods from the BMI class
 */

public class UseBMIClass {
	public static void main(String[] args) {
		BMI bmi1 = new BMI("John Doe", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI());

		BMI bmi2 = new BMI("Peter King", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI());
	}
}
