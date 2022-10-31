/*Amritpal Singh
 * Does the opposite of another one of my miniprojects - coinstochange. In this
 * program, you enter your coin values, it displays some stats and your total.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Money {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("$#0.00");
		Scanner kb = new Scanner(System.in);
		double money[] = new double [5];//represents coin values
		String coin[] = new String[5];//represents coin names
		String number[] = {"first","second","third","fourth","fifth"};//just another array I added 
		int counter[] = new int[4];//counter for how many of each type of coin ex. 2 quarters
		
		for(int i=0;i<5;i++)
		{
		System.out.println("Please enter the value in decimals of the "+number[i]+" coin you have found");
		money[i]=kb.nextDouble();
	
     	}
		
		System.out.print("You have entered the amounts:");
		for (double val:money)
		{
			System.out.print("\t"+val);
		}
		
		System.out.println();
		System.out.print("In reverse order they are: ");
		for(int i=4;i>=0;i--)
		{
			System.out.print("\t"+money[i]);
		}
		double sum = 0.0;
		for (int i=0;i<5;i++)
		{
		 sum = sum + money[i];
		}
		System.out.println();
		System.out.println("The sum of all the coins is " + df.format(sum));
		
		Arrays.parallelSort(money);
	
		for (int i=4;i>=0;i--)//parallel sort sorts from small to big so I had to do the code from here on in an opposite way
		{
			if (money[i]==.25)
				coin[i]="Quarter";
			else if (money[i]==.10)
				coin[i]="Dime";
			else if (money[i]==.05)
				coin[i]="Nickel";
			else 
				coin[i]="Penny";
		}
		
		System.out.println("The largest coin value you have is a " + coin[4]);
		System.out.println("The smallest coin value you have is a " + coin[0]);
		
		for (int i=4;i>=0;i--)//counter 0 represents quarters, 1 - dimes, 2 - nickels, 3 - pennys
		{
			if (money[i]==.25)
				counter[0]++;
			else if (money[i]==.10)
				counter[1]++;
			else if (money[i]==.05)
				counter[2]++;
			else
				counter[3]++;
		}
		
		for (int i=0;i<=3;i++)
		{
			if (counter[i]>=2)
				System.out.println("One coin type has been repeated look below for more info");
		}
		
		System.out.println("In total you have :");
		
		
			System.out.println(counter[0]+" Quarters\t"+counter[1]+" Dimes\t\t"+counter[2]+" Nickels\t"+counter[3]+" Pennys\t");
		
		
		

}
}
