/**
 * 
 */
package de.tuberlin.mcc.prog1winf.datastructures;

/**
 * @author Dave
 *
 */
public class QueueWrapper {

	private SinglyLinkedList list = new SinglyLinkedList();

	public void enqueue(String s) {
		list.append(s);
	}

	public String dequeue() {
		Object o = list.getValue(0);
		if (o == null)
			return null;
		list.deleteValue(o);
		return (String) o;
	}

}
