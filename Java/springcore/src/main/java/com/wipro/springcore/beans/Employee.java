package com.wipro.springcore.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("emp")
//@Service
//@Repository("emp")
public  class  Employee {
	
	
		private int eid;
		private String ename;
		private double salary;
		
		
		
		
		public Employee() {
			
			
			
			super();
			
			System.out.println("Employee() is  called by IOC/Spring Container");
		}




		public Employee(int eid, String ename, double salary) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
		}




		public int getEid() {
			return eid;
		}




		public void setEid(int eid) {
			this.eid = eid;
		}




		public String getEname() {
			return ename;
		}




		public void setEname(String ename) {
			this.ename = ename;
		}




		public double getSalary() {
			return salary;
		}




		public void setSalary(double salary) {
			this.salary = salary;
		}




		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
