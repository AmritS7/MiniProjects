package classactivity12;

/*Project: Class Activity 12
 * Class:  AlternateLists.java
 * Author: Amritpal Singh
 * Date:   March 28th, 2021
 * This class has a method called alternate that accepts two Lists as its parameters and returns a new List containing alternating elements from the two lists. 
 * If the lists do not contain the same number of elements, the remaining elements from the longer list are placed consecutively at the end.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class AlternateLists {

	public static LinkedList<String> alternate(LinkedList<String> firstList, LinkedList<String> secondList) {// assuming
																												// strings
																												// because
																												// not
																												// specified
		Iterator<String> firstIter = firstList.iterator();// Two separate iterators act as pointers in linked lists
		Iterator<String> secondIter = secondList.iterator();
		LinkedList<String> returnedList = new LinkedList<String>();

		while (firstIter.hasNext()) {// goes through all the elements in the first list
			returnedList.add(firstIter.next());
			if (secondIter.hasNext()) {// if the second list has a next value, prints it out, if not p1 will finish
										// adding on to the returnedList
				returnedList.add(secondIter.next());
			}
		}

		while (secondIter.hasNext()) {// if the first list is shorter, then the second's iterator will not be at the
										// end, so this will continue to print out the rest of it
			returnedList.add(secondIter.next());
		}

		return returnedList;
	}

	public static void main(String[] args) {// not required, but used to test if alternate is working correctly
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");

		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("6");
		l2.add("7");
		l2.add("8");
		l2.add("9");
		l2.add("10");
		l2.add("11");
		l2.add("12");

		System.out.println(alternate(l1, l2));
	}
}
