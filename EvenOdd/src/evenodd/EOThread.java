/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import static java.lang.Thread.sleep;

/**
 *
 * @author vladb
 */
public class EOThread extends Thread {
	/**
	 * The delay time, used in the {@link EOThread#run() run} method, by
	 * {@link Thread#sleep(long) sleep}.
	 */
	private final int DELAY = 500;

	/**
	 * The type of this thread: even or odd.
	 */
	private boolean numberType;

	/**
	 * The last number of the sequence.
	 */
	private final int finalNumber;

	/**
	 * Constructor.
	 * 
	 * @param number the target number of the counter
	 * @param type   of the thread: even or odd.
	 */
	public EOThread(int number, boolean type) {
		finalNumber = number;
		numberType = type;
	}

	/**
	 * <p>
	 * This is the run method invoked on the {@linkplain Thread#start() thread
	 * execution}.
	 * </p>
	 * 
	 * <p>
	 * It count from 0 to {@linkplain EOThread#finalNumber finalNumber} and
	 * print the process name and if the number is even or odd. Then put this thread
	 * to the {@link Thread#sleep(long) sleep} status.
	 * </p>
	 * 
	 * @see Runnable
	 */
	public void run() {
		String s = Thread.currentThread().getName();
		for (int i = 1; i < finalNumber + 1; i++) {
			if (numberType) {
				if (i % 2 == 0)
					System.out.println(s + " - Even " + i);
			} else {
				if (i % 2 != 0)
					System.out.println(s  + " - Odd " + i);
			}
			try {
				sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
