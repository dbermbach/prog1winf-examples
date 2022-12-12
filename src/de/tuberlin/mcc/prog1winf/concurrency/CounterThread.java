/**
 * 
 */
package de.tuberlin.mcc.prog1winf.concurrency;

/**
 * @author David Bermbach
 * 
 *         created on 22.12.2014
 */
public class CounterThread extends Thread {


	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("I am " + Thread.currentThread().getName()
					+ " and my number is " + i);
			try {
				Thread.sleep((long) (Math.random() * 100));
			} catch (InterruptedException e) {
				this.interrupt();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new CounterThread().start();
		new CounterThread().start();
	}



}
