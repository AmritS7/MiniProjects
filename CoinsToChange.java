/* Amritpal Singh
 * Created when I first learned about modulo. Converts change into coins.
 */

import java.util.Scanner;

public class CoinsToChange {
	
	public static void main(String args[]) {
	//declare variables
	int numQ,numD,numN,numP;
	final int VALQ=25;
	final int VALD=10;
	final int VALN=5;
	final int VALP=1;
	int change;
	Scanner keybd=new Scanner(System.in);
	
	//prompt user for amount of change
	System.out.print("Please enter amount of change as an integer: ");
	change = keybd.nextInt();
	
	//find answers
	//quarters
	numQ = change / VALQ;
	change = change % VALQ;
	
	//dimes
	numD = change / VALD;
	change = change % VALD;
	
	//nickels
	numN = change / VALN;
	change = change % VALN;
	
	//pennies
	numP = change / VALP;
	change= change % VALP;
	
	//display answers
	System.out.printf("%-19s%28d", "Number of quarters:", numQ);
	System.out.printf("\n%-19s%28d", "Number of dimes:", numD);
	System.out.printf("\n%-19s%28d", "Number of nickels:", numN);
	System.out.printf("\n%-19s%28d", "Number of pennies:", numP);
	
	}
}
