package com.wipro.restapi.datajpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.wipro.restapi.datajpa.entity.Employee;

@SpringBootTest
class EmployeeServiceImpTest {
	
	
		@Autowired
		IEmployeeService service;
		
		@Autowired
		Employee emp;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		
	}

	@Test
	void testAddEmployee() {
		
				emp.setEid(102);
				emp.setEname("scott");
				emp.setSalary(45000);
				emp.setCity("Hyderabad");
				emp.setEmail("scott@gmail.com");
		
		
	Employee e1 =		service.addEmployee(emp);
	
		assertEquals(102, e1.getEid());
		
		assertNotNull(e1);
		
		
	}

	@Test
	void testGetEmployeeById() {
		
	Employee emp = 	service.getEmployeeById(111);
		
				assertEquals("Black Smith", emp.getEname());
	
	}

	@Test
	void testGetAllEmployees() {
		
			List<Employee> list =	service.getAllEmployees();
			
			assertTrue(list.size() > 0);
		
		
	}

	@Test
	void testGetByEname() {
		
		Employee e1 =			service.getByEname("scott");
		
				assertNotNull(e1);
	}

	@Test
	@Disabled
	void testDeleteByEname() {
		
			ResponseEntity<String>	rs =  service.deleteByEname("tom");
		
				assertEquals(202, rs.getStatusCodeValue());
		
	}

}
