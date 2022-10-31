/*
 * Amritpal Singh
 * Lab 2 - Q3 - CUS 1126
 * 3. Write a Java program that uses both an iterative method and a 
 * recursive method to compute the n'th fibonacci number. Show that 
 * this works for the numbers 4, 8, and 12. 
 */
public class Fibonacci {
	
	public static int getFib(int n) {//Recursive Method
		if (n<=2) {
			return 1;
		}
		else 
			return getFib(n-1) + getFib(n-2);
		}	
		  
	 
	public static int fibIt(int n) {//Iterative Method - was a bit confusing but I figured it out 
		
		int fibnum = 1;
		int fibminus1 = 1;
		int temp = 0;
		
		if (n==1) {
			return 1;
		}
		else {
		for (int i = 2 ; i< n; i++) {
			temp = fibnum;//sets temp value to the last fib number
			fibnum = fibnum +fibminus1; //calculates fib number by adding previous fib number and previous fib num-1
			fibminus1 = temp;//sets previous fib number to new fibnumber for next loop
				}
		return fibnum;
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(getFib(4));
		System.out.println(getFib(8));
		System.out.println(getFib(12));
		
		System.out.println(fibIt(4));
		System.out.println(fibIt(8));
		System.out.println(fibIt(12));
	}
}

/*Sample Output:
3
21
144
3
21
144
*/
