package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>(); 
		  l.add("balakrishna"); 
		  l.add("venki"); 
		  l.add("chiru"); 
		  l.add("nag"); 
		  System.out.println(l);//[balakrishna, venki, chiru, nag] 
		  ListIterator<String> itr=l.listIterator(); 
		 
		  
		  while(itr.hasNext()) 
		  { 
		   String s= itr.next(); 
		   
		   System.out.println(s);
		   
		  }
		  
		  System.out.println("Backward direction using list iterator");
		  while(itr.hasPrevious()) {
			  
			  System.out.println(itr.previous());
			  
			  
		  }
		  
		  
	}

}
