/* Project: Project 2 - Map
 * Class:   DistanceFinder.java
 * Author:  Amritpal Singh
 * Date:    March 26th, 2021
 * This class creates a directConnections hashMap from an input file that stores a list of distances - to, from and their distance from each other.
 * It also returns the starting city which is the first city in the file in the getStartingCity() method and returns the shortest distances from 
 * the origin city to other cities in the shortestDistances() method. 
 */

import java.util.*;
import java.io.*;

public class DistanceFinder {

	private String startFrom;
	private Map<String, HashSet<DistanceTo>> directConnections;

	// ----------------------------------------------------------------
	// This method serves as the constructor and creates a hashMap, direct
	// connections that stores the distances from each city to the next through
	// reading a file
	public DistanceFinder(String filename) throws FileNotFoundException {

		directConnections = new HashMap<>();
		Scanner input = new Scanner(new File(filename));
		while (input.hasNext()) {
			String from = input.next();
			String to = input.next();
			int distance = input.nextInt();

			if (startFrom == null) {
				startFrom = from;
			}

			if (directConnections.get(from) == null) {
				directConnections.put(from, new HashSet<>());
			}

			directConnections.get(from).add(new DistanceTo(to, distance));

			if (directConnections.get(to) == null) {
				directConnections.put(to, new HashSet<>());

			}

			directConnections.get(to).add(new DistanceTo(from, distance));

		}

	}

	// ----------------------------------------------------------------
	// This method returns the starting city / origin of the input file
	public String getStartingCity() {
		return startFrom;
	}

	// ----------------------------------------------------------------
	// This method returns a HashMap of of the shortest distance from the origin
	// to every other city on the map by using a priority queue
	public Map<String, Integer> shortestDistances() {

		PriorityQueue<DistanceTo> pQueue = new PriorityQueue<DistanceTo>();

		String from = startFrom;
		pQueue.add(new DistanceTo(from, 0));
		Map<String, Integer> shortestKnownDistance = new HashMap<>();

		while (!pQueue.isEmpty()) {
			DistanceTo removed = pQueue.remove();

			if (!shortestKnownDistance.containsKey(removed.getTarget())) {
				int d = removed.getDistance();
				shortestKnownDistance.put(removed.getTarget(), d);

				for (DistanceTo c : directConnections.get(removed.getTarget())) {
					pQueue.add(new DistanceTo(c.getTarget(), d + c.getDistance()));
				}

			}
		}

		return shortestKnownDistance;
	}
}