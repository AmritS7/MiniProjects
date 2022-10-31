/* Project: Project 2 - Map
 * Class:   DistanceFinderDemo.java
 * Author:  Amritpal Singh
 * Date:    March 26th, 2021
 * This class serves as the main method to demo the DistanceFinder program
 */

import java.io.FileNotFoundException;
import java.util.Scanner;
public class DistanceFinderDemo
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner in = new Scanner(System.in);
      System.out.print("File with city names: ");
      String filename = in.nextLine();
      DistanceFinder d = new DistanceFinder(filename);

      System.out.println("Shortest distance from " + d.getStartingCity());
      System.out.println(d.shortestDistances());
   }
}
