package com.wipro.service;

import java.util.List;

import com.wipro.pojo.Employee;

public interface IEmployeeService {
	
	
			public  int  addEmployee(Employee emp);
			
			public  int  updateEmployee(Employee emp);
			
			public int  deleteEmployeeById(int eid);
			
			public  Employee     selectEmployeeById(int eid);
			
			public    List<Employee>       selectAll();

}
