package ThreadProgrammingProject;

/*
 * Amritpal Singh's individual submission -- Everyone in the group has their own in previous submissions 
 * CUS 1163 - OS
 * Thread Programming Project
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Queue {

	private String[] list;
	private Lock lock;
	private Condition waitForProducer;
	private Condition waitForConsumer;;
	private int pNum;
	private int cNum;
	private int elementCap = 10;

	public Queue() {
		lock = new ReentrantLock();
		list = new String[10];
		pNum = 0;
		cNum = 0;
		waitForProducer = lock.newCondition();
		waitForConsumer = lock.newCondition();
	}

	public void add(String element) {
		lock.lock();

		try {
			if (list[pNum] == null) {// array at the index is empty
				list[pNum] = element;
				pNum++;// after adding increments

				if (pNum == elementCap) {// moves list back to 0 -- goes back to beginning of list
					pNum = 0;
				}

				waitForProducer.signalAll();// alerts all waiting threads that a producer has created an element
			} else {
				waitForConsumer.await();

			}
		} catch (InterruptedException exception) {
		}

		finally {
			lock.unlock();
		}
	}

	public void remove() {
		lock.lock();

		try {
			if (list[cNum] != null) {// array at the index has a produced item ready
				System.out.println(list[cNum]);
				list[cNum] = null;
				cNum++; // moves onto next element

				if (cNum == elementCap) {// moves list back to 0 -- goes back to beginning of list
					cNum = 0;
				}

				waitForConsumer.signalAll();// alerts all waiting threads that there is space available in the queue
			} else {
				waitForProducer.await();

			}
		} catch (InterruptedException exception) {
		}

		finally {
			lock.unlock();
		}
	}
}
