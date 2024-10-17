package com.wipro.orm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Table")

@NamedQueries(  {
				@NamedQuery(name = "getAllEmployees", query = "select e from Employee e") ,
				@NamedQuery(name = "getSorted", query = "select e from Employee e  order by e.ename")

				}	
		
		    )


public class Employee { // Entity  ---->map----> Table Emp_Table(eid,emp_name,salary)
	
	@Id
	private int eid;
	
	@Column(name="emp_name")
	private String ename;
	
	private  double salary;
	
	
	public Employee() {
		super();
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
