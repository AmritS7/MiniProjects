package ThreadProgrammingProject;

/*
 * Amritpal Singh's individual submission -- Everyone in the group has their own in previous submissions 
 * CUS 1163 - OS
 * Thread Programming Project
 */

public class Producer implements Runnable {

	private static final int DELAY = 100;
	private Queue list;
	private String product;
	private int count;

	public Producer(Queue aList, String aProduct, int aCount) {
		list = aList;
		product = aProduct;
		count = aCount;
	}

	public void run() {
		try {
			for (int i = 0; i <= count; i++) {
				list.add(product);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
		}
	}

}
