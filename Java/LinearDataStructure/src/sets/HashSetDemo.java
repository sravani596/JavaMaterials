package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("apple"); // 102
		System.out.println(set.add("kiwi")); // 103
		set.add("pine apple");// 104
		set.add("orange");// 101
		set.add("mango");// 105
		System.out.println(set.add("kiwi"));
		// set.add(null);

		System.out.println(set);

		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String fruit = it.next();
			
			System.out.println(fruit);
			
		}
		
		
		

	}

}
