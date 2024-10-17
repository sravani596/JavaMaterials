package com.wipro.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMergeFlatMap {

	public static void main(String[] args) {


		
		
		
		List<Integer> list1 = Arrays.asList(1,2,23);
		List<Integer> list2 = Arrays.asList(24,15,26);
		List<Integer> list3 = Arrays.asList(17,8,29);
		  
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		 
		List<Integer> listOfAllIntegers = listOfLists.stream()
		          .flatMap(x -> x.stream())
		          .collect(Collectors.toList());

		
		listOfAllIntegers.sort(Comparator.reverseOrder());
		
		System.out.println(listOfAllIntegers);
		
	}

}
