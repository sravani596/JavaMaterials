package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {


		//duplicate , null are  allowed and insertion order is preserved
		
		//DS is growable array or dynamic array
		
		// initial capacity is 10
		//List<Object>   list =     new ArrayList<Object>();
		
		List<Object>   list =     new Vector<Object>();
		
			list.add(100); // new Integer(100)
			list.add(4.555);
			list.add("hello");
			list.add(new ListDemo());
			list.add(100);
			list.add(null);
		
		System.out.println(list);
		
		
		Iterator<Object> it =	list.iterator();
		
		while (it.hasNext()) {
			Object object = it.next();
			
			System.out.println(object);
			
		}
		
		
		
		
				

	}

}
