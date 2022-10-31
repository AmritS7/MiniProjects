
/**Amritpal Singh 
 * CUS 1151 - Project 1
 * ****The Overall Complexity of this Project is O(n^2). In the term class all methods are  O(1). 
 * In Polynomial, there is much more variance, with O(1). O(n) and O(n^2). As discussed in class, 
 * the elephant in this case is O(n^2), thus the overall time complexity of this project is O(n^2).
 * 
 * This project creates a polynomial through separating the terms. We can then sort the terms
 * depending on the power of the polynomial, as well as add and multiply one polynomial 
 * by another.
 */

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * A class to represent a polynomial.
 */
public class Polynomial {
	private LinkedList<Term> polynomial;

	/**
	 * Constructs an empty polynomial
	 */
	public Polynomial() { // prewritten -> default constructor, creates a LinkedList named polynomial to
							// add Terms to later. Complexity: O(1)
		polynomial = new LinkedList<Term>();
	}

	/**
	 * Constructs a new polynomial with the given term
	 * 
	 * @param t the term to initialize the polynomial with
	 */
	public Polynomial(Term t) { // prewritten -> constructor, adds the term that is passed to the end of the
								// linkedList. Complexity: o(1).
		this();
		polynomial.add(t);
	}

	/**
	 * Adds the polynomial such that the terms are in sorted order from highest
	 * power to lowest
	 * 
	 * @param p the polynomial to add
	 */

	public void add(Polynomial p) { // We have both a advanced for loop and an iterator. Through looping through
									// both of these, we can both position the term properly as well as add two
									// terms together if they have the same coefficient. We first create a new term
									// t, which stores our next value of this.polynomial. We call addIfSamePower
									// which executes by itself if the powers of the two terms are the same and adds
									// them. In the case that the term that we are trying to add is less than the
									// term in the polynomial (using the iterator), we would add the termToAdd to
									// the previous position (in the iterator). If none of these two cases occur,
									// that means that the termToAdd had the greatest power as compared to other
									// terms in the iterator, so we add it to the end.
									// Complexity: O(n^2) <- for loop and iterator
		for (Term termToAdd : p.polynomial) {

			ListIterator<Term> iter = polynomial.listIterator();

			while (iter.hasNext()) {

				Term t = iter.next();

				t.addIfSamePower(termToAdd);

				if (termToAdd.getPower() < t.getPower()) {
					iter.previous();
					iter.add(new Term(termToAdd.getCoefficient(), termToAdd.getPower()));
					return;
				}
			}

			iter.add(new Term(termToAdd.getCoefficient(), termToAdd.getPower()));
		}
	}

	/**
	 * Multiplies the given polynomial with this one and returns the result
	 * 
	 * @param p the polynomial to multiply
	 * @return this * p
	 */
	public Polynomial multiply(Polynomial p) { // In this method, we first initialize the polynomial. I decided to add
												// 0,0 (anything added or multiplied by it will result in 0, but those
												// will not be printed out due to the toString method. To multiply two
												// polynomials together, we have to multiply each term in the first
												// polynomial by each term in the second, which is why we use a nested
												// loop. We then add the values we get through multiplication as a new
												// polynomial with a new term. The final return is a polynomial, with
												// all of the multiplied values in correct order (through the add
												// method). Complexity: O(n^2) <- because of the nested for loop
		Polynomial result = new Polynomial();
		for (int i = 0; i < p.polynomial.size(); i++) {
			for (int j = 0; j < this.polynomial.size(); j++) {
				Term newTerm = p.polynomial.get(i).multiply(this.polynomial.get(j));
				result.add(new Polynomial(newTerm));
			}
		}

		return result;
	}

	/**
	 * Prints the polynomial "nicely" so that it reads from highest term to lowest
	 * and doesn't have a leading "+" if the first term is positive.
	 */
	public void print() // This method prints out the polynomial by using a for loop to go through each
						// Term, and calling the toString method on them (which is in the Term.java
						// class). This is stored in a string which we later print out. The printed out
						// string is a substring from 1 to the rest of the string if there is a negative
						// value in the front, otherwise 3 to the rest of the string so we can remove
						// the initial plus symbol.
						// Complexity: O(n)
	{
		String toPrint = "";

		for (Term t : polynomial) {
			toPrint += (t.toString());

		}

		if (toPrint.substring(1, 2).equals("-")) {
			System.out.println(toPrint.substring(1, toPrint.length()));
		} else {
			System.out.println(toPrint.substring(3, toPrint.length()));
		}
	}
}
