/**
 * 
 */
package de.tuberlin.mcc.prog1winf.concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Bermbach
 * 
 *         created on 23.12.2014
 */
public class SyncBlock {

	List<String> stringList = new ArrayList<>();

	void add(String s) {
		synchronized (stringList) {
			stringList.add(s);
		}
	}

	void print() {
		synchronized (stringList) {
			for (String s : stringList)
				System.out.println(s);
		}
	}

}
