package LamdaExpressionsAndStreams;
import java.util.*;

/*Amritpal Singh
 * CUS 1156
 * Stream and Lambda Expression
 */

public class Streams {

		public static void main(String [] args) {
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			numbers.add(5);
			numbers.add(43);
			numbers.add(65);
			numbers.add(8);
			numbers.add(29);
			numbers.add(3);
			numbers.add(11);
			numbers.add(85);
			
						
			numbers.stream()
					.filter(num->(num>30))
					.forEach(num->System.out.println(num));
			
			
			long count = numbers.stream()
				.filter(num->(num>30))
				.count();	
				System.out.println("Amount of numbers greater than 30: " + count);
		}
}
