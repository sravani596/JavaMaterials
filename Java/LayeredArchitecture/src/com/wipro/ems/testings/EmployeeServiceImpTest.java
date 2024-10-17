package com.wipro.ems.testings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.wipro.ems.pojo.Employee;
import com.wipro.ems.service.EmployeeServiceImp;
import com.wipro.ems.service.IEmployeeService;

class EmployeeServiceImpTest {
	
	
	 static  IEmployeeService service;
	 
	 @BeforeAll
	 public static void beforeAll() {
		 
		 service = new EmployeeServiceImp();
		 
	 }
	
	

	@Test
	void testAddEmployee() {
		
		
		Employee emp = new Employee(108	, "Ronaldo", 99000);
		
			int count = service.addEmployee(emp);
			
				assertEquals(1, count);
				
			//	assertTrue(count > 0);
				
			//	assertNotEquals(0, count);
		
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testDeleteEmployeeById() {
		
	}

	@Test
	void testSelectEmployeeById() {
		
	}

	@Test
	void testSelectAll() {
		
	}

}
