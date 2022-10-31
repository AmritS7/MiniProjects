   /*Amritpal Singh
	 * A simple program that resembles the functions of an ATM. 
	 * Keeps track of balance, overdrafts, alongside enabling the user to have multiple accounts.
	 * Requires user login, pin number is 1234. 
	 */
   
import java.text.DecimalFormat;
import java.util.Scanner;
public class ATM {
	private String type;
	private static int num;
	private double balance;
	static Scanner kb=new Scanner(System.in);
	
	public ATM()
	{
		type=null;
		num=0;
		balance=0.0;
	}
	private void setType(String t)
	{
		type=t;
	}
	private String getType()
	{
		return type;
	}
	private void setNum(int n)
	{
		num=n;
	}
	private int getNum()
	{
		return num;
	}
	private void setBalance(double b)
	{
		balance=b;
	}
private double balance()
{
	return balance;
}

public static void setAccountNum()
{
	System.out.println("Please enter your account pin number:");
	num=kb.nextInt();
	
}

public static boolean passwordTest()
{
	for(int i=1; i<=2; i++)
	{
	
		if (num != 1234)
		{
			System.out.println("Please try again");
			setAccountNum();
		}
		else
		{
			System.out.println("Pin is correct please continue!");
			return true;
		}
	}
		if (num == 1234)
		{
		System.out.println("Pin is correct please continue!");
		return true;
		}
			
		System.out.print("You have been logged out!");
		System.exit(0);
		return false ;
}
public void setAccountType()
{
	System.out.println("Please choose 1 for checking or 2 for savings");
	int choice=kb.nextInt();
	if(choice==1)
		type="Checking";
	else
		type="Savings";
}
public void computeTransaction()
{
	System.out.println("Please enter 1 for deposit or 2 for withdrawal:");
	int choice=kb.nextInt();
	double amt;
	if(choice==1)
		{
		System.out.println("Please enter the amount to be deposited:");
		amt=kb.nextDouble();
		balance+=amt;

		}
	else
	{
		System.out.println("Please enter the amount to be withdrawn:");
		amt=kb.nextDouble();
		balance-=amt;
		}
}
public String toString()
{
	DecimalFormat df=new DecimalFormat("$#,##0.00");
	return "Account Type\t\t\t\t"+type+"\nAccount Pin\t\t\t\t"+num+"\nAccount Balance after Transaction\t"+df.format(balance);
}

public void overdraft()
{

	if (balance < 0)
	{
		System.out.print("Error you have an overdraft. Please see a bank representative!");
		System.exit(0);
	}
}
}
