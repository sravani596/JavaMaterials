package arrays;

public class Array2D {

	public static void main(String[] args) {


		int arr[]  = new int[3];
		
		arr[0] = 10;
		arr[1] = 15;	
		
		for (int i : arr) {
			
			System.out.println(i);
		}
		
		
		int  arr2[][]   = new int[3][2];
		
		System.out.println("arr2 2D "+arr2);
		
		System.out.println("arr2[0] 1D "+arr2[0]);
		
		arr2[0][0]  = 30;
		
		
		System.out.println(arr2[0][0]);
		
		System.out.println(arr2[0][1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
