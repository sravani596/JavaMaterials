package com.anno;

import java.lang.annotation.Annotation;

@CustomAnnotation(name="Demo Class")
public class Demo {

	
	//@CustomAnnotation(name="main")
	public static void main(String[] args) throws ClassNotFoundException {


		
		
			m1("hello");
		
			
			
		Class c  =	Class.forName("com.anno.Demo");
			
		Annotation annos[] =	   c.getClass().getDeclaredAnnotations();
		
		
		System.out.println(annos);
		
			for (Annotation ann : annos) {
				
				System.out.println(ann);
				
			}
		

	}
	
	@CustomAnnotation
	public static void m1( @CustomAnnotation String  data) {
		
		System.out.println("m1()  is called...");
		
		
	}

}
