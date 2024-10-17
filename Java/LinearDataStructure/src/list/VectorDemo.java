package list;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		
		for(int i=0;i<=10;i++) 
		  { 
		   v.addElement(i); 
		  } 
		  System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		  System.out.println("Enumeration is used only by legacy classes");
			
			
			
			Enumeration<Integer>	 en =	v.elements();
	
			
			while (en.hasMoreElements()) {
			Integer n =  en.nextElement();
				
				System.out.println(n);
				
			}
		  
		  
		  
	}

}
