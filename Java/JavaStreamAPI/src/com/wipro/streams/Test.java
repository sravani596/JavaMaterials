package com.wipro.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {


			List<String> list = new ArrayList<String>();
			
			list.add("Apple"); list.add("Mango"); list.add("Orange"); list.add("Banana"); list.add("Kiwi");
			
			list.forEach(System.out::println);
			
			
		List sortedList = 	list.stream().sorted().collect(Collectors.toList());
			
		
			sortedList.forEach(System.out::println);
			
			
			
			int arr1[] = {3,2,5,6,1,4};  int arr2[] = {8,9,7,10};
			
		IntStream  stream1 =		IntStream.of(arr1);
				
		IntStream stream2 =		Arrays.stream(arr2);
		
					
		int arr3[] =		IntStream.concat(stream1, stream2).toArray();
			
			IntStream  stream3 =	  Arrays.stream(arr3).sorted();
				
				
					stream3.forEach(System.out::println);
					
					
					
			List<int[]> list1 =			Arrays.asList(arr1);
					
			List<int[]> list2 =			Arrays.asList(arr2);
			
			
	
			List<List<String>> listOfLists = Arrays.asList(
		            Arrays.asList("Geeks", "For"),
		            Arrays.asList("GeeksForGeeks", "A computer portal"),
		            Arrays.asList("Java", "Programming")
		        );
			
			  // Using Stream flatMap(Function mapper)
	        listOfLists.stream()
	                   .flatMap(l -> l.stream())
	                   .forEach(System.out::println);
		
	}

}
