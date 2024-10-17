package com.wipro.streams;

import java.util.function.Consumer;

public class MethodRef {
	
	
	
	public static  void printLength(String str) {
		
		System.out.println(str.length());
		
	}
	
	public void   show(String str) {
		
		
		System.out.println(str);
	}
	

	public static void main(String[] args) {


		
				Consumer<String>  consumer = MethodRef::printLength;
				
											  
				
					consumer.accept("Javeed");
					
			
		

	}

}
