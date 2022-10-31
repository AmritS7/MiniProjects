package ThreadProgrammingProject;

/*
 * Amritpal Singh's individual submission -- Everyone in the group has their own in previous submissions 
 * CUS 1163 - OS
 * Thread Programming Project
 */

public class Consumer implements Runnable {

	private static final int DELAY = 100;
	private Queue list;
	private int count;

	public Consumer(Queue aList, int aCount) {
		list = aList;
		count = aCount;
	}

	public void run() {

		try {
			for (int i = 0; i <= count; i++) {
				list.remove();
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
		}
	}
}
