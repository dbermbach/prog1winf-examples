/**
 * 
 */
package de.tuberlin.mcc.prog1winf.threads;

import java.util.Date;

/**
 * @author Dave
 *
 */
public class ThreadManagement {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		MeinThread mt = new MeinThread();
		mt.start();
		System.out.println(Thread.currentThread().getName()+": "+"Thread started.");
		Thread.sleep(5000);
		mt.interrupt();
		System.out.println(Thread.currentThread().getName()+": "+"interrupted.");
		mt.join();
		System.out.println(Thread.currentThread().getName()+": "+"done.");

		
		
	}

}

class MeinThread extends Thread {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		int counter = 5;
		while (!isInterrupted()&&counter-->0) {
			System.out.println(Thread.currentThread().getName()+": "+"Still alive "+ new Date());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+": "+"was interrupted.");
				this.interrupt();
			}
		}
	}

}
