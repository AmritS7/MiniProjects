/*Amritpal Singh 
 * CUS 1151 - Project 1
 */
/**
   A class to to test the Polynomial class.
*/
public class PolynomialTest //prewritten class -> used to test polynomial and term classes
{
   public static void main(String[] args)
   {
      Polynomial p = new Polynomial(new Term(-10, 0));
      p.add(new Polynomial(new Term(-1, 1)));
      p.add(new Polynomial(new Term(9, 7)));
      p.add(new Polynomial(new Term(5, 10)));
      Polynomial q = p.multiply(p);
      q.print();
    
   }
}
