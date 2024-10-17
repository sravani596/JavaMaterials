package com.wipro.restapi.datajpa.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.wipro.restapi.datajpa.entity.Employee;

@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	Employee emp;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testAdd() {

		emp.setEid(106);
		emp.setEname("javeed");
		emp.setCity("Hyderabad");
		emp.setSalary(40000);
		emp.setEmail("java@gmail.com");

		Employee responseEmp = restTemplate.postForObject("http://localhost:8080/api/employees/add", emp,
				Employee.class);

		assertNotNull(responseEmp);

	}

	@Test
	void testGetById() {

		int eid = 101;

		Employee emp = restTemplate.getForObject("http://localhost:8080/api/employees/getbyid/" + eid, Employee.class);

		assertEquals("Mumbai", emp.getCity());

	}

}
