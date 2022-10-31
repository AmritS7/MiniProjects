/* Project: Project 2 - Map
 * Class:   DistanceFinderTest.java
 * Author:  Amritpal Singh
 * Date:    March 26th, 2021
 * This class tests all of the methods that are in the DistanceFinder.java class
 */

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class DistanceFinderTest {

	// ----------------------------------------------------------------
	// This method tests the DistanceFinder constructor
	@Test
	public void testDistanceFinder() throws FileNotFoundException {
		String fileName = "cities1.txt";
		DistanceFinder test = new DistanceFinder(fileName);
		assertNotNull(test); // makes sure that directConnections is not empty
	}

	// ----------------------------------------------------------------
	// This method tests the getStartingCity method
	@Test
	public void testgetStartingCity() throws FileNotFoundException {
		String fileName = "cities2.txt";
		DistanceFinder test = new DistanceFinder(fileName);
		assertEquals("Phoenix", test.getStartingCity()); // checks if the starting city for the second file is Phoenix
	}

	// ----------------------------------------------------------------
	// This method tests the shortestDistances method
	@Test
	public void testshortestDistances() throws FileNotFoundException {
		String fileName = "cities3.txt";
		DistanceFinder test = new DistanceFinder(fileName);
		assertTrue(test.shortestDistances().get("Pueblo") == 10); // checks if the shortest distance from the starting
																	// city of file cities3.txt to Pueblo is 10 (the
																	// shortest distance on the map)
	}

}
