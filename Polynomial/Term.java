/*Amritpal Singh 
 * CUS 1151 - Project 1
 */

/**
 * A class to represent an algebraic term.
 */
public class Term {
	private double coefficient;
	private int power;

	/**
	 * A constructor to initialize a single term with a given coefficient and power
	 * 
	 * @param coefficent the coefficient
	 * @param power      the power
	 */
	public Term(double coefficient, int power) { // Constructor -> prewritten if we enter a coefficient and a power, we
													// construct a new coefficient with those vaslues. Complexity: O(1)
		this.coefficient = coefficient;
		this.power = power;
	}

	/**
	 * @return the coefficient
	 */
	public double getCoefficient() // This method serves as a getter and simply returns the coefficient of the
									// current term. Complexity: O(1)
	{
		return coefficient;
	}

	/**
	 * @return the power
	 */
	public int getPower() // This method serves as a getter and simply returns the power of the current
							// term. Complexity: O(1)
	{
		return power;
	}

	/**
	 * Multiplies two coefficient together and returns the result
	 * 
	 * @param t the other term
	 * @return this * t as a term
	 */
	public Term multiply(Term t) // multiplies the coefficients of the two terms together, and adds the products
									// (ie 6x^2 * 10x= 60x^3). These values are then returned in the form of a new
									// Term. The complexity of this method is O(1).
	{
		double cProduct = 0;
		int pProduct = 0;

		cProduct = this.getCoefficient() * t.getCoefficient();
		pProduct = this.getPower() + t.getPower();

		return new Term(cProduct, pProduct);
	}

	/**
	 * Adds the term to this term if the powers are the same
	 * 
	 * @param t the term to attempt to add
	 */
	public void addIfSamePower(Term t) // if the power of the two terms is the same, adds together the coefficients
										// together and sets other terms values to 0. The complexity of this method is
										// O(1).
	{
		if (power == t.power) {
			t.coefficient = t.getCoefficient() + this.getCoefficient();
			this.coefficient = 0;
			this.power = 0;
		}
	}

	/**
	 * Returns a string representation of the term with a ^ representing the
	 * exponent
	 * 
	 * @return a string representation of a term
	 */
	public String toString() // This method returns a String, so we can call print on our polynomial
								// function. If the coefficient is 0, then we would return
	// nothing since 0x^10 is 0. The comments for the rest of the statements are
	// listed below. The complexity of this is O(1).
	{
		String toReturn = "";

		if (this.coefficient == 0) { // if the coefficient is zero, return nothing
		} else if (this.coefficient > 0) { // if the coefficient is positive, we need to add plus signs between the
											// terms
			if (this.power == 0) { // if the power is zero we return only the coefficient, ie 3x^0 = 3
				toReturn = " + " + this.getCoefficient();
			} else if (this.power == 1 && this.coefficient == 1) { // if the power is 1 and the coefficient is 1, we
																	// return x, ie 1x^1 = 1
				toReturn = (" + x");
			} else if (this.coefficient == 1) { // if the coefficient is one we only return the power, ie 1x^3 = x^3
				toReturn = " + x^" + this.getPower();
			} else if (this.power == 1) { // if the power is 1 we return only the coefficient, ie 6x^1 = 6x
				toReturn = (" + " + this.getCoefficient() + "x");
			} else { // else we return both the coefficient and the power
				toReturn = (" + " + this.getCoefficient() + "x^" + this.getPower());
			}
		} else { // occurs when the coefficient is negative, same operations except with the plus
					// is replaced with a minus. When getting the coefficients, we also use Math.abs
					// to get rid of the negative right in front of the coefficient
			if (this.power == 0) {
				toReturn = " - " + Math.abs(this.getCoefficient());
			} else if (this.power == 1 && this.coefficient == -1) {
				toReturn = (" - x");
			} else if (this.coefficient == 1) {
				toReturn = " - x^" + this.getPower();
			} else if (this.power == 1) {
				toReturn = (" - " + Math.abs(this.getCoefficient()) + "x");
			} else {
				toReturn = (" - " + Math.abs(this.getCoefficient()) + "x^" + this.getPower());
			}
		}

		return toReturn;

	}
}
