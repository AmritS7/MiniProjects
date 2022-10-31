/*Amritpal Singh
 * Lab 4 - Stacks and Queues
 * CUS 1126
 * Uses stacks and queues to calculate average share prices of inputed stock sales
 */
import java.util.Scanner;

public class PrintStocks {

	static Stocks top;
	static Stocks topMarker;//marker acts as a poppable pointer
	static Stocks front;
	static Stocks frontMarker;
	static Stocks back;
	
	//inserting into stack
	public void push(Stocks toInsert) {
		if (top == null) {
			top = toInsert;
		}
		else {
			toInsert.next = top;
		    top = toInsert;
		}
	}
	
	//inserting into queue
	public void enqueue(Stocks toInsert) {
		if (front == null) {
			front = toInsert;
			back = toInsert;
		}
		else {
			back.next = toInsert;
			back = toInsert;
		}
	}
	
	
	public static double lifoSum(String stockSymbol, int numShares) {
		double sum = 0;
		topMarker=top;//resets topMarker to top of stack
		while(numShares>0){
		if (topMarker == null) {
			System.out.println("Error, not enough data for specified stock exist");
			System.exit(0);
		}
		else {
			if (topMarker.stockName.contentEquals(stockSymbol)){//checks if the topMarker object/stock has the stocksymbol being searched
				sum += topMarker.purchPrice;
				topMarker = topMarker.next;
				numShares--;//subtracts from numShares -- loop stops once we hit 0 
			}
			else {
				topMarker = topMarker.next;//if the stocksymbol and name don't match then it continues down the list
			}
		}
	}
		return sum;//returns the sum of the stock price for the number of shares searched for -- so we can find the average in the main
	}
	
	public static double fifoSum(String stockSymbol, int numShares) {//same comments as lifoSum, but in regards to front and the queue
		frontMarker=front;
		double sum = 0;
		while (numShares>0) {
			if (frontMarker == null) {
				System.out.println("Error, not enough data for specified stocks exist");
				System.exit(0);
			}
			else {
				if (frontMarker.stockName.contentEquals(stockSymbol)) {
				sum += frontMarker.purchPrice;
				frontMarker = frontMarker.next;
				numShares--;
			}
				else {
					frontMarker = frontMarker.next;
				}
		}
		}
		return sum;
		}
	
	
	public static void main(String [] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Press 1 to enter a stock sale\nPress 2 to find the fifo and lifo price of the stock");
		int choice = kb.nextInt();
		
		if (choice == 1) {
			do {
			System.out.println("Please enter the stock symbol");
			String symbol = kb.next();
			System.out.println("Please enter the number of shares purchased");
			int numShares = kb.nextInt();
			System.out.println("Please enter the cost purchase price per share");
			double purchasePrice = kb.nextDouble();
			
			PrintStocks newStocks = new PrintStocks();
			for (int i=numShares;i>0;i--) {//pushes entered stocks into stack
				Stocks stock = new Stocks(symbol, numShares, purchasePrice);
				newStocks.push(stock);
				}
			
			for (int j=numShares;j>0;j--) {//enqueues entered stocks into queue
				Stocks stock = new Stocks(symbol, numShares, purchasePrice);
				newStocks.enqueue(stock);
				}
						
			
			System.out.println("Press 1 to enter another stock or press 2 to find the lifo and fifo price");
			choice = kb.nextInt();
			}
			while(choice == 1);//if choice equals 1, runs loop again to add another stock 
			
			if (choice == 2) {//executes once user starts to search
				do {
				System.out.println("Please enter the stock symbol");
				String symbCheck = kb.next();
				System.out.println("Please enter the number of shares");
				int numCheck = kb.nextInt();
				
				System.out.println("The average fifo price is " + (fifoSum(symbCheck, numCheck)/numCheck));
				System.out.println("The average lifo price is " + (lifoSum(symbCheck, numCheck)/numCheck));
				
				System.out.println("If you would like to find the lifo and fifo prices of another stock, please press 2");
				choice=kb.nextInt();
			}
				while(choice==2);
			}
		}
			

		
		else if (choice == 2) {//if the choice is initially 2, then no stocks have been entered, so you can't search null stacks and queues
			System.out.println("Error, please enter stocks first");
			
		}
		
		else {//if the choice is not 1 or 2
			System.out.print("Error, invalid input");
		}
		
		
	}
}

