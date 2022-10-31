/*Amritpal Singh
 * MTH 1011
 * Chap 9 HW - Assignment B
 * Section 9.5 #24
 */
public class Chap9HW {	//((-1)^n)/(2n+1)!)
	
	
	static double factorial(double n){    
		double fact = 1; 
		for(double i = n; i >= 1; i--) {
			fact *= i;
		}
		return fact;
		 }    

	public static void main(String [] args) {
		double currValue = 1;
		double valPlusOne =1;
		boolean isLessThan = true;
		
		System.out.println("We are trying to figure out if ((-1)^n)/(2n+1)!) converges or diverges");
		System.out.println("Keep in mind that we are finding the limit only up to 100 for n becuase we are using factorial which produces exponentially greater values");
		System.out.println("The n values, the respective An and A(n+1) and if An+1 <= An is listed below\nAlso note that the later values are missalligned due to the values changing to 0."
				+ " I couldn't get this to fix as printf puts it into decimal notation rather than scientific.\n");
		System.out.println("N\t\tlimit (An = 1/(2n+1)!) as n -> Infinity\t\tAn+1 = 1/(2n+2)!\t\tAn+1<=An");
		
		for(int j=1;j<=100;j++){    
		    currValue = 1/factorial((2*j)+1);
		    valPlusOne = 1/factorial((2*j)+2);
		    
		    if (valPlusOne <= currValue) {
		    	isLessThan= true;
		    }
		    else {
		    	isLessThan = false;
		    }
		    
		    
		   System.out.printf(j + "\t\t" + currValue + "\t\t\t\t" + valPlusOne + "\t\t" + isLessThan + "\n");

		  }  
		
		
		System.out.println("\n\nFrom this, we can see that the limit as n approaches Infinity of An is equal to zero. Therefore, the first condition for the alternating series test is met.\n"
				+ "As An+1 increases, it is clear that An+1 is <= An for all n. Thus, since the two conditions are met, it is clear that the series An = 1/(2n+1)! converges.");
		 }  
}
