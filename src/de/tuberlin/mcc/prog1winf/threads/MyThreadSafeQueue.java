/**
 * 
 */
package de.tuberlin.mcc.prog1winf.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dave
 *
 */
public class MyThreadSafeQueue<T> {

	private List<T> list = new ArrayList<>(10);

	
	public void enqueue(T t) throws QueueFullException {
		synchronized (list) {
			if (list.size() >= 10)
				throw new QueueFullException("voll!");
			list.add(t);
		}
	}

	public T dequeue() {
		synchronized (list) {
			if (list.size() > 0)
				return list.remove(0);
			else
				return null;
		}
	}

}
