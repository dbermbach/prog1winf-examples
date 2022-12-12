/**
 * 
 */
package de.tuberlin.mcc.prog1winf.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dave
 *
 */
public class BTreeTestclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BTree tree = new BTree();
		tree.insert(3);
		tree.insert(37);
		tree.insert(4);
		
		
		//generics examples (no connection to BTree)
		List<BTree> list = new ArrayList<BTree>();
		BTree[] array = list.toArray(new BTree[list.size()]);
		Object[] array2 = list.toArray();
		
		List<? extends Number> abc = new ArrayList<Integer>();
		
		
	}

}
