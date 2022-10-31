/*Amritpal Singh
 * Super simple program that simulates a lottery drawing and gives you 
 * your stats based on the randomly generated drawing.
 */

import java.util.Arrays;

public class LottoArray {
	public static void main(String[] args) {
		
	
	int[]array= new int [6];
	for (int i=0;i<=5;i++)
	{
	array[i]=(int)(50*Math.random())+1;
	}
	
	int luckyLotto=7;
	int luckySum=35;
	int sum=0;
	int counter1=0;//<7
	int counter2=0;//==7
	int counter3=0;//>7
	Arrays.parallelSort(array);
	System.out.println("In sorted order the numbers are: ");
	for (int i=0;i<=5;i++)
	{
	System.out.print(array[i]+"\t");
	sum+=array[i];
	}
	
	
	for (int i=0;i<=5;i++)
	{
	if (array[i]==7)
	{
		System.out.println();
		System.out.println("One of the numbers that you have drawn is 7, the Lucky Lotto Number!");
		counter2++;
	}
	if (array[i]<7)
	{
		counter1++;
	}
	if (array[i]>7)
	{
		counter3++;
	}
	}
	

	if (counter2==0)
	{
		System.out.println();
		System.out.println("Unfortunately you have not drawn the Lucky Lotto Number of 7!");
	}
	if (sum==35)
	{
		
		System.out.print("The sum of your six numbers is 35, the Lucky Sum!");
	}
	else 
	{
		
		System.out.println("Unfortunately you have not drawn the Lucky Sum of 35!");
	}
		
		
	System.out.println("The sum of all your numbers is: "+sum);
	System.out.println("Your lowest number was: "+array[0]);
	System.out.println("Your highest number was: "+array[5]);
	System.out.println("You had "+counter1+" numbers that were less than 7");
	System.out.println("You had "+counter2+" numbers that were exactly 7");
	System.out.println("You had "+counter3+" numbers that were more than 7");
	
	
	}
}
