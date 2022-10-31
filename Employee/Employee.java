/*Amritpal Singh
 * Created shortly after I was introduced to the concept of objects.
 * Calculates salary of individual employees using hours worked and rate/hr. 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Employee {

	int id;
	int hours;
	double rate;
	
	public Employee()
	{
		id = 1234;
		hours = 0;
		rate = 0.0;
	}
	public void getInfo()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the employee ID number:");
		id = kb.nextInt();
		
		System.out.println("Enter the number of hours the employee worked:");
		hours = kb.nextInt();
		
		System.out.println("Enter the rate of the employee: ");
		rate = kb.nextInt();
	}
	public void showInfo()
	{
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		System.out.println(id+"\t"+hours+"\t"+df.format(rate)+"\t"+df.format(hours*rate));
	}
}
