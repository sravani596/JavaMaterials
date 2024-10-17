package com.wipro.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		
				//Predicate<Integer>  condition = (n)->{return n%2==0;};
		
		
		Predicate<Integer>  condition = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer n) {

					if(n%2 == 0) {
						
						return true;
					}
				
				return false;
			}
		};
		
		
			System.out.println("Filters");
				
				list.stream().filter(condition.negate()).forEach(System.out::println);
				
				
				
				System.out.println("filters and map");
				
				
				list.stream().filter((n)-> {return n>5;}).map((n)-> n*n).forEach(System.out::println);
				
				
				
			
		
	}
	

}
