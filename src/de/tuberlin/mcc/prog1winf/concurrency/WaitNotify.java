/**
 * 
 */
package de.tuberlin.mcc.prog1winf.concurrency;

/**
 * @author David Bermbach
 * 
 *         created on 23.12.2014
 */
public class WaitNotify {

	volatile int value = 0;
	volatile boolean produced = false;
	Long failedTries = 0L;

	void produce() {
		value++;
		produced = true;
	}

	void consume() {
		produced = false;
	}

	void failedTry() {
		synchronized (failedTries) {
			failedTries++;
		}
	}

	long getFailedTries() {
		synchronized (failedTries) {
			return failedTries;
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WaitNotify wn = new WaitNotify();
		ProducerWaitNotify p = new ProducerWaitNotify(wn);
		ConsumerWaitNotify c = new ConsumerWaitNotify(wn);
		p.start();
		c.start();
		Thread.sleep(5000);
		p.interrupt();
		c.interrupt();
		
		p.join();
		c.join();
		System.out.println("failed tries: " + wn.getFailedTries());
	}

}

class ProducerWaitNotify extends Thread {

	private WaitNotify wn;

	/**
	 * @param wn
	 */
	public ProducerWaitNotify(WaitNotify wn) {
		this.wn = wn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (wn) {
				while (wn.produced) {
					// System.out.println("Cannot produce :(...");
					wn.failedTry();
					try {
						wn.wait(10);
					} catch (InterruptedException e) {
						this.interrupt();
					}
				}
				System.out.println("Produced " + (wn.value + 1));
				wn.produce();
				wn.notify();
			}

		}
		synchronized (wn) {
			wn.notifyAll();
		}
		System.out.println("Producer is terminated.");
		
	}

}

class ConsumerWaitNotify extends Thread {

	private WaitNotify wn;

	/**
	 * @param wn
	 */
	public ConsumerWaitNotify(WaitNotify wn) {
		this.wn = wn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (wn) {
				while (!wn.produced) {
					// System.out.println("Cannot consume :(...");
					wn.failedTry();
					try {
						wn.wait(10);
					} catch (InterruptedException e) {
						this.interrupt();
					}
				}
				System.out.println("Consumed " + wn.value);
				wn.consume();
				wn.notify();
			}

		}
		synchronized (wn) {
			wn.notifyAll();
		}
		System.out.println("Consumer is terminated.");
	}
}
