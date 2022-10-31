/*Amritpal Singh
 * Calculus 3 Project 
 * #3 - Write a program in Java, Python, Excel or any language of your choices to 
 * approximate the solution of the following equation 
 * a)X3 + X -1 = 0, start with initial guess x1=0, x2=1,  with a margin of error(E) 
 * no more than 0.0001 via the secant method using 5 iterations:
 * b) Approximate the solution of the same equation X3 + X -1 = 0 via the bi-sector 
 * method over the given interval [0,1]
 * 
 * Notes: At the end of 5 iterations for the secant method, the margin of error was greater than .0001, 
 * so I completed another iteration, but the solution provided is for the 5 iterations as requested by the question. 
 * For the bisector method, I chose 14 iterations using the margin of error formula. My work is attached in the other file.
 */

import java.lang.Math;

public class Calculus3Project {

	// original formula x^3+x-1=0

	public static void main(String[] args) {

		secantMethod();
		System.out.println(
				"\n_________________________________________________________________________________________\n");
		bisectorMethod();
	}

	public static void secantMethod() {
		double xi = 1;
		double xi_1 = 0; // xi-1 (couldn't name because java)
		double root = 0;
		double fOfRoot = 0;

		System.out.println("Secant Method for x^3+x-1=0");

		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s", "Iteration", "xi-1", "xi", "next x (xi+1)", "f(xi+1)",
				"Margin of Error");

		for (int i = 1; i <= 6; i++) {
			double nextX = xi - (((Math.pow(xi, 3) + xi - 1) * (xi - xi_1))
					/ ((Math.pow(xi, 3) + xi - 1) - (Math.pow(xi_1, 3) + xi_1 - 1))); // formula: xi+1 = xi -
																						// (f(xi)(xi-xi-1))/f(xi)-f(xi-1))
			double fOfNextX = (Math.pow(nextX, 3) + nextX - 1);
			double marginOfError = Math.abs(nextX - xi);// formula: abs(x+1 - x)

			if (i == 5) {
				root = nextX;
				fOfRoot = fOfNextX;
			}

			System.out.printf("%n%-20d%-20f%-20f%-20f%-20f%-20f", i, xi_1, xi, nextX, fOfNextX, marginOfError);
			xi_1 = xi;
			xi = nextX;

		}
		System.out.println(
				"\n\nNote: At then end of 5 iterations the margin of error is greater than .0001, so another iteration is completed");
		System.out.println("Solution at the end of 5 iterations:\nRoot: " + root + "\nf(root): " + fOfRoot);
	}

	public static void bisectorMethod() {
		// interval 0 to 1

		double low = 0;
		double high = 1;
		double nextX = 0;
		double fOfNextX = 0;

		System.out.println("Bisector Method for x^3+x-1=0");

		System.out.printf("%-20s%-20s%-20s%-20s%-20s", "Iteration", "xi-1", "xi", "next x (xi+1)", "f(xi+1)");

		for (int i = 1; i <= 14; i++) { //14 iterations as seen in the attached doc 
			nextX = (low + high) / 2;
			fOfNextX = (Math.pow(nextX, 3) + nextX - 1);

			System.out.printf("%n%-20d%-20f%-20f%-20f%-20f", i, low, high, nextX, fOfNextX);
			
			if (fOfNextX > 0) {
				high = nextX;
			} else if (fOfNextX < 0) {
				low = nextX;
			}

			

		}

		System.out.println("\n\nSolution at then end of 14 iterations:\nRoot: " + nextX + "\nf(root): " + fOfNextX);

	}
}