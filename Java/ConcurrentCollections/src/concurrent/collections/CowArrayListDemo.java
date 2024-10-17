package concurrent.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CowArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("CV Raman", "Homi Bhabha", "Ramanujan"); 
		
		System.out.println(list);
		
		
	CopyOnWriteArrayList<String>  cowArrayList = new CopyOnWriteArrayList<>(list);
		
		
	//	CopyOnWriteArraySet<String>  cowArrayList = new CopyOnWriteArraySet<>(list);
		
			Iterator<String>  it =		cowArrayList.iterator();
			
					
					cowArrayList.add("Vikram Sarabai");
			
			while (it.hasNext()) {
				String name =  it.next();
				
				System.out.println("Iterator 1 : "+name);
				
			}
			
			
			Iterator<String>  it2 =		cowArrayList.iterator();
			
			while (it2.hasNext()) {
				String name =  it2.next();
				
				System.out.println("Iterator 2 : "+name);
				
			}

	}

}
