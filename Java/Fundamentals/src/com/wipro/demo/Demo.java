package com.wipro.demo;

import java.lang.*; // default package

public class Demo extends Object {
	
	
	public Demo() {
		
		
		super();  // Object();   // calling immediate parent class constructor
	}
	
	@Override
	public  String toString() {  // method overriding or runtime polymorphism
		
		return "hello from demo";
		
	}

	public static void main(String[] a1) {

		int x = 10;

		Object o = new String("javeed"); // runtime polymorphism

		Demo d1 = new Demo();
		
		String s1 = "hello"; // scp
		
		String s2 = new String("welcome");

		System.out.println(s2);

		System.out.println(d1);

	}

}
