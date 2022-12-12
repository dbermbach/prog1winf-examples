/**
 * 
 */
package de.tuberlin.mcc.prog1winf.concurrency;

/**
 * @author David Bermbach
 * 
 *         created on 23.12.2014
 */
public class NoWaitNotify {

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
	
	long getFailedTries(){
		synchronized (failedTries) {
		return failedTries;	
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		NoWaitNotify nwn = new NoWaitNotify();
		ProducerNoWaitNotify p = new ProducerNoWaitNotify(nwn);
		ConsumerNoWaitNotify c = new ConsumerNoWaitNotify(nwn);
		p.start();
		c.start();
		Thread.sleep(5000);
		p.interrupt();
		c.interrupt();
		p.join();
		c.join();
		System.out.println("failed tries: " + nwn.getFailedTries());
	}

}

class ProducerNoWaitNotify extends Thread {

	private NoWaitNotify nwn;

	public ProducerNoWaitNotify(NoWaitNotify nwn) {
		super();
		this.nwn = nwn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (nwn) {
				if (nwn.produced) {
					// System.out.println("Cannot produce :(...");
					nwn.failedTry();
					continue;
				}
				System.out.println("Produced " + (nwn.value + 1));
				nwn.produce();
			}

		}
		System.out.println("Producer is terminated.");
	}

}

class ConsumerNoWaitNotify extends Thread {

	private NoWaitNotify nwn;

	public ConsumerNoWaitNotify(NoWaitNotify nwn) {
		super();
		this.nwn = nwn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (nwn) {
				if (!nwn.produced) {
					// System.out.println("Cannot consume :(...");
					nwn.failedTry();
					continue;
				}
				System.out.println("Consumed " + nwn.value);
				nwn.consume();
			}

		}
		System.out.println("Consumer is terminated.");
	}
}
