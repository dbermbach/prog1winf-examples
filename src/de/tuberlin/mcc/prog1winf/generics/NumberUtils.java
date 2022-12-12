/**
 * 
 */
package de.tuberlin.mcc.prog1winf.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dave
 *
 */
public class NumberUtils {

	public double sum(List<? extends Number> numberList) {
		double sum = 0;
		for (Number n : numberList)
			sum += n.doubleValue();
		return sum;
	}

	public static void main(String[] args) {
		NumberUtils n = new NumberUtils();
		List<Double> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l.add(i*1.0);
		}
		n.sum(l);
	}
}
