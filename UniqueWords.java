package Lab2;//forces me to create a package 
//Caused by: java.lang.module.InvalidModuleDescriptorException: UniqueWords.class found in top-level directory (unnamed package not allowed in module)

import java.util.ArrayList;


/*Project: CUS1156_Lab2
 * Class: UniqueWords.java
 * Author: Amritpal Singh
 * Date: February 27, 2021
 * Description: This program consists in completing the countUnique method that counts the 
 * number of distinct elements in an ArrayList<String> (The strings that do not repeat).
 * The method also does not modify the array list.
 */

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	 
      for (int i = 0; i < list.size(); i++)
      {  
    	  int counter = 0; //creates a counter, which counts the number of times that i and j are the same during each iteration
    	  for (int j = 0; j < list.size(); j++)
		 {
			if(list.get(j).equals(list.get(i)))//if i and j are the same string, the counter increments
				counter++;
		 }
    	   if (counter==1) //if the number is unique, then there will be 1 match, where i==j, if not unique, then counter has to be greater than 1 
    	      count++;  
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
