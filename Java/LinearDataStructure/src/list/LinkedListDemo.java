package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {


		List<String> list =   new LinkedList<String>();
		
		
			list.add("king");
			System.out.println(list.add("tom"));
			list.add("smith");
			list.add("adam");
			System.out.println(list.add("tom"));
			list.add(null);
			
			System.out.println(list);
		
			
			System.out.println(list.get(4));
			list.set(0, "javeed");
			
			
			System.out.println("Display using For Each  ");
			
			for(String name:list) {
				System.out.println(name);
				
			}
			
			
			list.set(3, "pratik");
		
			System.out.println("Using Iterator ");
			
		Iterator<String> it =	list.iterator();
			
				while (it.hasNext()) {
					String str = it.next();
					
			System.out.println(it.next()); // Object o = new Sting();
					
					 
				}
			
		
		

	}

}
