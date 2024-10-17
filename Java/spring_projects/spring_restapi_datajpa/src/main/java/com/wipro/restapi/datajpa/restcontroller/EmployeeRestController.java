package com.wipro.restapi.datajpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.datajpa.entity.Employee;
import com.wipro.restapi.datajpa.exceptions.EmployeeNotFoundException;
import com.wipro.restapi.datajpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService service;

	@PostMapping("/add")
	public Employee add(@RequestBody Employee emp) {

		return service.addEmployee(emp);

	}

	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp) {

		
		
		return service.updateEmployee(emp);

	}

	@GetMapping("/getbyid/{eid}")
	public Employee getById(@PathVariable int eid) throws EmployeeNotFoundException {

	Employee emp =	 service.getEmployeeById(eid);
	
			if(emp==null) {
				
				throw  new EmployeeNotFoundException();
				
			}
			
		return emp;	

	}
	
	/*
	 * @ResponseStatus(reason="Emp not found ", code = HttpStatus.BAD_REQUEST)
	 * 
	 * @ExceptionHandler(EmployeeNotFoundException.class) public void
	 * handleException() {
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	

	@DeleteMapping("/deletebyid/{eid}")
	public String deleteEmployeeById(@PathVariable int eid) {

		return service.deleteEmployeeById(eid);

	}

	@GetMapping("/getall")
	public List<Employee> getAllEmployees() {

		return service.getAllEmployees();

	}
	
	
	@GetMapping("/getbyename/{ename}")
	public Employee  getByEname(@PathVariable String ename) {
		
		return service.getByEname(ename);
		
	}
	
	@GetMapping("/get-sal-gt/{salary}")
	public List<Employee> getBySalGT(@PathVariable double salary) {

		return service.getBySalGT(salary);

	}
	
	
	@GetMapping("/getsorted/{salary}")
	public List<Employee> getBySortedSal(@PathVariable double salary) {

		return service.getBySortedSal(salary);

	}
	
	@DeleteMapping("/deletebyename/{ename}")
	public ResponseEntity<String>  deleteByEname(@PathVariable String ename){
		
		return service.deleteByEname(ename);
		
	}
	
	
	

}
