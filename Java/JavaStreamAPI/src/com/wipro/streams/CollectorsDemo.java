package com.wipro.streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {

		List<Employee> employeesList = Arrays.asList(
		          new Employee(1, "Alex", 100),
		          new Employee(2, "Brian", 200),
		          new Employee(3, "Charles", 300),
		          new Employee(4, "David", 400),
		          new Employee(5, "Edward", 500),
		          new Employee(6, "Frank", 600)
		        );
		
		
		
 List<String> list =		employeesList.stream().map(e -> e.getEname() ).collect(Collectors.toCollection(LinkedList::new) );
		
 			
 
 
		//	list.forEach(System.out::println);
 
 
 	Map map =		employeesList.stream().collect(Collectors.toMap(Employee::getEid	, Employee::getEname));

 	
 		System.out.println(map);
	}

}
