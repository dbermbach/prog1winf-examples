/**
 * 
 */
package de.tuberlin.mcc.prog1winf.concurrency;

/**
 * @author David Bermbach
 * 
 *         created on 22.12.2014
 */
public class JoinedThread extends Thread {

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		System.out.println(getName() + ": Sleeping now...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			this.interrupt();
		}
		System.out.println(getName() + ": I'm done.");
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		JoinedThread jt = new JoinedThread();
		System.out.println(Thread.currentThread().getName()
				+ ": Ready to start.");
		jt.start();
		System.out.println(Thread.currentThread().getName()
				+ ": Ready to join.");
		jt.join();
		System.out.println(Thread.currentThread().getName() + ": He's done!");

	}

}
