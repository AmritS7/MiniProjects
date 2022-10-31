package ThreadProgrammingProject;

/*
 * Amritpal Singh's individual submission -- Everyone in the group has their own in previous submissions 
 * CUS 1163 - OS
 * Thread Programming Project
 */

import java.util.*;

public class QueueThreadRunner {

	public static void main(String[] args) {
		Queue list = new Queue();
		final int REPETITIONS = 100;
		int THREADS;
		String element;

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number of threads you would like: ");
		THREADS = kb.nextInt();

		for (int i = 1; i <= THREADS; i++) {
			element = new Date().toString();
			Producer p = new Producer(list, element, REPETITIONS);
			Consumer c = new Consumer(list, REPETITIONS);

			Thread pt = new Thread(p);
			Thread ct = new Thread(c);

			pt.start();
			ct.start();
		}
	}
}
