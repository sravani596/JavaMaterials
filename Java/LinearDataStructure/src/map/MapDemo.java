package map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {


		
//Map<Integer,String> map =	new HashMap<Integer,String>();
		
//Map<Integer,String> map =	new LinkedHashMap<Integer,String>();
		
		Map<Integer,String> map =	new TreeMap<Integer,String>();
		

			map.put(101,"King");  // k-v pair entry
			map.put(15,"Tom");
			map.put(263,"Smith");
			map.put(101,"Javeed");
			map.put(77, "Tom");
			
			
			System.out.println(map);
			

	}

}
