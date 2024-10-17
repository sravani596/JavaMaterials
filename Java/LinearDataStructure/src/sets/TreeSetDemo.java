package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> set1 = new TreeSet<String>();

		set1.add(new String("B"));
		set1.add("A");
		set1.add("D");
		set1.add("C");

		System.out.println(set1);

		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(30);  // new Integer(30);
		set2.add(20);
		set2.add(50);
		
		System.out.println(set2);
		
		Set<Employee>  set = new TreeSet<Employee>(new MyComparator());
		
	Employee e1 =	new Employee(101, "king", 50000);
		
		
		set.add(e1);
		
		
		
		set.add(new Employee(104, "ford", 20000));
		set.add(new Employee(105, "ravi", 10000));
		set.add(new Employee(102, "tom", 60000));
		set.add(new Employee(103, "smith", 30000));
		
		System.out.println(set);
		

	}

}
