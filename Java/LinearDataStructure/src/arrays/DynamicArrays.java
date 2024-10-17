package arrays;

public class DynamicArrays {

	public static void main(String[] args) {


		int arr[][] = new int[3][];
		
		
		System.out.println(arr  +"  size "+arr.length);
		
		System.out.println(arr[0]);
		
		arr[0]  = new int[2];
		
		arr[1]  = new int[3];
		
		arr[2]  = new int[4];
		
		System.out.println(arr[0]);
		System.out.println(arr[1][1]);
		
		
		int a3[][][]  = new int[3][][];
		
			a3[0]  = new int[2][2];	
			a3[0][0][0] = 99;
			
			System.out.println("3D "+a3);
			System.out.println("2D "+a3[0]);
			System.out.println("1D "+a3[0][0]);
			System.out.println("data "+a3[0][0][0]);
			
			
		
		
	}

}
