package Model.test18;

import java.util.AbstractList;
import java.util.List;

public class intArrayAsListFactory {
	static List<Integer> intArrayAsList(final int[] a){
		if (a==null) 
			throw new NullPointerException();
		return new AbstractList<Integer>() {
			public Integer get(int i) {
				return a[i];
			}
			@Override
			public Integer set(int index, Integer element) {
				int oldVal=a[index];
				a[index]=element;
				return oldVal;
			}
			@Override
			public int size() {
				return a.length;
			}
		};
	}
}
