/* Amritpal Singh
 * Program that calculates the amount of months required to finance a car, using
 * month by month interest values.
 */
public class BuyCar {
	public static void main(String[] args) {
		//initiate variables
		double balance = 500;
		double monthlyRate = .02/12; //2 percent annual rate
		double deposit = 40;
		double interest;
		double goal = 2500; //amounts needed to buy car
		int months = 0;
		String format = "%5d%15.2f%12.2f%12.2f";
		System.out.printf("%8s%15s%12s%9s", "Month", "Interest", "Deposit", "Balance");
		System.out.println();
		//Function
		while (balance < goal)
			{	months++; //OR months = months + 1
				interest = balance * monthlyRate;
				balance += interest;
				balance += deposit;
				System.out.printf(format, months,  interest, deposit, balance);
				System.out.println();
			}
		System.out.println("\nIt will take " + months + " months to buy this car!");
	}
}
