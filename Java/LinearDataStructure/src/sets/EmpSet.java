package sets;

import java.util.HashSet;
import java.util.Set;

public class EmpSet {

	public static void main(String[] args) {


		
		Set<Employee>  set = new HashSet<Employee>();
		
			set.add(new Employee(101, "king", 50000));
			set.add(new Employee(102, "tom", 60000));
			set.add(new Employee(103, "smith", 30000));
			set.add(new Employee(104, "ford", 20000));
			set.add(new Employee(105, "ravi", 10000));
			set.add(new Employee(105, "javeed", 45000));
		
			System.out.println(set);
		
			

	}

}
