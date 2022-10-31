package Lab1;
import java.util.*;
import java.io.*;

/*Amritpal Singh
 * CUS 1156
 * Lab 1 - Part B
 * Only changes to FamilyMain.JAva were made (no other classes)
 */

	public class FamilyMain {
	    public static void main (String[] args) throws FileNotFoundException {
	        giveIntro();
	        Scanner console = new Scanner(System.in);
	        Scanner input = new Scanner(new File("tudor.dat"));
	        FamilyDatabase family = new FamilyDatabase(input);
	        family.print();
	        doMatches(family, console);
	    
	        
	    }

	    public static void giveIntro() {
	        System.out.println("This program reads an input file with family");
	        System.out.println("information and provides information about the");
	        System.out.println("maternal line, paternal line and children of");
	        System.out.println("various people.");
	        System.out.println();
	    }

	    public static void doMatches(FamilyDatabase family, Scanner console) {
	        System.out.print("next person (enter to quit)? ");
	        String name = console.nextLine();
	        while (name.length() > 0) {
	            Person next = family.find(name);
	            if (next == null) {
	                System.out.println("No match.");
	            } else {
	                showMaternal(next);
	                showPaternal(next);
	                showChildren(next);
	                numMaternal(next);//from here down, all else statements are for new methods
	                numPaternal(next);
	                numChildren(next);
	                numSibling(next);
	            }
	            System.out.println();
	            System.out.print("next person (enter to quit)? ");
	            name = console.nextLine();
	        }
	    }

	    /* Shows maternal ancestors for given person */
	    public static void showMaternal(Person current) {
	        System.out.println("Maternal line:");
	        int level = 1;
	        while (current != null) {
	            for (int i = 0; i < level; i++)
	                System.out.print("    ");
	            System.out.println(current.getName());
	            current = current.getMother();
	            level++;
	        }
	    }

	    /* Shows paternal ancestors for given person */
	    public static void showPaternal(Person current) {
	        System.out.println("Paternal line:");
	        int level = 1;
	        while (current != null) {
	            for (int i = 0; i < level; i++)
	                System.out.print("    ");
	            System.out.println(current.getName());
	            current = current.getFather();
	            level++;
	        }
	    }

	    /* Shows children for given person */
	    public static void showChildren(Person current) {
	        ArrayList<Person> kids = current.getChildren();
	        System.out.println("Children:");
	        if (kids.size() == 0) {
	            System.out.println("    none");
	        } else {
	            for (Person kid: kids) {
	                System.out.println("    " + kid.getName());
	            }
	        }
	    }
	    
	    /*Prints out the number of maternal records*/
	    public static void numMaternal(Person current) {
	    		int maternalCounter = -1;	//-1 because the name of the current person increments it once
		        int level = 1;
		        while (current != null) {
		            for (int i = 0; i < level; i++)
		            current.getName();
		            current = current.getMother();
		            maternalCounter++;	//increments at every level
		            level++;
		        }
		        System.out.println("Number of Maternal Records (Not including the person): " + maternalCounter);

	    }
	    
	    /*Prints out the number of Paternal Records*/
	    public static void numPaternal(Person current) {
    		int paternalCounter = -1;	//-1 because the name of the current person increments it once
	        int level = 1;
	        while (current != null) {
	            for (int i = 0; i < level; i++)
	            current.getName();
	            current = current.getFather();
	            paternalCounter++;	//increments at every level
	            level++;
	        
    }
	        System.out.println("Number of Maternal Records (Not including the person): " + paternalCounter);

    }
	  
	    /*Prints out the number of children*/
	    public static void numChildren(Person current) {
	        ArrayList<Person> kids = current.getChildren();
	        int childCounter = 0;
	        if (kids.size() == 0) {
	           System.out.println("The current person has no children");
	        } else {
	            for (Person kid: kids) {
	                childCounter++;
	            }
	        }
	        System.out.println("Number of children: " + childCounter);
	    }
	    
	    /*Prints out the names and number of siblings*/
	    public static void numSibling(Person current) {
	    	
	    	int siblingCounter = 0;
	    	
	    	ArrayList<Person> kids = current.getFather().getChildren();	//gets the names of all of the father's children
	        System.out.println("Siblings:");
	  
	        	for (Person kid: kids) {
	               if (kid.getMother().equals(current.getMother())) {	//compares the sibling's mother to the current's mother -- siblings have to have the same mother and father
	            	   if(kid.getName().equals(current.getName())) {	//if the child is the current person does nothing (doesn't print name)
	            		   //do nothing
	            	   		}
	            	   else { //if the child is not the current person, prints their name
	            	   System.out.println(kid.getName());
	            	   siblingCounter++; //increments once for every sibling
	            	   		}
	               	}
	        	}
	        	System.out.println("Number of siblings: " + siblingCounter); //prints out the total number of siblings
	    }
	}


