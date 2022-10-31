package LamdaExpressionsAndStreams;

import java.util.*;

public class LambdaExpression {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<String>();

		students.add("James");
		students.add("Chris");
		students.add("Alonzo");
		students.add("Sara");
		students.add("Ben");
		students.add("John");
		students.add("Tom");

		System.out.println("In alphabetical order:");
		students.sort((a, b) -> a.compareTo(b));
		students.forEach((name -> System.out.println(name)));

		System.out.println("\nIn order by length:");
		Collections.sort(students, (a, b) -> a.length() - b.length());
		students.forEach((name) -> System.out.println(name));

	}
}