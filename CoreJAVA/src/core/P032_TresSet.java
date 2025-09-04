package core;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P032_TresSet {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(123);
		set.add(356);
		set.add(6789);
		set.add(345);
		set.add(-32);
		set.add(0);
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
