package reading_kb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromKB {

	public static void main(String[] args) {


		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
					try {
						
						/*
						 * System.out.println("Enter data"); int n = br.read();
						 * 
						 * System.out.println( (char)n );
						 */
						
						System.out.println("Enter Name");
						
						String name =	br.readLine();
						
						System.out.println(name);
						
						System.out.println("Enter amount");  //  "5000"  ---> 5000
						
							String s1 = br.readLine();
						
						int amount =	Integer.parseInt(s1);
						
						
						System.out.println("Total Amount is :  "+ (amount + 100));
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		

	}

}
