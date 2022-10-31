/* Project: Project 2 - Map
 * Class:   DistanceFinderTest.java
 * Author:  Amritpal Singh
 * Date:    March 26th, 2021
 * This class has methods that are essential to the rest of the program
 */

public class DistanceTo implements Comparable<DistanceTo>
{
   private String target;
   private int distance;

   public DistanceTo(String city, int dist) { target = city; distance = dist; }
   public String getTarget() { return target; }
   public int getDistance() { return distance; }
   public int compareTo(DistanceTo other) { return distance - other.distance; }
   public String toString() { return "Distance to " + target + " is " + distance; }
}
