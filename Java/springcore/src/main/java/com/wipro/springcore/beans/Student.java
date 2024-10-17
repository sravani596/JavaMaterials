package com.wipro.springcore.beans;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private int sid;
	private String sname;
	
	
	
	
	public Student() {
		super();
		
		System.out.println("Student() called obj created...");
		
	}




	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}




	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	

}
