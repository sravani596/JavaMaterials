package com.wipro.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FiltersDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "King", 5000);
		Employee e2 = new Employee(102, "Tom", 4000);
		Employee e3 = new Employee(103, "Smitt", 6000);
		Employee e4 = new Employee(104, "Jerry", 7000);
		Employee e5 = new Employee(105, "Scott", 4000);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		
			//	list.stream().filter( (emp)->{ return emp.getEname().endsWith("t"); }).forEach(System.out::println);
		
		
			
		list.stream().forEach(System.out::println);
		
			//	stream.forEach(e -> System.out.println(e.getEname()));
	
		System.out.println("Parallel Streams");

			  	list.parallelStream().forEach(System.out::println);
			  	
			  	
			  
			  	
			  				
			  	
			
		
	}

}
