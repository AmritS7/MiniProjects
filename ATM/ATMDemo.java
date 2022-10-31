import java.util.Scanner;
public class ATMDemo {
public static void main(String[] args)
	{
	System.out.println("Welcome to the ATM Bank");
	System.out.println("Please insert your card for the transaction:");
	Scanner kb=new Scanner(System.in);
	ATM atm1=new ATM();

	boolean contChoice;
	atm1.setAccountNum();
	atm1.passwordTest();
	atm1.setAccountType();
	atm1.computeTransaction();
	System.out.println(atm1);
	atm1.overdraft();
	
	do{
	System.out.println("Would you like to make another transaction:\nChoose 1 for yes or 2 for no:");
	int c=kb.nextInt();
	
	if(c==1){
		contChoice=true;
		atm1.computeTransaction();
		System.out.println(atm1);
		atm1.overdraft();
	}
	else
		contChoice=false;
	}
	while(contChoice);
	

	}
}

