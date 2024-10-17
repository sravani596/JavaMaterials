package arrays;

public class ArrayDemo {

	public static void main(String[] args) {


		int  arr1[] = {10,20,30,40,50};
		
		System.out.println(arr1);
		
		System.out.println(arr1.length);
		
		for (int i = 0; i < arr1.length; i++) {
			
			
			System.out.println(i +" "+ arr1[i]);
			
		}
		
		
		System.out.println("For Each Loop  / Enhance For Loop");
		
		
		for(int n:arr1) {
			
			System.out.println(n);
			
		}
		

	}

}
