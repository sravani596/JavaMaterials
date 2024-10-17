package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();

		set.add("apple"); 
		System.out.println(set.add("kiwi")); 
		set.add("pine apple");
		set.add("orange");
		set.add("mango");
		System.out.println(set.add("kiwi"));
		set.add(null);

		System.out.println(set);
	}

}
