package com.wipro.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(101, "King", 50000));
		list.add(new Employee(103, "Smith", 30000));
		list.add(new Employee(105, "Adam", 25000));
		list.add(new Employee(102, "Scott", 60000));
		list.add(new Employee(106, "Satish", 10000));
		list.add(new Employee(104, "Ford", 35000));

		list.forEach((Employee emp) -> {
			System.out.println(emp);
		});

		Stream<Employee> stream1 = list.stream();

		// System.out.println("Stream Collection");
		// stream1.forEach(System.out::println);

		System.out.println("Employees with Salary GT 25000");
		
		Predicate<Employee> salaryGT = e -> e.getSalary() > 25000;

		stream1.filter(salaryGT).forEach(System.out::println);
		
		Stream<Employee> stream2 = list.stream();
		
		System.out.println("Sorted list based on Ename");
		
  //stream2.sorted( (e1,e2)->{  return e1.getEname().compareTo(e2.getEname()); } )
		//.forEach(System.out::println);
		
			 stream2.sorted(Comparator.comparing(Employee::getSalary))
			       .forEach(System.out::println);
		
			//Employee emp = new Employee();
			 
			
			EmployeeFunctionaIInterface  emp = Employee::new;
			
			System.out.println(emp.getEmployee());
			
			
			Stream<Employee> stream3 = list.stream();
			
			//stream3.collect(Collectors.toCollection(HashSet::new));

			
		Map<Integer,String> map  =	list.stream().collect(Collectors.toMap(Employee::getEid	, Employee::getEname));
			
			System.out.println(map);
			
			
			//list.parallelStream().forEach(System.out::println);
			
	list.stream().map( (e1) -> { return  e1.getEname().length(); })
					.forEach(System.out::println);
	
	
		
	
	}

}
