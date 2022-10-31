//Amritpal Singh
//Lab 1 Question 3 - Write a method that returns a new array by eliminating duplicate values using 
//the following method signature: public static int[] removeDuplicates(int [] list). Write a test program that prompts 
//the user to enter 8 numbers, invokes this method and displays the distinct numbers separated by a single space.

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {

	 public static int[] createList() {//prompts user for values and creates a sorted array
		 
		 Scanner kb = new Scanner(System.in);
		 int [] createList = new int[8];
		 
		 for (int i=0; i<createList.length; i++) {
		 System.out.println("Please enter an integer: ");
		 createList[i]=kb.nextInt();//stores input into array
		 }
		 
		  Arrays.parallelSort(createList);//sorts array
		return createList;
	 }
	 
	 
	 public static int[] removeDuplicates(int [] list) {//stores non-duplicate values and 1 duplicate value in new array list2[]
		 
		
		int j = 0;
		int [] list2 = new int[8];
		
		
		 for (int i =0; i<list.length-1; i++) {
			if (list[i+1] != list[i]) {
				list2[i] = list[i];	 
				 }
		    }
		 
		 
		 	list2[7] = list[7];
		 return list2;
	 }
	 
	 public static void main(String[] args) {
		 
	
		 int list[] =  removeDuplicates(createList());//calls methods and stores returned array in list[]
		 
		 System.out.println("The values removing duplicates are: " );
		
		 for (int k=0;k<list.length;k++) {
			 if (list[k] == 0)//if == 0 does not print it out
			 {
			 }
			 else System.out.print(list[k]+ " ");
	      }
	 
	    }
}

/*Example Output:
Please enter an integer: 
2
Please enter an integer: 
2
Please enter an integer: 
3
Please enter an integer: 
4
Please enter an integer: 
5
Please enter an integer: 
6
Please enter an integer: 
6
Please enter an integer: 
7
The values removing duplicates are:
2 3 4 5 6 7 
*/
